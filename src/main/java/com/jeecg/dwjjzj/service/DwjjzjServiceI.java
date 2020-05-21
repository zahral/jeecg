package com.jeecg.dwjjzj.service;
import com.jeecg.dwjjzj.entity.DwjjzjEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwjjzjServiceI extends CommonService{
	
 	public void delete(DwjjzjEntity entity) throws Exception;
 	
 	public Serializable save(DwjjzjEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwjjzjEntity entity) throws Exception;
 	
}
