package org.xarch.reliable.config.wxinfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration // 配置类
@RefreshScope // bus动态刷新
public class WeixinConfiguration {

	@Value("${wechat.appid:error}")
	private String appid;

	@Value("${wechat.appsecret:error}")
	private String appsecret;

	@Value("${wechat.token:error}")
	private String token;

	public String getAppid() {
		return appid;
	}

	public String getAppsecret() {
		return appsecret;
	}

	public String getToken() {
		return token;
	}

	@Override
	public String toString() {
		return "WeixinConfiguration [appid=" + appid + ", appsecret=" + appsecret + ", token=" + token + "]";
	}
}
