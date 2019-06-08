package org.xarch.reliable.model.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 微信request的对象属性<br/>
 * 不用cdata标记直接可以解析<br/>
 * 包括所有类型的节点,若报文中无此属性则解析的时候不会生成本属性<br/>
 * @author Wei
 *
 */
@JacksonXmlRootElement(localName = "xml")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
//屏蔽重复输出字段[get方法][针对jackson序列化]
@JsonInclude(Include.NON_NULL)
//屏蔽null字段[针对jackson序列化]
public class WechatRequest {

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

	@JacksonXmlProperty(localName = "Event")
	@JacksonXmlCData(value = true)
	private String Event;

	@JacksonXmlProperty(localName = "EventKey")
	@JacksonXmlCData(value = true)
	private String EventKey;

	@JacksonXmlProperty(localName = "MsgId")
	private String MsgId;

	@JacksonXmlProperty(localName = "Content")
	@JacksonXmlCData(value = true)
	private String Content;

	@JacksonXmlProperty(localName = "Location_X")
	private String Location_X;

	@JacksonXmlProperty(localName = "Location_Y")
	private String Location_Y;

	@JacksonXmlProperty(localName = "Scale")
	private String Scale;

	@JacksonXmlProperty(localName = "Label")
	@JacksonXmlCData(value = true)
	private String Label;

	@JacksonXmlProperty(localName = "Title")
	@JacksonXmlCData(value = true)
	private String Title;

	@JacksonXmlProperty(localName = "Description")
	@JacksonXmlCData(value = true)
	private String Description;

	@JacksonXmlProperty(localName = "Url")
	@JacksonXmlCData(value = true)
	private String Url;

	@JacksonXmlProperty(localName = "PicUrl")
	@JacksonXmlCData(value = true)
	private String PicUrl;

	@JacksonXmlProperty(localName = "MediaId")
	@JacksonXmlCData(value = true)
	private String MediaId;

	@JacksonXmlProperty(localName = "Format")
	@JacksonXmlCData(value = true)
	private String Format;

	@JacksonXmlProperty(localName = "Status")
	@JacksonXmlCData(value = true)
	private String Status;

	@JacksonXmlProperty(localName = "Latitude")
	private String Latitude; // 上报地理位置事件Latitude

	@JacksonXmlProperty(localName = "Longitude")
	private String Longitude; // 上报地理位置事件Longitude

	@JacksonXmlProperty(localName = "Precision")
	private String Precision; // 上报地理位置事件Precision

	@JacksonXmlProperty(localName = "Ticket")
	@JacksonXmlCData(value = true)
	private String Ticket; // 扫描带参数二维码事件Ticket

	@JacksonXmlProperty(localName = "ThumbMediaId")
	@JacksonXmlCData(value = true)
	private String ThumbMediaId; // 视频消息 ThumbMediaId 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据

	@JacksonXmlProperty(localName = "ScanCodeInfo")
	private ScanCodeInfo ScanCodeInfo; // 扫描信息

	@JacksonXmlProperty(localName = "SendPicsInfo")
	private SendPicsInfo SendPicsInfo; // 发送的图片信息

	@JacksonXmlProperty(localName = "SendLocationInfo")
	private SendLocationInfo SendLocationInfo; // 发送的位置信息

	@JacksonXmlProperty(localName = "Recognition")
	@JacksonXmlCData(value = true)
	private String Recognition;

	public String getRecognition() {
		return Recognition;
	}

	public void setRecognition(String recognition) {
		Recognition = recognition;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	public String getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public String getMsgId() {
		return MsgId;
	}

	public void setMsgId(String msgId) {
		MsgId = msgId;
	}

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

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	public String getPrecision() {
		return Precision;
	}

	public void setPrecision(String precision) {
		Precision = precision;
	}

	public String getTicket() {
		return Ticket;
	}

	public void setTicket(String ticket) {
		Ticket = ticket;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

	public ScanCodeInfo getScanCodeInfo() {
		return ScanCodeInfo;
	}

	public void setScanCodeInfo(ScanCodeInfo scanCodeInfo) {
		ScanCodeInfo = scanCodeInfo;
	}

	public SendPicsInfo getSendPicsInfo() {
		return SendPicsInfo;
	}

	public void setSendPicsInfo(SendPicsInfo sendPicsInfo) {
		SendPicsInfo = sendPicsInfo;
	}

	public SendLocationInfo getSendLocationInfo() {
		return SendLocationInfo;
	}

	public void setSendLocationInfo(SendLocationInfo sendLocationInfo) {
		SendLocationInfo = sendLocationInfo;
	}
}
