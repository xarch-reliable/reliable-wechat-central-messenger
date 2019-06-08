package org.xarch.reliable.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.xarch.reliable.model.domain.request.WechatXmlRequestMessage;
import org.xarch.reliable.service.wechat.WechatManager;

@RestController
public class SupportController {
	
	private static final Logger logger = LoggerFactory.getLogger(SupportController.class);

	@Autowired
	private WechatManager wechatManager;

	@PostMapping("/support")
	public String Support(@RequestBody String request) {
		logger.info("==========request==========");
		logger.info(request);
		logger.info("==========request==========");
		WechatXmlRequestMessage wechatRequest = wechatManager.praseWechatRequest(request);
		String response = wechatManager.execute(wechatRequest);
		logger.info("==========response==========");
		logger.info(response);
		logger.info("==========response==========");
		return response;
	}
}
