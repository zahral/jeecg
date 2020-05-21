package com.jeecg.zhfhxx.service;
import com.jeecg.zhfhxx.entity.ZhfhxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface ZhfhxxServiceI extends CommonService{
	
 	public void delete(ZhfhxxEntity entity) throws Exception;
 	
 	public Serializable save(ZhfhxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(ZhfhxxEntity entity) throws Exception;
 	
}
