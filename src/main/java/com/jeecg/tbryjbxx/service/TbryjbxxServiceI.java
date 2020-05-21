package com.jeecg.tbryjbxx.service;
import com.jeecg.tbryjbxx.entity.TbryjbxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TbryjbxxServiceI extends CommonService{
	
 	public void delete(TbryjbxxEntity entity) throws Exception;
 	
 	public Serializable save(TbryjbxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TbryjbxxEntity entity) throws Exception;
 	
}
