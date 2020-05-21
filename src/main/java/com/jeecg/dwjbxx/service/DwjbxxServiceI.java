package com.jeecg.dwjbxx.service;
import com.jeecg.dwjbxx.entity.DwjbxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwjbxxServiceI extends CommonService{
	
 	public void delete(DwjbxxEntity entity) throws Exception;
 	
 	public Serializable save(DwjbxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwjbxxEntity entity) throws Exception;
 	
}
