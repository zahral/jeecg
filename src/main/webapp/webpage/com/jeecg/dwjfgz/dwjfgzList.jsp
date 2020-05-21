<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dwjfgzList" checkbox="false" pagination="true" fitColumns="true" title="单位缴费工资" sortName="id" actionUrl="dwjfgzController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经济类型"  field="jjlx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="机构代码"  field="zzjgdm" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位状态"  field="dwzt" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="行业代码"  field="hydm" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编码"  field="dwbm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="终止年月"  field="zzny"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="职工人数"  field="zgrs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="人员状态"  field="ryzt"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="工资总额"  field="gzze"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办人"  field="jbr"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办日期"  field="jbrq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dwjfgzController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dwjfgzController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dwjfgzController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="dwjfgzController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="dwjfgzController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'dwjfgzController.do?upload', "dwjfgzList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dwjfgzController.do?exportXls","dwjfgzList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dwjfgzController.do?exportXlsByT","dwjfgzList");
}

 </script>
