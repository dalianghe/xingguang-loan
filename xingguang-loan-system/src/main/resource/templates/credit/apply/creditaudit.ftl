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
        <div id="dataDiv" class="page-content">
            <div class="page-header">
                <h1>
                    <small>
                        <i class="ace-icon fa fa-angle-double-right"></i>
                        授信审核
                    </small>
                </h1>
            </div><!-- /.page-header -->
            <div class="row">
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
                                <a data-toggle="tab" href="#callrecord">
                                    <i class="green ace-icon fa fa-phone bigger-120"></i>
                                    通话记录
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
                                                    <div class="profile-info-name"> 与业务员距离 </div>
                                                    <div class="profile-info-value">{{apply.cusWorkDistance}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 经度 </div>
                                                    <div class="profile-info-value">{{apply.cusLng}}</div>
                                                    <div class="profile-info-name"> 纬度 </div>
                                                    <div class="profile-info-value">{{apply.cusLat}}</div>
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
                                                <div class="profile-info-name"> 联系人姓名 </div>
                                                <div class="profile-info-value">{{link.linkName}}</div>
                                                <div class="profile-info-name"> 电话 </div>
                                                <div class="profile-info-value">{{link.phone}}</div>
                                                <div class="profile-info-name"> 关系 </div>
                                                <div class="profile-info-value">{{link.relationName}}</div>
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
                                                    <span class="white">业务员信息</span>
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
                                                <div class="profile-info-name"> 业务员姓名 </div>
                                                <div class="profile-info-value">{{worker.name}}</div>
                                                <div class="profile-info-name"> 电话 </div>
                                                <div class="profile-info-value">{{worker.phone}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 所在省份 </div>
                                                <div class="profile-info-value">{{worker.provinceName}}</div>
                                                <div class="profile-info-name"> 所在城市 </div>
                                                <div class="profile-info-value">{{worker.cityName}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 经度 </div>
                                                <div class="profile-info-value">{{apply.workLng}}</div>
                                                <div class="profile-info-name"> 维度 </div>
                                                <div class="profile-info-value">{{apply.workLat}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="userfilm" class="tab-pane fade">
                                <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid.</p>
                            </div>
                            <div id="callrecord" class="tab-pane fade">
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
                                        <form id="auditForm">
                                            <div class="profile-user-info profile-user-info-striped">
                                                <div class="profile-info-row">
                                                <div class="profile-info-name"> 审核结果 </div>
                                                <div class="profile-info-value">
                                                    <div class="col-xs-10 col-sm-12" style="margin-left: -12px;">
                                                        <label>
                                                            <input name="status" type="radio" class="ace" v-model="audit.status"  value="2" @click="chooseResult"/>
                                                            <span class="lbl"> 通过</span>
                                                        </label>
                                                        &nbsp;&nbsp;
                                                        <label>
                                                            <input name="status" type="radio" class="ace" v-model="audit.status" value="3" @click="chooseResult"/>
                                                            <span class="lbl"> 不通过</span>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="profile-info-row" id="amountDiv" style="display: none">
                                                <div class="profile-info-name"> 授信金额 </div>
                                                <div class="profile-info-value">
                                                    <input type="text" id="amount" name="amount" v-model="audit.amount" placeholder="请输入授信金额"/>（元）
                                                </div>
                                            </div>
                                            <div class="profile-info-row" id="refuseCodeDiv" style="display: none">
                                                <div class="profile-info-name"> 拒代码 </div>
                                                <div class="profile-info-value">
                                                    <select class="form-control"  v-model="audit.refuseCode" style="width: 20%;">
                                                        <option disabled value=null>请选择</option>
                                                        <option value="001">年龄不符</option>
                                                        <option value="002">收入不符</option>
                                                        <option value="003">地域不符</option>
                                                        <option value="004">虚假信息</option>
                                                    </select>
                                                </div>
                                            </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <br/>
            <div style="text-align:justify;text-align-last:justify;">
                <button class="btn btn-sm btn-info" @click="backward">
                    <i class="ace-icon fa fa-backward bigger-120"></i>
                    返回
                </button>
                <button class="btn btn-sm btn-success" @click="auditCredit">
                    提交
                    <i class="ace-icon fa fa-forward bigger-120"></i>
                </button>
            </div>
        </div><!-- /.col -->
    </div><!-- /.row -->
    <input type="hidden" id="id" name="id" value="${id}"/>
    <script src="/js/lib/vue/axios.min.js"></script>
    <script type="text/javascript">
        function getCusUserInfo() {
            var userId = $("#id").val().split("&")[0];
            return axios.get("/cus/user/"+userId);
        }
        function getCusUserLink() {
            var userId = $("#id").val().split("&")[0];
            return axios.get('/cus/link/'+userId);
        }
        function getWorkUserInfo() {
            var userId = $("#id").val().split("&")[0];
            return axios.get("/work/cus/"+userId);
        }
        function getCreditApplyInfo() {
            var applyId = $("#id").val().split("&")[1];
            return axios.get("/credit/apply/"+applyId);
        }

        var app = new Vue({
            el: '#dataDiv',
            data: {
                user : {},
                link : {},
                worker : {},
                apply : {},
                audit : {
                    id : "",
                    cusUserId : "",
                    status : "",
                    amount : "",
                    refuseCode : null
                }
            },
            created : function(){
                var that=this;
                axios.all([getCusUserInfo(), getCusUserLink(), getWorkUserInfo(), getCreditApplyInfo()])
                        .then(axios.spread(function (cusUser, cusLink, worker, apply) {
                    var user = cusUser.data;
                    if(user.sysCode==0){
                        if(user.bizCode==0){
                            that.user = user.data;
                        }
                    }
                    var link = cusLink.data;
                    if(link.sysCode==0){
                        if(link.bizCode==0){
                            that.link = link.data;
                        }
                    }
                    var worker = worker.data;
                    if(worker.sysCode==0){
                        if(worker.bizCode==0){
                            that.worker = worker.data;
                        }
                    }
                    var apply = apply.data;
                    if(apply.sysCode==0){
                        if(apply.bizCode==0){
                            that.apply = apply.data;
                        }
                    }
                }));
            },
            methods : {
                chooseResult : function(){
                    var result = $('input:radio[name="status"]:checked').val();
                    if(result==3){
                        $("#refuseCodeDiv").show();
                        $("#amountDiv").hide();
                        this.audit.amount = null;
                    }else{
                        $("#refuseCodeDiv").hide();
                        $("#amountDiv").show();
                        this.audit.refuseCode = null;
                    }
                },
                auditCredit : function(){
                    this.audit.cusUserId = $("#id").val().split("&")[0];
                    this.audit.id = $("#id").val().split("&")[1];
                    axios.all([updateCreditApplyInfo()]).then(axios.spread(function (applyResult) {
                        var result = applyResult.data;
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                layer.msg('操作成功！');
                                $("#main").load("/router/credit/apply/applytodolist");
                            }
                        }
                    }));
                },
                backward : function(){
                    $("#main").load("/router/credit/apply/applytodolist");
                }
            }
        });

        function updateCreditApplyInfo(){
            var formData = app.audit;
            return axios.post('/credit/audit' , formData);
        }

    </script>