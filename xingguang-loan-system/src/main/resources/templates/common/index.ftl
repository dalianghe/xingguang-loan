<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta charset="utf-8" />
        <title>星光钱包-运营管理平台</title>
        <meta name="description" content="overview &amp; stats" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <!-- bootstrap & fontawesome -->
        <link rel="stylesheet" href="/assets/css/bootstrap.min.css" />
        <link rel="stylesheet" href="/assets/font-awesome/4.5.0/css/font-awesome.min.css" />
        <!-- page specific plugin styles -->
        <!-- text fonts -->
        <link rel="stylesheet" href="/assets/css/fonts.googleapis.com.css" />
        <!-- ace styles -->
        <link rel="stylesheet" href="/assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />
        <!--[if lte IE 9]>
        <link rel="stylesheet" href="/assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
        <![endif]-->
        <link rel="stylesheet" href="/assets/css/ace-skins.min.css" />
        <link rel="stylesheet" href="/assets/css/ace-rtl.min.css" />
        <!--[if lte IE 9]>
        <link rel="stylesheet" href="/assets/css/ace-ie.min.css" />
        <![endif]-->
        <!-- inline styles related to this page -->
        <!-- ace settings handler -->
        <script src="/assets/js/ace-extra.min.js"></script>
        <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->
        <!--[if lte IE 8]>
        <script src="/assets/js/html5shiv.min.js"></script>
        <script src="/assets/js/respond.min.js"></script>
        <![endif]-->
    </head>

    <body class="no-skin">
        <div id="navbar" class="navbar navbar-default ace-save-state">
            <!-- 加载header -->
            <div class="navbar-container ace-save-state" id="navbar-container">
            </div><!-- /.navbar-container -->
        </div>

        <div class="main-container ace-save-state" id="main-container">
            <script type="text/javascript">
                try{ace.settings.loadState('main-container')}catch(e){}
            </script>

            <div id="sidebar" class="sidebar responsive ace-save-state">
                <script type="text/javascript">
                    try{ace.settings.loadState('sidebar')}catch(e){}
                </script>
                <!-- 加载菜单menu -->
                <div id="menu"></div>
            </div>
            <!-- 加载主工作区 -->
            <div id="main" class="main-content"></div>
            <!-- 加载底部区域 -->
            <div id="footer" class="footer"></div>
            <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
                <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
            </a>
        </div><!-- /.main-container -->

        <!-- basic scripts -->
        <!--[if !IE]> -->
        <script src="/assets/js/jquery-2.1.4.min.js"></script>
        <!-- <![endif]-->
        <!--[if IE]>
        <script src="/assets/js/jquery-1.11.3.min.js"></script>
        <![endif]-->
        <script type="text/javascript">
            if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
        </script>
        <script src="/assets/js/bootstrap.min.js"></script>
        <!-- page specific plugin scripts -->
        <!--[if lte IE 8]>
        <script src="/assets/js/excanvas.min.js"></script>
        <![endif]-->
        <script src="/assets/js/jquery-ui.custom.min.js"></script>
        <script src="/assets/js/jquery.ui.touch-punch.min.js"></script>
        <script src="/assets/js/jquery.easypiechart.min.js"></script>
        <script src="/assets/js/jquery.sparkline.index.min.js"></script>
        <script src="/assets/js/jquery.flot.min.js"></script>
        <script src="/assets/js/jquery.flot.pie.min.js"></script>
        <script src="/assets/js/jquery.flot.resize.min.js"></script>
        <!-- ace scripts -->
        <script src="/assets/js/ace-elements.min.js"></script>
        <script src="/assets/js/ace.min.js"></script>
        <script src="/js/lib/layer/layer.js"></script>
        <!-- inline scripts related to this page -->
        <script type="text/javascript">
            jQuery(function($) {
                $(function () {
                    $("#navbar-container").load("/router/common/header");
                    $("#menu").load("/router/common/menu");
                    $("#main").load("/router/common/main");
                    $("#footer").load("/router/common/footer");
                });
            });
            function callBack(url){
                $("#main").load(url,function(response,status,xhr){
                    console.log(status);
                });
            }
        </script>


    </body>

</html>