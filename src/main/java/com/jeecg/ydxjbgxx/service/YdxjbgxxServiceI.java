package com.jeecg.ydxjbgxx.service;
import com.jeecg.ydxjbgxx.entity.YdxjbgxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface YdxjbgxxServiceI extends CommonService{
	
 	public void delete(YdxjbgxxEntity entity) throws Exception;
 	
 	public Serializable save(YdxjbgxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(YdxjbgxxEntity entity) throws Exception;
 	
}
