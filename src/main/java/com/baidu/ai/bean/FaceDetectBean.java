package com.baidu.ai.bean;

import java.io.Serializable;
import java.util.List;

public class FaceDetectBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7765117946606120156L;
	
	private int result_num;
    private int log_id;
    private List<ResultBean> result;
	public int getResult_num() {
		return result_num;
	}
	public void setResult_num(int result_num) {
		this.result_num = result_num;
	}
	public int getLog_id() {
		return log_id;
	}
	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}
	public List<ResultBean> getResult() {
		return result;
	}
	public void setResult(List<ResultBean> result) {
		this.result = result;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
