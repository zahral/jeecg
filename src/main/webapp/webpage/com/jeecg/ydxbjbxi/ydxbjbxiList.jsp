<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="ydxbjbxiList" checkbox="false" pagination="true" fitColumns="true" title="基本信息" sortName="id" actionUrl="ydxbjbxiController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号" query="true" field="dwbh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类别"  field="dwlb"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人编号"  field="grbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="姓名"  field="xm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="性别"  field="xb"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="证件类别"  field="sszjlb"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证号"  field="gmsfzh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="户口性质"  field="hkxz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="地行政区"  field="hkszdxzq"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="工作日期"  field="cagzrq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位日期"  field="dbdwrq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="离退休日期"  field="ltxrq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="离退休状态"  field="ltxzt"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="保险证号"  field="ylbxzh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="社保卡号"  field="sbkh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="转入月数"  field="ylzrys"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费月数"  field="ylstjfys"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="ydxbjbxiController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="ydxbjbxiController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="ydxbjbxiController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="ydxbjbxiController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="ydxbjbxiController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'ydxbjbxiController.do?upload', "ydxbjbxiList");
}

//导出
function ExportXls() {
	JeecgExcelExport("ydxbjbxiController.do?exportXls","ydxbjbxiList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("ydxbjbxiController.do?exportXlsByT","ydxbjbxiList");
}

 </script>
