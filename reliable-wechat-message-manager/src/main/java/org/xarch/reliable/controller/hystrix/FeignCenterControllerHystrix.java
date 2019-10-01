package org.xarch.reliable.controller.hystrix;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.xarch.reliable.service.feign.FeignCenterController;

@Service
public class FeignCenterControllerHystrix implements FeignCenterController{

	@Override
	public Map<String, Object> getToken() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("error_msg", "[FeignCenterController]发起数据请求失败");
		return map;
	}
}
