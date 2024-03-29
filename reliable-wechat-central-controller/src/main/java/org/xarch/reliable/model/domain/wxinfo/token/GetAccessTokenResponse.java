package org.xarch.reliable.model.domain.wxinfo.token;

import java.io.Serializable;

public class GetAccessTokenResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String access_token;
	private String expires_in;
	private String errcode;
	private String errmsg;

	public GetAccessTokenResponse(String access_token, String expires_in, String errcode, String errmsg) {
		this.access_token = access_token;
		this.expires_in = expires_in;
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public GetAccessTokenResponse() {
		access_token = null;
		expires_in = null;
		errcode = null;
		errmsg = null;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
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
		return "GetAccessTokenResponse [access_token=" + access_token + ", expires_in=" + expires_in + ", errcode="
				+ errcode + ", errmsg=" + errmsg + "]";
	}

}
