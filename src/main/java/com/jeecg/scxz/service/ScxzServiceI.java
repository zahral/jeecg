package com.jeecg.scxz.service;
import com.jeecg.scxz.entity.ScxzEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface ScxzServiceI extends CommonService{
	
 	public void delete(ScxzEntity entity) throws Exception;
 	
 	public Serializable save(ScxzEntity entity) throws Exception;
 	
 	public void saveOrUpdate(ScxzEntity entity) throws Exception;
 	
}
