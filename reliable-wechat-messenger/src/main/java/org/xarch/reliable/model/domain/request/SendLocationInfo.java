package org.xarch.reliable.model.domain.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SendLocationInfo {
	
	@JacksonXmlProperty(localName ="Location_X")
	@JacksonXmlCData(value =true)
	private String Location_X;
	
	@JacksonXmlProperty(localName ="Location_Y")
	@JacksonXmlCData(value =true)
	private String Location_Y;
	
	@JacksonXmlProperty(localName ="Scale")
	@JacksonXmlCData(value =true)
	private String Scale;
	
	@JacksonXmlProperty(localName ="Label")
	@JacksonXmlCData(value =true)
	private String Label;
	
	@JacksonXmlProperty(localName ="Poiname")
	@JacksonXmlCData(value =true)
	private String Poiname;

	public String getLocation_X() {
		return Location_X;
	}
	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	public String getLocation_Y() {
		return Location_Y;
	}
	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}
	
	public String getScale() {
		return Scale;
	}
	public void setScale(String scale) {
		Scale = scale;
	}
	
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	
	public String getPoiname() {
		return Poiname;
	}
	public void setPoiname(String poiname) {
		Poiname = poiname;
	}
}
