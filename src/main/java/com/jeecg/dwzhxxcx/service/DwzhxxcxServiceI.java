package com.jeecg.dwzhxxcx.service;
import com.jeecg.dwzhxxcx.entity.DwzhxxcxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwzhxxcxServiceI extends CommonService{
	
 	public void delete(DwzhxxcxEntity entity) throws Exception;
 	
 	public Serializable save(DwzhxxcxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwzhxxcxEntity entity) throws Exception;
 	
}
