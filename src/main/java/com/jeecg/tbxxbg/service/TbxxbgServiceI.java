package com.jeecg.tbxxbg.service;
import com.jeecg.tbxxbg.entity.TbxxbgEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TbxxbgServiceI extends CommonService{
	
 	public void delete(TbxxbgEntity entity) throws Exception;
 	
 	public Serializable save(TbxxbgEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TbxxbgEntity entity) throws Exception;
 	
}
