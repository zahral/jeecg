<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="qitaList" checkbox="false" pagination="true" fitColumns="true" title="其他" sortName="id" actionUrl="qitaController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="法人姓名"  field="frxm"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="法人证件类型"  field="frzjlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="法人证件号码"  field="frzjhm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="法人电话"  field="frdh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="专管员姓名"  field="zgyxm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="专管员电话"  field="zgydh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="专管员部门"  field="zgybm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="bz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="qitaController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="qitaController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="qitaController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="qitaController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="qitaController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'qitaController.do?upload', "qitaList");
}

//导出
function ExportXls() {
	JeecgExcelExport("qitaController.do?exportXls","qitaList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("qitaController.do?exportXlsByT","qitaList");
}

 </script>
