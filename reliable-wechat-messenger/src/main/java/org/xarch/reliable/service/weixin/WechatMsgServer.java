package org.xarch.reliable.service.weixin;

import org.springframework.stereotype.Service;
import org.xarch.reliable.model.domain.request.WechatRequest;
import org.xarch.reliable.model.domain.response.WechatResponse;
import org.xarch.reliable.service.weixin.msg.WechatSupport;

@Service
public class WechatMsgServer extends WechatSupport {

	@Override
	protected void onText(WechatRequest wechatRequest, WechatResponse wechatResponse) {
		String content = wechatRequest.getContent();
		if (content != null && content.equals("text")) {
			responseText(wechatResponse, "惊喜!～～恭喜发现彩蛋。");
			return;
		}
		responseText(wechatResponse, "[您的消息为] " + content);
	}

}
