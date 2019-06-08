package org.xarch.reliable.utils.http;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class WebHttpUtil {
	
	private static final String accessTokenUrl = "http://47.92.98.17:8110/token/get";
	
	public static Mono<String> getAccessToken() {
		
		return WebClient.create().get()
				.uri(accessTokenUrl)
				.retrieve().bodyToMono(String.class);
	}
}
