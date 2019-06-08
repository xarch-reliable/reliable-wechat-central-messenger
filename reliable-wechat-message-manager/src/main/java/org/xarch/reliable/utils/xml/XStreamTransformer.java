package org.xarch.reliable.utils.xml;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xarch.reliable.model.domain.request.WechatXmlRequestMessage;
import org.xarch.reliable.model.domain.response.WechatXmlResponseMessage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XStreamTransformer {

	private static final Logger logger = LoggerFactory.getLogger(XStreamTransformer.class);
	
	/**
	 * 将请求的Xml流数据转换成对象
	 * 
	 * @return WechatXmlMessage
	 * @throws JsonProcessingException
	 */
	public static WechatXmlRequestMessage Request2Xml(String request) {
		XmlMapper xmlMapper = new XmlMapper();
		try {
			return xmlMapper.readValue(request, WechatXmlRequestMessage.class);
		}catch(IOException e) {
			logger.error("Request数据转换对象失败  !!!");
			e.printStackTrace();
		}
		return new WechatXmlRequestMessage();
	}
	
	/**
	 * 将对象转换成Response的Xml流数据
	 * 
	 * @return String
	 * @throws JsonProcessingException
	 */
	public static String Xml2Response(WechatXmlResponseMessage response) {
		XmlMapper xmlMapper = new XmlMapper();
		try {
			return xmlMapper.writeValueAsString(response);
		}catch(JsonProcessingException e) {
			logger.error("对象转换Response失败 !!!");
			e.printStackTrace();
		}
		return new String();
	}
}
