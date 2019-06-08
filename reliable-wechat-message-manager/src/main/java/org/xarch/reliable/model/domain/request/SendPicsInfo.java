package org.xarch.reliable.model.domain.request;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SendPicsInfo {

	@JacksonXmlProperty(localName="Count")
	private String count;
	
	@JacksonXmlElementWrapper(localName="PicList")
	@JacksonXmlProperty(localName="item")
	private List<Item> item;

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
	
}
