<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="dwbgxxList" checkbox="false" pagination="true" fitColumns="true" title="单位变更信息" sortName="id" actionUrl="dwbgxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="变更类型"  field="bglx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="险种类型"  field="xzlx" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="变更原因"  field="bgyy" query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="开始时间"  field="jbkssj" query="true" formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="终止时间"  field="jbzzsj" query="true" formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="变更类型"  field="bglx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="变更日期"  field="bgrq"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办人"  field="jbr"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办时间"  field="jbsj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="bz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="dwbgxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="dwbgxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="dwbgxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="dwbgxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="dwbgxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'dwbgxxController.do?upload', "dwbgxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("dwbgxxController.do?exportXls","dwbgxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("dwbgxxController.do?exportXlsByT","dwbgxxList");
}

 </script>
