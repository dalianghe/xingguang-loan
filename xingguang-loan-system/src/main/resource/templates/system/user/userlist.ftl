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

<div class="page-content">
    <#--<div class="ace-settings-container" id="ace-settings-container">
        <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
            <i class="ace-icon fa fa-cog bigger-130"></i>
        </div>

        <div class="ace-settings-box clearfix" id="ace-settings-box">
            <div class="pull-left width-50">
                <div class="ace-settings-item">
                    <div class="pull-left">
                        <select id="skin-colorpicker" class="hide">
                            <option data-skin="no-skin" value="#438EB9">#438EB9</option>
                            <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                            <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                            <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                        </select>
                    </div>
                    <span>&nbsp; Choose Skin</span>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-navbar" autocomplete="off" />
                    <label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-sidebar" autocomplete="off" />
                    <label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-breadcrumbs" autocomplete="off" />
                    <label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" autocomplete="off" />
                    <label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-add-container" autocomplete="off" />
                    <label class="lbl" for="ace-settings-add-container">
                        Inside
                        <b>.container</b>
                    </label>
                </div>
            </div><!-- /.pull-left &ndash;&gt;

            <div class="pull-left width-50">
                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover" autocomplete="off" />
                    <label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact" autocomplete="off" />
                    <label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight" autocomplete="off" />
                    <label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
                </div>
            </div><!-- /.pull-left &ndash;&gt;
        </div><!-- /.ace-settings-box &ndash;&gt;
    </div>--><!-- /.ace-settings-container -->

    <div class="page-header">
        <h1>
            <small>
                <i class="ace-icon fa fa-angle-double-right"></i>
                用户管理
            </small>
        </h1>
    </div><!-- /.page-header -->

    <div style="margin-bottom: 10px;" align="right" onclick="addUser()">
        <button class="btn btn-white btn-info btn-bold">
            <i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
            新增
        </button>
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
                            <th>用户性别</th>
                            <th>用户账户</th>
                            <th class="hidden-480">手机号</th>
                            <th>
                                <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                创建时间
                            </th>
                            <th class="hidden-480">状态</th>
                            <th class="detail-col">详情</th>
                            <th>操作</th>
                        </tr>
                        </thead>

                        <tbody>
                            <tr v-for="(user,index) in users"><!-- v-on:click="show_detail(user.id)"-->
                                <td class="center">
                                    {{index+1}}
                                </td>
                                <td>{{user.userName}}</td>
                                <td>{{user.userSexName}}</td>
                                <td>{{user.loginId}}</td>
                                <td class="hidden-480">{{user.userMobile}}</td>
                                <td>{{user.createTime}}</td>

                                <td class="hidden-480">
                                    <span class="label label-sm label-success" v-if="user.status==='0'">{{user.statusName}}</span>
                                    <span class="label label-sm label-info" v-if="user.status==='1'">{{user.statusName}}</span>
                                    <span class="label label-sm label-danger" v-if="user.status==='2'">{{user.statusName}}</span>
                                </td>

                                <td class="center">
                                    <div class="action-buttons">
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
</div><!-- /.page-content -->
</div>

<script src="/js/lib/vue/vue.min.js"></script>
<script src="/js/lib/vue/vue-resource.min.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">

    function addUser(){
        $("#main").load("/router/system/user/useradd",function(response,status,xhr){
            //console.log("success");
        });
    }

    var app = new Vue({
        el: '#simple-table',
        data: {
            users: ""
        },
        created : function(){
            var idx = layer.load(2);
            var that=this;
            that.$http.get("/system/users").then(function(response){
                // 响应成功回调
                var result = response.data;
                if(result.sysCode==0){
                    if(result.bizCode==0){
                        that.users = result.data;
                    }
                }
                layer.close(idx);
            }, function(response){
                // 响应错误回调
            });
        },
        methods : {
            show_detail : function(userId){
                //iframe层-父子操作
                layer.open({
                    title: "用户信息",
                    type: 2,
                    area: ['700px', '450px'],
                    fixed: false, //不固定
                    maxmin: true,
                    content: '/prouter/system/user/userinfo/'+userId,
                    success: function(layero, index){
                        var body = layer.getChildFrame('body',index);//建立父子联系
                        var userIdInput = body.find('#userId');
                        $(userIdInput).attr("value",userId);
                        console.log($(userIdInput).val());
                    }
                });
            },
            modify_user : function(userId){
                var url = "/prouter/system/user/userupdate/"+userId;
                $("#main").load(url,function(response,status,xhr){
                    //console.log("success");
                });
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