<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位历史年审信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwlsnsxxController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${dwlsnsxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							单位编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwbh" name="dwbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编号</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							单位名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwmc" name="dwmc" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位名称</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							工资总额:
						</label>
					</td>
					<td class="value">
					     	 <input id="ndgzze" name="ndgzze" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工资总额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							标准工资:
						</label>
					</td>
					<td class="value">
					     	 <input id="nbzgz" name="nbzgz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">标准工资</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							缴费基数:
						</label>
					</td>
					<td class="value">
					     	 <input id="jfjs" name="jfjs" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费基数</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							应缴金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="bnyjje" name="bnyjje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">应缴金额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							已缴金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="bnjyjje" name="bnjyjje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">已缴金额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							欠缴金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="bnqjje" name="bnqjje" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">欠缴金额</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
