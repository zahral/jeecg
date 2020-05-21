package com.jeecg.bxzyxx.service;
import com.jeecg.bxzyxx.entity.BxzyxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BxzyxxServiceI extends CommonService{
	
 	public void delete(BxzyxxEntity entity) throws Exception;
 	
 	public Serializable save(BxzyxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BxzyxxEntity entity) throws Exception;
 	
}
