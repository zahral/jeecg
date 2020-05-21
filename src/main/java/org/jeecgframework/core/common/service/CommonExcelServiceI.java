package org.jeecgframework.core.common.service;

import java.util.Collection;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
动态报表excel导出
 */
public interface CommonExcelServiceI extends CommonService{
	/**
	 * 
	 * @param title 标题
	 * @param titleSet	报表头
	 * @param dataSet	报表内容
	 * @return
	 */
	public HSSFWorkbook exportExcel(String title, Collection<?> titleSet,Collection<?> dataSet);
}
