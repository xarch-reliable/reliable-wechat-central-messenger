package org.xarch.reliable.model.domain.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Video {
	
	@JacksonXmlProperty(localName="MediaId")
	@JacksonXmlCData(value =true)
	private String mediaId;
	
	@JacksonXmlProperty(localName="Title")
	@JacksonXmlCData(value =true)
	private String title;
	
	@JacksonXmlProperty(localName="Description")
	@JacksonXmlCData(value =true)
	private String description;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

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
	
	
}
