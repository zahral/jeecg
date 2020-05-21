<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="ydxjbgxxList" checkbox="false" pagination="true" fitColumns="true" title="异地续接变更信息" sortName="id" actionUrl="ydxjbgxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="凭证号"  field="pzh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="医疗保障"  field="ylbz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="基本医疗"  field="jbyl"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="起始时间"  field="jfqssj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="终止时间"  field="jfzzsj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="转出参数"  field="zcdcs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="bz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="ydxjbgxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="ydxjbgxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="ydxjbgxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="ydxjbgxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="ydxjbgxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'ydxjbgxxController.do?upload', "ydxjbgxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("ydxjbgxxController.do?exportXls","ydxjbgxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("ydxjbgxxController.do?exportXlsByT","ydxjbgxxList");
}

 </script>
