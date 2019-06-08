package org.xarch.reliable.service.wechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xarch.reliable.config.type.EventType;
import org.xarch.reliable.config.type.MsgType;
import org.xarch.reliable.model.domain.request.WechatXmlRequestMessage;
import org.xarch.reliable.model.domain.response.WechatXmlResponseMessage;

import io.micrometer.core.instrument.util.StringUtils;

public abstract class WechatDispatch {

	private static final Logger logger = LoggerFactory.getLogger(WechatDispatch.class);
	
	protected WechatXmlResponseMessage mydispatch(WechatXmlRequestMessage request) {
		
		if(StringUtils.isBlank(request.getMsgType())) {
			logger.info("WechatDispatch::mydispatch() : msgType is null !!!");
		}
		WechatXmlResponseMessage response = new WechatXmlResponseMessage();
		MsgType msgType = MsgType.valueOf(request.getMsgType());
		logger.info("WechatDispatch::mydispatch() : msgType is " + msgType.name());
		switch(msgType) {
		case event:
			praseEvent(request, response);
			break;
		case text:
			onText(request, response);
			break;
		case image:
			onImage(request, response);
			break;
		case voice:
			onVoice(request, response);
			break;
		case location:
			onLocation(request, response);
			break;
		case video:
			onVideo(request, response);
			break;
		case shortvideo:
			onShortvideo(request, response);
			break;
		case link:
			onLink(request, response);
			break;
		default:
			onDefault(request, response);
			break;
		}
		return response;
	}

	private void praseEvent(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		EventType event = EventType.valueOf(request.getEvent());
		logger.info("WechatDispatch::praseEvent() : event is " + event.name());
		switch (event) {
		case CLICK:
			click(request, response);
			break;
		case subscribe:
			logger.info("WechatDispatch::praseEvent() : 关注事件触发");
			subscribe(request, response);
			break;
		case unsubscribe:
			logger.info("WechatDispatch::praseEvent() : 取关事件触发");
			unSubscribe(request, response);
			break;
		case SCAN:
			scan(request, response);
			break;
		case LOCATION:
			logger.info("WechatDispatch::praseEvent() : 上传位置事件触发");
			location(request, response);
			break;
		case VIEW:
			logger.info("WechatDispatch::praseEvent() : 跳转事件触发");
			view(request, response);
			break;
		case TEMPLATESENDJOBFINISH:
			templateMsgCallback(request, response);
			break;
		case scancode_push:
			logger.info("WechatDispatch::praseEvent() : 扫码事件触发");
			scanCodePush(request, response);
			break;
		case scancode_waitmsg:
			scanCodeWaitMsg(request, response);
			break;
		case pic_sysphoto:
			picSysPhoto(request, response);
			break;
		case pic_photo_or_album:
			picPhotoOrAlbum(request, response);
			break;
		case pic_weixin:
			picWeixin(request, response);
			break;
		case location_select:
			logger.info("WechatDispatch::praseEvent() : 位置选择事件触发");
			locationSelect(request, response);
			break;
		case kf_create_session:
			logger.info("WechatDispatch::praseEvent() : 创建对话事件触发");
			kfCreateSession(request, response);
			break;
		case kf_close_session:
			logger.info("WechatDispatch::praseEvent() : 关闭对话事件触发");
			kfCloseSession(request, response);
			break;
		case kf_switch_session:
			logger.info("WechatDispatch::praseEvent() : 转入对话事件触发");
			kfSwitchSession(request, response);
			break;
		default:
			logger.info("WechatDispatch::praseEvent() : 默认事件触发");
			onDefault(request, response);
			break;
		}
	}

	protected abstract void kfSwitchSession(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void kfCloseSession(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void kfCreateSession(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void locationSelect(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void picWeixin(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void picPhotoOrAlbum(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void picSysPhoto(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void scanCodeWaitMsg(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void scanCodePush(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void templateMsgCallback(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void view(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void location(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void scan(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void unSubscribe(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void subscribe(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void click(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void onText(WechatXmlRequestMessage request, WechatXmlResponseMessage response);
	
	protected abstract void onLink(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void onLocation(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void onShortvideo(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void onVideo(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void onVoice(WechatXmlRequestMessage request, WechatXmlResponseMessage response);

	protected abstract void onImage(WechatXmlRequestMessage request, WechatXmlResponseMessage response);
	
	protected abstract void onDefault(WechatXmlRequestMessage request, WechatXmlResponseMessage response);
	
}
