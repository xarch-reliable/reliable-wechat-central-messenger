package org.xarch.reliable.service.thread;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.xarch.reliable.service.token.TokenPostServer;

@Component
public class ThreadFnc {
	private static final Logger logger = LoggerFactory.getLogger(ThreadFnc.class);
	
	@Autowired
	private TokenPostServer tokenPostServer;

	@Async("asyncExecutor")
	public void TokenPost() {
		logger.info("ThreadFnc::TokenPost()" + (new Date()).toString());
		tokenPostServer.AccessTokenTimer();
	}
}
