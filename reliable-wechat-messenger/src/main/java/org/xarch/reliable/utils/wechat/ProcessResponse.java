package org.xarch.reliable.utils.wechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xarch.reliable.model.domain.request.WechatRequest;
import org.xarch.reliable.model.domain.response.WechatResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ProcessResponse {

	private static final Logger logger = LoggerFactory.getLogger(ProcessResponse.class);

	/**
	 * 返回响应数据
	 * 
	 * @return
	 * @throws JsonProcessingException
	 */
	public static String response(WechatResponse wechatResponse) {
		// TODO
		XmlMapper xmlMapper = new XmlMapper();
		try {
			return xmlMapper.writeValueAsString(wechatResponse);
		} catch (JsonProcessingException e) {
			logger.error("pojo对象转xml失败!");
			e.printStackTrace();
		}
		return new String();
	}

	/**
	 * 响应数据基础构造
	 */
	public static void responseBase(WechatRequest wechatRequest, WechatResponse wechatResponse) {
		wechatResponse.setToUserName(wechatRequest.getFromUserName());
		wechatResponse.setFromUserName(wechatRequest.getToUserName());
		wechatResponse.setCreateTime(wechatRequest.getCreateTime());
	}
}
