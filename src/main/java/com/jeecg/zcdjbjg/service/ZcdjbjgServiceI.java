package com.jeecg.zcdjbjg.service;
import com.jeecg.zcdjbjg.entity.ZcdjbjgEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface ZcdjbjgServiceI extends CommonService{
	
 	public void delete(ZcdjbjgEntity entity) throws Exception;
 	
 	public Serializable save(ZcdjbjgEntity entity) throws Exception;
 	
 	public void saveOrUpdate(ZcdjbjgEntity entity) throws Exception;
 	
}
