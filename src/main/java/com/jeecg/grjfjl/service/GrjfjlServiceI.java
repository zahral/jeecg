package com.jeecg.grjfjl.service;
import com.jeecg.grjfjl.entity.GrjfjlEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface GrjfjlServiceI extends CommonService{
	
 	public void delete(GrjfjlEntity entity) throws Exception;
 	
 	public Serializable save(GrjfjlEntity entity) throws Exception;
 	
 	public void saveOrUpdate(GrjfjlEntity entity) throws Exception;
 	
}
