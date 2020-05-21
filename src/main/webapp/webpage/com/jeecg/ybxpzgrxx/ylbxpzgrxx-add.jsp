<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>医疗保险凭证个人基本信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="ylbxpzgrxxController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${ylbxpzgrxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							户口在地:
						</label>
					</td>
					<td class="value">
					     	 <input id="hkszdxxdz" name="hkszdxxdz" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">户口在地</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							常驻地址:
						</label>
					</td>
					<td class="value">
					     	 <input id="czdxxdz" name="czdxxdz" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">常驻地址</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
