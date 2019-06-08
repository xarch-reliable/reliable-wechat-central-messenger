package org.xarch.reliable.model.domain.response;

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
public class WechatXmlResponseMessage {

	///////////////////////
	// 回复微信消息的xml属性
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
	
	@JacksonXmlProperty(localName = "Image")
	private Image image;
	
	@JacksonXmlProperty(localName = "Voice")
	private Voice voice;
	
	@JacksonXmlProperty(localName = "Video")
	private Video video;
	
	@JacksonXmlProperty(localName = "Music")
	private Music music;
	
	@JacksonXmlProperty(localName = "ArticleCount")
	private Integer articleCount;
	
	@JacksonXmlProperty(localName = "Articles")
	private Articles articles;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public Integer getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(Integer articleCount) {
		this.articleCount = articleCount;
	}

	public Articles getArticles() {
		return articles;
	}

	public void setArticles(Articles articles) {
		this.articles = articles;
	}

	
}
