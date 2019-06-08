package org.xarch.reliable.config.type;

/**
 * 微信消息类型
 * 大小写对应微信接口
 * @author xarch
 */
public enum MsgType {
	
	event,      // 事件消息
	text,       // 文本消息
	image,      // 图片消息
	voice,      // 语音消息
	video,      // 视频消息
	shortvideo, // 小视频消息
	location,   // 位置消息
	link,       // 链接消息
	music,      // 音乐消息
	news,       // 图文消息
	transfer_customer_service; // 客服系统
	
}
