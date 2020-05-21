package com.jeecg.sybxjbxx.service;
import com.jeecg.sybxjbxx.entity.SybxjbxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface SybxjbxxServiceI extends CommonService{
	
 	public void delete(SybxjbxxEntity entity) throws Exception;
 	
 	public Serializable save(SybxjbxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(SybxjbxxEntity entity) throws Exception;
 	
}
