<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>账号返还信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="zhfhxxController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${zhfhxxPage.id }"/>
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
							个人编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="grbh" name="grbh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">个人编号</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							年度:
						</label>
					</td>
					<td class="value">
					     	 <input id="nd" name="nd" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">年度</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							返还类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="fhlx" name="fhlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">返还类型</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							返还金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="fhje" name="fhje" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">返还金额</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							并入统筹:
						</label>
					</td>
					<td class="value">
					     	 <input id="brtc" name="brtc" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">并入统筹</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							处理方式:
						</label>
					</td>
					<td class="value">
					     	 <input id="clfs" name="clfs" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">处理方式</label>
						</td>
				</tr>
				
				
			</table>
		</t:formvalid>
 </body>
