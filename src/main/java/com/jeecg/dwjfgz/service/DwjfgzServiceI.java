package com.jeecg.dwjfgz.service;
import com.jeecg.dwjfgz.entity.DwjfgzEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwjfgzServiceI extends CommonService{
	
 	public void delete(DwjfgzEntity entity) throws Exception;
 	
 	public Serializable save(DwjfgzEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwjfgzEntity entity) throws Exception;
 	
}
