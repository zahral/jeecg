package com.jeecg.dwzhxx.service;
import com.jeecg.dwzhxx.entity.DwzhxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwzhxxServiceI extends CommonService{
	
 	public void delete(DwzhxxEntity entity) throws Exception;
 	
 	public Serializable save(DwzhxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwzhxxEntity entity) throws Exception;
 	
}
