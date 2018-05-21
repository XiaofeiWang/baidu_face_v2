package com.baidu.ai.bean;

import java.io.Serializable;

public class FaceshapeBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1890144489368487642L;

	 private String type;
     private double probability;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getProbability() {
		return probability;
	}
	public void setProbability(double probability) {
		this.probability = probability;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
