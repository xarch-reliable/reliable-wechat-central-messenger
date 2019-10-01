package org.xarch.reliable.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.xarch.reliable.service.CustomerServer;

@Service
public class CustomerServerImpl implements CustomerServer {
	
	@Override
	public Map<String, Object> onSendImage(String mediaId) {
		Map<String, Object> datamap = new HashMap<String, Object>();
		datamap.put("media_id", mediaId);
		return datamap;
	}

	@Override
	public Map<String, Object> onSendText(String content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> onSendVoice(String mediaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> onSendNews(String title, String description, String url,
			String picurl) {
		// TODO Auto-generated method stub
		return null;
	}

}
