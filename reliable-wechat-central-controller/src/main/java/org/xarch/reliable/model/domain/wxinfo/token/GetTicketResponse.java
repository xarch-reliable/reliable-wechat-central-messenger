package org.xarch.reliable.model.domain.wxinfo.token;

import java.io.Serializable;

public class GetTicketResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ticket;
	private String expires_in;
	private String errcode;
	private String errmsg;

	public GetTicketResponse(String ticket, String expires_in, String errcode, String errmsg) {
		this.ticket = ticket;
		this.expires_in = expires_in;
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public GetTicketResponse() {
		ticket = null;
		expires_in = null;
		errcode = null;
		errmsg = null;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	@Override
	public String toString() {
		return "GetTicketResponse [ticket=" + ticket + ", expires_in=" + expires_in + ", errcode=" + errcode
				+ ", errmsg=" + errmsg + "]";
	}

}
