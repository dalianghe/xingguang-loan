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
        <li class="active">资源管理</li>
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
                    资源管理
                </small>
            </h1>
        </div><!-- /.page-header -->
        <div style="margin-bottom: 10px; float:left;">
            <div class="input-group" style="width: 300px;float:left;">
                <span class="input-group-addon">
                    <i class="ace-icon fa fa-check"></i>
                </span>
                <input type="text" class="form-control search-query" placeholder="请输入资源名称" v-model="resName"/>
                <span class="input-group-btn">
                    <button type="button" class="btn btn-inverse btn-white" @click="queryResource">
                        <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                        查询
                    </button>
                </span>
            </div>
            &nbsp;&nbsp;
            <div style="float:right;">
                <button class="btn btn-white btn-info btn-bold"  data-toggle="modal" data-target="#resource-modal">
                    <i class="ace-icon fa fa-pencil-square-o bigger-120 blue"></i>
                    添加资源
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
                                <th>资源名称</th>
                                <th>资源类型</th>
                                <th>URL</th>
                                <th class="hidden-480">菜单级别</th>
                                <th class="hidden-480">权限码</th>
                                <th>
                                    <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                    创建时间
                                </th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                                <tr v-for="(resource,index) in resources"><!-- v-on:click="show_detail(user.id)"-->
                                    <td class="center">
                                        {{index+1}}
                                    </td>
                                    <td>{{resource.resName}}</td>
                                    <td>{{resource.resType}}</td>
                                    <td>{{resource.resUrl}}</td>
                                    <td>{{resource.menuLevelName}}</td>
                                    <td>{{resource.permisCode}}</td>
                                    <td>{{resource.createTime}}</td>

                                    <td>
                                        <div class="hidden-sm hidden-xs btn-group">
                                            <button class="btn btn-xs btn-info" @click="modifyResource(resource.id)">
                                                <i class="ace-icon fa fa-pencil bigger-120"></i>
                                            </button>
                                            <button class="btn btn-xs btn-danger" @click="deleteResource(resource.id)">
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
                                                        <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit" @click="modifyResource(resource.id)">
                                                                    <span class="green">
                                                                        <i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
                                                                    </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete" @click="deleteResource(resource.id)">
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
        <!-- 添加资源弹出层 -->
        <div id="resource-modal" class="modal fade" tabindex="2">
            <div class="modal-dialog">
                <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h3 class="smaller lighter blue no-margin">添加资源</h3>
                        </div>
                        <div class="modal-body">
                            <form id="resourceForm">
                                <div class="profile-user-info profile-user-info-striped">
                                    <div class="profile-info-row">
                                        <div class="profile-info-name "><span style="color: red">*</span> 资源名称 </div>
                                        <div class="profile-info-value">
                                            <input type="text" id="resName" name="resName" placeholder="请输入资源名称"/>
                                        </div>
                                        <div class="profile-info-name"><span style="color: red">*</span> 资源类型 </div>
                                        <div class="profile-info-value">
                                            <label>
                                                <input name="resType" type="radio" class="ace" value="menu"/>
                                                <span class="lbl"> 菜单</span>
                                            </label>
                                            &nbsp;&nbsp;
                                            <label>
                                                <input name="resType" type="radio" class="ace"  value="permission"/>
                                                <span class="lbl"> 资源</span>
                                            </label>
                                        </div>
                                    </div>
                                    <div class="profile-info-row">
                                        <div class="profile-info-name "><span style="color: red">*</span> RUL </div>
                                        <div class="profile-info-value">
                                            <input type="text" id="resUrl" name="resUrl" placeholder="请输入资源RUL"/>
                                        </div>
                                        <div class="profile-info-name"><span style="color: red">*</span> ICON图标 </div>
                                        <div class="profile-info-value">
                                            <input type="text" id="menuIcon" name="menuIcon" placeholder="请输入菜单ICON"/>
                                        </div>
                                    </div>
                                    <div class="profile-info-row">
                                        <div class="profile-info-name "><span style="color: red">*</span> 菜单级别 </div>
                                        <div class="profile-info-value">
                                            <label>
                                                <input name="menuLevel" type="radio" class="ace" value="1"/>
                                                <span class="lbl"> 一级</span>
                                            </label>
                                            &nbsp;&nbsp;
                                            <label>
                                                <input name="menuLevel" type="radio" class="ace"  value="2"/>
                                                <span class="lbl"> 二级</span>
                                            </label>
                                        </div>
                                        <div class="profile-info-name"><span style="color: red">*</span> 权限码 </div>
                                        <div class="profile-info-value">
                                            <input type="text" id="permisCode" name="permisCode" placeholder="请输入权限码"/>
                                        </div>
                                    </div>
                                    <div class="profile-info-row">
                                        <div class="profile-info-name "><span style="color: red">*</span> 父菜单 </div>
                                        <div class="profile-info-value">
                                            <select class="form-control" id="parentId" name="parentId">
                                                <option value=""></option>
                                                <option value="AL">Alabama</option>
                                                <option value="AK">Alaska</option>
                                                <option value="AZ">Arizona</option>
                                                <option value="AL">Alabama</option>
                                                <option value="AK">Alaska</option>
                                                <option value="AZ">Arizona</option>
                                            </select>
                                        </div>
                                        <div class="profile-info-name "></div>
                                        <div class="profile-info-value"></div>
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
        <div class="wrap pages pa-cen clearfix" id="wrap">
            <zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-on:pagehandler="pageHandler"><zpagenav>
        </div>
    </div><!-- /.page-content -->
