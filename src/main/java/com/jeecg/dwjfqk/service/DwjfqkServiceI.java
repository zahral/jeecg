package com.jeecg.dwjfqk.service;
import com.jeecg.dwjfqk.entity.DwjfqkEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwjfqkServiceI extends CommonService{
	
 	public void delete(DwjfqkEntity entity) throws Exception;
 	
 	public Serializable save(DwjfqkEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwjfqkEntity entity) throws Exception;
 	
}
