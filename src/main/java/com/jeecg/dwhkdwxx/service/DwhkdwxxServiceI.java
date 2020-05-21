package com.jeecg.dwhkdwxx.service;
import com.jeecg.dwhkdwxx.entity.DwhkdwxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwhkdwxxServiceI extends CommonService{
	
 	public void delete(DwhkdwxxEntity entity) throws Exception;
 	
 	public Serializable save(DwhkdwxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwhkdwxxEntity entity) throws Exception;
 	
}
