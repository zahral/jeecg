<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="grjfjlList" checkbox="false" pagination="true" fitColumns="true" title="个人缴费记录" sortName="id" actionUrl="grjfjlController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="年度"  field="nd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费基数"  field="jfjs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人缴纳"  field="grjnje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位缴纳"  field="dwjnje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合计缴纳"  field="hjjnje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人比例"  field="grbl"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位比例"  field="dwbl"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="合计比例"  field="hjbl"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="起止月"  field="qzy"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="终止月"  field="zzy"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="grjfjlController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="grjfjlController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="grjfjlController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="grjfjlController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="grjfjlController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'grjfjlController.do?upload', "grjfjlList");
}

//导出
function ExportXls() {
	JeecgExcelExport("grjfjlController.do?exportXls","grjfjlList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("grjfjlController.do?exportXlsByT","grjfjlList");
}

 </script>
