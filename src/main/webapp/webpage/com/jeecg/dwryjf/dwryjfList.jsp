<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dwryjfList" checkbox="false" pagination="true" fitColumns="true" title="单位人员缴费" sortName="id" actionUrl="dwryjfController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人编号"  field="grbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="开始结算"  field="ksjsq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="终止结算"  field="zzjsq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="姓名"  field="xm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证号"  field="sfzh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结算期"  field="jsq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="对应结算"  field="dyjsq"  formatter="yyyy-MM-dd hh:mm:ss"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费基数"  field="jfjs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位缴纳"  field="dwjn"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人缴纳"  field="grjn"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴纳合计"  field="jnhe"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dwryjfController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dwryjfController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dwryjfController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="dwryjfController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="dwryjfController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'dwryjfController.do?upload', "dwryjfList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dwryjfController.do?exportXls","dwryjfList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dwryjfController.do?exportXlsByT","dwryjfList");
}

 </script>
