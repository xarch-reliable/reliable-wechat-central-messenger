package org.xarch.reliable.service.token.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.xarch.reliable.model.domain.wxinfo.token.GetAccessTokenResponse;
import org.xarch.reliable.model.domain.wxinfo.token.GetTicketResponse;
import org.xarch.reliable.service.token.WeixinTokenServer;

@Component
public class WeixinTokenServerImpl implements WeixinTokenServer {
	
	private static final Logger logger = LoggerFactory.getLogger(WeixinTokenServerImpl.class);
	
	@Override
	public GetAccessTokenResponse getAccessTokenResponse(GetAccessTokenResponse getAccessTokenResponse) {
		logger.error("WeixinTokenServerImpl::getAccessTokenResponse() --> cache null [error]");
		return getAccessTokenResponse;
	}

	@Override
	public GetAccessTokenResponse setAccessTokenResponse(GetAccessTokenResponse getAccessTokenResponse) {
		logger.info("WeixinTokenServerImpl::setAccessTokenResponse()");
		return getAccessTokenResponse;
	}

	@Override
	public GetTicketResponse getTicketResponse(GetTicketResponse getTicketResponse) {
		logger.error("WeixinTokenServerImpl::getTicketResponse() --> cache null [error]");
		return getTicketResponse;
	}

	@Override
	public GetTicketResponse setTicketResponse(GetTicketResponse getTicketResponse) {
		logger.info("WeixinTokenServerImpl::setTicketResponse()");
		return getTicketResponse;
	}

}
