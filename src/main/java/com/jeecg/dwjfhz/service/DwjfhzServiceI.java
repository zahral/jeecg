package com.jeecg.dwjfhz.service;
import com.jeecg.dwjfhz.entity.DwjfhzEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwjfhzServiceI extends CommonService{
	
 	public void delete(DwjfhzEntity entity) throws Exception;
 	
 	public Serializable save(DwjfhzEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwjfhzEntity entity) throws Exception;
 	
}
