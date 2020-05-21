<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!--360浏览器优先以webkit内核解析-->
    <title>社会保险信息平台</title>

    <link rel="shortcut icon" href="images/favicon.ico">
    <link href="plug-in/hplus/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="plug-in/hplus/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="plug-in/hplus/css/animate.css" rel="stylesheet">
    <link href="plug-in/hplus/css/style.css?v=4.1.0" rel="stylesheet">
</head>

<body class="gray-bg">
<div class="row  border-bottom white-bg dashboard-header">
    <div class="col-sm-12">
        <blockquote class="text-warning" style="font-size:14px">欢迎进入
            <h4 class="text-danger">北京市社会保险信息管理系统</h4>
        </blockquote>
        <hr>
    </div>
    <div class="col-sm-3">
        <h2>Hello</h2>
        <br>
        <br>
        <img src="plug-in/login/images/jeecg.jpg" width="100%" style="max-width:264px;">
        <br>
    </div>
    <div class="col-sm-5">
        <h2>
			社会保险信息平台
        </h2>
        <p>社会保障局</p>
        <p>
            <span class="label label-warning">服务为人</span>
        </p>
        <br>
    </div>
</div>
<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-sm-4">

            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>支持</h5>
                </div>
            </div>
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>联系信息</h5>

                </div>
                <%--<div class="ibox-content">--%>
                    <%--<p><i class="fa fa-send-o"></i> 官网：<a href="http://www.jeecg.org" target="_blank">http://www.jeecg.org</a>--%>
                    <%--</p>--%>
                    <%--<p><i class="fa fa-qq"></i> QQ群：<a href="javascript:;">190866569</a>--%>
                    <%--</p>--%>
                    <%--<p><i class="fa fa-weixin"></i>微信公众号：<a href="javascript:;">jeecg</a>--%>
                    <%--</p>--%>
                    <%--<p><i class="fa fa-credit-card"></i> 邮箱：<a href="javascript:;" class="邮箱">jeecg@sina.com</a>--%>
                    <%--</p>--%>
                <%--</div>--%>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>版本升级日志</h5>
                </div>
                <div class="ibox-content no-padding">
                    <div class="panel-body">
                        <div class="panel-group" id="version">
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v57">v3.8</a><code class="pull-right">2018.10.24</code>
                                    </h5>
                                </div>
                                <div id="v57" class="panel-collapse collapse in">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版；</div>
                                        <ol>
											<li>【新功能】一套新的代码生成器模板，Bootstrap表单+EasyUI列表（单表、一对多）;</li>
                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v56">v3.7.8</a><code class="pull-right">2018.08.06</code>
                                    </h5>
                                </div>
                                <div id="v56" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本主要目标是努力消灭BUG；</div>
                                        <ol>
											<li>【新功能】一套新的代码生成器模板，Bootstrap表单+EasyUI列表（单表、一对多）;</li>
											<li>【新功能】一套新的代码生成器模板，Bootstrap表单+EasyUI原生列表（单表、一对多）;</li>
											<li>【demo】页面打印 demo;</li>
                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v55">v3.7.7</a><code class="pull-right">2018.07.16</code>
                                    </h5>
                                </div>
                                <div id="v55" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本为性能和表单UI深化加强版本</div>
                                        <ol>
											<li>【bug】Online移动报表功能演示导出Excel报错;</li>
                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v54">v3.7.6</a><code class="pull-right">2018.06.06</code>
                                    </h5>
                                </div>
                                <div id="v54" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本提供新一代风格代码生成器</div>
                                        <ol>
											<li>【功能升级】新一代 (单表/一对多) 代码生成器模板，Vue+ElementUI风格功能优化升级;</li>
                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v53">v3.7.5</a><code class="pull-right">2018.05.17</code>
                                    </h5>
                                </div>
                                <div id="v53" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本提供新一代风格代码生成器模板</div>
                                        <ol>
											<li>【新增功能】新一代更灵活的代码生成器工厂，可灵活自定义生成的代码文件名称、路径等；根据模板结构生成代码文件;</li>
											<li>【BUG】一系列论坛网友问题解决;</li>
                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v52">v3.7.3</a><code class="pull-right">2018.03.13</code>
                                    </h5>
                                </div>
                                <div id="v52" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本增加很多比较实用的功能</div>
                                        <ol>
											<li>【新增功能】“常用示例-原生态组件”增加省市区复杂的三级联动效果，控件美观，可以很友好的进行省市区的选择;</li>
                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v51">v3.7.2</a><code class="pull-right">2018.01.25</code>
                                    </h5>
                                </div>
                                <div id="v51" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本为接口开发版</div>
                                        <ol>
											<li>【新功能】restful接口统一采用jwt token机制登录验证机制，方便客户端对接;</li>
											<li>【功能升级】多数据源改造，支持唯一db链接，提供连接关闭方法 ;</li>
                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v50">v3.7.1</a><code class="pull-right">2017.09.18</code>
                                    </h5>
                                </div>
                                <div id="v50" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本为跨时代精良重构版</div>
                                        <ol>
                                        	<li>【功能升级】简化在线定时任务配置，支持分布式;</li>

                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v45">v3.7</a><code class="pull-right">2017.04.20</code>
                                    </h5>
                                </div>
                                <div id="v45" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本微服务版本</div>
                                        <ol>
                                        	<li>精简平台代码，重写demo模块，删除无用的JS插件;</li>
                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v44">v3.6.6</a><code class="pull-right">2017.02.08</code>
                                    </h5>
                                </div>
                                <div id="v44" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本微服务版本</div>
                                        <ol>
                                        	<li>插件：集成即时聊天webim聊天插件;</li>
                                        </ol>
                                    </div>
                                </div>
                        </div>
                        <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v41">v3.6.5</a><code class="pull-right">2016.07.18</code>
                                    </h5>
                                </div>
                                <div id="v41" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本云应用插件开发版本</div>
                                        <ol>
                                        	<li>Jeecg3.6.4稳定升级版，精简功能；</li>
                                        </ol>
                                    </div>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v42">v3.6.4</a><code class="pull-right">2016.07.01</code>
                                    </h5>
                                </div>
                                <div id="v42" class="panel-collapse collapse">
                                    <div class="panel-body">
                                       <div class="alert alert-warning">此版本云应用插件开发版本</div>
                                        <ol>
                                            <li>扁平化新首页风格；</li>
                                        </ol>
                                    </div>
                                </div>
                            </div>
                             <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v43">v3.6.3</a><code class="pull-right">2016.04.09</code>
                                    </h5>
                                </div>
                                <div id="v43" class="panel-collapse collapse">
                                    <div class="panel-body">
                                       <div class="alert alert-warning">此版本是一个扁平化UI风格版</div>
                                        <ol>
                                            <li>ACE扁平化风格；</li>
                                        </ol>
                                    </div>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v31">v3.6.2</a><code class="pull-right">2016.03.15</code>
                                    </h5>
                                </div>
                                <div id="v31" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <div class="alert alert-warning">此版本是一个移动开发版</div>
                                        <ol>
                                            <li>平台插件支持（可插拔）；</li>
                                        </ol>
                                    </div>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v30">v</a><code class="pull-right">2019.07.04</code>
                                    </h5>
                                </div>
                                <div id="v30" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ol>
                                            <li>表单设计器</li>
                                            <li>增加行编辑DEMO</li>
                                        </ol>
                                    </div>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v32">v3.5.0</a><code class="pull-right">2015.03.10</code>
                                    </h5>
                                </div>
                                <div id="v32" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ol>
                                            <li>支持数据权限，按钮级、数据行级、列级、字段级；</li>
                                        </ol>
                                    </div>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h5 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#version" href="#v33">更多版本...</a><code class="pull-right"></code>
                                    </h5>
                                </div>
                                <div id="v33" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ol>
                                            <li>更多版本，请详见论坛：www.jeecg.org</li>
                                        </ol>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>适用范围</h5>
                </div>
                <div class="ibox-content">
                    <p>选择</p>
                    <ol>
                        <li>采用主流框架，容易上手，学习成本低；</li>
                        <li>……</li>
                    </ol>
                    <hr>
                    <div class="alert alert-warning">内部办公系统（OA）
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 全局js -->
<script src="plug-in/hplus/js/jquery.min.js?v=2.1.4"></script>
<script src="plug-in/hplus/js/bootstrap.min.js?v=3.3.6"></script>
<script src="plug-in/hplus/js/plugins/layer/layer.min.js"></script>

<!-- 自定义js -->
<script src="plug-in/hplus/js/content.js"></script>
</body>

</html>
