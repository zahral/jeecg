package com.jeecg.dwryjf.service;
import com.jeecg.dwryjf.entity.DwryjfEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DwryjfServiceI extends CommonService{
	
 	public void delete(DwryjfEntity entity) throws Exception;
 	
 	public Serializable save(DwryjfEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DwryjfEntity entity) throws Exception;
 	
}
