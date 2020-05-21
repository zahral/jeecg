package com.jeecg.cetzxx.service;
import com.jeecg.cetzxx.entity.CetzxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface CetzxxServiceI extends CommonService{
	
 	public void delete(CetzxxEntity entity) throws Exception;
 	
 	public Serializable save(CetzxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(CetzxxEntity entity) throws Exception;
 	
}
