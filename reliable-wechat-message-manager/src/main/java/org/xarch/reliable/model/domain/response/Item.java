package org.xarch.reliable.model.domain.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Item {
	
	@JacksonXmlProperty(localName="Title")
	@JacksonXmlCData(value =true)
	private String title;
	
	@JacksonXmlProperty(localName="Description")
	@JacksonXmlCData(value =true)
	private String description;
	
	@JacksonXmlProperty(localName="PicUrl")
	@JacksonXmlCData(value =true)
	private String picUrl;
	
	@JacksonXmlProperty(localName="Url")
	@JacksonXmlCData(value =true)
	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
