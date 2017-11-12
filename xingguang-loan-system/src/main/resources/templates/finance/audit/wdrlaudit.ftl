<link rel="stylesheet" href="/assets/css/colorbox.min.css" />
<link rel="stylesheet" href="/assets/font-awesome/4.5.0/css/font-awesome.min.css" />
<link rel="stylesheet" href="/assets/css/bootstrap-datepicker3.min.css" />
<link rel="stylesheet" href="/assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />
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
                <li class="active">提现审核</li>
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
                        客户列表
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
                                <a data-toggle="tab" href="#auditresult">
                                    <i class="green ace-icon fa fa-check bigger-120"></i>
                                    提现审核
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
                                                    <div class="profile-info-name"></div>
                                                    <div class="profile-info-value"></div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                <#--<div class="col-xs-12 col-sm-2">
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
                                </div>-->
                                <#--<div class="row">
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
                                </div>-->
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
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="userfilm" class="tab-pane fade">
                                <div>
                                    <ul class="ace-thumbnails clearfix">
                                        <li>
                                            <a :href="user.realImg1Url" data-rel="colorbox">
                                                <img width="150" height="150" alt="150x150" :src="user.realImg1Url" />
                                            </a>
                                        </li>
                                        <li>
                                            <a :href="user.realImg2Url" data-rel="colorbox">
                                                <img width="150" height="150" alt="150x150" :src="user.realImg2Url" />
                                            </a>
                                        </li>
                                        <li>
                                            <a :href="user.realImg3Url" data-rel="colorbox">
                                                <img width="150" height="150" alt="150x150" :src="user.realImg3Url" />
                                            </a>
                                        </li>
                                    </ul>
                                </div>
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
                                                <div class="profile-info-name"><span style="color: red">*</span> 审核结果 </div>
                                                <div class="profile-info-value">
                                                    <div class="col-xs-10 col-sm-12" style="margin-left: -12px;">
                                                        <label>
                                                            <input name="status" type="radio" class="ace" v-model="audit.status"  value="20"/>
                                                            <span class="lbl"> 通过</span>
                                                        </label>
                                                        &nbsp;&nbsp;
                                                        <label id="statusDiv">
                                                            <input name="status" type="radio" class="ace" v-model="audit.status" value="25"/>
                                                            <span class="lbl"> 不通过</span>
                                                        </label>
                                                    </div>
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
    <script src="/js/lib/vue/axios.min.js"></script>
    <script src="/assets/js/jquery.colorbox.min.js"></script>
    <script type="text/javascript">
        function getCusUserInfo() {
            return axios.get("/cus/user/${userId}");
        }
        function getCusUserLink() {
            return axios.get('/cus/link/${userId}');
        }
        function getWorkUserInfo() {
            return axios.get("/work/cus/${userId}");
        }

        var app = new Vue({
            el: '#dataDiv',
            data: {
                user : {},
                link : {},
                worker : {},
                audit : {
                    id : "${applyId}",
                    status : ""
                }
            },
            created : function(){
                var that=this;
                axios.all([getCusUserInfo(), getWorkUserInfo()])
                        .then(axios.spread(function (cusUser, worker, apply, refuses) {
                    var user = cusUser.data;
                    if(user.sysCode==0){
                        if(user.bizCode==0){
                            that.user = user.data;
                        }
                    }
                    /*var link = cusLink.data;
                    if(link.sysCode==0){
                        if(link.bizCode==0){
                            that.link = link.data;
                        }
                    }*/
                    var worker = worker.data;
                    if(worker.sysCode==0){
                        if(worker.bizCode==0){
                            that.worker = worker.data;
                        }
                    }
                }));
            },
            methods : {
                auditCredit : function(){
                    if(this.audit.status==""){
                        layer.tips('请选择审核结果！', $("#statusDiv") );
                        return;
                    }
                    layer.confirm('确认执行提交操作吗？', {icon: 3, title:'系统提示'}, function(index){
                        axios.all([updateWdrlApplyInfo()]).then(axios.spread(function (applyResult) {
                            var result = applyResult.data;
                            if(result.sysCode==0){
                                if(result.bizCode==0){
                                    layer.msg('操作成功！');
                                    $("#main").load("/router/finance/audit/wdrlauditlist");
                                }
                            }
                        }));
                        layer.close(index);
                    });
                },
                backward : function(){
                    $("#main").load("/router/finance/audit/wdrlauditlist");
                }
            }
        });

        function updateWdrlApplyInfo(){
            var formData = app.audit;
            console.log(formData);
            return axios.post('/finance/audit' , formData);
        }
        jQuery(function($) {
            var $overflow = '';
            var colorbox_params = {
                rel: 'colorbox',
                reposition:true,
                scalePhotos:true,
                scrolling:false,
                previous:'<i class="ace-icon fa fa-arrow-left"></i>',
                next:'<i class="ace-icon fa fa-arrow-right"></i>',
                close:'&times;',
                current:'{current} of {total}',
                maxWidth:'100%',
                maxHeight:'100%',
                onOpen:function(){
                    $overflow = document.body.style.overflow;
                    document.body.style.overflow = 'hidden';
                },
                onClosed:function(){
                    document.body.style.overflow = $overflow;
                },
                onComplete:function(){
                    $.colorbox.resize();
                }
            };
            $('.ace-thumbnails [data-rel="colorbox"]').colorbox(colorbox_params);
            $("#cboxLoadingGraphic").html("<i class='ace-icon fa fa-spinner orange fa-spin'></i>");//let's add a custom loading icon
            $(document).one('ajaxloadstart.page', function(e) {
                $('#colorbox, #cboxOverlay').remove();
            });
        })
        $('#nav-search-input').bind('keypress', function(event) {
            if (event.keyCode == "13") {
                event.preventDefault();
                window.open("http://www.baidu.com/s?wd="+$('#nav-search-input').val());
            }
        });
    </script>