</div><!-- /.main-content-inner -->


<script src="/js/lib/vue/vue.min.js"></script>
<script src="/js/lib/vue/vue-resource.min.js"></script>
<script src="/js/lib/vue/page/zpageNav.js"></script>
<script src="/js/lib/jquery/jquery.serializejson.min.js"></script>

<!-- inline scripts related to this page -->
<script type="text/javascript">
    var app = new Vue({
        el: '#dataDiv',
        data: {
            resources: {},
            "resName" : "",
            // 分页
            page: 1,
            pageSize: 10,
            total: ''
        },
        created : function(){
            query(this);
        },
        methods : {
            queryResource : function(){
                query(this);
            },
            saveResource : function(){
                console.log(JSON.stringify($("#resourceForm").serializeJSON()));
                app.$http.post("/system/resource",JSON.stringify($("#resourceForm").serializeJSON())).then(function(response){
                    // 响应成功回调
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            $('#resource-modal').modal('hide');
                            layer.msg('添加成功。');
                            //app.$options.methods.queryResource();
                            query(this);
                        }else{
                            layer.alert(result.msg, {icon:2,title:"系统提示"});
                        }
                    }
                }, function(response){
                    // 响应错误回调
                });
            },
            modifyResource : function(roleId){
                layer.msg('系统正在完善，敬请恭候！');
            },
            deleteResource : function(resourceId){
                layer.confirm('确认要删除该资源吗？', {icon: 3, title:'系统提示'}, function(index){
                    app.$http.put("/system/resource/"+resourceId,JSON.stringify({"id":resourceId,"deleteFlag":"1"})).then(function(response){
                        // 响应成功回调
                        var result = response.data;
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                layer.msg('删除成功！');
                                //app.$options.methods.queryResource();
                                query(this);
                            }else{
                                layer.alert(result.msg, {icon:2,title:"系统提示"});
                            }
                        }
                    }, function(response){
                        // 响应错误回调
                    });
                    layer.close(index);
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
        var paramJson = {"resName":that.resName,"pager":{"page":that.page,"pageSize":that.pageSize}};
        var param = {"paramJson":JSON.stringify(paramJson)};
        that.$http.get("/system/resources?op=get",{params:param},{emulateJSON: true}).then(function(response){
            var result = response.data;
            if(result.sysCode==0){
                if(result.bizCode==0){
                    that.resources = result.data.resources;
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