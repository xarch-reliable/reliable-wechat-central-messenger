package org.xarch.reliable.model.domain.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ScanCodeInfo {
	
	@JacksonXmlProperty(localName="ScanType")
	@JacksonXmlCData(value =true)
	private String ScanType;   //扫描类型，一般是qrcode
	
	@JacksonXmlProperty(localName="ScanResult")
	@JacksonXmlCData(value =true)
	private String ScanResult; //扫描结果，即二维码对应的字符串信息
	
	public String getScanType() {
		return ScanType;
	}
	public void setScanType(String scanType) {
		ScanType = scanType;
	}

	public String getScanResult() {
		return ScanResult;
	}
	public void setScanResult(String scanResult) {
		ScanResult = scanResult;
	}
}
