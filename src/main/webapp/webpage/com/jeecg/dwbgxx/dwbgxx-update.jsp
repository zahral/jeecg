<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位变更信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwbgxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${dwbgxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位编号:
							</label>
						</td>
						<td class="value">
						    <input id="dwbh" name="dwbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwbgxxPage.dwbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								变更类型:
							</label>
						</td>
						<td class="value">
						    <input id="bglx" name="bglx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwbgxxPage.bglx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">变更类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								险种类型:
							</label>
						</td>
						<td class="value">
						    <input id="xzlx" name="xzlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwbgxxPage.xzlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">险种类型</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								变更原因:
							</label>
						</td>
						<td class="value">
						    <input id="bgyy" name="bgyy" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwbgxxPage.bgyy}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">变更原因</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								开始时间:
							</label>
						</td>
						<td class="value">
									  <input id="jbkssj" name="jbkssj" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${dwbgxxPage.jbkssj}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开始时间</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								终止时间:
							</label>
						</td>
						<td class="value">
									  <input id="jbzzsj" name="jbzzsj" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${dwbgxxPage.jbzzsj}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">终止时间</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								变更类型:
							</label>
						</td>
						<td class="value">
						    <input id="bglx" name="bglx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwbgxxPage.bglx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">变更类型</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								变更日期:
							</label>
						</td>
						<td class="value">
									  <input id="bgrq" name="bgrq" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${dwbgxxPage.bgrq}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">变更日期</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								经办人:
							</label>
						</td>
						<td class="value">
						    <input id="jbr" name="jbr" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwbgxxPage.jbr}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经办人</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								经办时间:
							</label>
						</td>
						<td class="value">
									  <input id="jbsj" name="jbsj" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${dwbgxxPage.jbsj}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经办时间</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						    <input id="bz" name="bz" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwbgxxPage.bz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
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
