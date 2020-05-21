package com.jeecg.shiyedwjbxx.service;
import com.jeecg.shiyedwjbxx.entity.ShiyedwjbxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface ShiyedwjbxxServiceI extends CommonService{
	
 	public void delete(ShiyedwjbxxEntity entity) throws Exception;
 	
 	public Serializable save(ShiyedwjbxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(ShiyedwjbxxEntity entity) throws Exception;
 	
}
