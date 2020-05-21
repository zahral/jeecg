package com.jeecg.shiyedwpzclxx.service;
import com.jeecg.shiyedwpzclxx.entity.ShiyedwpzclxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface ShiyedwpzclxxServiceI extends CommonService{
	
 	public void delete(ShiyedwpzclxxEntity entity) throws Exception;
 	
 	public Serializable save(ShiyedwpzclxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(ShiyedwpzclxxEntity entity) throws Exception;
 	
}
