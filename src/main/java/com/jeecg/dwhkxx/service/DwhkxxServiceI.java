package com.jeecg.dwhkxx.service;
import com.jeecg.dwhkxx.entity.DwhkxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwhkxxServiceI extends CommonService{
	
 	public void delete(DwhkxxEntity entity) throws Exception;
 	
 	public Serializable save(DwhkxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwhkxxEntity entity) throws Exception;
 	
}
