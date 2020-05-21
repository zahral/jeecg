<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位还款信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwhkxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${dwhkxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								结算期:
							</label>
						</td>
						<td class="value">
									  <input id="jsq" name="jsq" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${dwhkxxPage.jsq}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结算期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								还款金额:
							</label>
						</td>
						<td class="value">
						    <input id="dwhkje" name="dwhkje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwhkxxPage.dwhkje}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">还款金额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								还款原因:
							</label>
						</td>
						<td class="value">
						    <input id="hkyy" name="hkyy" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwhkxxPage.hkyy}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">还款原因</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								全部还款:
							</label>
						</td>
						<td class="value">
						    <input id="qbhk" name="qbhk" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwhkxxPage.qbhk}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">全部还款</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
