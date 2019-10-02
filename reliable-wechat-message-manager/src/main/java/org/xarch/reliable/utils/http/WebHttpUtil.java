package org.xarch.reliable.utils.http;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.xarch.reliable.service.feign.FeignCenterController;
import reactor.core.publisher.Mono;

@Service
public class WebHttpUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(WebHttpUtil.class);

	private static final String customerUrl = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=";
	
	@Autowired
	private FeignCenterController feignCenterController;
	
	public String getAccessToken() {
		Map<String, Object> resmap = feignCenterController.getToken();
		return (String)resmap.get("access_token");
	}
	
	public Mono<String> sendCustomerMessage(String data){
		
		String access_token = getAccessToken();
		logger.info("[postUrl] "+customerUrl+access_token);
		logger.info("[data] "+data);
		return WebClient.create().post().uri(customerUrl+access_token)
			.accept(MediaType.APPLICATION_JSON_UTF8)
			.syncBody(data)
			.retrieve().bodyToMono(String.class);
	}
}
