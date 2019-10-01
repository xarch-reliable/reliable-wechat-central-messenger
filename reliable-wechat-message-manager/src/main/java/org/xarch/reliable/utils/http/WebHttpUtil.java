package org.xarch.reliable.utils.http;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.xarch.reliable.service.feign.FeignCenterController;

import com.alibaba.fastjson.JSON;
import reactor.core.publisher.Mono;

@Service
public class WebHttpUtil {

	private static final String customerUrl = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=";
	
	@Autowired
	private FeignCenterController feignCenterController;
	
	public String getAccessToken() {
		Map<String, Object> resmap = feignCenterController.getToken();
		return (String)resmap.get("access_token");
	}
	
	public Mono<String> sendCustomerMessage(String data){
		
		String access_token = getAccessToken();
		return WebClient.create().post().uri(customerUrl+access_token)
			.accept(MediaType.APPLICATION_JSON_UTF8)
			.body(Mono.just(JSON.toJSONString(data)),String.class)
			.retrieve().bodyToMono(String.class);
	}
}
