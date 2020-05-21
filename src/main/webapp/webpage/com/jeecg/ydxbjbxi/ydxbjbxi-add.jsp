<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>基本信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="ydxbjbxiController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${ydxbjbxiPage.id }"/>
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
							单位类别:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwlb" name="dwlb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位类别</label>
						</td>
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
							姓名:
						</label>
					</td>
					<td class="value">
					     	 <input id="xm" name="xm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">姓名</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							性别:
						</label>
					</td>
					<td class="value">
					     	 <input id="xb" name="xb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">性别</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							证件类别:
						</label>
					</td>
					<td class="value">
					     	 <input id="sszjlb" name="sszjlb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">证件类别</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							身份证号:
						</label>
					</td>
					<td class="value">
					     	 <input id="gmsfzh" name="gmsfzh" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">身份证号</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							户口性质:
						</label>
					</td>
					<td class="value">
					     	 <input id="hkxz" name="hkxz" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">户口性质</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							地行政区:
						</label>
					</td>
					<td class="value">
					     	 <input id="hkszdxzq" name="hkszdxzq" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">地行政区</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							工作日期:
						</label>
					</td>
					<td class="value">
							   <input id="cagzrq" name="cagzrq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">工作日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							单位日期:
						</label>
					</td>
					<td class="value">
							   <input id="dbdwrq" name="dbdwrq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位日期</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							离退休日期:
						</label>
					</td>
					<td class="value">
							   <input id="ltxrq" name="ltxrq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">离退休日期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							离退休状态:
						</label>
					</td>
					<td class="value">
					     	 <input id="ltxzt" name="ltxzt" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">离退休状态</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							保险证号:
						</label>
					</td>
					<td class="value">
					     	 <input id="ylbxzh" name="ylbxzh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">保险证号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							社保卡号:
						</label>
					</td>
					<td class="value">
					     	 <input id="sbkh" name="sbkh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">社保卡号</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							转入月数:
						</label>
					</td>
					<td class="value">
							   <input id="ylzrys" name="ylzrys" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">转入月数</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							缴费月数:
						</label>
					</td>
					<td class="value">
					     	 <input id="ylstjfys" name="ylstjfys" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费月数</label>
						</td>
					</tr>
				
				
			</table>
		</t:formvalid>
 </body>
