<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>单位参保信息</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="dwcbxxController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${dwcbxxPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位编号:
							</label>
						</td>
						<td class="value">
						    <input id="dwbh" name="dwbh" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.dwbh}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单位类型:
							</label>
						</td>
						<td class="value">
						    <input id="dwlx" name="dwlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.dwlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								参保状态:
							</label>
						</td>
						<td class="value">
						    <input id="cbzt" name="cbzt" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.cbzt}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">参保状态</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								经济类型:
							</label>
						</td>
						<td class="value">
						    <input id="jjlx" name="jjlx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.jjlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">经济类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								风险类别:
							</label>
						</td>
						<td class="value">
						    <input id="hyfxlb" name="hyfxlb" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.hyfxlb}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">风险类别</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								隶属关系:
							</label>
						</td>
						<td class="value">
						    <input id="lsgx" name="lsgx" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.lsgx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">隶属关系</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								统筹区:
							</label>
						</td>
						<td class="value">
						    <input id="sstcq" name="sstcq" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.sstcq}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">统筹区</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								单位编码:
							</label>
						</td>
						<td class="value">
						    <input id="dwbm" name="dwbm" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.dwbm}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位编码</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								单位名称:
							</label>
						</td>
						<td class="value">
						    <input id="dwmc" name="dwmc" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.dwmc}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">单位名称</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								险种类型:
							</label>
						</td>
						<td class="value">
						    <input id="xzlx" name="xzlx" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.xzlx}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">险种类型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								参保人数:
							</label>
						</td>
						<td class="value">
						    <input id="cbrs" name="cbrs" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${dwcbxxPage.cbrs}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">参保人数</label>
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
