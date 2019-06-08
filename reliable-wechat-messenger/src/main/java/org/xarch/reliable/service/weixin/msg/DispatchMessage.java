package org.xarch.reliable.service.weixin.msg;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xarch.reliable.config.event.EventType;
import org.xarch.reliable.config.event.MsgType;
import org.xarch.reliable.model.domain.request.WechatRequest;
import org.xarch.reliable.model.domain.response.WechatResponse;

public abstract class DispatchMessage {
	private static final Logger logger = LoggerFactory.getLogger(DispatchMessage.class);

	protected WechatResponse dispatch(WechatRequest wechatRequest) {
		if (StringUtils.isBlank(wechatRequest.getMsgType())) {
			logger.info("DispatchMessage::dispatch()-->msgType is null");
		}
		WechatResponse wechatResponse = new WechatResponse();
		MsgType msgType = MsgType.valueOf(wechatRequest.getMsgType());
		logger.info("msgType is " + msgType.name());
		switch (msgType) {
		case event:
			dispatchEvent(wechatRequest, wechatResponse);
			break;
		case text:
			onText(wechatRequest, wechatResponse);
			break;
		case image:
			// onImage();
			// break;
		case voice:
			// onVoice();
			// break;
		case video:
			// onVideo();
			// break;
		case shortvideo:
			// onShortvideo();
			// break;
		case location:
			// onLocation();
			// break;
		case link:
			// onLink();
			// break;
		default:
			onDefault(wechatRequest, wechatResponse);
			break;
		}
		return wechatResponse;
	}

	/**
	 * event事件分发
	 */
	private void dispatchEvent(WechatRequest wechatRequest, WechatResponse wechatResponse) {
		EventType event = EventType.valueOf(wechatRequest.getEvent());
		logger.info("dispatch event,event is " + event.name());
		switch (event) {
		case CLICK:
			// click();
			// break;
		case subscribe:
			// subscribe();
			// break;
		case unsubscribe:
			// unSubscribe();
			// break;
		case SCAN:
			// scan();
			// break;
		case LOCATION:
			// location();
			// break;
		case VIEW:
			// view();
			// break;
		case TEMPLATESENDJOBFINISH:
			// templateMsgCallback();
			// break;
		case scancode_push:
			// scanCodePush();
			// break;
		case scancode_waitmsg:
			// scanCodeWaitMsg();
			// break;
		case pic_sysphoto:
			// picSysPhoto();
			// break;
		case pic_photo_or_album:
			// picPhotoOrAlbum();
			// break;
		case pic_weixin:
			// picWeixin();
			// break;
		case location_select:
			// locationSelect();
			// break;
		case kf_create_session:
			// kfCreateSession();
			// break;
		case kf_close_session:
			// kfCloseSession();
			// break;
		case kf_switch_session:
			// kfSwitchSession();
			// break;
		default:
			onDefault(wechatRequest, wechatResponse);
			break;
		}
	}

	protected abstract void onText(WechatRequest wechatRequest, WechatResponse wechatResponse);

	protected void onDefault(WechatRequest wechatRequest, WechatResponse wechatResponse) {
		responseText(wechatResponse,"默认消息-->系统优化中...敬请期待!");
	};

	/**
	 * 回复文本消息
	 * 
	 * @param content 回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	protected void responseText(WechatResponse wechatResponse, String content) {
		wechatResponse.setMsgType(MsgType.text.name());
		wechatResponse.setContent(content);
	}

}
