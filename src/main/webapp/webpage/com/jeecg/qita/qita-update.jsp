<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>其他</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="qitaController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${qitaPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								法人姓名:
							</label>
						</td>
						<td class="value">
						    <input id="frxm" name="frxm" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${qitaPage.frxm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">法人姓名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								法人证件类型:
							</label>
						</td>
						<td class="value">
						    <input id="frzjlx" name="frzjlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${qitaPage.frzjlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">法人证件类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								法人证件号码:
							</label>
						</td>
						<td class="value">
						    <input id="frzjhm" name="frzjhm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${qitaPage.frzjhm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">法人证件号码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								法人电话:
							</label>
						</td>
						<td class="value">
						    <input id="frdh" name="frdh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${qitaPage.frdh}'/>
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
						    <input id="zgyxm" name="zgyxm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${qitaPage.zgyxm}'/>
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
						    <input id="zgydh" name="zgydh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${qitaPage.zgydh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">专管员电话</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								专管员部门:
							</label>
						</td>
						<td class="value">
						    <input id="zgybm" name="zgybm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${qitaPage.zgybm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">专管员部门</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						    <input id="bz" name="bz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${qitaPage.bz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
