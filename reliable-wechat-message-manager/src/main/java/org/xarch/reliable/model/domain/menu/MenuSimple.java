package org.xarch.reliable.model.domain.menu;

import java.util.ArrayList;
import java.util.List;

import org.xarch.reliable.config.type.EventType;

public class MenuSimple {
	/**
	 * 菜单内容模板
	 */
	public static Menu MenuSimple1() {
		
		//扫码按钮
		MenuButton Btn11_Scancode = new MenuButton();
		Btn11_Scancode.setName("扫码功能");
		Btn11_Scancode.setType(EventType.scancode_push);
		Btn11_Scancode.setKey("扫码功能");
		
		//拍照发图
		MenuButton Btn12_PicSysPhoto = new MenuButton();
		Btn12_PicSysPhoto.setName("拍照发图");
		Btn12_PicSysPhoto.setType(EventType.pic_sysphoto);
		Btn12_PicSysPhoto.setKey("拍照发图");
		
		//弹出相册
		MenuButton Btn13_PicPhotoOrAlbum = new MenuButton();
		Btn13_PicPhotoOrAlbum.setName("拍照/相册");
		Btn13_PicPhotoOrAlbum.setType(EventType.pic_photo_or_album);
		Btn13_PicPhotoOrAlbum.setKey("拍照/相册");
		
		// 弹出地理位置选择器
		MenuButton Btn14_LocationSelect = new MenuButton();
		Btn14_LocationSelect.setName("地理位置");
		Btn14_LocationSelect.setType(EventType.location_select);
		Btn14_LocationSelect.setKey("地理位置");
		
		// 单击按钮
		MenuButton B15_Click = new MenuButton();
		B15_Click.setName("单击按钮");
		B15_Click.setType(EventType.click);
		B15_Click.setKey("单击按钮");

		// 设置二级菜单内容
		List<MenuButton> B1_button = new ArrayList<MenuButton>();
		B1_button.add(Btn11_Scancode);
		B1_button.add(Btn12_PicSysPhoto);
		B1_button.add(Btn13_PicPhotoOrAlbum);
		B1_button.add(Btn14_LocationSelect);
		B1_button.add(B15_Click);
		
		
		
		// 跳转主页
		MenuButton Btn2_View = new MenuButton();
		Btn2_View.setName("靠谱吧");
		Btn2_View.setType(EventType.view);
		Btn2_View.setUrl("https://www.xarchgroup.net/test/dist/index.html");
		
		
		
		
		// 跳转URL
		MenuButton Btn31_View = new MenuButton();
		Btn31_View.setName("授权测试");
		Btn31_View.setType(EventType.view);
		Btn31_View.setUrl("https://www.xarchgroup.net/test/oauth/index.html");
		
		// 跳转URL
		MenuButton Btn32_View = new MenuButton();
		Btn32_View.setName("支付测试");
		Btn32_View.setType(EventType.view);
		Btn32_View.setUrl("https://www.xarchgroup.net/test/pay/index.html");


		// 设置二级菜单内容
		List<MenuButton> B3_button = new ArrayList<MenuButton>();
		B3_button.add(Btn31_View);
		B3_button.add(Btn32_View);


		// 二级菜单
		MenuButton sub1 = new MenuButton();
		sub1.setName("点击菜单");
		sub1.setSubButton(B1_button);
		MenuButton sub3 = new MenuButton();
		sub3.setName("授权认证");
		sub3.setSubButton(B3_button);

		// 总菜单
		List<MenuButton> button = new ArrayList<MenuButton>();
		button.add(sub1);
		button.add(Btn2_View);
		button.add(sub3);

		Menu menu = new Menu();
		menu.setButton(button);

		return menu;
	}
}
