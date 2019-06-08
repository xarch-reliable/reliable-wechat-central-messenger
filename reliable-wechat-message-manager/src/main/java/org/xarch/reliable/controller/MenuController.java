package org.xarch.reliable.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xarch.reliable.model.domain.menu.MenuSimple;
import org.xarch.reliable.service.wechat.menu.MenuManager;

import reactor.core.publisher.Mono;

@RestController
public class MenuController {

	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	@Autowired
	private MenuManager menuManager;
	
	@GetMapping("/menu/create")
	public Mono<String> create() {
		logger.info("发起创建菜单请求...");
		Mono<String> response = menuManager.createMenu(MenuSimple.MenuSimple1());
		return response;
	}
	
	@GetMapping("/menu/get")
	public Mono<String> get() {
		logger.info("发起获取菜单请求...");
		Mono<String> response = menuManager.getMenu();
		return response;
	}
	
	@GetMapping("/menu/delete")
	public Mono<String> delete() {
		logger.info("发起删除菜单请求...");
		Mono<String> response = menuManager.deleteMenu();
		return response;
	}
}
