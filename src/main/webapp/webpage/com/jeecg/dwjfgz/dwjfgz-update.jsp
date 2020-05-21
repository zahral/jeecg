<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位缴费工资</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwjfgzController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${dwjfgzPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位编号:
							</label>
						</td>
						<td class="value">
						    <input id="dwbh" name="dwbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.dwbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单位名称:
							</label>
						</td>
						<td class="value">
						    <input id="dwmc" name="dwmc" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.dwmc}'/>
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
						    <input id="jjlx" name="jjlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.jjlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经济类型</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单位类型:
							</label>
						</td>
						<td class="value">
						    <input id="dwlx" name="dwlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.dwlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								机构代码:
							</label>
						</td>
						<td class="value">
						    <input id="zzjgdm" name="zzjgdm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.zzjgdm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">机构代码</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单位状态:
							</label>
						</td>
						<td class="value">
						    <input id="dwzt" name="dwzt" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.dwzt}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位状态</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								行业代码:
							</label>
						</td>
						<td class="value">
						    <input id="hydm" name="hydm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.hydm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">行业代码</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单位编码:
							</label>
						</td>
						<td class="value">
						    <input id="dwbm" name="dwbm" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.dwbm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								终止年月:
							</label>
						</td>
						<td class="value">
									  <input id="zzny" name="zzny" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${dwjfgzPage.zzny}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">终止年月</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								职工人数:
							</label>
						</td>
						<td class="value">
						    <input id="zgrs" name="zgrs" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.zgrs}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">职工人数</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								人员状态:
							</label>
						</td>
						<td class="value">
						    <input id="ryzt" name="ryzt" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.ryzt}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">人员状态</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								工资总额:
							</label>
						</td>
						<td class="value">
						    <input id="gzze" name="gzze" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.gzze}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工资总额</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								经办人:
							</label>
						</td>
						<td class="value">
						    <input id="jbr" name="jbr" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwjfgzPage.jbr}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经办人</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								经办日期:
							</label>
						</td>
						<td class="value">
									  <input id="jbrq" name="jbrq" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${dwjfgzPage.jbrq}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经办日期</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>
