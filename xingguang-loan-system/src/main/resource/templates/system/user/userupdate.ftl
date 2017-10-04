<link rel="stylesheet" href="/assets/font-awesome/4.5.0/css/font-awesome.min.css" />
<link rel="stylesheet" href="/assets/css/bootstrap-datepicker3.min.css" />
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
                        用户修改
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
                                                        <span class="white">{{user.userName}}</span>
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
                                                <div class="profile-info-value">
                                                    <input type="text" id="userName" placeholder="Username" class="col-xs-10 col-sm-10" v-model="user.userName"/>
                                                </div>
                                                <div class="profile-info-name"> 用户账户 </div>
                                                <div class="profile-info-value">
                                                    <input type="text" id="loginId" placeholder="Username" class="col-xs-10 col-sm-10" v-model="user.loginId"/>
                                                </div>
                                            </div>

                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 出生日期 </div>
                                                <div class="profile-info-value">
                                                    <div class="input-group" @click="datePicker">
                                                        <input class="form-control date-picker" id="userBirthday" type="text" data-date-format="yyyy-mm-dd" v-model="user.userBirthday"/>
                                                        <span class="input-group-addon">
                                                            <i class="fa fa-calendar bigger-110"></i>
                                                        </span>
                                                    </div>
                                                </div>
                                                <div class="profile-info-name"> 性别 </div>
                                                <div class="profile-info-value">
                                                    <div class="col-xs-10 col-sm-10">
                                                        <label>
                                                            <input name="form-field-radio" type="radio" class="ace" v-model="user.userSex" value="1"/>
                                                            <span class="lbl"> 男</span>
                                                        </label>
                                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                                        <label>
                                                            <input name="form-field-radio" type="radio" class="ace" v-model="user.userSex" value="0"/>
                                                            <span class="lbl"> 女</span>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 手机号 </div>
                                                <div class="profile-info-value">
                                                    <input type="text" id="userMobile" placeholder="Username" class="col-xs-10 col-sm-10" v-model="user.userMobile"/>
                                                </div>
                                                <div class="profile-info-name"> 办公地址 </div>
                                                <div class="profile-info-value">
                                                    <#--<i class="fa fa-map-marker light-orange bigger-110"></i>-->
                                                    <input type="text" id="workAddress" placeholder="Username" class="col-xs-10 col-sm-10" v-model="user.workAddress"/>
                                                </div>
                                            </div>

                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 入职日期  </div>
                                                <div class="profile-info-value">
                                                    <div class="input-group" @click="datePicker">
                                                        <input class="form-control date-picker" id="joinDate" type="text" data-date-format="yyyy-mm-dd" v-model="user.joinDate"/>
                                                        <span class="input-group-addon">
                                                            <i class="fa fa-calendar bigger-110"></i>
                                                        </span>
                                                    </div>
                                                </div>
                                                <div class="profile-info-name"> 职务 </div>
                                                <div class="profile-info-value">
                                                    <input type="text" id="userJob" placeholder="Username" class="col-xs-10 col-sm-10" v-model="user.userJob"/>
                                                </div>
                                            </div>

                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 邮箱地址 </div>
                                                <div class="profile-info-value">
                                                    <input type="text" id="userEmail" placeholder="Username" class="col-xs-10 col-sm-10" v-model="user.userEmail"/>
                                                </div>
                                                <div class="profile-info-name"> 账户状态 </div>
                                                <div class="profile-info-value">
                                                    <div class="col-xs-10 col-sm-10">
                                                        <label>
                                                            <input name="status" type="radio" class="ace" v-model="user.status" value="0"/>
                                                            <span class="lbl"> 正常</span>
                                                        </label>
                                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                                        <label>
                                                            <input name="status" type="radio" class="ace" v-model="user.status" value="1"/>
                                                            <span class="lbl"> 锁定</span>
                                                        </label>
                                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                                        <label>
                                                            <input name="status" type="radio" class="ace" v-model="user.status" value="2"/>
                                                            <span class="lbl"> 停用</span>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div><!-- /.span -->
                    </div><!-- /.row -->
                    <br/>
                    <button class="btn btn-white btn-info btn-bold" @click="saveUser">
                        <i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
                        保存
                    </button>
                </div><!-- /.col -->
            </div><!-- /.row -->
        </div><!-- /.page-content -->

    </div>

    <input type="hidden" id="userId" name="userId" value="${id}"/>
    <script src="/assets/js/bootstrap-datepicker.min.js"></script>

    <script type="text/javascript">
        var app = new Vue({
            el: '#dataDiv',
            data: {
                user: {
                    userName:"",
                    login:"",
                    userBirthday:"",
                    userSex:"",
                    userMobile:"",
                    workAddress:"",
                    joinDate:"",
                    userJob:"",
                    userEmail:"",
                    status:""
                }
            },
            created : function(){
                var userId = $("#userId").val();
                var that=this;
                that.$http.get("/system/users/"+userId).then(function(response){
                    // 响应成功回调
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            console.log(result.data);
                            that.user = result.data;
                        }
                    }
                }, function(response){
                    // 响应错误回调
                });
            },
            methods : {
                datePicker : function(){
                    //datepicker plugin
                    //link
                    $('.date-picker').datepicker({
                        autoclose: true,
                        todayHighlight: true
                    })
                    //show datepicker when clicking on the icon
                    .next().on(ace.click_event, function(){
                        $(this).prev().focus();
                    });
                },
                saveUser : function(){
                    var formData = JSON.stringify(this.user);
                    console.log(formData);
                    //return;
                    this.$http.put("/system/users/"+userId,formData).then(function(response){
                        // 响应成功回调
                        var result = response.data;
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                this.user = result.data;
                                layer.alert('操作成功！', {
                                    icon: 1,
                                    title: "系统提示"
                                });
                            }
                        }
                    }, function(response){
                        // 响应错误回调
                    });
                }
            }
        });

    </script>