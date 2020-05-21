<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>欠款补缴查询条件录入</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="qkbjcxtjlrController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${qkbjcxtjlrPage.id }"/>
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
				</tr>
				<tr>
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
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							费款开始年月:
						</label>
					</td>
					<td class="value">
							   <input id="fkksny" name="fkksny" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">费款开始年月</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							费款终止年月:
						</label>
					</td>
					<td class="value">
							   <input id="fkzzny" name="fkzzny" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">费款终止年月</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							征集通知流水号:
						</label>
					</td>
					<td class="value">
					     	 <input id="zjtzlsh" name="zjtzlsh" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">征集通知流水号</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
