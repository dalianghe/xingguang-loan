<link rel="stylesheet" href="/js/lib/vue/page/zpageNav.css" />
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
        <li class="active">用户管理</li>
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
                用户管理
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
        &nbsp;&nbsp;
        <div style="float:right;" onclick="addUser()">
            <button class="btn btn-white btn-info btn-bold"  data-toggle="modal" data-target="#my-modal">
                <i class="ace-icon fa fa-pencil-square-o bigger-120 blue"></i>
                添加用户
            </button>
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
                            <th class="hidden-480">用户性别</th>
                            <th class="hidden-480">用户账户</th>
                            <th>手机号</th>
                            <th>
                                <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                创建时间
                            </th>
                            <th>状态</th>
                            <th class="detail-col" class="hidden-480">详情</th>
                            <th>操作</th>
                        </tr>
                        </thead>

                        <tbody>
                            <tr v-for="(user,index) in users"><!-- v-on:click="show_detail(user.id)"-->
                                <td class="center">
                                    {{index+1}}
                                </td>
                                <td>{{user.userName}}</td>
                                <td class="hidden-480">{{user.userSexName}}</td>
                                <td class="hidden-480">{{user.loginId}}</td>
                                <td>{{user.userMobile}}</td>
                                <td>{{user.createTime}}</td>

                                <td class="hidden-480">
                                    <span class="label label-sm label-success" v-if="user.status==='0'">{{user.statusName}}</span>
                                    <span class="label label-sm label-info" v-if="user.status==='1'">{{user.statusName}}</span>
                                    <span class="label label-sm label-danger" v-if="user.status==='2'">{{user.statusName}}</span>
                                </td>

                                <td class="hidden-480">
                                    <div class="action-buttons" style="text-align:center;">
                                        <a href="#" class="green bigger-140 show-details-btn" title="Show Details"  @click="show_detail(user.id)">
                                            <i class="ace-icon fa fa-angle-double-down"></i>
                                            <span class="sr-only">Details</span>
                                        </a>
                                    </div>
                                </td>

                                <td>
                                    <div class="hidden-sm hidden-xs btn-group">
                                        <button class="btn btn-xs btn-success">
                                            <i class="ace-icon fa fa-check bigger-120"></i>
                                        </button>
                                        <button class="btn btn-xs btn-info" @click="modify_user(user.id)">
                                            <i class="ace-icon fa fa-pencil bigger-120"></i>
                                        </button>
                                        <button class="btn btn-xs btn-danger">
                                            <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                        </button>
                                        <#--<button class="btn btn-xs btn-warning">
                                            <i class="ace-icon fa fa-flag bigger-120"></i>
                                        </button>-->
                                    </div>

                                    <div class="hidden-md hidden-lg">
                                        <div class="inline pos-rel">
                                            <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                            </button>
                                            <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                <li>
                                                    <a href="#" class="tooltip-info" data-rel="tooltip" title="View">
                                                                <span class="blue">
                                                                    <i class="ace-icon fa fa-search-plus bigger-120"></i>
                                                                </span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit" @click="modify_user(user.id)">
                                                                <span class="green">
                                                                    <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                                                </span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
                                                                <span class="red">
                                                                    <i class="ace-icon fa fa-trash-o bigger-120"></i>
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
    <input type="hidden" id="userId" name="userId" value=""/>
    <div class="wrap pages pa-cen clearfix" id="wrap">
        <zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-on:pagehandler="pageHandler"><zpagenav>
    </div>
</div><!-- /.page-content -->
</div>

<script src="/js/lib/vue/vue.min.js"></script>
<script src="/js/lib/vue/vue-resource.min.js"></script>
<script src="/js/lib/vue/page/zpageNav.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">

    function addUser(){
        $("#main").load("/router/system/user/useradd",function(response,status,xhr){
            //console.log("success");
        });
    }

    var app = new Vue({
        el: '#dataDiv',
        data: {
            users: {},
            "userName":"",
            // 分页
            page: 1,
            pageSize: 10,
            total: ''
        },
        mounted : function(){
            query(this);
        },
        methods : {
            show_detail : function(userId){
                $("#userId").val(userId);
                //iframe层-父子操作
                layer.open({
                    title: "用户信息",
                    type: 2,
                    area: ['700px', '450px'],
                    fixed: false, //不固定
                    maxmin: true,
                    content: '/router/system/user/userinfo',
                    success: function(layero, index){
                        var body = layer.getChildFrame('body',index);//建立父子联系
                        var userIdInput = body.find('#userId');
                        $(userIdInput).attr("value",userId);
                        console.log($(userIdInput).val());
                    }
                });
            },
            queryUser : function(){
                query(this);
            },
            modify_user : function(userId){
                var url = "/router/system/user/userupdate";
                var paramJson = {"id":userId };
                var param = {"paramJson":JSON.stringify(paramJson)};
                $("#main").load(url, param, function(response,status,xhr){
                    //console.log("success");
                });
            },
            pageHandler: function (page) {
                this.page=page;
                query(this);
            }
        }
    });
    function query(obj){
        var that = obj;
        var idx = layer.load(2);
        var paramJson = {"userName":that.userName,"pager":{"page":that.page,"pageSize":that.pageSize}};
        var param = {"paramJson":JSON.stringify(paramJson)};
        that.$http.get("/system/users?op=get",{params:param},{emulateJSON: true}).then(function(response){
            var result = response.data;
            if(result.sysCode==0){
                if(result.bizCode==0){
                    that.users = result.data.users;
                    that.total = result.data.total;
                }
            }
            layer.close(idx);
        }, function(response){
            layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
        });
    }
    $('#nav-search-input').bind('keypress', function(event) {
        if (event.keyCode == "13") {
            event.preventDefault();
            window.open("http://www.baidu.com/s?wd="+$('#nav-search-input').val());
        }
    });
</script>