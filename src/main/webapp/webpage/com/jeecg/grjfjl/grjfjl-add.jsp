<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>个人缴费记录</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="grjfjlController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${grjfjlPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							年度:
						</label>
					</td>
					<td class="value">
					     	 <input id="nd" name="nd" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">年度</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							缴费基数:
						</label>
					</td>
					<td class="value">
					     	 <input id="jfjs" name="jfjs" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费基数</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							个人缴纳:
						</label>
					</td>
					<td class="value">
					     	 <input id="grjnje" name="grjnje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人缴纳</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							单位缴纳:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwjnje" name="dwjnje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位缴纳</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							合计缴纳:
						</label>
					</td>
					<td class="value">
					     	 <input id="hjjnje" name="hjjnje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计缴纳</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							个人比例:
						</label>
					</td>
					<td class="value">
					     	 <input id="grbl" name="grbl" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人比例</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							单位比例:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwbl" name="dwbl" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位比例</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							合计比例:
						</label>
					</td>
					<td class="value">
					     	 <input id="hjbl" name="hjbl" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">合计比例</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							起止月:
						</label>
					</td>
					<td class="value">
							   <input id="qzy" name="qzy" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">起止月</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							终止月:
						</label>
					</td>
					<td class="value">
							   <input id="zzy" name="zzy" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">终止月</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
