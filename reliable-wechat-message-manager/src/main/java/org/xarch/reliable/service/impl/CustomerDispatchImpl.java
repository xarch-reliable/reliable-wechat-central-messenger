package org.xarch.reliable.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xarch.reliable.config.type.CustomerType;
import org.xarch.reliable.service.CustomerDispatch;
import org.xarch.reliable.service.CustomerServer;
import org.xarch.reliable.utils.BaseResultTools;
import org.xarch.reliable.utils.http.WebHttpUtil;

import reactor.core.publisher.Mono;

@Service
public class CustomerDispatchImpl implements CustomerDispatch {

	private static final Logger logger = LoggerFactory.getLogger(CustomerDispatchImpl.class);
	
	@Autowired
	private CustomerServer customerServer;
	
	@Autowired
	private WebHttpUtil webHttpUtil;
	
	@SuppressWarnings("unchecked")
	@Override
	public Mono<String> execute(Map<String, Object> data) {
		String msgtype = (String)data.get("msgtype");
		String touseropenid = (String)data.get("touser");
		return dispatch(touseropenid, msgtype, (Map<String, Object>)data.get("data"));
	}

	@Override
	public Mono<String> dispatch(String touseropenid, String msgtype, Map<String, Object> bodyMap) {
		logger.info("CustomerDispatchImpl::dispatch() : msgtype = " + msgtype);
		Map<String, Object> sendMap = new HashMap<String, Object>();
		CustomerType msgType = CustomerType.valueOf(msgtype);

		switch (msgType) {
		case text:
			
			break;
		case image:
			sendMap.put("image", customerServer.onSendImage((String)bodyMap.get("media_id")));
			break;
		case voice:
			
			break;
		case news:
			
			break;
		default:

			break;
		}
		sendMap.put("touser", touseropenid);
		sendMap.put("msgtype", msgtype);
		return webHttpUtil.sendCustomerMessage(BaseResultTools.JsonObjectToStr(sendMap));
	}

}
