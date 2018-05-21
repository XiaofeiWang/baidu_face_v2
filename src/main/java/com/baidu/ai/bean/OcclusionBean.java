package com.baidu.ai.bean;

import java.io.Serializable;

public class OcclusionBean implements Serializable{

	
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1092005440493648300L;
	private int left_eye;
	private int right_eye;
	private int nose;
	private int mouth;
	private int left_cheek;
	private int right_cheek;
	private int chin;
	public int getLeft_eye() {
		return left_eye;
	}
	public void setLeft_eye(int left_eye) {
		this.left_eye = left_eye;
	}
	public int getRight_eye() {
		return right_eye;
	}
	public void setRight_eye(int right_eye) {
		this.right_eye = right_eye;
	}
	public int getNose() {
		return nose;
	}
	public void setNose(int nose) {
		this.nose = nose;
	}
	public int getMouth() {
		return mouth;
	}
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	public int getLeft_cheek() {
		return left_cheek;
	}
	public void setLeft_cheek(int left_cheek) {
		this.left_cheek = left_cheek;
	}
	public int getRight_cheek() {
		return right_cheek;
	}
	public void setRight_cheek(int right_cheek) {
		this.right_cheek = right_cheek;
	}
	public int getChin() {
		return chin;
	}
	public void setChin(int chin) {
		this.chin = chin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
