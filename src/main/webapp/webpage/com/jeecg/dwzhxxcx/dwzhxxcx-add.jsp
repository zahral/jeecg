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
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwzhxxcxController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${dwzhxxcxPage.id }"/>
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
					     	 <input id="dwlb" name="dwlb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位类型</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							联系电话:
						</label>
					</td>
					<td class="value">
					     	 <input id="lxdh" name="lxdh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">联系电话</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							邮政编码:
						</label>
					</td>
					<td class="value">
					     	 <input id="yzbm" name="yzbm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">邮政编码</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							经济类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="jjlx" name="jjlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经济类型</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							险种类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="xzlx" name="xzlx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">险种类型</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							参保信息:
						</label>
					</td>
					<td class="value">
					     	 <input id="bccbxx" name="bccbxx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">参保信息</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							参保状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="cazt" name="cazt" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">参保状态</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							机构:
						</label>
					</td>
					<td class="value">
					     	 <input id="shbxjbjg" name="shbxjbjg" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">机构</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							统筹区:
						</label>
					</td>
					<td class="value">
					     	 <input id="sstcq" name="sstcq" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">统筹区</label>
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
