package com.jeecg.danwpzclxx.controller;
import com.jeecg.danwpzclxx.entity.DanwpzclxxEntity;
import com.jeecg.danwpzclxx.service.DanwpzclxxServiceI;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
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
单位批准成立信息
 */
@Controller
@RequestMapping("/danwpzclxxController")
public class DanwpzclxxController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(DanwpzclxxController.class);

	@Autowired
	private DanwpzclxxServiceI danwpzclxxService;
	@Autowired
	private SystemService systemService;
	



	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/danwpzclxx/danwpzclxxList");
	}


	@RequestMapping(params = "datagrid")
	public void datagrid(DanwpzclxxEntity danwpzclxx,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(DanwpzclxxEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, danwpzclxx, request.getParameterMap());
		try{
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.danwpzclxxService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	

	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(DanwpzclxxEntity danwpzclxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		danwpzclxx = systemService.getEntity(DanwpzclxxEntity.class, danwpzclxx.getId());
		message = "单位批准成立信息删除成功";
		try{
			danwpzclxxService.delete(danwpzclxx);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "单位批准成立信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除单位批准成立信息
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "单位批准成立信息删除成功";
		try{
			for(String id:ids.split(",")){
				DanwpzclxxEntity danwpzclxx = systemService.getEntity(DanwpzclxxEntity.class, 
				id
				);
				danwpzclxxService.delete(danwpzclxx);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "单位批准成立信息删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加单位批准成立信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(DanwpzclxxEntity danwpzclxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "单位批准成立信息添加成功";
		try{
			String sdj = danwpzclxx.getGsdjzzhm();
			String sql = "FROM DanwpzclxxEntity WHERE gsdjzzhm = '"+sdj+"'";
			List lists = systemService.findByQueryString(sql);

			//List list = danwpzclxxService.findByQueryString(sql);
			if(lists.size() > 0){
				message = "执照号码已存在";
				j.setMsg(message);
				return j;
			}else{
				danwpzclxxService.save(danwpzclxx);
				systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "单位批准成立信息添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新单位批准成立信息
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(DanwpzclxxEntity danwpzclxx, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "单位批准成立信息更新成功";
		DanwpzclxxEntity t = danwpzclxxService.get(DanwpzclxxEntity.class, danwpzclxx.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(danwpzclxx, t);
			danwpzclxxService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "单位批准成立信息更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 单位批准成立信息新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(DanwpzclxxEntity danwpzclxx, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(danwpzclxx.getId())) {
			danwpzclxx = danwpzclxxService.getEntity(DanwpzclxxEntity.class, danwpzclxx.getId());
			req.setAttribute("danwpzclxxPage", danwpzclxx);
		}
		return new ModelAndView("com/jeecg/danwpzclxx/danwpzclxx-add");
	}
	/**
	 * 单位批准成立信息编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(DanwpzclxxEntity danwpzclxx, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(danwpzclxx.getId())) {
			danwpzclxx = danwpzclxxService.getEntity(DanwpzclxxEntity.class, danwpzclxx.getId());
			req.setAttribute("danwpzclxxPage", danwpzclxx);
		}
		return new ModelAndView("com/jeecg/danwpzclxx/danwpzclxx-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","danwpzclxxController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(DanwpzclxxEntity danwpzclxx,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(DanwpzclxxEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, danwpzclxx, request.getParameterMap());
		List<DanwpzclxxEntity> danwpzclxxs = this.danwpzclxxService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"单位批准成立信息");
		modelMap.put(NormalExcelConstants.CLASS,DanwpzclxxEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("单位批准成立信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,danwpzclxxs);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(DanwpzclxxEntity danwpzclxx,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"单位批准成立信息");
    	modelMap.put(NormalExcelConstants.CLASS,DanwpzclxxEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("单位批准成立信息列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<DanwpzclxxEntity> listDanwpzclxxEntitys = ExcelImportUtil.importExcel(file.getInputStream(),DanwpzclxxEntity.class,params);
				for (DanwpzclxxEntity danwpzclxx : listDanwpzclxxEntitys) {
					danwpzclxxService.save(danwpzclxx);
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
