package com.baidu.ai;

import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONML;
import org.json.JSONObject;

import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;
import com.google.gson.JsonObject;

public class FaceDetect {
	/**
	    * 重要提示代码中所需工具类
	    * FileUtil,Base64Util,HttpUtil,GsonUtils请从
	    * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
	    * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
	    * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
	    * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
	    * 下载
	    */
	    public static String detect() {
	        // 请求url
	        String url = "https://aip.baidubce.com/rest/2.0/face/v1/detect";
	        try {
	            // 本地文件路径
	        	String file = "H:\\1.jpg";
	            String filePath = file;
	            byte[] imgData = FileUtil.readFileByBytes(filePath);
	            String imgStr = Base64Util.encode(imgData);
	            String imgParam = URLEncoder.encode(imgStr, "UTF-8");
	            String param = "max_face_num=" + 5 + "&face_fields=" + "age,beauty,expression,faceshape,gender,glasses,landmark,race,qualities" + "&image=" + imgParam;
	            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
	            String accessToken = "24.76caecd82ddafacf307e78a0bfc32823.2592000.1529031428.282335-11157326";
	            String result = HttpUtil.post(url, accessToken, param);
	            System.out.println(result);
	            return result;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	       String str = FaceDetect.detect();
	       String one = str.substring(0, 2);
	       System.out.println(one);
	    }
}
