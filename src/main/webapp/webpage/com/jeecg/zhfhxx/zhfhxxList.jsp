<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="zhfhxxList" checkbox="false" pagination="true" fitColumns="true" title="账号返还信息" sortName="id" actionUrl="zhfhxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"   width="120"></t:dgCol>
   <t:dgCol title="个人编号"  field="grbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="年度"  field="nd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="返还类型"  field="fhlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="返还金额"  field="fhje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="并入统筹"  field="brtc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="处理方式"  field="clfs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="zhfhxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="zhfhxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="zhfhxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="zhfhxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="zhfhxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'zhfhxxController.do?upload', "zhfhxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("zhfhxxController.do?exportXls","zhfhxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("zhfhxxController.do?exportXlsByT","zhfhxxList");
}

 </script>
