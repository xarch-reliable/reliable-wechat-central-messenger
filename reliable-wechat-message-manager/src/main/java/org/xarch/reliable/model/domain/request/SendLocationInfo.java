package org.xarch.reliable.model.domain.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SendLocationInfo {
	
	@JacksonXmlProperty(localName ="Location_X")
	@JacksonXmlCData(value =true)
	private String location_X;
	
	@JacksonXmlProperty(localName ="Location_Y")
	@JacksonXmlCData(value =true)
	private String location_Y;
	
	@JacksonXmlProperty(localName ="Scale")
	@JacksonXmlCData(value =true)
	private String scale;
	
	@JacksonXmlProperty(localName ="Label")
	@JacksonXmlCData(value =true)
	private String label;
	
	@JacksonXmlProperty(localName ="Poiname")
	@JacksonXmlCData(value =true)
	private String poiname;

	public String getLocation_X() {
		return location_X;
	}

	public void setLocation_X(String location_X) {
		this.location_X = location_X;
	}

	public String getLocation_Y() {
		return location_Y;
	}

	public void setLocation_Y(String location_Y) {
		this.location_Y = location_Y;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPoiname() {
		return poiname;
	}

	public void setPoiname(String poiname) {
		this.poiname = poiname;
	}

}
