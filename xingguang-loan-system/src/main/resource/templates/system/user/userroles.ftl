<link rel="stylesheet" href="/assets/css/bootstrap-duallistbox.min.css" />
<div class="main-content-inner">
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li>
                <i class="ace-icon fa fa-home home-icon"></i>
                <a href="#">控制台</a>
            </li>

            <li>
                <a href="#">系统设置</a>
            </li>
            <li class="active">角色分配</li>
        </ul><!-- /.breadcrumb -->

        <div class="nav-search" id="nav-search">
            <form class="form-search">
                    <span class="input-icon">
                        <input type="text" placeholder="百度搜索 ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
                        <i class="ace-icon fa fa-search nav-search-icon"></i>
                    </span>
            </form>
        </div><!-- /.nav-search -->
    </div>
    <div id="dataDiv" class="page-content">
        <div class="page-header">
            <h1>
                <small>
                    <i class="ace-icon fa fa-angle-double-right"></i>
                    角色分配
                </small>
            </h1>
        </div><!-- /.page-header -->
        <div style="margin-bottom: 10px; float:left;">
            <div class="input-group" style="width: 300px;float:left;">
                    <span class="input-group-addon">
                        <i class="ace-icon fa fa-check"></i>
                    </span>
                <input type="text" class="form-control search-query" placeholder="请输入用户姓名" v-model="userName"/>
                <span class="input-group-btn">
                        <button type="button" class="btn btn-inverse btn-white" @click="queryUser">
                            <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                            查询
                        </button>
                    </span>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-12">
                <!-- PAGE CONTENT BEGINS -->
                <div class="row">
                    <div class="col-xs-12">
                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                            <tr>
                                <th class="center">序号</th>
                                <th>用户姓名</th>
                                <th>用户账户</th>
                                <th class="hidden-480">状态</th>
                                <th >拥有角色</th>
                                <th>操作</th>
                            </tr>
                            </thead>

                            <tbody>
                            <tr v-for="(user,index) in users"><!-- v-on:click="show_detail(user.id)"-->
                                <td class="center">
                                    {{index+1}}
                                </td>
                                <td>{{user.userName}}</td>
                                <td>{{user.loginId}}</td>
                                <td class="hidden-480">
                                    <span class="label label-sm label-success" v-if="user.status==='0'">{{user.statusName}}</span>
                                    <span class="label label-sm label-info" v-if="user.status==='1'">{{user.statusName}}</span>
                                    <span class="label label-sm label-danger" v-if="user.status==='2'">{{user.statusName}}</span>
                                </td>
                                <td>
                                        <span class="action-buttons" v-for="(role,index) in user.roles">
                                            {{role.roleName}}&nbsp;&nbsp;
                                        </span>
                                </td>
                                <td>
                                    <div class="hidden-sm hidden-xs btn-group">
                                        <button class="btn btn-xs btn-success" data-toggle="modal" data-target="#my-modal" @click="queryRoleByUserId(user.id)">
                                            <i class="glyphicon glyphicon-share-alt"></i>
                                        </button>
                                    </div>

                                    <div class="hidden-md hidden-lg">
                                        <div class="inline pos-rel">
                                            <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                            </button>
                                            <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                <li>
                                                    <a href="#" class="tooltip-info" data-rel="tooltip" title="View"  data-toggle="modal" data-target="#my-modal" @click="queryRoleByUserId(user.id)">
                                                            <span class="blue">
                                                                <i class="ace-icon fa fa-search-plus bigger-120"></i>
                                                            </span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div><!-- /.span -->
                </div><!-- /.row -->
            </div><!-- /.col -->
        </div><!-- /.row -->
        <div id="my-modal" class="modal fade" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h3 class="smaller lighter blue no-margin">角色分配</h3>
                    </div>

                    <div class="page-content">
                        <div class="row">
                            <!-- PAGE CONTENT BEGINS -->
                            <form class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label class="col-sm-2 control-label no-padding-top" for="duallist"></label>
                                    <div class="col-sm-8">
                                        <select multiple="multiple" name="duallistbox_demo1[]" id="duallist" v-model="selected">
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

                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div>
    </div><!-- /.page-content -->
</div>

<script src="/assets/js/jquery-2.1.4.min.js"></script>
<script src="/assets/js/jquery.bootstrap-duallistbox.min.js"></script>

<script src="/js/lib/vue/vue.min.js"></script>
<script src="/js/lib/vue/vue-resource.min.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">

    jQuery(function($){

        $("#my-modal").on("hidden.bs.modal", function() {
            $('#my-modal').removeData("bs.modal");
        });
    });

    var app = new Vue({
        el: '#dataDiv',
        data: {
            users: {},
            "userName" : "",
            selected:"",
            roles: []
        },
        created : function(){
            var idx = layer.load(2);
            this.$http.get("/system/users/roles").then(function(response){
                // 响应成功回调
                var result = response.data;
                if(result.sysCode==0){
                    if(result.bizCode==0){
                        app.users = result.data;
                    }
                }
                layer.close(idx);
            }, function(response){
                // 响应错误回调
            });
        },
        methods : {
            queryUser : function(){
                var idx = layer.load(2);
                var param = {"userName":app.userName};
                app.$http.get("/system/users/roles?op=get",{params:param},{emulateJSON: true}).then(function(response){
                    // 响应成功回调
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            app.users = result.data;
                        }
                    }
                    layer.close(idx);
                }, function(response){
                    // 响应错误回调
                });
            },
            queryRoleByUserId : function(userId){
                //iframe层-父子操作
                /*layer.open({
                    title: "用户信息",
                    type: 2,
                    area: ['1000px', '380px'],
                    fixed: false, //不固定
                    maxmin: true,
                    content: '/prouter/system/user/grant/'+userId,
                    success: function(layero, index){
                        var body = layer.getChildFrame('body',index);//建立父子联系
                        var userIdInput = body.find('#userId');
                        $(userIdInput).attr("value",userId);
                        console.log($(userIdInput).val());
                    }
                });*/

                var param = {"userId":app.userId};
                var that = this;
                that.$http.get("/system/users/roles/"+userId+"?op=get",{params:param},{emulateJSON: true}).then(function(response){
                    // 响应成功回调
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            //that.roles = result.data;
                            var roles = result.data;
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
                        }
                    }
                }, function(response){
                    // 响应错误回调
                });
            },
            saveUserRole : function(){
                var aa = $("#duallist").val();
                alert(aa);
            }
        }

    });
    $('#nav-search-input').bind('keypress', function(event) {
        if (event.keyCode == "13") {
            event.preventDefault();
            window.open("http://www.baidu.com/s?wd="+$('#nav-search-input').val());
        }
    });
</script>