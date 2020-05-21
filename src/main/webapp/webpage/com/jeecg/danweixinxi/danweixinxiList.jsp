<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="danweixinxiList" checkbox="false" pagination="true" fitColumns="true" title="单位信息" sortName="id" actionUrl="danweixinxiController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="行政区代码"  field="xzqdm" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="行业风险类别"  field="hyfxlb" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位电话"  field="dwdh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="邮政编码"  field="yzbm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位地址"  field="dwdz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="电子邮箱地址"  field="dzyxdz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="社保经办机构"  field="sbjbjg" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="税号"  field="sh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位登记状态"  field="dwdjzt"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="danweixinxiController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="danweixinxiController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="danweixinxiController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="danweixinxiController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="danweixinxiController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'danweixinxiController.do?upload', "danweixinxiList");
}

//导出
function ExportXls() {
	JeecgExcelExport("danweixinxiController.do?exportXls","danweixinxiList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("danweixinxiController.do?exportXlsByT","danweixinxiList");
}

 </script>
