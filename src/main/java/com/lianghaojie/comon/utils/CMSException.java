package com.lianghaojie.comon.utils;

import com.sun.tools.javac.util.Assert;

/**
 * 
 * @ClassName: CMSException 
 * @Description: 自定义异常类
 * @author:单击开始
 * @date: 2019年7月15日 上午9:07:29
 */
public class CMSException extends Exception {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @Title:CMSException
	 * @Description:构造方法
	 */
	public CMSException() {
		super();
	}
	/**
	 * 
	 * @Title:CMSException
	 * @Description:重写构造方法
	 * @param message
	 */
	public CMSException(String message) {
		Assert.error(message);
	}
}
