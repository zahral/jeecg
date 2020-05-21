package com.jeecg.dwlsnsxx.controller;
import com.jeecg.dwlsnsxx.entity.DwlsnsxxEntity;
import com.jeecg.dwlsnsxx.service.DwlsnsxxServiceI;
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
单位历史年审信息
 */
@Controller
@RequestMapping("/dwlsnsxxController")
public class DwlsnsxxController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(DwlsnsxxController.class);

	@Autowired
	private DwlsnsxxServiceI dwlsnsxxService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * 单位历史年审信息列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/dwlsnsxx/dwlsnsxxList");
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
	public void datagrid(DwlsnsxxEntity dwlsnsxx,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(DwlsnsxxEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, dwlsnsxx, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.dwlsnsxxService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除单位历史年审信息
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(DwlsnsxxEntity dwlsnsxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		dwlsnsxx = systemService.getEntity(DwlsnsxxEntity.class, dwlsnsxx.getId());
		message = "单位历史年审信息删除成功";
		try{
			dwlsnsxxService.delete(dwlsnsxx);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "单位历史年审信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除单位历史年审信息
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "单位历史年审信息删除成功";
		try{
			for(String id:ids.split(",")){
				DwlsnsxxEntity dwlsnsxx = systemService.getEntity(DwlsnsxxEntity.class, 
				id
				);
				dwlsnsxxService.delete(dwlsnsxx);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "单位历史年审信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加单位历史年审信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(DwlsnsxxEntity dwlsnsxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "单位历史年审信息添加成功";
		try{
			dwlsnsxxService.save(dwlsnsxx);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "单位历史年审信息添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新单位历史年审信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(DwlsnsxxEntity dwlsnsxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "单位历史年审信息更新成功";
		DwlsnsxxEntity t = dwlsnsxxService.get(DwlsnsxxEntity.class, dwlsnsxx.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(dwlsnsxx, t);
			dwlsnsxxService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "单位历史年审信息更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 单位历史年审信息新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(DwlsnsxxEntity dwlsnsxx, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(dwlsnsxx.getId())) {
			dwlsnsxx = dwlsnsxxService.getEntity(DwlsnsxxEntity.class, dwlsnsxx.getId());
			req.setAttribute("dwlsnsxxPage", dwlsnsxx);
		}
		return new ModelAndView("com/jeecg/dwlsnsxx/dwlsnsxx-add");
	}
	/**
	 * 单位历史年审信息编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(DwlsnsxxEntity dwlsnsxx, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(dwlsnsxx.getId())) {
			dwlsnsxx = dwlsnsxxService.getEntity(DwlsnsxxEntity.class, dwlsnsxx.getId());
			req.setAttribute("dwlsnsxxPage", dwlsnsxx);
		}
		return new ModelAndView("com/jeecg/dwlsnsxx/dwlsnsxx-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","dwlsnsxxController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(DwlsnsxxEntity dwlsnsxx,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(DwlsnsxxEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, dwlsnsxx, request.getParameterMap());
		List<DwlsnsxxEntity> dwlsnsxxs = this.dwlsnsxxService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"单位历史年审信息");
		modelMap.put(NormalExcelConstants.CLASS,DwlsnsxxEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("单位历史年审信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,dwlsnsxxs);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(DwlsnsxxEntity dwlsnsxx,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"单位历史年审信息");
    	modelMap.put(NormalExcelConstants.CLASS,DwlsnsxxEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("单位历史年审信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<DwlsnsxxEntity> listDwlsnsxxEntitys = ExcelImportUtil.importExcel(file.getInputStream(),DwlsnsxxEntity.class,params);
				for (DwlsnsxxEntity dwlsnsxx : listDwlsnsxxEntitys) {
					dwlsnsxxService.save(dwlsnsxx);
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
