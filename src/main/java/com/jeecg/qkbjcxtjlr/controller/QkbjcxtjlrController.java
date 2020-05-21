package com.jeecg.qkbjcxtjlr.controller;
import com.jeecg.qkbjcxtjlr.entity.QkbjcxtjlrEntity;
import com.jeecg.qkbjcxtjlr.service.QkbjcxtjlrServiceI;
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
欠款补缴查询条件录入
 */
@Controller
@RequestMapping("/qkbjcxtjlrController")
public class QkbjcxtjlrController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(QkbjcxtjlrController.class);

	@Autowired
	private QkbjcxtjlrServiceI qkbjcxtjlrService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * 欠款补缴查询条件录入列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/qkbjcxtjlr/qkbjcxtjlrList");
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
	public void datagrid(QkbjcxtjlrEntity qkbjcxtjlr,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(QkbjcxtjlrEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, qkbjcxtjlr, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.qkbjcxtjlrService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除欠款补缴查询条件录入
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(QkbjcxtjlrEntity qkbjcxtjlr, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		qkbjcxtjlr = systemService.getEntity(QkbjcxtjlrEntity.class, qkbjcxtjlr.getId());
		message = "欠款补缴查询条件录入删除成功";
		try{
			qkbjcxtjlrService.delete(qkbjcxtjlr);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "欠款补缴查询条件录入删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除欠款补缴查询条件录入
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "欠款补缴查询条件录入删除成功";
		try{
			for(String id:ids.split(",")){
				QkbjcxtjlrEntity qkbjcxtjlr = systemService.getEntity(QkbjcxtjlrEntity.class, 
				id
				);
				qkbjcxtjlrService.delete(qkbjcxtjlr);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "欠款补缴查询条件录入删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加欠款补缴查询条件录入
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(QkbjcxtjlrEntity qkbjcxtjlr, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "欠款补缴查询条件录入添加成功";
		try{
			qkbjcxtjlrService.save(qkbjcxtjlr);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "欠款补缴查询条件录入添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新欠款补缴查询条件录入
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(QkbjcxtjlrEntity qkbjcxtjlr, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "欠款补缴查询条件录入更新成功";
		QkbjcxtjlrEntity t = qkbjcxtjlrService.get(QkbjcxtjlrEntity.class, qkbjcxtjlr.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(qkbjcxtjlr, t);
			qkbjcxtjlrService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "欠款补缴查询条件录入更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 欠款补缴查询条件录入新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(QkbjcxtjlrEntity qkbjcxtjlr, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(qkbjcxtjlr.getId())) {
			qkbjcxtjlr = qkbjcxtjlrService.getEntity(QkbjcxtjlrEntity.class, qkbjcxtjlr.getId());
			req.setAttribute("qkbjcxtjlrPage", qkbjcxtjlr);
		}
		return new ModelAndView("com/jeecg/qkbjcxtjlr/qkbjcxtjlr-add");
	}
	/**
	 * 欠款补缴查询条件录入编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(QkbjcxtjlrEntity qkbjcxtjlr, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(qkbjcxtjlr.getId())) {
			qkbjcxtjlr = qkbjcxtjlrService.getEntity(QkbjcxtjlrEntity.class, qkbjcxtjlr.getId());
			req.setAttribute("qkbjcxtjlrPage", qkbjcxtjlr);
		}
		return new ModelAndView("com/jeecg/qkbjcxtjlr/qkbjcxtjlr-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","qkbjcxtjlrController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(QkbjcxtjlrEntity qkbjcxtjlr,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(QkbjcxtjlrEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, qkbjcxtjlr, request.getParameterMap());
		List<QkbjcxtjlrEntity> qkbjcxtjlrs = this.qkbjcxtjlrService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"欠款补缴查询条件录入");
		modelMap.put(NormalExcelConstants.CLASS,QkbjcxtjlrEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("欠款补缴查询条件录入列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,qkbjcxtjlrs);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(QkbjcxtjlrEntity qkbjcxtjlr,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"欠款补缴查询条件录入");
    	modelMap.put(NormalExcelConstants.CLASS,QkbjcxtjlrEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("欠款补缴查询条件录入列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<QkbjcxtjlrEntity> listQkbjcxtjlrEntitys = ExcelImportUtil.importExcel(file.getInputStream(),QkbjcxtjlrEntity.class,params);
				for (QkbjcxtjlrEntity qkbjcxtjlr : listQkbjcxtjlrEntitys) {
					qkbjcxtjlrService.save(qkbjcxtjlr);
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
