package com.jeecg.ydxbjbxi.service;
import com.jeecg.ydxbjbxi.entity.YdxbjbxiEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface YdxbjbxiServiceI extends CommonService{
	
 	public void delete(YdxbjbxiEntity entity) throws Exception;
 	
 	public Serializable save(YdxbjbxiEntity entity) throws Exception;
 	
 	public void saveOrUpdate(YdxbjbxiEntity entity) throws Exception;
 	
}
