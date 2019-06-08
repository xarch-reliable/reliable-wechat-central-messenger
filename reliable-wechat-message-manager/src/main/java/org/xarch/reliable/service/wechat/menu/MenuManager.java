package org.xarch.reliable.service.wechat.menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.xarch.reliable.model.domain.menu.Menu;
import org.xarch.reliable.utils.http.WebHttpUtil;

import com.alibaba.fastjson.JSON;
import reactor.core.publisher.Mono;

@Service
public class MenuManager {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuManager.class);
	
	private static final String MENU_CREATE_POST_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=";
	private static final String MENU_GET_GET_URL = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=";
	private static final String MENU_DEL_GET_URL = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=";

	/**
	 * 创建菜单
	 */
	public Mono<String> createMenu(Menu menu){
		
		Mono<String> accessToken = WebHttpUtil.getAccessToken();
		logger.info("MenuManager::create : menu = " + JSON.toJSONString(menu));
		return accessToken.flatMap(r -> {
			return WebClient.create().post().uri(MENU_CREATE_POST_URL+r)
			.accept(MediaType.APPLICATION_JSON_UTF8)
			.body(Mono.just(JSON.toJSONString(menu)),String.class)
			.retrieve().bodyToMono(String.class);
		});
	}
	
	/**
	 * 查询菜单
	 */
	public Mono<String> getMenu() {
		
		Mono<String> accessToken = WebHttpUtil.getAccessToken();
		return accessToken.flatMap(r -> {
			return WebClient.create().get().uri(MENU_GET_GET_URL+r).retrieve().bodyToMono(String.class);
		});

	}
	
	/**
	 * 删除菜单
	 */
	public Mono<String> deleteMenu() {
		
		Mono<String> accessToken = WebHttpUtil.getAccessToken();
		return accessToken.flatMap(r -> {
			return WebClient.create().get().uri(MENU_DEL_GET_URL+r).retrieve().bodyToMono(String.class);
		});

	}
}
