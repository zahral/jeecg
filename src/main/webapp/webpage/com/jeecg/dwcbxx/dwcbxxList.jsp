<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dwcbxxList" checkbox="false" pagination="true" fitColumns="true" title="单位参保信息" sortName="id" actionUrl="dwcbxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"   width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="参保状态"  field="cbzt" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经济类型"  field="jjlx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="风险类别"  field="hyfxlb" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="隶属关系"  field="lsgx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="统筹区"  field="sstcq" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编码"  field="dwbm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="险种类型"  field="xzlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="参保人数"  field="cbrs"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dwcbxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dwcbxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dwcbxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <%--<t:dgToolBar title="批量删除"  icon="icon-remove" url="dwcbxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>--%>
   <t:dgToolBar title="查看" icon="icon-search" url="dwcbxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'dwcbxxController.do?upload', "dwcbxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dwcbxxController.do?exportXls","dwcbxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dwcbxxController.do?exportXlsByT","dwcbxxList");
}

 </script>
