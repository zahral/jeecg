<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位人员信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwryxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${dwryxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位编号:
							</label>
						</td>
						<td class="value">
						    <input id="dwbh" name="dwbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.dwbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单位名称:
							</label>
						</td>
						<td class="value">
						    <input id="dwmc" name="dwmc" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.dwmc}'/>
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
						    <input id="dwlx" name="dwlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.dwlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位类型</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								参保状态:
							</label>
						</td>
						<td class="value">
						    <input id="rycbzt" name="rycbzt" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.rycbzt}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">参保状态</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								人员类型:
							</label>
						</td>
						<td class="value">
						    <input id="ylrylx" name="ylrylx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.ylrylx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">人员类型</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								个人编号:
							</label>
						</td>
						<td class="value">
						    <input id="grbh" name="grbh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.grbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人编号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								证件号码:
							</label>
						</td>
						<td class="value">
						    <input id="zjhm" name="zjhm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.zjhm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">证件号码</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								姓名:
							</label>
						</td>
						<td class="value">
						    <input id="xm" name="xm" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.xm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">姓名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								性别:
							</label>
						</td>
						<td class="value">
						    <input id="xb" name="xb" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.xb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								民族:
							</label>
						</td>
						<td class="value">
						    <input id="mz" name="mz" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.mz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">民族</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								出生日期:
							</label>
						</td>
						<td class="value">
									  <input id="csrq" name="csrq" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${dwryxxPage.csrq}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">出生日期</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								缴费信息:
							</label>
						</td>
						<td class="value">
						    <input id="yljfxx" name="yljfxx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwryxxPage.yljfxx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费信息</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
