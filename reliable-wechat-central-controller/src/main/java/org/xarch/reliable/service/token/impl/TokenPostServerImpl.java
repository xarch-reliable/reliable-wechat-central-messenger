package org.xarch.reliable.service.token.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xarch.reliable.model.domain.wxinfo.token.GetAccessTokenResponse;
import org.xarch.reliable.model.domain.wxinfo.token.GetTicketResponse;
import org.xarch.reliable.service.token.TokenPostServer;
import org.xarch.reliable.service.token.TokenPostValidator;
import org.xarch.reliable.service.token.WeixinTokenServer;

@Component
public class TokenPostServerImpl implements TokenPostServer {

	private static final Logger logger = LoggerFactory.getLogger(TokenPostServerImpl.class);

	@Autowired
	private TokenPostValidator tokenPostValidator;

	@Autowired
	private WeixinTokenServer weixinTokenServer;

	@Override
	public boolean AccessTokenTimer() {
		logger.info("TokenPostServerImpl::AccessTokenTimer()");
		GetAccessTokenResponse res = tokenPostValidator.PostInfo();
		logger.info(res.toString());
		weixinTokenServer.setAccessTokenResponse(res);
		if (tokenPostValidator.parseData(res)) {
			return TicketTimer(res.getAccess_token());
		}
		logger.error("[Errcode]="+res.getErrcode()+" [Errmsg]="+res.getErrmsg());
		return false;
	}

	@Override
	public boolean TicketTimer(String access_token) {
		logger.info("TokenPostServerImpl::TicketTimer()");
		GetTicketResponse res = tokenPostValidator.PostInfo(access_token);
		logger.info(res.toString());
		weixinTokenServer.setTicketResponse(res);
		if(tokenPostValidator.parseData(res)) {
			return true;
		}
		logger.error("[Errcode]="+res.getErrcode()+" [Errmsg]="+res.getErrmsg());
		return false;
	}

}
