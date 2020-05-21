package org.jeecgframework.core.online.exception;
/**
 * 
 * @Title:CgReportNotFoundException
 * @description:动态报表配置没有找到异常
 */
public class CgReportNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CgReportNotFoundException(String msg) {
		 super(msg);
	}
}
