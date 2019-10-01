package org.xarch.reliable.utils.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.alibaba.fastjson.JSON;
import reactor.core.publisher.Mono;

@Service
public class WebHttpUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(WebHttpUtil.class);
	
	private static final String accessTokenUrl = "http://47.92.98.17:8110/token/get";
	private static final String customerUrl = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=";
	
	public static Mono<String> getAccessToken() {
		
		return WebClient.create().get()
				.uri(accessTokenUrl)
				.retrieve().bodyToMono(String.class);
	}
	
	public Mono<String> sendCustomerMessage(String data){
		
		Mono<String> accessToken = WebHttpUtil.getAccessToken();
		return accessToken.flatMap(r -> {
			return WebClient.create().post().uri(customerUrl+r)
			.accept(MediaType.APPLICATION_JSON_UTF8)
			.body(Mono.just(JSON.toJSONString(data)),String.class)
			.retrieve().bodyToMono(String.class);
		});
	}
}
