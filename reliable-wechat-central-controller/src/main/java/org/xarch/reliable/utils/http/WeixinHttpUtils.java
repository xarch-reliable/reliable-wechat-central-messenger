package org.xarch.reliable.utils.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;
import org.xarch.reliable.model.domain.wxinfo.token.GetTicketResponse;
import org.xarch.reliable.model.domain.wxinfo.token.GetAccessTokenResponse;

import reactor.core.publisher.Mono;

public class WeixinHttpUtils {

	private static final String WxApiUrl = "api.weixin.qq.com";
	private static final String TokenPath = "/cgi-bin/token";
	private static final String TicketPath = "/cgi-bin/ticket/getticket";

	private static final Logger logger = LoggerFactory.getLogger(WeixinHttpUtils.class);

	public static Mono<GetAccessTokenResponse> HttpGetAccessToken(String appid, String secret) {
		logger.info("WeixinHttpUtils::HttpGetAccessToken() " + " [appid] = " + appid + ",[secret] = " + secret);
		return WebClient.create().get()
				.uri(uriBuilder -> uriBuilder.scheme("https").host(WxApiUrl).path(TokenPath)
						.queryParam("grant_type", "client_credential").queryParam("appid", appid)
						.queryParam("secret", secret).build())
				.retrieve().bodyToMono(GetAccessTokenResponse.class);
	}

	public static Mono<GetTicketResponse> HttpGetTiket(String access_token) {
		logger.info("WeixinHttpUtils::HttpGetTiket() " + " [access_token] = " + access_token);
		return WebClient.create().get()
				.uri(uriBuilder -> uriBuilder.scheme("https").host(WxApiUrl).path(TicketPath)
						.queryParam("access_token", access_token).queryParam("type", "jsapi").build())
				.retrieve().bodyToMono(GetTicketResponse.class);
	}
}
