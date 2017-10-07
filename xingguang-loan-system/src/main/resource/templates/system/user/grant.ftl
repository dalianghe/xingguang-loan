<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />
    <title>More Elements - Ace Admin</title>
    <meta name="description" content="" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="/assets/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/assets/font-awesome/4.5.0/css/font-awesome.min.css" />
    <!-- page specific plugin styles -->
    <link rel="stylesheet" href="/assets/css/bootstrap-duallistbox.min.css" />
    <link rel="stylesheet" href="/assets/css/bootstrap-multiselect.min.css" />
    <link rel="stylesheet" href="/assets/css/select2.min.css" />
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
    <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
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
        <div id="dataDiv">
            <div class="page-content">
                <div class="row">
                    <!-- PAGE CONTENT BEGINS -->
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label class="col-sm-2 control-label no-padding-top" for="duallist"></label>
                            <div class="col-sm-8">
                                <select multiple="multiple" name="duallistbox_demo1[]" id="duallist">
                                    <#--<template  v-for="role in roles">
                                        <option  :value="role.value" v-if="role.marker!=='0'" selected="selected">{{ role.roleName }}</option>
                                        <option :value="role.value" v-else>{{role.roleName}}</option>
                                    </template>-->
                                </select>
                            </div>
                        </div>
                    </form>
                </div><!-- /.row -->
            </div><!-- /.page-content -->

            <div class="modal-footer">
                <button class="btn btn-sm btn-success pull-right" @click="saveUserRole">
                    <i class="ace-icon fa fa-check"></i>
                    确定
                </button>
                <button class="btn btn-sm btn-danger pull-right" data-dismiss="modal">
                    <i class="ace-icon fa fa-times"></i>
                    取消
                </button>
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
    if('ontouchstart' in document.documentElement) document.write("<script src='/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script src="/assets/js/bootstrap.min.js"></script>
<!-- page specific plugin scripts -->
<script src="/assets/js/jquery.bootstrap-duallistbox.min.js"></script>
<script src="/js/lib/vue/vue.min.js"></script>
<script src="/js/lib/vue/vue-resource.min.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">
    jQuery(function($){
        $.ajax({
            url: "/system/users/roles/"+4,
            type: "GET",
            contentType: "application/json",
            data : {"userId":4},
            dataType: "json",
            timeout: 10000,
            success: function (data) {
                var roles = data.data;
                if(data.sysCode==0){ // 系统正常返回
                    if(data.bizCode==0){ // 业务处理通过
                        var html =[];
                        $.each(roles,function(i){
                            var selected = "";
                            if(roles[i].marker != "0"){
                                selected = "selected='selected'";
                            }
                            html.push("<option value='"+roles[i].id+"' "+selected+">"+roles[i].roleName+"</option>");
                        });
                        $("#duallist").html(html);
                        var demo1 = $('select[name="duallistbox_demo1[]"]').bootstrapDualListbox();
                    }else{

                    }
                }
            },
            fail: function (err) {
                console.log(err)
            }
        })

    });
    /*var app = new Vue({
        el: '#dataDiv',
        data: {
            selected:"",
            roles: [

            ]
        },
        created : function(){
            var userId = 4;
            var param = {"userId":4};
            var that = this;
            that.$http.get("/system/users/roles/"+userId+"?op=get",{params:param},{emulateJSON: true}).then(function(response){
                // 响应成功回调
                var result = response.data;
                if(result.sysCode==0){
                    if(result.bizCode==0){
                        console.log(result.data);
                        that.roles = result.data;
                    }
                }
            }, function(response){
                // 响应错误回调
            });
        },
        methods : {
            saveUserRole : function(){
                var aa = $("#duallist").val();
                alert(aa);
            }
        }

    });*/
</script>
</body>
</html>