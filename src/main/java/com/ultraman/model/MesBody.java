
package com.ultraman.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Title: MesBody.java
 * @Package daily.edu.data.model
 * @Description: 消息体
 * @author zhukai
 * @since 2017年1月6日 下午3:54:39
 * @version V1.0
 */
public class MesBody implements Serializable {

	private static final long serialVersionUID = 5207143990131459756L;

	private List<MesBodyEs> bodies;

	private Map<String, Object> ext;

	public List<MesBodyEs> getBodies() {
		return bodies;
	}

	public void setBodies(List<MesBodyEs> bodies) {
		this.bodies = bodies;
	}

	public Map<String, Object> getExt() {
		return ext;
	}

	public void setExt(Map<String, Object> ext) {
		this.ext = ext;
	}

}
