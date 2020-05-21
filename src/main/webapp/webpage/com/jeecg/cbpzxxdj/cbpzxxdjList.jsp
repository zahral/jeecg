<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="cbpzxxdjList" checkbox="false" pagination="true" fitColumns="true" title="参保凭证信息登记" sortName="id" actionUrl="cbpzxxdjController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="登记类型"  field="djbl"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位编号"  field="dwbh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="单位名称"  field="dwmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="代办人"  field="dbrxm"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="关系"  field="dbrycbrgx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="联系电话"  field="dbrlxdh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="联系地址"  field="dbrlxdz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证号"  field="dbrsfzh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="保险类型"  field="ylbxlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="转出地"  field="zcd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="转入金额"  field="grzhzrje"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="开始时间"  field="cbkssj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="终止时间"  field="cbzzsj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="缴费月数"  field="ljsjjfys"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="机构名称"  field="zcdcbjgmc"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="机构地址"  field="zcdcbjgdz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="机构邮编"  field="zcdcbjgyb"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="联系人"  field="zcdcbjglxr"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="bz"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="联系电话"  field="zcdcbjglxdh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办人"  field="jbr"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="经办时间"  field="jbsj"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="凭证号"  field="pzh"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="医疗保险类型"  field="ylbxlx"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="区划"  field="zcdxzqb"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="cbpzxxdjController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="cbpzxxdjController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="cbpzxxdjController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="cbpzxxdjController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="cbpzxxdjController.do?goUpdate" funname="detail"></t:dgToolBar>
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
	openuploadwin('Excel导入', 'cbpzxxdjController.do?upload', "cbpzxxdjList");
}

//导出
function ExportXls() {
	JeecgExcelExport("cbpzxxdjController.do?exportXls","cbpzxxdjList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("cbpzxxdjController.do?exportXlsByT","cbpzxxdjList");
}

 </script>
