<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tbrybgdjList" checkbox="false" pagination="true" fitColumns="true" title="退保人员变更单据" sortName="id" actionUrl="tbrybgdjController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人编号"  field="grbh" query="true"  queryMode="single" width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="gzdwlx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结算期限"  field="jsqx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费比例"  field="jxbl"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费金额"  field="jfje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="业务批次号"  field="ywpch" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="tbrybgdjController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="tbrybgdjController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="tbrybgdjController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="tbrybgdjController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="tbrybgdjController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'tbrybgdjController.do?upload', "tbrybgdjList");
}

//导出
function ExportXls() {
	JeecgExcelExport("tbrybgdjController.do?exportXls","tbrybgdjList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("tbrybgdjController.do?exportXlsByT","tbrybgdjList");
}

 </script>
