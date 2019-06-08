package org.xarch.reliable.utils.wechat;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xarch.reliable.model.domain.request.WechatRequest;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ProcessRequest {

	private static final Logger logger = LoggerFactory.getLogger(ProcessRequest.class);

	public static WechatRequest Request(String request) {
		XmlMapper xmlMapper = new XmlMapper();
		try {
			return xmlMapper.readValue(request, WechatRequest.class);
		} catch (IOException e) {
			logger.error("xml消息转pojo错误!");
			e.printStackTrace();
		}
		return new WechatRequest();
	}

}
