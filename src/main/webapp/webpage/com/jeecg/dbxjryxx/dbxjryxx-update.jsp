<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>断保续接人员信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dbxjryxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${dbxjryxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位编号:
							</label>
						</td>
						<td class="value">
						    <input id="dwbh" name="dwbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.dwbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单位名称:
							</label>
						</td>
						<td class="value">
						    <input id="dwmc" name="dwmc" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.dwmc}'/>
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
						    <input id="dwlb" name="dwlb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.dwlb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位类型</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								个人编号:
							</label>
						</td>
						<td class="value">
						    <input id="grbh" name="grbh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.grbh}'/>
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
						    <input id="zjhm" name="zjhm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.zjhm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">证件号码</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								姓名:
							</label>
						</td>
						<td class="value">
						    <input id="xm" name="xm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.xm}'/>
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
						    <input id="xb" name="xb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.xb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								民族:
							</label>
						</td>
						<td class="value">
						    <input id="mz" name="mz" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.mz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">民族</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								年龄:
							</label>
						</td>
						<td class="value">
						    <input id="nl" name="nl" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.nl}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">年龄</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								出生日期:
							</label>
						</td>
						<td class="value">
									  <input id="csrq" name="csrq" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${dbxjryxxPage.csrq}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">出生日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								个人身份:
							</label>
						</td>
						<td class="value">
						    <input id="grsf" name="grsf" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dbxjryxxPage.grsf}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人身份</label>
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
