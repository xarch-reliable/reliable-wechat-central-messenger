package org.xarch.reliable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReliableWechatMessageManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReliableWechatMessageManagerApplication.class, args);
	}

}
