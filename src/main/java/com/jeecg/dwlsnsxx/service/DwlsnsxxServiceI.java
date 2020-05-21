package com.jeecg.dwlsnsxx.service;
import com.jeecg.dwlsnsxx.entity.DwlsnsxxEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwlsnsxxServiceI extends CommonService{
	
 	public void delete(DwlsnsxxEntity entity) throws Exception;
 	
 	public Serializable save(DwlsnsxxEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwlsnsxxEntity entity) throws Exception;
 	
}
