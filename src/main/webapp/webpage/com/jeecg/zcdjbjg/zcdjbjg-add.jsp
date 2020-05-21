<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>转出地经办机构</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="zcdjbjgController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${zcdjbjgPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							经办机构名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="jbjgmc" name="jbjgmc" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经办机构名称</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							经办人姓名:
						</label>
					</td>
					<td class="value">
					     	 <input id="jbrxm" name="jbrxm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经办人姓名</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							经办人电话:
						</label>
					</td>
					<td class="value">
					     	 <input id="jbrdh" name="jbrdh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经办人电话</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
