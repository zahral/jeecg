package com.jeecg.zcdjbjg.controller;
import com.jeecg.zcdjbjg.entity.ZcdjbjgEntity;
import com.jeecg.zcdjbjg.service.ZcdjbjgServiceI;
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
 转出地经办机构
 */
@Controller
@RequestMapping("/zcdjbjgController")
public class ZcdjbjgController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(ZcdjbjgController.class);

	@Autowired
	private ZcdjbjgServiceI zcdjbjgService;
	@Autowired
	private SystemService systemService;
	



	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/zcdjbjg/zcdjbjgList");
	}



	@RequestMapping(params = "datagrid")
	public void datagrid(ZcdjbjgEntity zcdjbjg,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(ZcdjbjgEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, zcdjbjg, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.zcdjbjgService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	

	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(ZcdjbjgEntity zcdjbjg, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		zcdjbjg = systemService.getEntity(ZcdjbjgEntity.class, zcdjbjg.getId());
		message = "转出地经办机构删除成功";
		try{
			zcdjbjgService.delete(zcdjbjg);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "转出地经办机构删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "转出地经办机构删除成功";
		try{
			for(String id:ids.split(",")){
				ZcdjbjgEntity zcdjbjg = systemService.getEntity(ZcdjbjgEntity.class, 
				id
				);
				zcdjbjgService.delete(zcdjbjg);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "转出地经办机构删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}



	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(ZcdjbjgEntity zcdjbjg, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "转出地经办机构添加成功";
		try{
			zcdjbjgService.save(zcdjbjg);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "转出地经办机构添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(ZcdjbjgEntity zcdjbjg, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "转出地经办机构更新成功";
		ZcdjbjgEntity t = zcdjbjgService.get(ZcdjbjgEntity.class, zcdjbjg.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(zcdjbjg, t);
			zcdjbjgService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "转出地经办机构更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 转出地经办机构新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(ZcdjbjgEntity zcdjbjg, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(zcdjbjg.getId())) {
			zcdjbjg = zcdjbjgService.getEntity(ZcdjbjgEntity.class, zcdjbjg.getId());
			req.setAttribute("zcdjbjgPage", zcdjbjg);
		}
		return new ModelAndView("com/jeecg/zcdjbjg/zcdjbjg-add");
	}
	/**
	 * 转出地经办机构编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(ZcdjbjgEntity zcdjbjg, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(zcdjbjg.getId())) {
			zcdjbjg = zcdjbjgService.getEntity(ZcdjbjgEntity.class, zcdjbjg.getId());
			req.setAttribute("zcdjbjgPage", zcdjbjg);
		}
		return new ModelAndView("com/jeecg/zcdjbjg/zcdjbjg-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","zcdjbjgController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(ZcdjbjgEntity zcdjbjg,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(ZcdjbjgEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, zcdjbjg, request.getParameterMap());
		List<ZcdjbjgEntity> zcdjbjgs = this.zcdjbjgService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"转出地经办机构");
		modelMap.put(NormalExcelConstants.CLASS,ZcdjbjgEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("转出地经办机构列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,zcdjbjgs);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(ZcdjbjgEntity zcdjbjg,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"转出地经办机构");
    	modelMap.put(NormalExcelConstants.CLASS,ZcdjbjgEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("转出地经办机构列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<ZcdjbjgEntity> listZcdjbjgEntitys = ExcelImportUtil.importExcel(file.getInputStream(),ZcdjbjgEntity.class,params);
				for (ZcdjbjgEntity zcdjbjg : listZcdjbjgEntitys) {
					zcdjbjgService.save(zcdjbjg);
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
