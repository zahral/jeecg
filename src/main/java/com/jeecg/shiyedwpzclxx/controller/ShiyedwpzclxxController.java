package com.jeecg.shiyedwpzclxx.controller;
import com.jeecg.shiyedwpzclxx.entity.ShiyedwpzclxxEntity;
import com.jeecg.shiyedwpzclxx.service.ShiyedwpzclxxServiceI;
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
  失业单位成立基本信息
 */
@Controller
@RequestMapping("/shiyedwpzclxxController")
public class ShiyedwpzclxxController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(ShiyedwpzclxxController.class);

	@Autowired
	private ShiyedwpzclxxServiceI shiyedwpzclxxService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * 失业单位成立基本信息列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/shiyedwpzclxx/shiyedwpzclxxList");
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
	public void datagrid(ShiyedwpzclxxEntity shiyedwpzclxx,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(ShiyedwpzclxxEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, shiyedwpzclxx, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.shiyedwpzclxxService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除失业单位成立基本信息
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(ShiyedwpzclxxEntity shiyedwpzclxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		shiyedwpzclxx = systemService.getEntity(ShiyedwpzclxxEntity.class, shiyedwpzclxx.getId());
		message = "失业单位成立基本信息删除成功";
		try{
			shiyedwpzclxxService.delete(shiyedwpzclxx);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "失业单位成立基本信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除失业单位成立基本信息
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "失业单位成立基本信息删除成功";
		try{
			for(String id:ids.split(",")){
				ShiyedwpzclxxEntity shiyedwpzclxx = systemService.getEntity(ShiyedwpzclxxEntity.class, 
				id
				);
				shiyedwpzclxxService.delete(shiyedwpzclxx);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "失业单位成立基本信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加失业单位成立基本信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(ShiyedwpzclxxEntity shiyedwpzclxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "失业单位成立基本信息添加成功";
		try{
			shiyedwpzclxxService.save(shiyedwpzclxx);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "失业单位成立基本信息添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新失业单位成立基本信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(ShiyedwpzclxxEntity shiyedwpzclxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "失业单位成立基本信息更新成功";
		ShiyedwpzclxxEntity t = shiyedwpzclxxService.get(ShiyedwpzclxxEntity.class, shiyedwpzclxx.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(shiyedwpzclxx, t);
			shiyedwpzclxxService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "失业单位成立基本信息更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 失业单位成立基本信息新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(ShiyedwpzclxxEntity shiyedwpzclxx, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(shiyedwpzclxx.getId())) {
			shiyedwpzclxx = shiyedwpzclxxService.getEntity(ShiyedwpzclxxEntity.class, shiyedwpzclxx.getId());
			req.setAttribute("shiyedwpzclxxPage", shiyedwpzclxx);
		}
		return new ModelAndView("com/jeecg/shiyedwpzclxx/shiyedwpzclxx-add");
	}
	/**
	 * 失业单位成立基本信息编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(ShiyedwpzclxxEntity shiyedwpzclxx, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(shiyedwpzclxx.getId())) {
			shiyedwpzclxx = shiyedwpzclxxService.getEntity(ShiyedwpzclxxEntity.class, shiyedwpzclxx.getId());
			req.setAttribute("shiyedwpzclxxPage", shiyedwpzclxx);
		}
		return new ModelAndView("com/jeecg/shiyedwpzclxx/shiyedwpzclxx-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","shiyedwpzclxxController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(ShiyedwpzclxxEntity shiyedwpzclxx,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(ShiyedwpzclxxEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, shiyedwpzclxx, request.getParameterMap());
		List<ShiyedwpzclxxEntity> shiyedwpzclxxs = this.shiyedwpzclxxService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"失业单位成立基本信息");
		modelMap.put(NormalExcelConstants.CLASS,ShiyedwpzclxxEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("失业单位成立基本信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,shiyedwpzclxxs);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(ShiyedwpzclxxEntity shiyedwpzclxx,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"失业单位成立基本信息");
    	modelMap.put(NormalExcelConstants.CLASS,ShiyedwpzclxxEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("失业单位成立基本信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<ShiyedwpzclxxEntity> listShiyedwpzclxxEntitys = ExcelImportUtil.importExcel(file.getInputStream(),ShiyedwpzclxxEntity.class,params);
				for (ShiyedwpzclxxEntity shiyedwpzclxx : listShiyedwpzclxxEntitys) {
					shiyedwpzclxxService.save(shiyedwpzclxx);
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
