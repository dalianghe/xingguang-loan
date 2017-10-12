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
                    <a href="#">审核管理</a>
                </li>
                <li class="active">授信审核</li>
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
                        授信审核
                    </small>
                </h1>
            </div><!-- /.page-header -->
            <div id="dataDiv" class="row">
                <div class="col-xs-12">
                    <div class="tabbable">
                        <ul class="nav nav-tabs" id="myTab">
                            <li class="active">
                                <a data-toggle="tab" href="#userinfo">
                                    <i class="green ace-icon fa fa-info bigger-120"></i>
                                    客户信息
                                </a>
                            </li>
                            <li>
                                <a data-toggle="tab" href="#userfilm">
                                    <i class="green ace-icon fa fa-film bigger-120"></i>
                                    客户影像
                                </a>
                            </li>
                            <li>
                                <a data-toggle="tab" href="#auditresult">
                                    <i class="green ace-icon fa fa-check bigger-120"></i>
                                    授信审核
                                </a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div id="userinfo" class="tab-pane fade in active">
                                <div class="col-xs-12 col-sm-2">
                                    <div class="text-left">
                                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-left">
                                            <div class="inline position-relative">
                                                <a class="user-title-label" href="#">
                                                    <i class="ace-icon fa fa-circle light-green"></i>
                                                    <span class="white">客户信息</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                        <div class="col-xs-12 col-sm-12">
                                            <div class="space visible-xs"></div>
                                            <div class="profile-user-info profile-user-info-striped">
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 姓名 </div>
                                                    <div class="profile-info-value">{{user.name}}</div>
                                                    <div class="profile-info-name"> 性别 </div>
                                                    <div class="profile-info-value">{{user.sexName}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 手机号 </div>
                                                    <div class="profile-info-value">{{user.phone}}</div>
                                                    <div class="profile-info-name"> 身份证号 </div>
                                                    <div class="profile-info-value">{{user.idNo}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 认证状态 </div>
                                                    <div class="profile-info-value">{{user.realStatusName}}</div>
                                                    <div class="profile-info-name"> 收入 </div>
                                                    <div class="profile-info-value">{{user.incomeName}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 学历  </div>
                                                    <div class="profile-info-value">{{user.educationName}}</div>
                                                    <div class="profile-info-name"> 职业 </div>
                                                    <div class="profile-info-value">{{user.occupationName}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 申请时间 </div>
                                                    <div class="profile-info-value">{{user.createTime}}</div>
                                                    <div class="profile-info-name"> 业务员 </div>
                                                    <div class="profile-info-value">{{user.workUserName}}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                <div class="col-xs-12 col-sm-2">
                                    <div class="text-left">
                                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-left">
                                            <div class="inline position-relative">
                                                <a class="user-title-label" href="#">
                                                    <i class="ace-icon fa fa-circle light-green"></i>
                                                    <span class="white">联系人信息</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="space visible-xs"></div>
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 姓名 </div>
                                                <div class="profile-info-value">{{user.name}}</div>
                                                <div class="profile-info-name"> 电话 </div>
                                                <div class="profile-info-value">{{user.sexName}}</div>
                                                <div class="profile-info-name"> 关系 </div>
                                                <div class="profile-info-value">{{user.sexName}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="userfilm" class="tab-pane fade">
                                <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid.</p>
                            </div>
                            <div id="auditresult" class="tab-pane fade">
                                <div class="col-xs-12 col-sm-2">
                                    <div class="text-left">
                                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-left">
                                            <div class="inline position-relative">
                                                <a class="user-title-label" href="#">
                                                    <i class="ace-icon fa fa-circle light-red"></i>
                                                    <span class="white">审核结果</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="space visible-xs"></div>
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 审核结果 </div>
                                                <div class="profile-info-value">
                                                    <div class="col-xs-10 col-sm-12" style="margin-left: -12px;">
                                                        <label>
                                                            <input name="sex" type="radio" class="ace"  value="1"/>
                                                            <span class="lbl"> 通过</span>
                                                        </label>
                                                        &nbsp;&nbsp;
                                                        <label>
                                                            <input name="sex" type="radio" class="ace" value="0"/>
                                                            <span class="lbl"> 不通过</span>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <br/>
            <div align="right">
            <button class="btn btn-success" @click="saveUser">
                <i class="ace-icon fa fa-check bigger-120"></i>
                提交
            </button>
            </div>
        </div><!-- /.col -->
    </div><!-- /.row -->

    <input type="hidden" id="userId" name="userId" value="${id}"/>
    <script src="/assets/js/bootstrap-datepicker.min.js"></script>

    <script type="text/javascript">
        var app = new Vue({
            el: '#dataDiv',
            data: {
                user: {
                    userName:"",
                    loginId:"",
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
                that.$http.get("/system/user/"+userId).then(function(response){
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
                datePicker : function(){
                    $('.date-picker').datepicker({
                        autoclose: true,
                        todayHighlight: true
                    }).on("hide",function(){
                        alert(2);
                    })
                    .next().on(ace.click_event, function(){ //show datepicker when clicking on the icon
                        $(this).prev().focus();
                    });
                },
                saveUser : function(){
                    var formData = JSON.stringify(this.user);
                    console.log(formData);
                    //return;
                    this.$http.put("/system/user/"+userId,formData).then(function(response){
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
                },
                audit : function(){
                    var url = "/prouter/credit/apply/creditaudit/"+userId;
                    $("#main").load(url,function(response,status,xhr){
                        //console.log("success");
                    });
                }
            }
        });

    </script>