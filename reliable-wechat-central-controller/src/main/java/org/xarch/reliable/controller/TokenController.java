package org.xarch.reliable.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xarch.reliable.model.domain.wxinfo.token.GetAccessTokenResponse;
import org.xarch.reliable.model.domain.wxinfo.token.GetTicketResponse;
import org.xarch.reliable.service.thread.ThreadFnc;
import org.xarch.reliable.service.token.WeixinTokenServer;

import reactor.core.publisher.Mono;

@RestController
public class TokenController {

	@Autowired
	private WeixinTokenServer weixinTokenServer;

	@Autowired
	private ThreadFnc threadFnc;

	@RequestMapping("/token/get")
	public Mono<String> getAccessToken() {
		String access_token = weixinTokenServer.getAccessTokenResponse(new GetAccessTokenResponse()).getAccess_token();
		if (StringUtils.isNotEmpty(access_token)) {
			return Mono.just(access_token);
		}
		return Mono.just("[AccessToken]error");
	}

	@RequestMapping("/ticket/get")
	public Mono<String> getTicket() {
		String ticket = weixinTokenServer.getTicketResponse(new GetTicketResponse()).getTicket();
		if (StringUtils.isNotEmpty(ticket)) {
			return Mono.just(ticket);
		}
		return Mono.just("[Ticket]error");
	}

	@RequestMapping("token/refresh")
	public Mono<String> RefreshToken() {
		threadFnc.TokenPost();
		return Mono.just("已成功发起刷新token请求");
	}
	
}
