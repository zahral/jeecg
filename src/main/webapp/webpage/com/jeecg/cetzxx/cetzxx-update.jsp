<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>差额调整信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="cetzxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${cetzxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								险种列表:
							</label>
						</td>
						<td class="value">
						    <input id="xzlb" name="xzlb" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.xzlb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">险种列表</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								人员列表:
							</label>
						</td>
						<td class="value">
						    <input id="rylb" name="rylb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.rylb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">人员列表</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								个人编号:
							</label>
						</td>
						<td class="value">
						    <input id="grbh" name="grbh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.grbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								姓名:
							</label>
						</td>
						<td class="value">
						    <input id="xm" name="xm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.xm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">姓名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								身份证:
							</label>
						</td>
						<td class="value">
						    <input id="sfzjh" name="sfzjh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.sfzjh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">身份证</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								补缴处理:
							</label>
						</td>
						<td class="value">
						    <input id="bjcl" name="bjcl" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.bjcl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">补缴处理</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								滞纳金:
							</label>
						</td>
						<td class="value">
						    <input id="jsznj" name="jsznj" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.jsznj}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">滞纳金</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						    <input id="bz" name="bz" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.bz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								所属期:
							</label>
						</td>
						<td class="value">
						    <input id="cbzzfkssq" name="cbzzfkssq" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.cbzzfkssq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">所属期</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								险种类型:
							</label>
						</td>
						<td class="value">
						    <input id="xzlx" name="xzlx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.xzlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">险种类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								缴费对象:
							</label>
						</td>
						<td class="value">
						    <input id="jfdx" name="jfdx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${cetzxxPage.jfdx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费对象</label>
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
