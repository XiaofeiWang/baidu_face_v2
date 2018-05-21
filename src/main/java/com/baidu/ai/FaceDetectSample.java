package com.baidu.ai;

import java.net.URLEncoder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;
import com.baidu.ai.bean.FaceDetectBean;


public class FaceDetectSample {

	/** 请求路径 */
	public static String FACE_DETECT_URL="https://aip.baidubce.com/rest/2.0/face/v1/detect";

	public static void main(String[] args) throws Exception {
		String filePath = "H:\\3.jpg";
		String accessToken = "24.76caecd82ddafacf307e78a0bfc32823.2592000.1529031428.282335-11157326";
		String result = faceDetect(filePath,"1",accessToken);
		JSON json = JSON.parseObject(result);
		FaceDetectBean bean = JSONObject.toJavaObject(json, FaceDetectBean.class);
		System.out.println("人脸数量:"+bean.getResult_num());
		System.out.println("美丑打分:"+bean.getResult().get(0).getBeauty());
		System.out.println("年龄:"+bean.getResult().get(0).getAge());
		
		/** 是否佩戴眼睛 */
		int glasses = bean.getResult().get(0).getGlasses();
		if(glasses==0){
			System.out.println("不带眼睛");
		}else if(glasses==1){
			System.out.println("普通眼镜");
		}else{
			System.out.println("墨镜");
		}
		
		/** 是否微笑 */
		int expression = bean.getResult().get(0).getExpression();
		if(expression==0){
			System.out.println("不笑");
		}else if(expression==1){
			System.out.println("微笑");
		}else{
			System.out.println("大笑");
		}
	}
	
	
	public static String faceDetect(String filePath,String max_face_num,String accessToken) throws Exception {
		byte[] imgData = FileUtil.readFileByBytes(filePath);
        String imgStr = Base64Util.encode(imgData);
        String params = "image=" + URLEncoder.encode(imgStr,"UTF-8")+"&max_face_num="+max_face_num+"&face_fields=age,beauty,expression,faceshape,gender,glasses,landmark,race,qualities";
		String result = HttpUtil.post(FACE_DETECT_URL, accessToken, params);
		return result;
	}
	
}
