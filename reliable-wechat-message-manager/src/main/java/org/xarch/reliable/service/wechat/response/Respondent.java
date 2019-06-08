package org.xarch.reliable.service.wechat.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.xarch.reliable.model.domain.request.SendLocationInfo;
import org.xarch.reliable.model.domain.request.WechatXmlRequestMessage;
import org.xarch.reliable.model.domain.response.WechatXmlResponseMessage;
import org.xarch.reliable.service.wechat.WechatManager;
import org.xarch.reliable.utils.xml.MessageBuilder;

@Service
public class Respondent extends WechatManager {

	private static final Logger logger = LoggerFactory.getLogger(WechatManager.class);

	@Override
	protected void onText(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		String content = request.getContent();
		logger.info("Respondent::onText() : content ==> " + content);
		if(content != null) {
			switch(content) {
			case "test":
				MessageBuilder.buildText(response, "测试成功");
				break;
			case "王洪亮":
				MessageBuilder.buildText(response, "你输入的是个智障");
				break;
			case "宛春宇":
				MessageBuilder.buildText(response, "这真是一个天才");
				break;
			case "赵倩昀":
				MessageBuilder.buildText(response, "这好像是个小仙女");
				break;
			case "韦伟钦":
				MessageBuilder.buildText(response, "你输入的是我韦哥吗？");
				break;
			case "富雪":
				MessageBuilder.buildText(response, "她不是该去找图标吗");
				break;
			case "季鑫":
				MessageBuilder.buildText(response, "哎...");
				break;
			case "图文消息":
				MessageBuilder.buildNews(response, "靠谱吧", "这是一个图文消息", 
										"https://xarchgroup.net/images/user-003.png", 
										"https://www.xarchgroup.net/test/dist/index.html");
				break;
			case "音乐":
				MessageBuilder.buildText(response, "呃呃呃...我还没准备好音乐");
				break;
			default:
				MessageBuilder.buildText(response, "您输入的消息为：" + content);
				break;
			}
		}else {
			MessageBuilder.buildText(response, "您的消息为空,请核对后再重试");
		}
		return;
		
	}

	@Override
	protected void onLink(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "链接消息");
		
	}

	@Override
	protected void onLocation(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		Double location_X = request.getLocation_X();
		Double location_Y = request.getLocation_Y();
		String label = request.getLabel();
		if(label != null) {
			MessageBuilder.buildText(response, "您当前位置信息为 { 纬度为："+ location_X +
									", 经度为："+ location_Y +
									", 地点为："+ label +
									" }");
		}else {
			MessageBuilder.buildText(response, "您的消息为空,请核对后再重试");
		}
		return;
		
	}

	@Override
	protected void onShortvideo(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "小视频消息");
		
	}

	@Override
	protected void onVideo(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "视频消息");
		
	}

	@Override
	protected void onVoice(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		String mediaId = request.getMediaId();
		
		if(mediaId != null) {
			MessageBuilder.buildVoice(response, mediaId);
		}else {
			MessageBuilder.buildVoice(response, "您的消息为空,请核对后再重试");
		}
		
	}

	@Override
	protected void onImage(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		String mediaId = request.getMediaId();
		
		if(mediaId != null) {
			MessageBuilder.buildImage(response, mediaId);
		}else {
			MessageBuilder.buildImage(response, "您的消息为空,请核对后再重试");
		}
		return;
		
	}

	@Override
	protected void onDefault(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "未开发消息模板，敬请期待");
		return;
		
	}

	@Override
	protected void kfSwitchSession(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "你好，有什么能帮助你的吗？");
		
	}

	@Override
	protected void kfCloseSession(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "再见，希望下次再相遇");
		
	}

	@Override
	protected void kfCreateSession(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "你好，有什么能帮助你的么？");
		
	}

	@Override
	protected void locationSelect(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		SendLocationInfo sendLocationInfo = request.getSendLocationInfo();
		String location_X = sendLocationInfo.getLocation_X();
		String location_Y = sendLocationInfo.getLocation_Y();
		String label = sendLocationInfo.getLabel();
		MessageBuilder.buildText(response, "您选择的位置信息为 { 纬度为："+ location_X +
				", 经度为："+ location_Y +
				", 地点为："+ label +
				" }");
	}

	@Override
	protected void picWeixin(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "弹出微信相册发图器的事件");
		
	}

	@Override
	protected void picPhotoOrAlbum(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "弹出拍照或者相册发图的事件");
		
	}

	@Override
	protected void picSysPhoto(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "弹出系统拍照发图的事件");
		
	}

	@Override
	protected void scanCodeWaitMsg(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "扫码推事件且弹出“消息接收中”提示框的事件");
		
	}

	@Override
	protected void scanCodePush(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "扫码推事件");
		
	}

	@Override
	protected void templateMsgCallback(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "模板消息发送成功之后事件");
		
	}

	@Override
	protected void view(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "跳转链接事件");
		
	}

	@Override
	protected void location(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "上报地理位置成功");
		
	}

	@Override
	protected void scan(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "扫描事件");
		
	}

	@Override
	protected void unSubscribe(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "哼，您居然取消了关注");
		
	}

	@Override
	protected void subscribe(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "欢迎关注锦衣测试，这里会让你变得更靠谱");
		
	}

	@Override
	protected void click(WechatXmlRequestMessage request, WechatXmlResponseMessage response) {
		MessageBuilder.buildText(response, "点击事件");
		
	}

}
