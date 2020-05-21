<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="shiyedwjbxxList" checkbox="false" pagination="true" fitColumns="true" title="失业单位基本信息" sortName="id" actionUrl="shiyedwjbxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true"  queryMode="single"   width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位电话"  field="dwdh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="邮政编码"  field="yzbm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位简称"  field="dwjc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="shiyedwjbxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="shiyedwjbxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="shiyedwjbxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="shiyedwjbxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="shiyedwjbxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'shiyedwjbxxController.do?upload', "shiyedwjbxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("shiyedwjbxxController.do?exportXls","shiyedwjbxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("shiyedwjbxxController.do?exportXlsByT","shiyedwjbxxList");
}

 </script>
