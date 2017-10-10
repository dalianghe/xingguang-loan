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
                <li class="active">业务员审核</li>
            </ul><!-- /.breadcrumb -->

            <div class="nav-search" id="nav-search">
                <form class="form-search">
				<span class="input-icon">
					<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
					<i class="ace-icon fa fa-search nav-search-icon"></i>
				</span>
                </form>
            </div><!-- /.nav-search -->
        </div>
        <div class="page-content">

            <div class="page-header">
                <h1>
                    <small>
                        <i class="ace-icon fa fa-angle-double-right"></i>
                        业务员审核
                    </small>
                </h1>
            </div><!-- /.page-header -->

            <div id="dataDiv" class="row">
                <div class="col-xs-12">
                    <!-- PAGE CONTENT BEGINS -->
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="table-detail">
                                <div class="row">
                                    <div class="col-xs-12 col-sm-2">
                                        <div class="text-center">
                                            <img height="150" class="thumbnail inline no-margin-bottom" alt="Domain Owner's Avatar" src="/assets/images/avatars/profile-pic.jpg" />
                                            <br />
                                            <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                                                <div class="inline position-relative">
                                                    <a class="user-title-label" href="#">
                                                        <i class="ace-icon fa fa-circle light-green"></i>
                                                        <span class="white">{{user.name}}</span>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-xs-12 col-sm-10">
                                        <div class="space visible-xs"></div>
                                        <form id="userForm">
                                            <div class="profile-user-info profile-user-info-striped">
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 姓名 </div>
                                                    <div class="profile-info-value">{{user.name}}</div>
                                                    <div class="profile-info-name"> 性别 </div>
                                                    <div class="profile-info-value">{{user.sexName}}</div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 手机号 </div>
                                                    <div class="profile-info-value">
                                                        <div class="input-group">{{user.phone}}</div>
                                                    </div>
                                                    <div class="profile-info-name"> 身份证号 </div>
                                                    <div class="profile-info-value">{{user.idNo}}</div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 所在省市 </div>
                                                    <div class="profile-info-value">{{user.provinceName}}{{user.cityName}}</div>
                                                    <div class="profile-info-name"> 申请时间 </div>
                                                    <div class="profile-info-value">{{user.createTime}}</div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 审核结果 </div>
                                                    <div class="profile-info-value">
                                                        <div class="col-xs-10 col-sm-12" style="margin-left: -12px;">
                                                            <label>
                                                                <input name="status" type="radio" class="ace" value="2"/>
                                                                <span class="lbl"> 通过</span>
                                                            </label>
                                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                                            <label>
                                                                <input name="status" type="radio" class="ace" value="3"/>
                                                                <span class="lbl"> 不通过</span>
                                                            </label>
                                                        </div>
                                                    </div>
                                                    <div class="profile-info-name"></div>
                                                    <div class="profile-info-value"></div>
                                                </div>
                                            </div>
                                            <input type="hidden" id="id" name="id" value="${id}"/>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div><!-- /.span -->
                    </div><!-- /.row -->
                    <br/>
                    <button class="btn btn-white btn-info btn-bold" @click="auditUser">
                        <i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
                        保存
                    </button>
                </div><!-- /.col -->
            </div><!-- /.row -->
        </div><!-- /.page-content -->

    </div>
    <script src="/js/lib/jquery/jquery.serializejson.min.js"></script>
    <script type="text/javascript">
        var app = new Vue({
            el: '#dataDiv',
            data: {
                user: {}
            },
            created : function(){
                var userId = $("#id").val();
                var that=this;
                that.$http.get("/work/user/"+userId).then(function(response){
                    // 响应成功回调
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            that.user = result.data;
                        }
                    }
                }, function(response){
                    // 响应错误回调
                });
            },
            methods : {
                auditUser : function(){
                    var formData = JSON.stringify($("#userForm").serializeJSON());
                    this.$http.post("/work/audituser",formData).then(function(response){
                        // 响应成功回调
                        var result = response.data;
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                //this.user = result.data;
                                layer.alert('操作成功！', {icon: 1,title: "系统提示"});
                            }
                        }
                    }, function(response){
                        // 响应错误回调
                    });
                }
            }
        });

    </script>