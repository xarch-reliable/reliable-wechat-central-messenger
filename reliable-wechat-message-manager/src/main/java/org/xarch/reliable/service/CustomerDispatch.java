package org.xarch.reliable.service;

import java.util.Map;

import reactor.core.publisher.Mono;

public interface CustomerDispatch {
	
	public Mono<String> execute(Map<String, Object> data);
	
	public Mono<String> dispatch(String touseropenid, String msgtype, Map<String, Object> bodyMap);
}
