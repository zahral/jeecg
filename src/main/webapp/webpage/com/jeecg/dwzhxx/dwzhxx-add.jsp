<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位综合信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwzhxxController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${dwzhxxPage.id }"/>
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
							单位类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwlx" name="dwlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							税号:
						</label>
					</td>
					<td class="value">
					     	 <input id="sh" name="sh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税号</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							单位状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwzt" name="dwzt" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位状态</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							代表人:
						</label>
					</td>
					<td class="value">
					     	 <input id="fddbr" name="fddbr" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">代表人</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							风险类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="hyfxlx" name="hyfxlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">风险类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							联系电话:
						</label>
					</td>
					<td class="value">
					     	 <input id="lxdh" name="lxdh" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">联系电话</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
