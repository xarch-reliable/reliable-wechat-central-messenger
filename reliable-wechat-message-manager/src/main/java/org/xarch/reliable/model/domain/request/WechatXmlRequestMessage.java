package org.xarch.reliable.model.domain.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 微信推送过来的消息，xml格式
 * 部分未注释的字段的解释请查阅相关微信开发文档：
 * <a href="http://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421140453&token=&lang=zh_CN">接收普通消息</a>
 * <a href="http://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421140454&token=&lang=zh_CN">接收事件推送</a>
 * @author xarch
 *
 */
@JacksonXmlRootElement(localName = "xml")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE) //屏蔽重复输出字段(针对jackson序列)]
@JsonInclude(Include.NON_NULL) //屏蔽null字段(针对jackson序列化)
public class WechatXmlRequestMessage {

	///////////////////////
	// 微信推送过来的消息的xml属性
	// 部分不涉及功能未写
	///////////////////////
	
	@JacksonXmlProperty(localName = "ToUserName")
	@JacksonXmlCData(value = true)
	private String toUserName;

	@JacksonXmlProperty(localName = "FromUserName")
	@JacksonXmlCData(value = true)
	private String fromUserName;

	@JacksonXmlProperty(localName = "CreateTime")
	private Long createTime;

	@JacksonXmlProperty(localName = "MsgType")
	@JacksonXmlCData(value = true)
	private String msgType;

	@JacksonXmlProperty(localName = "Content")
	@JacksonXmlCData(value = true)
	private String content;
	
	@JacksonXmlProperty(localName = "MenuId")
	private Long menuId;
	
	@JacksonXmlProperty(localName = "MsgId")
	private Long msgId;
	
	@JacksonXmlProperty(localName = "PicUrl")
	@JacksonXmlCData(value = true)
	private String picUrl;
	
	@JacksonXmlProperty(localName = "MediaId")
	@JacksonXmlCData(value = true)
	private String mediaId;
	
	@JacksonXmlProperty(localName = "Format")
	@JacksonXmlCData(value = true)
	private String format;
	
	@JacksonXmlProperty(localName = "ThumbMediaId")
	@JacksonXmlCData(value = true)
	private String thumbMediaId;
	
	@JacksonXmlProperty(localName = "Location_X")
	private Double location_X;

	@JacksonXmlProperty(localName = "Location_Y")
	private Double location_Y;
	
	@JacksonXmlProperty(localName = "Scale")
	private Double scale;
	
	@JacksonXmlProperty(localName = "Label")
	@JacksonXmlCData(value = true)
	private String label;
	
	@JacksonXmlProperty(localName = "Title")
	@JacksonXmlCData(value = true)
	private String title;
	
	@JacksonXmlProperty(localName = "Description")
	@JacksonXmlCData(value = true)
	private String description;
	
	@JacksonXmlProperty(localName = "Url")
	@JacksonXmlCData(value = true)
	private String url;
	
	@JacksonXmlProperty(localName = "Ticket")
	@JacksonXmlCData(value = true)
	private String ticket;
	
	@JacksonXmlProperty(localName = "Latitude")
	private Double latitude;
	
	@JacksonXmlProperty(localName = "Longitude")
	private Double longitude;
	
	@JacksonXmlProperty(localName = "Precision")
	private Double precision;
	
	@JacksonXmlProperty(localName = "Recognition")
	@JacksonXmlCData(value = true)
	private String recognition;
	
	@JacksonXmlProperty(localName = "UnionId")
	@JacksonXmlCData(value = true)
	private String unionId;

	@JacksonXmlProperty(localName = "Event")
	@JacksonXmlCData(value = true)
	private String event;

	@JacksonXmlProperty(localName = "EventKey")
	@JacksonXmlCData(value = true)
	private String eventKey;
	
	///////////////////////
	// 微信推送事件
	///////////////////////
	
	@JacksonXmlProperty(localName = "ScanCodeInfo")
	private ScanCodeInfo scanCodeInfo;
	
