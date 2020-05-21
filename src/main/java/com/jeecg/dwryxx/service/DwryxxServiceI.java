package com.jeecg.dwryxx.service;
import com.jeecg.dwryxx.entity.DwryxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwryxxServiceI extends CommonService{
	
 	public void delete(DwryxxEntity entity) throws Exception;
 	
 	public Serializable save(DwryxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwryxxEntity entity) throws Exception;
 	
}
