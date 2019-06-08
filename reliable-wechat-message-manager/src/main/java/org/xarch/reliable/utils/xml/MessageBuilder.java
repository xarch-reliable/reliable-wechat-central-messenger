package org.xarch.reliable.utils.xml;

import org.xarch.reliable.config.type.MsgType;
import org.xarch.reliable.model.domain.request.WechatXmlRequestMessage;
import org.xarch.reliable.model.domain.response.Articles;
import org.xarch.reliable.model.domain.response.Image;
import org.xarch.reliable.model.domain.response.Item;
import org.xarch.reliable.model.domain.response.Music;
import org.xarch.reliable.model.domain.response.Video;
import org.xarch.reliable.model.domain.response.Voice;
import org.xarch.reliable.model.domain.response.WechatXmlResponseMessage;

public class MessageBuilder {

	/**
	 * Response基础数据构造
	 */
	public static void buildBase(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		response.setToUserName(request.getFromUserName());
		response.setFromUserName(request.getToUserName());
		response.setCreateTime(request.getCreateTime());
	}
	
	/**
	 * 回复文本消息
	 * 
	 * @param content 回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	public static void buildText(WechatXmlResponseMessage response, String content) {
		response.setMsgType(MsgType.text.name());
		response.setContent(content);
		return;
	}
	
	/**
	 * 回复图片消息
	 * 
	 * @param content 回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	public static void buildImage(WechatXmlResponseMessage response, String mediaId) {
		response.setMsgType(MsgType.image.name());
		Image image = new Image();
		image.setMediaId(mediaId);
		response.setImage(image);
		return;
	}
	
	/**
	 * 回复语音消息
	 * 
	 * @param content 回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	public static void buildVoice(WechatXmlResponseMessage response, String mediaId) {
		response.setMsgType(MsgType.voice.name());
		Voice voice = new Voice();
		voice.setMediaId(mediaId);
		response.setVoice(voice);
		return;
	}
	
	/**
	 * 回复视频消息
	 * 
	 * @param content 回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	public static void buildVideo(WechatXmlResponseMessage response, String mediaId, String title, String description) {
		response.setMsgType(MsgType.video.name());
		Video video = new Video();
		video.setMediaId(mediaId);
		video.setTitle(title);
		video.setDescription(description);
		response.setVideo(video);
		return;
	}
	
	/**
	 * 回复音乐消息
	 * 
	 * @param content 回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	public static void buildMusic(WechatXmlResponseMessage response, 
									String title,
									String description,
									String musicUrl,
									String hQMusicUrl,
									String thumbMediaId) {
		response.setMsgType(MsgType.music.name());
		Music music = new Music();
		music.setTitle(title);
		music.setDescription(description);
		music.setMusicUrl(musicUrl);
		music.sethQMusicUrl(hQMusicUrl);
		music.setThumbMediaId(thumbMediaId);
		response.setMusic(music);
		return;
	}
	
	/**
	 * 回复图文消息
	 * 
	 * @param content 回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	public static void buildNews(WechatXmlResponseMessage response, 
									String title,
									String description,
									String picUrl,
									String url) {
		response.setMsgType(MsgType.news.name());
		response.setArticleCount(1);
		Articles articles = new Articles();
		Item item = new Item();
		item.setTitle(title);
		item.setDescription(description);
		item.setPicUrl(picUrl);
		item.setUrl(url);
		articles.setItem(item);
		response.setArticles(articles);
		return;
	}
}
