package org.xarch.reliable.service.wechat;

import org.xarch.reliable.model.domain.request.WechatXmlRequestMessage;
import org.xarch.reliable.model.domain.response.WechatXmlResponseMessage;
import org.xarch.reliable.utils.xml.MessageBuilder;
import org.xarch.reliable.utils.xml.XStreamTransformer;

public abstract class WechatManager extends WechatDispatch{

	public WechatXmlRequestMessage praseWechatRequest(String request) {
		return XStreamTransformer.Request2Xml(request);
	}
	
	public String execute(WechatXmlRequestMessage request) {
		WechatXmlResponseMessage reponse = mydispatch(request);
		MessageBuilder.buildBase(request, reponse);
		return XStreamTransformer.Xml2Response(reponse);
	}
}
