package com.jeecg.dwcbxx.service;
import com.jeecg.dwcbxx.entity.DwcbxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwcbxxServiceI extends CommonService{
	
 	public void delete(DwcbxxEntity entity) throws Exception;
 	
 	public Serializable save(DwcbxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwcbxxEntity entity) throws Exception;
 	
}
