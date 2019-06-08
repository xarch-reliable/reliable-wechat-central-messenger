package org.xarch.reliable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.xarch.reliable.config.wxinfo.WeixinConfiguration;
import org.xarch.reliable.utils.validate.ValidateSignature;

@RestController
public class SupportController {

	@Autowired
	private WeixinConfiguration weixinConfiguration;

	/**
	 * 微信URL验证
	 * 
	 * @param echostr
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @return
	 */
	@GetMapping("/support")
	public String Support(@RequestParam(value = "echostr", required = true) String echostr,
			@RequestParam(value = "signature", required = true) String signature,
			@RequestParam(value = "timestamp", required = true) String timestamp,
			@RequestParam(value = "nonce", required = true) String nonce) {
		ValidateSignature validateSignature = new ValidateSignature(signature, timestamp, nonce,
				weixinConfiguration.getToken());
		if (!validateSignature.check()) {
			return "error";
		}
		return echostr;
	}

}
