package com.bbs.common.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class BaseAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
/*	
	// 0-成功
	// -1表示sessionid错误
	// -2表示入参错误
	// -3表示server业务处理错误
	// -4表示账号错误，账号已经存在或者不存在。
	// -5表示密码错误。
	// -6表示权限错误。
	// -7表示验证码错误
	public static final int RET_SUCCESS = 0;
	public static final int RET_ERROR_SESSIONID = -1;
	public static final int RET_ERROR_INPUT = -2;
	public static final int RET_ERROR_SERVICE = -3;
	public static final int RET_ERROR_ACCOUNT = -4;
	public static final int RET_ERROR_PASSWD = -5;
	public static final int RET_ERROR_AUTHORITY = -6;
	public static final int RET_ERROR_VALIDATECODE = -7;
*/
	// Action错误页面跳转如下：
	public static final String response_rermission_denied = "response_rermission_denied";
	public static final String response_exception = "response_exception";
	public static final String response_error_input = "response_error_input"; 
	public static final String response_reflush = "response_reflush"; 
	public static final String response_group_reflush="response_group_reflush";
	
	
		
	/*** 代表页面的响应结果的对象 ***/
    protected Object responseObj;
	public Object getResponseObj() {
		return responseObj;
	}
	public void setResponseObj(Object responseObj) {
		this.responseObj = responseObj;
	}
	
	
	/***获取当前的Request对象***/
	public HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}
	
	/***获取当前的Response对象***/
	public HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}	

	

}
