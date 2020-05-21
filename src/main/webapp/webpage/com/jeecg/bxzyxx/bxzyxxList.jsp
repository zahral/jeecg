<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="bxzyxxList" checkbox="false" pagination="true" fitColumns="true" title="保险转移信息" sortName="id" actionUrl="bxzyxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="月数总计"  field="qcydzryszj"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办人"  field="jbr"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办时间"  field="jbsj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="名称"  field="dbrmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="关系"  field="dbrycbrgx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="联系电话"  field="dbrlxdh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="联系地址"  field="dbrlxdz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证号"  field="dbrsfzh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="bxzyxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="bxzyxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="bxzyxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="bxzyxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="bxzyxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'bxzyxxController.do?upload', "bxzyxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("bxzyxxController.do?exportXls","bxzyxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("bxzyxxController.do?exportXlsByT","bxzyxxList");
}

 </script>
