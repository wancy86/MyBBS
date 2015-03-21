package com.bbs.common.base;

public class BaseJsonBean {
	private int ret; // 0-正确, -1-sessionid错误, -2入参错误, -3业务处理错误
	public int getRet() {
		return ret;
	}

	public void setRet(int ret) {
		this.ret = ret;
	}
	
}
