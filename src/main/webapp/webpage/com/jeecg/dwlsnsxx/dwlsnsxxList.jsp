<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dwlsnsxxList" checkbox="false" pagination="true" fitColumns="true" title="单位历史年审信息" sortName="id" actionUrl="dwlsnsxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"   width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="工资总额"  field="ndgzze"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="标准工资"  field="nbzgz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费基数"  field="jfjs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="应缴金额"  field="bnyjje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="已缴金额"  field="bnjyjje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="欠缴金额"  field="bnqjje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dwlsnsxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dwlsnsxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dwlsnsxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="dwlsnsxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="dwlsnsxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'dwlsnsxxController.do?upload', "dwlsnsxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dwlsnsxxController.do?exportXls","dwlsnsxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dwlsnsxxController.do?exportXlsByT","dwlsnsxxList");
}

 </script>
