package org.xarch.reliable.model.domain.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 用于回复的基本消息类型
 * 
 * @author Wei
 *
 */
@JacksonXmlRootElement(localName = "xml")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
//屏蔽重复输出字段[get方法][针对jackson序列化]
@JsonInclude(Include.NON_NULL)
//屏蔽null字段[针对jackson序列化]
public class WechatResponse {

	@JacksonXmlProperty(localName = "ToUserName")
	@JacksonXmlCData(value = true)
	private String ToUserName;

	@JacksonXmlProperty(localName = "FromUserName")
	@JacksonXmlCData(value = true)
	private String FromUserName;

	@JacksonXmlProperty(localName = "CreateTime")
	private String CreateTime;

	@JacksonXmlProperty(localName = "MsgType")
	@JacksonXmlCData(value = true)
	private String MsgType;

	@JacksonXmlProperty(localName = "Content")
	@JacksonXmlCData(value = true)
	private String Content;

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}
