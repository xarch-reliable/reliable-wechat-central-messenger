package org.xarch.reliable.service.token.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xarch.reliable.model.domain.wxinfo.token.GetTicketResponse;
import org.xarch.reliable.config.wxinfo.WeixinConfiguration;
import org.xarch.reliable.model.domain.wxinfo.token.GetAccessTokenResponse;
import org.xarch.reliable.service.token.TokenPostValidator;
import org.xarch.reliable.utils.http.WeixinHttpUtils;

@Component
public class TokenPostValidatorImpl implements TokenPostValidator {

	@Autowired
	private WeixinConfiguration weixinConfiguration;

	@Override
	public GetAccessTokenResponse PostInfo() {
		String appid = weixinConfiguration.getAppid();
		String secret = weixinConfiguration.getAppsecret();
		return WeixinHttpUtils.HttpGetAccessToken(appid, secret).block();
	}

	@Override
	public boolean parseData(GetAccessTokenResponse getAccessTokenResponse) {
		if (StringUtils.isNotEmpty(getAccessTokenResponse.getAccess_token())) {
			return true;
		}
		return false;
	}

	@Override
	public GetTicketResponse PostInfo(String access_token) {
		return WeixinHttpUtils.HttpGetTiket(access_token).block();
	}

	@Override
	public boolean parseData(GetTicketResponse getAccessTicketResponse) {
		if (StringUtils.isNotEmpty(getAccessTicketResponse.getTicket())) {
			return true;
		}
		return false;
	}

}
