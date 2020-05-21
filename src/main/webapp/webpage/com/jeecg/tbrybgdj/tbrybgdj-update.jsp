<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>退保人员变更单据</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="tbrybgdjController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${tbrybgdjPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								个人编号:
							</label>
						</td>
						<td class="value">
						    <input id="grbh" name="grbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbrybgdjPage.grbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位类型:
							</label>
						</td>
						<td class="value">
						    <input id="gzdwlx" name="gzdwlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbrybgdjPage.gzdwlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								结算期限:
							</label>
						</td>
						<td class="value">
						    <input id="jsqx" name="jsqx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbrybgdjPage.jsqx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结算期限</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								缴费比例:
							</label>
						</td>
						<td class="value">
						    <input id="jxbl" name="jxbl" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbrybgdjPage.jxbl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费比例</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								缴费金额:
							</label>
						</td>
						<td class="value">
						    <input id="jfje" name="jfje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbrybgdjPage.jfje}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费金额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								业务批次号:
							</label>
						</td>
						<td class="value">
						    <input id="ywpch" name="ywpch" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbrybgdjPage.ywpch}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">业务批次号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位编号:
							</label>
						</td>
						<td class="value">
						    <input id="dwbh" name="dwbh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${tbrybgdjPage.dwbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编号</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
