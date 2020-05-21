<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tbzhxxList" checkbox="false" pagination="true" fitColumns="true" title="退保账号信息" sortName="id" actionUrl="tbzhxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="账号余额"  field="zhye"  queryMode="single"   width="120"></t:dgCol>
   <t:dgCol title="返款余额"  field="fkye"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="违规金额"  field="wgje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="并入统筹金额"  field="brtcje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="tbzhxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="tbzhxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="tbzhxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="tbzhxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="tbzhxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'tbzhxxController.do?upload', "tbzhxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("tbzhxxController.do?exportXls","tbzhxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("tbzhxxController.do?exportXlsByT","tbzhxxList");
}

 </script>
