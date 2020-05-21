package com.jeecg.qkbjcxtjlr.service;
import com.jeecg.qkbjcxtjlr.entity.QkbjcxtjlrEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface QkbjcxtjlrServiceI extends CommonService{
	
 	public void delete(QkbjcxtjlrEntity entity) throws Exception;
 	
 	public Serializable save(QkbjcxtjlrEntity entity) throws Exception;
 	
 	public void saveOrUpdate(QkbjcxtjlrEntity entity) throws Exception;
 	
}
