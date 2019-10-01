package org.xarch.reliable.service;

import java.util.Map;

public interface CustomerServer {

	public Map<String, Object> onSendImage(String mediaId);
	
	public Map<String, Object> onSendText(String content);
	
	public Map<String, Object> onSendVoice(String mediaId);
	
	public Map<String, Object> onSendNews(String title, String description, String url, String picurl);
	
}
