package com.jeecg.dbxjryxx.service;
import com.jeecg.dbxjryxx.entity.DbxjryxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DbxjryxxServiceI extends CommonService{
	
 	public void delete(DbxjryxxEntity entity) throws Exception;
 	
 	public Serializable save(DbxjryxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DbxjryxxEntity entity) throws Exception;
 	
}
