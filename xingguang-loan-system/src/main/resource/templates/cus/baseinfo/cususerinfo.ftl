<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />
    <title>Dashboard - Ace Admin</title>
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

<body>

    <div id="dataDiv" class="table-detail">
        <div class="row">
            <div class="col-xs-12 col-sm-7">
                <div class="col-xs-12 col-sm-2">
                    <div class="text-center">
                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                            <div class="inline position-relative">
                                <a class="user-title-label" href="#">
                                    <i class="ace-icon fa fa-circle light-green"></i>
                                    <span class="white">客户信息</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="space visible-xs"></div>
                <div class="profile-user-info profile-user-info-striped">
                    <div class="profile-info-row">
                        <div class="profile-info-name"> 姓名 </div>
                        <div class="profile-info-value">
                            <span>{{user.name}}</span>
                        </div>
                        <div class="profile-info-name"> 性别 </div>
                        <div class="profile-info-value">
                            <span>{{user.sexName}}</span>
                        </div>
                    </div>

                    <div class="profile-info-row">
                        <div class="profile-info-name"> 手机号 </div>
                        <div class="profile-info-value">
                            <span>{{user.phone}}</span>
                        </div>
                        <div class="profile-info-name"> 身份证号 </div>
                        <div class="profile-info-value">
                            <span>{{user.idNo}}</span>
                        </div>
                    </div>
                    <div class="profile-info-row">
                        <div class="profile-info-name"> 认证状态  </div>
                        <div class="profile-info-value">
                            <span>{{user.realStatusName}}</span>
                        </div>
                        <div class="profile-info-name"> 收入 </div>
                        <div class="profile-info-value">
                            <span>{{user.incomeName}}</span>
                        </div>
                    </div>
                    <div class="profile-info-row">
                        <div class="profile-info-name"> 学历 </div>
                        <div class="profile-info-value">
                            <span>{{user.educationName}}</span>
                        </div>
                        <div class="profile-info-name"> 职业 </div>
                        <div class="profile-info-value">
                            <span>{{user.occupationName}}</span>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xs-12 col-sm-7" style="margin-top: 10px;">
                <div class="col-xs-12 col-sm-2">
                    <div class="text-center">
                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                            <div class="inline position-relative">
                                <a class="user-title-label" href="#">
                                    <i class="ace-icon fa fa-circle light-green"></i>
                                    <span class="white">联系人信息</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="space visible-xs"></div>
                <div class="profile-user-info profile-user-info-striped">
                    <div class="profile-info-row">
                        <div class="profile-info-name"> 姓名 </div>
                        <div class="profile-info-value">
                            <span>{{link.linkName}}</span>
                        </div>
                        <div class="profile-info-name"> 电话 </div>
                        <div class="profile-info-value">
                            <span>{{link.phone}}</span>
                        </div>
                        <div class="profile-info-name"> 关系 </div>
                        <div class="profile-info-value">
                            <span>{{link.relationName}}</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <input type="hidden" id="userId" name="userId" value="${id}"/>
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
    <script src="/js/lib/vue/vue.min.js"></script>
    <script src="/js/lib/vue/axios.min.js"></script>
    <script type="text/javascript">
        function getCusUserInfo() {
            var userId = $("#userId").val();
            return axios.get("/cus/user/"+userId);
        }

        function getCusUserLink() {
            var userId = $("#userId").val();
            return axios.get('/cus/link/'+userId);
        }

        var app = new Vue({
            el: '#dataDiv',
            data: {
                user: "",
                link:""
            },
            created : function(){
                var that=this;
                axios.all([getCusUserInfo(), getCusUserLink()]).then(axios.spread(function (cusUser, cusLink) {
                    var user = cusUser.data;
                    if(user.sysCode==0){
                        if(user.bizCode==0){
                            that.user = user.data;
                        }
                    }
                    var link = cusLink.data;
                    if(link.sysCode==0){
                        if(link.bizCode==0){
                            that.link = link.data;
                        }
                    }
                }));
            }
        });
    </script>
</body>