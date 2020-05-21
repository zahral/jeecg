<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>失业保险基本信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="sybxjbxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${sybxjbxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								个人编号:
							</label>
						</td>
						<td class="value">
						    <input id="grbh" name="grbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${sybxjbxxPage.grbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								个人姓名:
							</label>
						</td>
						<td class="value">
						    <input id="grxm" name="grxm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${sybxjbxxPage.grxm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人姓名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								性别:
							</label>
						</td>
						<td class="value">
						    <input id="xb" name="xb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${sybxjbxxPage.xb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								缴费月数:
							</label>
						</td>
						<td class="value">
						    <input id="stjfys" name="stjfys" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${sybxjbxxPage.stjfys}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费月数</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								工作时间:
							</label>
						</td>
						<td class="value">
									  <input id="cjgzsj" name="cjgzsj" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${sybxjbxxPage.cjgzsj}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工作时间</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								缴费月数:
							</label>
						</td>
						<td class="value">
						    <input id="jfys" name="jfys" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${sybxjbxxPage.jfys}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费月数</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								计入时间:
							</label>
						</td>
						<td class="value">
									  <input id="grjfscjrsj" name="grjfscjrsj" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${sybxjbxxPage.grjfscjrsj}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">计入时间</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
