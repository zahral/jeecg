package com.jeecg.qita.service;
import com.jeecg.qita.entity.QitaEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface QitaServiceI extends CommonService{
	
 	public void delete(QitaEntity entity) throws Exception;
 	
 	public Serializable save(QitaEntity entity) throws Exception;
 	
 	public void saveOrUpdate(QitaEntity entity) throws Exception;
 	
}
