<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="cetzxxList" checkbox="true" pagination="true" fitColumns="true" title="差额调整信息" sortName="id" actionUrl="cetzxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="险种列表"  field="xzlb"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <%--<t:dgCol title="人员列表"  field="rylb"  queryMode="single"  width="120"></t:dgCol>--%>
   <t:dgCol title="个人编号"  field="grbh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="姓名"  field="xm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证"  field="sfzjh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="补缴处理"  field="bjcl"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="滞纳金"  field="jsznj"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="bz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属期"  field="cbzzfkssq"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="险种类型"  field="xzlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费对象"  field="jfdx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="cetzxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="cetzxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="cetzxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="cetzxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <%--<t:dgToolBar title="查看" icon="icon-search" url="cetzxxController.do?goUpdate" funname="detail"></t:dgToolBar>--%>
   <%--<t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>--%>
   <%--<t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>--%>
   <%--<t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>--%>
  </t:datagrid>
  </div>
 </div>
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'cetzxxController.do?upload', "cetzxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("cetzxxController.do?exportXls","cetzxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("cetzxxController.do?exportXlsByT","cetzxxList");
}

 </script>
