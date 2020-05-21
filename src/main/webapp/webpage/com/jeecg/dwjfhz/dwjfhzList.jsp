<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dwjfhzList" checkbox="false" pagination="true" fitColumns="true" title="单位缴费汇总" sortName="id" actionUrl="dwjfhzController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="征收方式"  field="zsfs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费标志"  field="jfbz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结算期"  field="jsqkssj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结算期"  field="jsqzzsj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费类型"  field="jflx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="结算期"  field="jsq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="应收金额"  field="ysje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="到账金额"  field="dzje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="实收金额"  field="shje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="应缴人数"  field="yjrs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dwjfhzController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dwjfhzController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dwjfhzController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="dwjfhzController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="dwjfhzController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'dwjfhzController.do?upload', "dwjfhzList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dwjfhzController.do?exportXls","dwjfhzList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dwjfhzController.do?exportXlsByT","dwjfhzList");
}

 </script>
