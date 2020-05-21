<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>断保人员列表信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dbrylbxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${dbrylbxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								个人编号:
							</label>
						</td>
						<td class="value">
						    <input id="grbh" name="grbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbrylbxxPage.grbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								证件号码:
							</label>
						</td>
						<td class="value">
						    <input id="zjhm" name="zjhm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbrylbxxPage.zjhm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">证件号码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								姓名:
							</label>
						</td>
						<td class="value">
						    <input id="xm" name="xm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbrylbxxPage.xm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">姓名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								性别:
							</label>
						</td>
						<td class="value">
						    <input id="xb" name="xb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbrylbxxPage.xb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								工资:
							</label>
						</td>
						<td class="value">
						    <input id="gz" name="gz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbrylbxxPage.gz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工资</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
