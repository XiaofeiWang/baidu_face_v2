package com.baidu.ai.bean;

import java.io.Serializable;

public class TypeBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8016624111920394180L;
	 private double human;
     private double cartoon;
	public double getHuman() {
		return human;
	}
	public void setHuman(double human) {
		this.human = human;
	}
	public double getCartoon() {
		return cartoon;
	}
	public void setCartoon(double cartoon) {
		this.cartoon = cartoon;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
