package com.jeecg.dwjfgz.service.impl;
import com.jeecg.dwjfgz.service.DwjfgzServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.dwjfgz.entity.DwjfgzEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

import org.jeecgframework.minidao.util.FreemarkerParseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.jeecgframework.core.util.ResourceUtil;

@Service("dwjfgzService")
@Transactional
public class DwjfgzServiceImpl extends CommonServiceImpl implements DwjfgzServiceI {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
 	public void delete(DwjfgzEntity entity) throws Exception{
 		super.delete(entity);
 	}
 	
 	public Serializable save(DwjfgzEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(DwjfgzEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 	}
 	
}