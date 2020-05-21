package com.jeecg.bgxx.service;
import com.jeecg.bgxx.entity.BgxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BgxxServiceI extends CommonService{
	
 	public void delete(BgxxEntity entity) throws Exception;
 	
 	public Serializable save(BgxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BgxxEntity entity) throws Exception;
 	
}
