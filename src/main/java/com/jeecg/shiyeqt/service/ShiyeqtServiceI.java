package com.jeecg.shiyeqt.service;
import com.jeecg.shiyeqt.entity.ShiyeqtEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface ShiyeqtServiceI extends CommonService{
	
 	public void delete(ShiyeqtEntity entity) throws Exception;
 	
 	public Serializable save(ShiyeqtEntity entity) throws Exception;
 	
 	public void saveOrUpdate(ShiyeqtEntity entity) throws Exception;
 	
}
