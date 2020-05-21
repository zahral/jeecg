package com.jeecg.dbxjryxx.controller;
import com.jeecg.dbxjryxx.entity.DbxjryxxEntity;
import com.jeecg.dbxjryxx.service.DbxjryxxServiceI;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.common.TreeChildCount;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import java.util.HashMap;
import org.jeecgframework.core.util.ExceptionUtil;


/**   
 短保续接人员信息
 */
@Controller
@RequestMapping("/dbxjryxxController")
public class DbxjryxxController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(DbxjryxxController.class);

	@Autowired
	private DbxjryxxServiceI dbxjryxxService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * 短保续接人员信息列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/dbxjryxx/dbxjryxxList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(DbxjryxxEntity dbxjryxx,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(DbxjryxxEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, dbxjryxx, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.dbxjryxxService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除短保续接人员信息
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(DbxjryxxEntity dbxjryxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		dbxjryxx = systemService.getEntity(DbxjryxxEntity.class, dbxjryxx.getId());
		message = "断保续接人员信息删除成功";
		try{
			dbxjryxxService.delete(dbxjryxx);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "断保续接人员信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除短保续接人员信息
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "断保续接人员信息删除成功";
		try{
			for(String id:ids.split(",")){
				DbxjryxxEntity dbxjryxx = systemService.getEntity(DbxjryxxEntity.class, 
				id
				);
				dbxjryxxService.delete(dbxjryxx);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "断保续接人员信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加短保续接人员信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(DbxjryxxEntity dbxjryxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "断保续接人员信息添加成功";
		try{
			dbxjryxxService.save(dbxjryxx);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "断保续接人员信息添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新短保续接人员信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(DbxjryxxEntity dbxjryxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "断保续接人员信息更新成功";
		DbxjryxxEntity t = dbxjryxxService.get(DbxjryxxEntity.class, dbxjryxx.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(dbxjryxx, t);
			dbxjryxxService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "断保续接人员信息更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 短保续接人员信息新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(DbxjryxxEntity dbxjryxx, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(dbxjryxx.getId())) {
			dbxjryxx = dbxjryxxService.getEntity(DbxjryxxEntity.class, dbxjryxx.getId());
			req.setAttribute("dbxjryxxPage", dbxjryxx);
		}
		return new ModelAndView("com/jeecg/dbxjryxx/dbxjryxx-add");
	}
	/**
	 * 短保续接人员信息编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(DbxjryxxEntity dbxjryxx, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(dbxjryxx.getId())) {
			dbxjryxx = dbxjryxxService.getEntity(DbxjryxxEntity.class, dbxjryxx.getId());
			req.setAttribute("dbxjryxxPage", dbxjryxx);
		}
		return new ModelAndView("com/jeecg/dbxjryxx/dbxjryxx-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","dbxjryxxController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(DbxjryxxEntity dbxjryxx,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(DbxjryxxEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, dbxjryxx, request.getParameterMap());
		List<DbxjryxxEntity> dbxjryxxs = this.dbxjryxxService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"断保续接人员信息");
		modelMap.put(NormalExcelConstants.CLASS,DbxjryxxEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("断保续接人员信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,dbxjryxxs);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(DbxjryxxEntity dbxjryxx,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"断保续接人员信息");
    	modelMap.put(NormalExcelConstants.CLASS,DbxjryxxEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("断保续接人员信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<DbxjryxxEntity> listDbxjryxxEntitys = ExcelImportUtil.importExcel(file.getInputStream(),DbxjryxxEntity.class,params);
				for (DbxjryxxEntity dbxjryxx : listDbxjryxxEntitys) {
					dbxjryxxService.save(dbxjryxx);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(e.getMessage());
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	
}
