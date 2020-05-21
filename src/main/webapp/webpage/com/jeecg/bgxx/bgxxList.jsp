<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="bgxxList" checkbox="false" pagination="true" fitColumns="true" title="变更信息" sortName="id" actionUrl="bgxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"   width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlb"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="变更类别"  field="dwlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="险种类型"  field="xzlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="变更原因"  field="bgyy"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="变更日期"  field="bgrq"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办人"  field="jbr"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办时间"  field="jbsj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="bz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="bgxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="bgxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="bgxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="bgxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="bgxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'bgxxController.do?upload', "bgxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("bgxxController.do?exportXls","bgxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("bgxxController.do?exportXlsByT","bgxxList");
}

 </script>
