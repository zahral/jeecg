package com.jeecg.zrdwxx.service;
import com.jeecg.zrdwxx.entity.ZrdwxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface ZrdwxxServiceI extends CommonService{
	
 	public void delete(ZrdwxxEntity entity) throws Exception;
 	
 	public Serializable save(ZrdwxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(ZrdwxxEntity entity) throws Exception;
 	
}
