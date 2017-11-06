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
        <li class="active">资源分配</li>
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
                    资源分配
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
        </div>
        <div class="row">
            <div class="col-xs-12">
                <!-- PAGE CONTENT BEGINS -->
                <div class="row">
                    <div class="col-xs-12">
                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                            <tr>
                                <th class="hidden-480" class="center">序号</th>
                                <th>角色名称</th>
                                <th class="hidden-480">角色状态</th>
                                <th width="50%">拥有资源</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                                <tr v-for="(role,index) in roles"><!-- v-on:click="show_detail(user.id)"-->
                                    <td class="hidden-480" class="center">{{index+1}}</td>
                                    <td>{{role.roleName}}</td>
                                    <td class="hidden-480">
                                        <span class="label label-sm label-success" v-if="role.status==='0'">{{role.statusName}}</span>
                                        <span class="label label-sm label-info" v-if="role.status==='1'">{{role.statusName}}</span>
                                    </td>
                                    <td>
                                        <span class="action-buttons" v-for="(resource,index) in role.resources">
                                            {{resource.resName}}&nbsp;&nbsp;
                                        </span>
                                    </td>
                                    <td>
                                        <div class="hidden-sm hidden-xs btn-group">
                                            <button class="btn btn-xs btn-success" data-toggle="modal" data-target="#my-modal"  @click="queryResourceByRoleId(role.id)" title="分配资源">
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
                                                        <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit" @click="queryResourceByRoleId(role.id)">
                                                                    <span class="green">
                                                                        <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
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
        <div id="my-modal" class="modal fade" tabindex="1">
            <div class="modal-dialog">
                <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h3 class="smaller lighter blue no-margin">资源分配</h3>
                        </div>
                        <div class="modal-body">
                            <form class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label class="col-sm-2 control-label no-padding-top" for="duallist"></label>
                                    <div class="col-sm-8">
                                        <select multiple="multiple" name="duallistbox_demo1[]" id="duallist" v-model="selected" style="height: 300px;">
                                        </select>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-sm btn-success pull-right" @click="saveResource">
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
<script src="/assets/js/jquery.bootstrap-duallistbox.min.js"></script>
<script src="/js/lib/vue/vue.min.js"></script>
<script src="/js/lib/vue/vue-resource.min.js"></script>
<script src="/js/lib/jquery/jquery.serializejson.min.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">
    var app = new Vue({
        el: '#dataDiv',
        data: {
            roles: {},
            "roleName" : "",
            "selected" : "",
            "roleId" : ""
        },
        mounted : function(){
            var idx = layer.load(2);
            var that=this;
            that.$http.get("/system/roles/resources").then(function(response){
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
                app.$http.get("/system/roles/resources?op=get",{params:param},{emulateJSON: true}).then(function(response){
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
            queryResourceByRoleId : function(roleId){

                this.roleId=roleId;
                var param = {"roleId":roleId};
                this.$http.get("/system/roles/resources/"+roleId+"?op=get",{params:param},{emulateJSON: true}).then(function(response){
                    // 响应成功回调
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            var resources = result.data;
                            var html =[];
                            $.each(resources,function(i){
                                var selected = "";
                                if(resources[i].marker != "0"){
                                    selected = "selected='selected'";
                                }
                                html.push("<option value='"+resources[i].id+"' "+selected+">"+resources[i].resName+"</option>");
                            });
                            $("#duallist").html(html);
                            var demo1 = $('select[name="duallistbox_demo1[]"]').bootstrapDualListbox({
                                nonSelectedListLabel: '未选资源',
                                selectedListLabel: '已选资源',
                                infoText:'{0}'
                            });
                            $('select[name="duallistbox_demo1[]"]').bootstrapDualListbox('refresh', true);
                        }
                    }
                }, function(response){
                    // 响应错误回调
                });
                //layer.msg('系统正在完善，敬请恭候！');
            },
            saveResource : function(){
                var resources = $("#duallist").val();
                var param = JSON.stringify({"roleId":app.roleId,"resources":resources});
                app.$http.post("/system/roleresources",param).then(function(response){
                    // 响应成功回调
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            //$(".modal-backdrop").removeClass("modal-backdrop");
                            //$('#my-modal').modal('hide');
                            layer.msg('分配成功！');
                            app.$options.methods.queryRole();
                        }
                    }
                }, function(response){
                    // 响应错误回调
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