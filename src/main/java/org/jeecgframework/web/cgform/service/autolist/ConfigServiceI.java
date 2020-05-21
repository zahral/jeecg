package org.jeecgframework.web.cgform.service.autolist;

import java.util.Map;
/**
动态配置服务接口
 */
public interface ConfigServiceI {
	/**
	 * 读取动态表配置
	 * @param configId 标示配置的id
	 * @return
	 */
	public Map<String,Object> queryConfigs(String configId,String jversion);
}
