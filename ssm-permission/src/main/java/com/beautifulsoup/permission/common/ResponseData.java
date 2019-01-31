package com.beautifulsoup.permission.common;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>Title: ResponseData</p>
 * <p>Description:统一响应数据返回 </p>
 * <p>Author: BeautifulSoup</p>
 * <p>Time: 2019年1月29日 下午6:27:56</p>
 */
@Getter
@Setter
public class ResponseData {
	private boolean ret;
	private String message;
	private Object data;
	public ResponseData(boolean ret) {
		this.ret = ret;
	}
	public static ResponseData success(Object data,String message) {
		ResponseData response=new ResponseData(true);
		response.message=message;
		response.data=data;
		return response;
	}
	public static ResponseData success(Object data) {
		ResponseData response=new ResponseData(true);
		response.data=data;
		return response;
	}
	public static ResponseData success() {
		ResponseData response=new ResponseData(true);
		return response;
	}
	public static ResponseData fail(String message) {
		ResponseData response=new ResponseData(false);
		response.message=message;
		return response;
	}
	public Map<String,Object> toMap(){
		HashMap<String,Object> result=new HashMap<String, Object>();
		result.put("ret",ret);
		result.put("message", message);
		result.put("data", data);
		return result;
		
	}
}
