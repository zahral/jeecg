package com.jeecg.danweixinxi.service;
import com.jeecg.danweixinxi.entity.DanweixinxiEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface DanweixinxiServiceI extends CommonService{
	
 	public void delete(DanweixinxiEntity entity) throws Exception;
 	
 	public Serializable save(DanweixinxiEntity entity) throws Exception;
 	
 	public void saveOrUpdate(DanweixinxiEntity entity) throws Exception;
 	
}
