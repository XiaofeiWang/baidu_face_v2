package com.baidu.ai.bean;

import java.io.Serializable;

public class LandmarkBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5322551618914172056L;
	private int x;
    private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
