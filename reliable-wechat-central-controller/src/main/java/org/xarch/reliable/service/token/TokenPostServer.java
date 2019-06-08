package org.xarch.reliable.service.token;

public interface TokenPostServer {

	/**
	 * AccessToken 处理
	 */
	public boolean AccessTokenTimer();

	/**
	 * Ticket 处理
	 */
	public boolean TicketTimer(String access_token);

}
