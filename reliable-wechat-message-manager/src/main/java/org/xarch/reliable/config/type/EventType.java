package org.xarch.reliable.config.type;

/**
 * 微信事件消息类型
 * 大小写对应微信接口
 * @author xarch
 */
public enum EventType {

	subscribe,            // 关注事件
	unsubscribe,          // 取关事件
	click,                // 创建菜单使用
	CLICK,                // 点击事件
	view,                 // 
	VIEW,                 // 跳转链接事件
	SCAN,                 // 扫描事件
	LOCATION,             // 上报地理位置
	TEMPLATESENDJOBFINISH,// 模板消息发送成功之后事件
	scancode_push,        // 扫码推事件
	scancode_waitmsg,     // 扫码推事件且弹出“消息接收中”提示框的事件
	pic_sysphoto,         // 弹出系统拍照发图的事件
	pic_photo_or_album,   // 弹出拍照或者相册发图的事件
	pic_weixin,           // 弹出微信相册发图器的事件
	location_select,      // 弹出地理位置选择器的事件
	media_id,             // 下发消息(除文本消息)事件
	view_limited,         // 跳转图文消息事件
	kf_create_session,    // 接入会话事件
	kf_close_session,     // 关闭会话事件
	kf_switch_session,    // 转接会话事件

}
