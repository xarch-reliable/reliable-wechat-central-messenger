package org.xarch.reliable.service.token;

import org.xarch.reliable.model.domain.wxinfo.token.GetTicketResponse;
import org.xarch.reliable.model.domain.wxinfo.token.GetAccessTokenResponse;

public interface TokenPostValidator {

	/**
	 * AccessToken 请求
	 */
	public GetAccessTokenResponse PostInfo();

	/**
	 * AccessToken 验证
	 * AccessToken --> 成功取得AccessToken
	 */
	public boolean parseData(GetAccessTokenResponse getAccessTokenResponse);

	/**
	 * Ticket 请求
	 */
	public GetTicketResponse PostInfo(String access_token);

	/**
	 * Ticket 验证
	 * true --> 成功取得Ticket
	 */
	public boolean parseData(GetTicketResponse getTicketResponse);
}
