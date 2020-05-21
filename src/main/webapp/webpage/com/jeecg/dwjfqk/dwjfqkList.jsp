<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dwjfqkList" checkbox="false" pagination="true" fitColumns="true" title="单位缴费情况" sortName="id" actionUrl="dwjfqkController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费类型"  field="jflx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="开始结算"  field="ksjsq" query="true" formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="终止结算"  field="zzjsq" query="true" formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="费款开始"  field="fkksny" query="true" formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="费款终止"  field="fkzzny" query="true" formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费标志"  field="jfbz" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编码"  field="dwbm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经济类型"  field="jjlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="风险类型"  field="hyfxlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dwjfqkController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dwjfqkController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dwjfqkController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="dwjfqkController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="dwjfqkController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'dwjfqkController.do?upload', "dwjfqkList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dwjfqkController.do?exportXls","dwjfqkList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dwjfqkController.do?exportXlsByT","dwjfqkList");
}

 </script>
