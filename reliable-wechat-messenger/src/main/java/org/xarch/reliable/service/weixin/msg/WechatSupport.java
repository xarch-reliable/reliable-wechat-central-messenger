package org.xarch.reliable.service.weixin.msg;

import org.xarch.reliable.model.domain.request.WechatRequest;
import org.xarch.reliable.model.domain.response.WechatResponse;
import org.xarch.reliable.utils.wechat.ProcessRequest;
import org.xarch.reliable.utils.wechat.ProcessResponse;

public abstract class WechatSupport extends DispatchMessage {

	public WechatRequest setWechatRequest(String request) {
		return ProcessRequest.Request(request);
	}

	/**
	 * wechat调用入口，进行数据接收，事件分发
	 * 
	 * @return
	 */
	public String execute(WechatRequest wechatRequest) {
		// 分发消息，得到响应
		WechatResponse wechatResponse = dispatch(wechatRequest);
		ProcessResponse.responseBase(wechatRequest, wechatResponse);
		return ProcessResponse.response(wechatResponse);
	}

}
