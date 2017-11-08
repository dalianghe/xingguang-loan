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
            <div class="col-xs-12 col-sm-2">
                <div class="text-center">
                    <img height="150" class="thumbnail inline no-margin-bottom" alt="Domain Owner's Avatar" src="/assets/images/avatars/profile-pic.jpg" />
                    <br />
                    <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                        <div class="inline position-relative">
                            <a class="user-title-label" href="#">
                                <i class="ace-icon fa fa-circle light-green"></i>
                                <span class="white">{{user.userName}}</span>
                            </a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-xs-12 col-sm-7">
                <div class="space visible-xs"></div>

                <div class="profile-user-info profile-user-info-striped">
                    <div class="profile-info-row">
                        <div class="profile-info-name"> 姓名 </div>
                        <div class="profile-info-value">
                            <span>{{user.userName}}</span>
                        </div>
                        <div class="profile-info-name"> 用户账户 </div>
                        <div class="profile-info-value">
                            <span>{{user.loginId}}</span>
                        </div>
                    </div>

                    <div class="profile-info-row">
                        <div class="profile-info-name"> 出生日期 </div>
                        <div class="profile-info-value">
                            <span>{{user.userBirthday}}</span>
                        </div>
                        <div class="profile-info-name"> 性别 </div>
                        <div class="profile-info-value">
                            <span>{{user.userSexName}}</span>
                        </div>
                    </div>

                    <div class="profile-info-row">
                        <div class="profile-info-name"> 手机号 </div>
                        <div class="profile-info-value">
                            <span>{{user.userMobile}}</span>
                        </div>
                        <div class="profile-info-name"> 办公地址 </div>
                        <div class="profile-info-value">
                            <i class="fa fa-map-marker light-orange bigger-110"></i>
                            <span>{{user.workAddress}}</span>
                        </div>
                    </div>

                    <div class="profile-info-row">
                        <div class="profile-info-name"> 入职日期  </div>
                        <div class="profile-info-value">
                            <span>{{user.joinDate}}</span>
                        </div>
                        <div class="profile-info-name"> 职务 </div>
                        <div class="profile-info-value">
                            <span>{{user.userJob}}</span>
                        </div>
                    </div>

                    <div class="profile-info-row">
                        <div class="profile-info-name"> 邮箱地址 </div>
                        <div class="profile-info-value">
                            <span>{{user.userEmail}}</span>
                        </div>
                        <div class="profile-info-name"> 账户状态 </div>
                        <div class="profile-info-value">
                            <span class="label label-sm label-success">{{user.statusName}}</span>
                        </div>
                    </div>

                    <div class="profile-info-row">
                        <div class="profile-info-name"> 创建时间 </div>
                        <div class="profile-info-value">
                            <span>{{user.createTime}}</span>
                        </div>
                        <div class="profile-info-name"> 更新时间 </div>
                        <div class="profile-info-value">
                            <span>{{user.updateTime}}</span>
                        </div>
                    </div>
                </div>
            </div>
            <#--<div class="col-xs-12 col-sm-3">
                <div class="space visible-xs"></div>
                <h4 class="header blue lighter less-margin">修改密码</h4>
                <div class="space-6"></div>
                <form>
                    <fieldset>
                        <input type="password" id="form-field-2" placeholder="请输入密码" class="col-xs-10 col-sm-12" />
                    </fieldset>
                    </br>
                    <fieldset>
                        <input type="password" id="form-field-2" placeholder="请再次输入密码" class="col-xs-10 col-sm-12" />
                    </fieldset>
                    <div class="hr hr-dotted"></div>
                    <div class="clearfix">
                        <label class="pull-left">
                            <input type="checkbox" class="ace" />
                            <span class="lbl"> 发送邮件通知</span>
                        </label>

                        <button class="pull-right btn btn-sm btn-primary btn-white btn-round" type="button">
                            提交
                            <i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
                        </button>
                    </div>
                </form>
            </div>-->
        </div>
    </div>

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

    <script type="text/javascript">
        var app = new Vue({
            el: '#dataDiv',
            data: {
                user: ""
            },
            mounted : function(){
                var userId = parent.$("#userId").val();
                var that=this;
                $.ajax({
                    url: "/system/user/"+userId,
                    type: "GET",
                    contentType: "application/json",
                    data : null,
                    dataType: "json",
                    timeout: 10000,
                    success: function (result) {
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                that.user = result.data;
                            }
                        }
                    },
                    fail: function (err) {
                        layer.close(index);
                        console.log(err)
                    }
                })
            }
        });
    </script>
</body>