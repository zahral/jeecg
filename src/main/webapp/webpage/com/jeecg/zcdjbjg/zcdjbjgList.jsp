<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="zcdjbjgList" checkbox="false" pagination="true" fitColumns="true" title="转出地经办机构" sortName="id" actionUrl="zcdjbjgController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办机构名称"  field="jbjgmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办人姓名"  field="jbrxm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办人电话"  field="jbrdh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="zcdjbjgController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="zcdjbjgController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="zcdjbjgController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="zcdjbjgController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="zcdjbjgController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'zcdjbjgController.do?upload', "zcdjbjgList");
}

//导出
function ExportXls() {
	JeecgExcelExport("zcdjbjgController.do?exportXls","zcdjbjgList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("zcdjbjgController.do?exportXlsByT","zcdjbjgList");
}

 </script>
