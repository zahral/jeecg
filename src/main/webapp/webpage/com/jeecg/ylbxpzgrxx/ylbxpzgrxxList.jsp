<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="ylbxpzgrxxList" checkbox="false" pagination="true" fitColumns="true" title="医疗保险凭证个人基本信息" sortName="id" actionUrl="ylbxpzgrxxController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位类型"  field="dwlx"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="个人编号"  field="grbh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证号"  field="gcsfzh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="姓名"  field="xm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="性别"  field="xb"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="邮政编码"  field="yzbm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="户口性质"  field="hkxz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="户口在地"  field="hkszdxxdz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="常驻地址"  field="czdxxdz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="ylbxpzgrxxController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="ylbxpzgrxxController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="ylbxpzgrxxController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="ylbxpzgrxxController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="ylbxpzgrxxController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'ylbxpzgrxxController.do?upload', "ylbxpzgrxxList");
}

//导出
function ExportXls() {
	JeecgExcelExport("ylbxpzgrxxController.do?exportXls","ylbxpzgrxxList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("ylbxpzgrxxController.do?exportXlsByT","ylbxpzgrxxList");
}

 </script>
