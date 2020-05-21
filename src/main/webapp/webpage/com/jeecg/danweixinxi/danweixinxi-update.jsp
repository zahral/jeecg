<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="danweixinxiController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${danweixinxiPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位编号:
							</label>
						</td>
						<td class="value">
						    <input id="dwbh" name="dwbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.dwbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单位名称:
							</label>
						</td>
						<td class="value">
						    <input id="dwmc" name="dwmc" type="text" maxlength="255" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.dwmc}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								行政区代码:
							</label>
						</td>
						<td class="value">
						    <input id="xzqdm" name="xzqdm" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.xzqdm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">行政区代码</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								行业风险类别:
							</label>
						</td>
						<td class="value">
						    <input id="hyfxlb" name="hyfxlb" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.hyfxlb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">行业风险类别</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位电话:
							</label>
						</td>
						<td class="value">
						    <input id="dwdh" name="dwdh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.dwdh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位电话</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								邮政编码:
							</label>
						</td>
						<td class="value">
						    <input id="yzbm" name="yzbm" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.yzbm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">邮政编码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位地址:
							</label>
						</td>
						<td class="value">
						    <input id="dwdz" name="dwdz" type="text" maxlength="255" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.dwdz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位地址</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								电子邮箱地址:
							</label>
						</td>
						<td class="value">
						    <input id="dzyxdz" name="dzyxdz" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.dzyxdz}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">电子邮箱地址</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								社保经办机构:
							</label>
						</td>
						<td class="value">
						    <input id="sbjbjg" name="sbjbjg" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.sbjbjg}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">社保经办机构</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								税号:
							</label>
						</td>
						<td class="value">
						    <input id="sh" name="sh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.sh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">税号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位登记状态:
							</label>
						</td>
						<td class="value">
						    <input id="dwdjzt" name="dwdjzt" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${danweixinxiPage.dwdjzt}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位登记状态</label>
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
