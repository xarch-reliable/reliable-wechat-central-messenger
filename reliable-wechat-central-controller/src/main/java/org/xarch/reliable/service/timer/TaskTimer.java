package org.xarch.reliable.service.timer;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.xarch.reliable.service.thread.ThreadFnc;

@Service
public class TaskTimer {

	private static final Logger logger = LoggerFactory.getLogger(TaskTimer.class);

	private static final long PERIOD = 6000 * 1000;
	
	@Autowired
	private ThreadFnc threadFnc;

	@Scheduled(initialDelay = 3000, fixedDelay = PERIOD) // 6000秒 [access_token的有效期是7200秒][首次延迟3秒]
	public void Timer() {
		logger.info("TaskTimer::AccessTokenTimer()" + (new Date()).toString());
		threadFnc.TokenPost();
	}

}

/*
 * (cron = ) + Async == fixedRate 上一次开始执行时间点之后5秒再执行
 * 
 * (cron = ) == fixedDelay 上一次执行完毕时间点之后5秒再执行
 */
