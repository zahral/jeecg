package com.jeecg.cbpzxxdj.service;
import com.jeecg.cbpzxxdj.entity.CbpzxxdjEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface CbpzxxdjServiceI extends CommonService{
	
 	public void delete(CbpzxxdjEntity entity) throws Exception;
 	
 	public Serializable save(CbpzxxdjEntity entity) throws Exception;
 	
 	public void saveOrUpdate(CbpzxxdjEntity entity) throws Exception;
 	
}
