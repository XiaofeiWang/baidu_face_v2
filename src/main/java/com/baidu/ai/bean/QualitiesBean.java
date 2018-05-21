package com.baidu.ai.bean;

import java.io.Serializable;

public class QualitiesBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3655628236737587881L;

	private OcclusionBean occlusion;
    private int blur;
    private int illumination;
    private int completeness;
    private TypeBean type;
	public OcclusionBean getOcclusion() {
		return occlusion;
	}
	public void setOcclusion(OcclusionBean occlusion) {
		this.occlusion = occlusion;
	}
	public int getBlur() {
		return blur;
	}
	public void setBlur(int blur) {
		this.blur = blur;
	}
	public int getIllumination() {
		return illumination;
	}
	public void setIllumination(int illumination) {
		this.illumination = illumination;
	}
	public int getCompleteness() {
		return completeness;
	}
	public void setCompleteness(int completeness) {
		this.completeness = completeness;
	}
	public TypeBean getType() {
		return type;
	}
	public void setType(TypeBean type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
