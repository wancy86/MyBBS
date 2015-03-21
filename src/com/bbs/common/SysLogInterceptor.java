package com.bbs.common;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.bbs.common.base.BaseAction;

/*** 调试阶段的错误日志记录器 ***/
public class SysLogInterceptor extends MethodFilterInterceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Logger LOG = Logger.getLogger(getClass());

	// 拦截器核心实现方法
	protected String doIntercept(final ActionInvocation invocation)
			throws Exception {
		try {
			return invocation.invoke();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return BaseAction.response_exception;
		}
	}
}


