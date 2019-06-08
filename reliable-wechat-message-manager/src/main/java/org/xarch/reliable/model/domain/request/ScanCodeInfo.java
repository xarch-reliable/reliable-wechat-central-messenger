package org.xarch.reliable.model.domain.request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ScanCodeInfo {
	
	@JacksonXmlProperty(localName="ScanType")
	@JacksonXmlCData(value =true)
	private String scanType;   //扫描类型，一般是qrcode
	
	@JacksonXmlProperty(localName="ScanResult")
	@JacksonXmlCData(value =true)
	private String scanResult; //扫描结果，即二维码对应的字符串信息

	public String getScanType() {
		return scanType;
	}

	public void setScanType(String scanType) {
		this.scanType = scanType;
	}

	public String getScanResult() {
		return scanResult;
	}

	public void setScanResult(String scanResult) {
		this.scanResult = scanResult;
	}

	
}
