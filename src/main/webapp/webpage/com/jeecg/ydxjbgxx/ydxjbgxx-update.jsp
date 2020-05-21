<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>异地续接变更信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="ydxjbgxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${ydxjbgxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								凭证号:
							</label>
						</td>
						<td class="value">
						    <input id="pzh" name="pzh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${ydxjbgxxPage.pzh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">凭证号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								医疗保障:
							</label>
						</td>
						<td class="value">
						    <input id="ylbz" name="ylbz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${ydxjbgxxPage.ylbz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">医疗保障</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								基本医疗:
							</label>
						</td>
						<td class="value">
						    <input id="jbyl" name="jbyl" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${ydxjbgxxPage.jbyl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">基本医疗</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								起始时间:
							</label>
						</td>
						<td class="value">
									  <input id="jfqssj" name="jfqssj" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${ydxjbgxxPage.jfqssj}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">起始时间</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								终止时间:
							</label>
						</td>
						<td class="value">
									  <input id="jfzzsj" name="jfzzsj" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${ydxjbgxxPage.jfzzsj}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">终止时间</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								转出参数:
							</label>
						</td>
						<td class="value">
						    <input id="zcdcs" name="zcdcs" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${ydxjbgxxPage.zcdcs}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">转出参数</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						    <input id="bz" name="bz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${ydxjbgxxPage.bz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
