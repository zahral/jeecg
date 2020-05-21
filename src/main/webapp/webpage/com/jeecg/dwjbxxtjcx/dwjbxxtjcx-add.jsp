<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位基本信息条件查询</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwjbxxtjcxController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${dwjbxxtjcxPage.id }"/>
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
							险种类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="xzlx" name="xzlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">险种类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							参保状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="cbzt" name="cbzt" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">参保状态</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							趸缴标志:
						</label>
					</td>
					<td class="value">
					     	 <input id="djbz" name="djbz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">趸缴标志</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							趸缴类别:
						</label>
					</td>
					<td class="value">
					     	 <input id="yldjlx" name="yldjlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">趸缴类别</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							单位名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwmc" name="dwmc" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					     	 <input id="jjlx" name="jjlx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经济类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							单位状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwzt" name="dwzt" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位状态</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							风险类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="hyfxlx" name="hyfxlx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">风险类型</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
