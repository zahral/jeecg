<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位基金征集</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwjjzjController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${dwjjzjPage.id }"/>
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
							单位名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwmc" name="dwmc" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					     	 <input id="jjlx" name="jjlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经济类型</label>
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
							单位状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwzt" name="dwzt" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位状态</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							隶属关系:
						</label>
					</td>
					<td class="value">
					     	 <input id="lsgx" name="lsgx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">隶属关系</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							行业代码:
						</label>
					</td>
					<td class="value">
					     	 <input id="hydm" name="hydm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">行业代码</label>
						</td>
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
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							结算期:
						</label>
					</td>
					<td class="value">
							   <input id="jsq" name="jsq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结算期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							对应结算:
						</label>
					</td>
					<td class="value">
							   <input id="dyjsq" name="dyjsq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">对应结算</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							征收方式:
						</label>
					</td>
					<td class="value">
					     	 <input id="zsfs" name="zsfs" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">征收方式</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							缴费方式:
						</label>
					</td>
					<td class="value">
					     	 <input id="jffs" name="jffs" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费方式</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							险种类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="xzlx" name="xzlx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">险种类型</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
				
				
			</table>
		</t:formvalid>
 </body>
