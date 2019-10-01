package org.xarch.reliable.service;

import java.util.Map;

public interface CustomerDispatch {
	
	public Map<String, Object> execute(Map<String, Object> data);
	
	public Map<String, Object> dispatch(String touseropenid, String msgtype, Map<String, Object> bodyMap);
}
