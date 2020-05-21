package com.jeecg.dbrylbxx.service;
import com.jeecg.dbrylbxx.entity.DbrylbxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DbrylbxxServiceI extends CommonService{
	
 	public void delete(DbrylbxxEntity entity) throws Exception;
 	
 	public Serializable save(DbrylbxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DbrylbxxEntity entity) throws Exception;
 	
}
