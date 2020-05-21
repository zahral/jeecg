<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dwjjzjList" checkbox="false" pagination="true" fitColumns="true" title="单位基金征集" sortName="id" actionUrl="dwjjzjController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" dictionary="bpm_status"  queryMode="single"   width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc" dictionary="bpm_status"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经济类型"  field="jjlx" dictionary="bpm_status"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlx" dictionary="bpm_status"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位状态"  field="dwzt" dictionary="bpm_status"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="隶属关系"  field="lsgx" dictionary="bpm_status"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="行业代码"  field="hydm" dictionary="bpm_status"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编码"  field="dwbm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结算期"  field="jsq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="对应结算"  field="dyjsq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="征收方式"  field="zsfs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费方式"  field="jffs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="险种类型"  field="xzlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dwjjzjController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dwjjzjController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dwjjzjController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="dwjjzjController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="dwjjzjController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'dwjjzjController.do?upload', "dwjjzjList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dwjjzjController.do?exportXls","dwjjzjList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dwjjzjController.do?exportXlsByT","dwjjzjList");
}

 </script>
