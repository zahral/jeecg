package com.jeecg.tbzhxx.service;
import com.jeecg.tbzhxx.entity.TbzhxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TbzhxxServiceI extends CommonService{
	
 	public void delete(TbzhxxEntity entity) throws Exception;
 	
 	public Serializable save(TbzhxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TbzhxxEntity entity) throws Exception;
 	
}
