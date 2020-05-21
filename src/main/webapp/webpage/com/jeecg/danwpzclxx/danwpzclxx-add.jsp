<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位批准成立信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="danwpzclxxController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${danwpzclxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							执照号码:
						</label>
					</td>
					<td class="value">
					     	 <input id="gsdjzzhm" name="gsdjzzhm" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">执照号码</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发照日期:
						</label>
					</td>
					<td class="value">
							   <input id="gsdjfzrq" name="gsdjfzrq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发照日期</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							登记有效期限:
						</label>
					</td>
					<td class="value">
					     	 <input id="gsdjyxqx" name="gsdjyxqx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">登记有效期限</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发证机构:
						</label>
					</td>
					<td class="value">
					     	 <input id="gszzfzjg" name="gszzfzjg" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">发证机构</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							起止日期:
						</label>
					</td>
					<td class="value">
							   <input id="gszzqzrq" name="gszzqzrq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">起止日期</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							终止日期:
						</label>
					</td>
					<td class="value">
							   <input id="gszzzzrq" name="gszzzzrq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">终止日期</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							批准成立部门:
						</label>
					</td>
					<td class="value">
					     	 <input id="pzclbm" name="pzclbm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">批准成立部门</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
