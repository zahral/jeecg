<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位缴费情况</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwjfqkController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${dwjfqkPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							单位编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwbh" name="dwbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							单位类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwlx" name="dwlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位类型</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							缴费类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="jflx" name="jflx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费类型</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							开始结算:
						</label>
					</td>
					<td class="value">
							   <input id="ksjsq" name="ksjsq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开始结算</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							终止结算:
						</label>
					</td>
					<td class="value">
							   <input id="zzjsq" name="zzjsq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">终止结算</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							费款开始:
						</label>
					</td>
					<td class="value">
							   <input id="fkksny" name="fkksny" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">费款开始</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							费款终止:
						</label>
					</td>
					<td class="value">
							   <input id="fkzzny" name="fkzzny" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">费款终止</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							缴费标志:
						</label>
					</td>
					<td class="value">
					     	 <input id="jfbz" name="jfbz" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费标志</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							单位编码:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwbm" name="dwbm" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编码</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							单位名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwmc" name="dwmc" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位名称</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							经济类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="jjlx" name="jjlx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经济类型</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							风险类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="hyfxlx" name="hyfxlx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">风险类型</label>
						</td>
					</tr>
				
				
			</table>
		</t:formvalid>
 </body>
