<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dbxjryxxList" checkbox="false" pagination="true" fitColumns="true" title="断保续接人员信息" sortName="id" actionUrl="dbxjryxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlb" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人编号"  field="grbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="证件号码"  field="zjhm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="姓名"  field="xm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="性别"  field="xb"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="民族"  field="mz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="年龄"  field="nl"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="出生日期"  field="csrq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人身份"  field="grsf"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dbxjryxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dbxjryxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dbxjryxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="dbxjryxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="dbxjryxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'dbxjryxxController.do?upload', "dbxjryxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dbxjryxxController.do?exportXls","dbxjryxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dbxjryxxController.do?exportXlsByT","dbxjryxxList");
}

 </script>
