package com.jeecg.dwjbxxtjcx.service;
import com.jeecg.dwjbxxtjcx.entity.DwjbxxtjcxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwjbxxtjcxServiceI extends CommonService{
	
 	public void delete(DwjbxxtjcxEntity entity) throws Exception;
 	
 	public Serializable save(DwjbxxtjcxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwjbxxtjcxEntity entity) throws Exception;
 	
}
