package org.xarch.reliable.model.domain.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Music {
	
	@JacksonXmlProperty(localName="Title")
	@JacksonXmlCData(value =true)
	private String title;
	
	@JacksonXmlProperty(localName="Description")
	@JacksonXmlCData(value =true)
	private String description;
	
	@JacksonXmlProperty(localName="MusicUrl")
	@JacksonXmlCData(value =true)
	private String musicUrl;
	
	@JacksonXmlProperty(localName="HQMusicUrl")
	@JacksonXmlCData(value =true)
	private String hQMusicUrl;
	
	@JacksonXmlProperty(localName="ThumbMediaId")
	@JacksonXmlCData(value =true)
	private String thumbMediaId;

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

	public String getMusicUrl() {
		return musicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}

	public String gethQMusicUrl() {
		return hQMusicUrl;
	}

	public void sethQMusicUrl(String hQMusicUrl) {
		this.hQMusicUrl = hQMusicUrl;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	
	
}
