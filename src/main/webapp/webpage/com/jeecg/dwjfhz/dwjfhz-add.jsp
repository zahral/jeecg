<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位缴费汇总</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwjfhzController.do?doAdd" >
					<input id="id" name="id" type="hidden" value="${dwjfhzPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
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
					<td align="right">
						<label class="Validform_label">
							征收方式:
						</label>
					</td>
					<td class="value">
					     	 <input id="zsfs" name="zsfs" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">征收方式</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							缴费标志:
						</label>
					</td>
					<td class="value">
					     	 <input id="jfbz" name="jfbz" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费标志</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							结算期:
						</label>
					</td>
					<td class="value">
							   <input id="jsqkssj" name="jsqkssj" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结算期</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							结算期:
						</label>
					</td>
					<td class="value">
							   <input id="jsqzzsj" name="jsqzzsj" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结算期</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							缴费类型:
						</label>
					</td>
					<td class="value">
					     	 <input id="jflx" name="jflx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">缴费类型</label>
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
							结算期:
						</label>
					</td>
					<td class="value">
							   <input id="jsq" name="jsq" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker()"  ignore="ignore" />    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">结算期</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							应收金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="ysje" name="ysje" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">应收金额</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							到账金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="dzje" name="dzje" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">到账金额</label>
						</td>
					</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							实收金额:
						</label>
					</td>
					<td class="value">
					     	 <input id="shje" name="shje" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">实收金额</label>
						</td>
					<td align="right">
						<label class="Validform_label">
							应缴人数:
						</label>
					</td>
					<td class="value">
					     	 <input id="yjrs" name="yjrs" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore" />
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">应缴人数</label>
						</td>
					</tr>
				
				
			</table>
		</t:formvalid>
 </body>
