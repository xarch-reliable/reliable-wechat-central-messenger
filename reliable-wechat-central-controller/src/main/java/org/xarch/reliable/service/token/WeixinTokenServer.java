package org.xarch.reliable.service.token;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.xarch.reliable.model.domain.wxinfo.token.GetAccessTokenResponse;
import org.xarch.reliable.model.domain.wxinfo.token.GetTicketResponse;

public interface WeixinTokenServer {

	@Cacheable(cacheNames = "AccessTokenResponse",key="'Object'")
	public GetAccessTokenResponse getAccessTokenResponse(GetAccessTokenResponse getAccessTokenResponse);

	@CachePut(cacheNames = "AccessTokenResponse",key="'Object'")
	public GetAccessTokenResponse setAccessTokenResponse(GetAccessTokenResponse getAccessTokenResponse);

	@Cacheable(cacheNames = "TicketResponse",key="'Object'")
	public GetTicketResponse getTicketResponse(GetTicketResponse getTicketResponse);

	@CachePut(cacheNames = "TicketResponse",key="'Object'")
	public GetTicketResponse setTicketResponse(GetTicketResponse getTicketResponse);

}
