package com.jeecg.dwbgxx.service;
import com.jeecg.dwbgxx.entity.DwbgxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwbgxxServiceI extends CommonService{
	
 	public void delete(DwbgxxEntity entity) throws Exception;
 	
 	public Serializable save(DwbgxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwbgxxEntity entity) throws Exception;
 	
}
