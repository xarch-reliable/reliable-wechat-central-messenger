package org.xarch.reliable.service.feign;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.xarch.reliable.controller.hystrix.FeignCenterControllerHystrix;

@FeignClient(name = "reliable-wechat-central-controller", fallback = FeignCenterControllerHystrix.class)
public interface FeignCenterController {
	
	@GetMapping("/token/get")
	public Map<String, Object> getToken();

}
