package org.xarch.reliable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  //定时器
@EnableCaching //缓存
public class ReliableWechatCentralControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReliableWechatCentralControllerApplication.class, args);
	}

}
