package org.xarch.reliable.model.domain.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Item {

	@JacksonXmlProperty(localName="PicMd5Sum")
	@JacksonXmlCData(value =true)
	private String PicMd5Sum;

	public String getPicMd5Sum() {
		return PicMd5Sum;
	}
	public void setPicMd5Sum(String picMd5Sum) {
		PicMd5Sum = picMd5Sum;
	}
}