	@JacksonXmlProperty(localName = "SendPicsInfo")
	private SendPicsInfo sendPicsInfo;
	
	@JacksonXmlProperty(localName = "SendLocationInfo")
	private SendLocationInfo sendLocationInfo;
	
	
	///////////////////////////////////////
	// 群发消息返回的结果
	///////////////////////////////////////
	
	/**
	 * 群发的结果.
	 */
	@JacksonXmlProperty(localName = "Status")
	@JacksonXmlCData(value = true)
	private String status;
	
	/**
	 * group_id下粉丝数；或者openid_list中的粉丝数.
	 */
	@JacksonXmlProperty(localName = "TotalCount")
	private Integer totalCount;
	
	/**
	 * 过滤（过滤是指特定地区、性别的过滤、用户设置拒收的过滤，用户接收已超4条的过滤）后，准备发送的粉丝数.
	 * 原则上，filterCount = sentCount + errorCount
	 */
	@JacksonXmlProperty(localName = "FilterCount")
	private Integer filterCount;
	
	/**
	 * 发送成功的粉丝数.
	 */
	@JacksonXmlProperty(localName = "SentCount")
	private Integer sentCount;
	
	/**
	 * 发送失败的粉丝数.
	 */
	@JacksonXmlProperty(localName = "ErrorCount")
	private Integer errorCount;
	
	///////////////////////////////////////
	// 客服会话管理相关事件推送
	///////////////////////////////////////
	
	/**
	* 创建或关闭客服会话时的客服帐号.
	*/
	@JacksonXmlProperty(localName = "KfAccount")
	private String kfAccount;
	
	/**
	* 转接客服会话时的转入客服帐号.
	*/
	@JacksonXmlProperty(localName = "ToKfAccount")
	private String toKfAccount;
	
	/**
	* 转接客服会话时的转出客服帐号.
	*/
	@JacksonXmlProperty(localName = "FromKfAccount")
	private String fromKfAccount;

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	
	public ScanCodeInfo getScanCodeInfo() {
		return scanCodeInfo;
	}

	public void setScanCodeInfo(ScanCodeInfo scanCodeInfo) {
		this.scanCodeInfo = scanCodeInfo;
	}

	public SendPicsInfo getSendPicsInfo() {
		return sendPicsInfo;
	}

	public void setSendPicsInfo(SendPicsInfo sendPicsInfo) {
		this.sendPicsInfo = sendPicsInfo;
	}

	public SendLocationInfo getSendLocationInfo() {
		return sendLocationInfo;
	}

	public void setSendLocationInfo(SendLocationInfo sendLocationInfo) {
		this.sendLocationInfo = sendLocationInfo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public Double getLocation_X() {
		return location_X;
	}

	public void setLocation_X(Double location_X) {
		this.location_X = location_X;
	}

	public Double getLocation_Y() {
		return location_Y;
	}

	public void setLocation_Y(Double location_Y) {
		this.location_Y = location_Y;
	}

	public Double getScale() {
		return scale;
	}

	public void setScale(Double scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getPrecision() {
		return precision;
	}

	public void setPrecision(Double precision) {
		this.precision = precision;
	}

	public String getRecognition() {
		return recognition;
	}

	public void setRecognition(String recognition) {
		this.recognition = recognition;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getFilterCount() {
		return filterCount;
	}

	public void setFilterCount(Integer filterCount) {
		this.filterCount = filterCount;
	}

	public Integer getSentCount() {
		return sentCount;
	}

	public void setSentCount(Integer sentCount) {
		this.sentCount = sentCount;
	}

	public Integer getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

	public String getKfAccount() {
		return kfAccount;
	}

	public void setKfAccount(String kfAccount) {
		this.kfAccount = kfAccount;
	}

	public String getToKfAccount() {
		return toKfAccount;
	}

	public void setToKfAccount(String toKfAccount) {
		this.toKfAccount = toKfAccount;
	}

	public String getFromKfAccount() {
		return fromKfAccount;
	}

	public void setFromKfAccount(String fromKfAccount) {
		this.fromKfAccount = fromKfAccount;
	}
	

}
