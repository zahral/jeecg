<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="sybxjbxxList" checkbox="false" pagination="true" fitColumns="true" title="失业保险基本信息" sortName="id" actionUrl="sybxjbxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人编号"  field="grbh"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="个人姓名"  field="grxm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="性别"  field="xb"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费月数"  field="stjfys"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="工作时间"  field="cjgzsj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费月数"  field="jfys"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="计入时间"  field="grjfscjrsj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="sybxjbxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="sybxjbxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="sybxjbxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="sybxjbxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="sybxjbxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'sybxjbxxController.do?upload', "sybxjbxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("sybxjbxxController.do?exportXls","sybxjbxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("sybxjbxxController.do?exportXlsByT","sybxjbxxList");
}

 </script>
