<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>失业其他</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="shiyeqtController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${shiyeqtPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							法人姓名:
						</label>
					</td>
					<td class="value">
					     	 <input id="frxm" name="frxm" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">法人姓名</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							法人证件号码:
						</label>
					</td>
					<td class="value">
					     	 <input id="frzjhm" name="frzjhm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">法人证件号码</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							法人参保标志:
						</label>
					</td>
					<td class="value">
					     	 <input id="frcbbz" name="frcbbz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">法人参保标志</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							法人电话:
						</label>
					</td>
					<td class="value">
					     	 <input id="frdh" name="frdh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">法人电话</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							专管员姓名:
						</label>
					</td>
					<td class="value">
					     	 <input id="zgyxm" name="zgyxm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">专管员姓名</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							专管员电话:
						</label>
					</td>
					<td class="value">
					     	 <input id="zgydh" name="zgydh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">专管员电话</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
