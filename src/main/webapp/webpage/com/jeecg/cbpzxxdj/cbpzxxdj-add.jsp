<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>参保凭证信息登记</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="cbpzxxdjController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${cbpzxxdjPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							登记类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="djbl" name="djbl" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">登记类型</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							单位编号:
						</label>
					</td>
					<td class="value">
					     	 <input id="dwbh" name="dwbh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
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
					<td align="right">
						<label class="Validform_label">
							代办人:
						</label>
					</td>
					<td class="value">
					     	 <input id="dbrxm" name="dbrxm" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">代办人</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							关系:
						</label>
					</td>
					<td class="value">
					     	 <input id="dbrycbrgx" name="dbrycbrgx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">关系</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							联系电话:
						</label>
					</td>
					<td class="value">
					     	 <input id="dbrlxdh" name="dbrlxdh" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">联系电话</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							联系地址:
						</label>
					</td>
					<td class="value">
					     	 <input id="dbrlxdz" name="dbrlxdz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">联系地址</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							身份证号:
						</label>
					</td>
					<td class="value">
					     	 <input id="dbrsfzh" name="dbrsfzh" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">身份证号</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							保险类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="ylbxlx" name="ylbxlx" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">保险类型</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							转出地:
						</label>
					</td>
					<td class="value">
					     	 <input id="zcd" name="zcd" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">转出地</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							转入金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="grzhzrje" name="grzhzrje" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">转入金额</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							开始时间:
						</label>
					</td>
					<td class="value">
							   <input id="cbkssj" name="cbkssj" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">开始时间</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							终止时间:
						</label>
					</td>
					<td class="value">
							   <input id="cbzzsj" name="cbzzsj" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">终止时间</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							缴费月数:
						</label>
					</td>
					<td class="value">
					     	 <input id="ljsjjfys" name="ljsjjfys" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费月数</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							机构名称:
						</label>
					</td>
					<td class="value">
					     	 <input id="zcdcbjgmc" name="zcdcbjgmc" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">机构名称</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							机构地址:
						</label>
					</td>
					<td class="value">
					     	 <input id="zcdcbjgdz" name="zcdcbjgdz" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">机构地址</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							机构邮编:
						</label>
					</td>
					<td class="value">
					     	 <input id="zcdcbjgyb" name="zcdcbjgyb" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">机构邮编</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							联系人:
						</label>
					</td>
					<td class="value">
					     	 <input id="zcdcbjglxr" name="zcdcbjglxr" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">联系人</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							备注:
						</label>
					</td>
					<td class="value">
					     	 <input id="bz" name="bz" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							联系电话:
						</label>
					</td>
					<td class="value">
					     	 <input id="zcdcbjglxdh" name="zcdcbjglxdh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">联系电话</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							经办人:
						</label>
					</td>
					<td class="value">
					     	 <input id="jbr" name="jbr" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经办人</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							经办时间:
						</label>
					</td>
					<td class="value">
							   <input id="jbsj" name="jbsj" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经办时间</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							凭证号:
						</label>
					</td>
					<td class="value">
					     	 <input id="pzh" name="pzh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">凭证号</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							医疗保险类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="ylbxlx" name="ylbxlx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">医疗保险类型</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							区划:
						</label>
					</td>
					<td class="value">
					     	 <input id="zcdxzqb" name="zcdxzqb" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">区划</label>
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
