package com.jeecg.ylbxpzgrxx.service;
import com.jeecg.ylbxpzgrxx.entity.YlbxpzgrxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface YlbxpzgrxxServiceI extends CommonService{
	
 	public void delete(YlbxpzgrxxEntity entity) throws Exception;
 	
 	public Serializable save(YlbxpzgrxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(YlbxpzgrxxEntity entity) throws Exception;
 	
}
