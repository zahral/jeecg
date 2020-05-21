package org.jeecgframework.web.system.service;

import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.service.CommonService;


public interface FunctionService extends CommonService{

	/**
	 * 删除菜单
	 * @param function
	 * @return 
	 */
	public AjaxJson delFunction(String functionId);
}
