<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>退保信息变更</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="tbxxbgController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${tbxxbgPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								变更日期:
							</label>
						</td>
						<td class="value">
									  <input id="bgrq" name="bgrq" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${tbxxbgPage.bgrq}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">变更日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								变更原因:
							</label>
						</td>
						<td class="value">
						    <input id="bgyy" name="bgyy" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbxxbgPage.bgyy}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">变更原因</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						    <input id="bz" name="bz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbxxbgPage.bz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
