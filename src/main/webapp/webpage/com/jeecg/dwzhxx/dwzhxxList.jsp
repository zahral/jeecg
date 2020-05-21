<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dwzhxxList" checkbox="false" pagination="true" fitColumns="true" title="单位综合信息" sortName="id" actionUrl="dwzhxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlx" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="税号"  field="sh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位状态"  field="dwzt"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="代表人"  field="fddbr"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="风险类型"  field="hyfxlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="联系电话"  field="lxdh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dwzhxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dwzhxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dwzhxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="dwzhxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="dwzhxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'dwzhxxController.do?upload', "dwzhxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dwzhxxController.do?exportXls","dwzhxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dwzhxxController.do?exportXlsByT","dwzhxxList");
}

 </script>
