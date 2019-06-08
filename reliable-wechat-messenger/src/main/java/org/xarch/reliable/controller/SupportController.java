package org.xarch.reliable.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.xarch.reliable.model.domain.request.WechatRequest;
import org.xarch.reliable.service.weixin.WechatMsgServer;

@RestController
public class SupportController {

	private static final Logger logger = LoggerFactory.getLogger(SupportController.class);

	@Autowired
	private WechatMsgServer wechatMsgServer;

	@PostMapping("/support")
	public String Support(@RequestBody String request) {
		logger.info("request: " + request);
		WechatRequest wechatRequest = wechatMsgServer.setWechatRequest(request);
		return wechatMsgServer.execute(wechatRequest);
	}

}
