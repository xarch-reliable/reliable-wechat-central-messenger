package org.xarch.reliable.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.xarch.reliable.service.CustomerDispatch;

import reactor.core.publisher.Mono;

@RestController
public class CustomerController {

	@Autowired
	private CustomerDispatch customerDispath;
	
	@PostMapping("/message/send")
	public Mono<String> MessageSendController(@RequestBody Map<String, Object> requestdata) {

		return customerDispath.execute(requestdata);
	}
	
}
