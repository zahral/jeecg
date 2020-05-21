package com.jeecg.danwpzclxx.service;
import com.jeecg.danwpzclxx.entity.DanwpzclxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DanwpzclxxServiceI extends CommonService{
	
 	public void delete(DanwpzclxxEntity entity) throws Exception;
 	
 	public Serializable save(DanwpzclxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DanwpzclxxEntity entity) throws Exception;
 	
}
