
package com.ultraman.model;

import java.io.Serializable;

/**
 * @Title: MesBodyEs.java
 * @Package daily.edu.data.model
 * @Description: 消息体子项
 * @author zhukai
 * @since 2017年1月6日 下午3:55:42
 * @version V1.0
 */
public class MesBodyEs implements Serializable {

	private static final long serialVersionUID = -8333022368386868495L;

	private String addr;

	private String filename;

	private String lat;

	private Long length;

	private double lng;

	private String msg;

	private String secret;

	private String type;

	private String url;

	private String urlAnother;

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlAnother() {
		return urlAnother;
	}

	public void setUrlAnother(String urlAnother) {
		this.urlAnother = urlAnother;
	}

}
