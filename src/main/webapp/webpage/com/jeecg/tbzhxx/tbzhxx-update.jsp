<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>退保账号信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="tbzhxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${tbzhxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								账号余额:
							</label>
						</td>
						<td class="value">
						    <input id="zhye" name="zhye" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbzhxxPage.zhye}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">账号余额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								返款余额:
							</label>
						</td>
						<td class="value">
						    <input id="fkye" name="fkye" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbzhxxPage.fkye}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">返款余额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								违规金额:
							</label>
						</td>
						<td class="value">
						    <input id="wgje" name="wgje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbzhxxPage.wgje}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">违规金额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								并入统筹金额:
							</label>
						</td>
						<td class="value">
						    <input id="brtcje" name="brtcje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbzhxxPage.brtcje}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">并入统筹金额</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
