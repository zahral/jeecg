package com.jeecg.tbrybgdj.service;
import com.jeecg.tbrybgdj.entity.TbrybgdjEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TbrybgdjServiceI extends CommonService{
	
 	public void delete(TbrybgdjEntity entity) throws Exception;
 	
 	public Serializable save(TbrybgdjEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TbrybgdjEntity entity) throws Exception;
 	
}
