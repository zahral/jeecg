<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="shiyeqtList" checkbox="false" pagination="true" fitColumns="true" title="失业其他" sortName="id" actionUrl="shiyeqtController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="法人姓名"  field="frxm" query="true" queryMode="single"   width="120"></t:dgCol>
   <t:dgCol title="法人证件号码"  field="frzjhm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="法人参保标志"  field="frcbbz" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="法人电话"  field="frdh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="专管员姓名"  field="zgyxm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="专管员电话"  field="zgydh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="shiyeqtController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="shiyeqtController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="shiyeqtController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="shiyeqtController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="shiyeqtController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'shiyeqtController.do?upload', "shiyeqtList");
}

//导出
function ExportXls() {
	JeecgExcelExport("shiyeqtController.do?exportXls","shiyeqtList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("shiyeqtController.do?exportXlsByT","shiyeqtList");
}

 </script>
