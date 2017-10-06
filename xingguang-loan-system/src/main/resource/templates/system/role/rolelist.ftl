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
        <li class="active">角色管理</li>
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
                    角色管理
                </small>
            </h1>
        </div><!-- /.page-header -->
        <div style="margin-bottom: 10px; float:left;">
                <div class="input-group" style="width: 300px;float:left;">
                    <span class="input-group-addon">
                        <i class="ace-icon fa fa-check"></i>
                    </span>
                    <input type="text" class="form-control search-query" placeholder="请输入角色名称" v-model="roleName"/>
                    <span class="input-group-btn">
                        <button type="button" class="btn btn-inverse btn-white" @click="queryRole">
                            <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                            查询
                        </button>
                    </span>
                </div>
                &nbsp;&nbsp;
                <div style="float:right;">
                    <button class="btn btn-white btn-info btn-bold"  data-toggle="modal" data-target="#my-modal">
                        添加角色
                    </button>
                        <#--<a href="#my-modal" role="button" class="btn btn-white btn-info btn-bold" data-toggle="modal" align="right">
                            <i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
                            添加角色
                        </a>-->
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
                                <th>角色编码</th>
                                <th>角色名称</th>
                                <th>角色类型</th>
                                <th class="hidden-480">角色状态</th>
                                <th>
                                    <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                    创建时间
                                </th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                                <tr v-for="(role,index) in roles"><!-- v-on:click="show_detail(user.id)"-->
                                    <td class="center">
                                        {{index+1}}
                                    </td>
                                    <td>{{role.roleCode}}</td>
                                    <td>{{role.roleName}}</td>
                                    <td>{{role.roleType}}</td>
                                    <td>
                                        <span class="label label-sm label-success" v-if="role.status==='0'">{{role.statusName}}</span>
                                        <span class="label label-sm label-danger" v-if="role.status==='1'">{{role.statusName}}</span>
                                    </td>
                                    <td>{{role.createTime}}</td>

                                    <td>
                                        <div class="hidden-sm hidden-xs btn-group">
                                            <button class="btn btn-xs btn-info" @click="modifyRole(role.id)">
                                                <i class="ace-icon fa fa-pencil bigger-120"></i>
                                            </button>
                                            <button class="btn btn-xs btn-danger" @click="deleteRole(role.id)">
                                                <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                            </button>
                                        </div>
                                        <div class="hidden-md hidden-lg">
                                            <div class="inline pos-rel">
                                                <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                    <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                                </button>
                                                <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                    <li>
                                                        <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit" @click="modifyRole(role.id)">
                                                                    <span class="green">
                                                                        <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                                                    </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete" @click="deleteRole(role.id)">
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
        <!-- 添加角色弹出层 -->
        <div id="my-modal" class="modal fade" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h3 class="smaller lighter blue no-margin">添加角色</h3>
                        </div>
                        <div class="modal-body">
                            <form id="roleForm">
                                <div class="profile-user-info profile-user-info-striped">
                                    <div class="profile-info-row">
                                        <div class="profile-info-name "><span style="color: red">*</span> 角色名称 </div>
                                        <div class="profile-info-value">
                                            <input type="text" id="roleName" name="roleName" placeholder="请输入角色名称"/>
                                        </div>
                                        <div class="profile-info-name"><span style="color: red">*</span> 角色编码 </div>
                                        <div class="profile-info-value">
                                            <input type="text" id="roleCode" name="roleCode" placeholder="请输入角色编码"/>
                                        </div>
                                    </div>
                                    <div class="profile-info-row">
                                        <div class="profile-info-name "><span style="color: red">*</span> 角色类型 </div>
                                        <div class="profile-info-value">
                                            <input type="text" id="roleType" name="roleType" placeholder="请输入角色类型"/>
                                        </div>
                                        <div class="profile-info-name"><span style="color: red">*</span> 角色状态 </div>
                                        <div class="profile-info-value">
                                            <label>
                                                <input name="status" type="radio" class="ace" value="0"/>
                                                <span class="lbl"> 有效</span>
                                            </label>
                                            &nbsp;&nbsp;
                                            <label>
                                                <input name="status" type="radio" class="ace"  value="1"/>
                                                <span class="lbl"> 无效</span>
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-sm btn-success pull-right" @click="saveRole">
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
</div><!-- /.main-content-inner -->


<script src="/js/lib/vue/vue.min.js"></script>
<script src="/js/lib/vue/vue-resource.min.js"></script>
<script src="/js/lib/jquery/jquery.serializejson.min.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">
    var app = new Vue({
        el: '#dataDiv',
        data: {
            roles: {},
            "roleName" : ""
        },
        created : function(){
            var idx = layer.load(2);
            var that=this;
            that.$http.get("/system/roles").then(function(response){
                // 响应成功回调
                var result = response.data;
                if(result.sysCode==0){
                    if(result.bizCode==0){
                        that.roles = result.data;
                    }
                }
                layer.close(idx);
            }, function(response){
                // 响应错误回调
            });
        },
        methods : {
            queryRole : function(){
                var idx = layer.load(2);
                var param = {"roleName":this.roleName};
                app.$http.get("/system/roles?op=get",{params:param},{emulateJSON: true}).then(function(response){
                    // 响应成功回调
                    var result = response.data;
                    console.log(result);
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            this.roles = result.data;
                        }
                    }
                    layer.close(idx);
                }, function(response){
                    // 响应错误回调
                });
            },
            saveRole : function(){
                app.$http.post("/system/role",JSON.stringify($("#roleForm").serializeJSON())).then(function(response){
                    // 响应成功回调
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            $(".modal-backdrop").removeClass("modal-backdrop");
                            layer.msg('添加成功。');
                            callBack("/router/system/role/rolelist");
                        }else{
                            layer.alert(result.msg, {icon:2,title:"系统提示"});
                        }
                    }
                }, function(response){
                    // 响应错误回调
                });
            },
            modifyRole : function(roleId){
                alert(roleId);
            },
            deleteRole : function(roleId){
                layer.confirm('确认要删除该角色吗？', {icon: 3, title:'系统提示'}, function(index){
                    app.$http.put("/system/role/"+roleId,JSON.stringify({"id":roleId,"deleteFlag":"1"})).then(function(response){
                        // 响应成功回调
                        var result = response.data;
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                layer.msg('删除成功！');
                                app.$options.methods.queryRole();
                            }else{
                                layer.alert(result.msg, {icon:2,title:"系统提示"});
                            }
                        }
                    }, function(response){
                        // 响应错误回调
                    });
                    layer.close(index);
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