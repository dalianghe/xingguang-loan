<link rel="stylesheet" href="/assets/font-awesome/4.5.0/css/font-awesome.min.css" />
<link rel="stylesheet" href="/assets/css/bootstrap-datepicker3.min.css" />

    <div id="userDiv" class="page-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <h3 class="smaller lighter blue no-margin">用户信息</h3>
        </div>
        <div class="modal-body">
            <div class="row">
            <div class="col-xs-12 col-sm-12">
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
                </ul>
                <div class="tab-content">
                    <div id="userinfo" class="tab-pane fade in active">
                        <div class="col-xs-12">
                            <div class="text-center">
                                <img height="150" class="thumbnail inline no-margin-bottom" alt="Domain Owner's Avatar" src="/assets/images/avatars/profile-pic.jpg" />
                                <br />
                                <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                                    <div class="inline position-relative">
                                        <a class="user-title-label" href="#">
                                            <i class="ace-icon fa fa-circle light-green"></i>
                                            <span class="white" v-text="user.name"></span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="profile-user-info profile-user-info-striped">
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> <strong>用户信息</strong> </div>
                                    <div class="profile-info-name"></div>
                                    <div class="profile-info-name"></div>
                                    <div class="profile-info-name"></div>
                                </div>
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 姓名 </div>
                                    <div class="profile-info-value">
                                        <span v-text="user.name"></span>
                                    </div>
                                    <div class="profile-info-name"> 性别 </div>
                                    <div class="profile-info-value">
                                        <span v-text="user.sexName"></span>
                                    </div>
                                </div>
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 手机号 </div>
                                    <div class="profile-info-value">
                                        <span v-text="user.phone"></span>
                                    </div>
                                    <div class="profile-info-name"> 身份证号 </div>
                                    <div class="profile-info-value">
                                        <span v-text="user.idNo"></span>
                                    </div>
                                </div>
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 认证状态  </div>
                                    <div class="profile-info-value">
                                        <span v-text="user.realStatusName"></span>
                                    </div>
                                    <div class="profile-info-name"> 收入 </div>
                                    <div class="profile-info-value">
                                        <span v-text="user.incomeName"></span>
                                    </div>
                                </div>
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 学历 </div>
                                    <div class="profile-info-value">
                                        <span v-text="user.educationName"></span>
                                    </div>
                                    <div class="profile-info-name"> 职业 </div>
                                    <div class="profile-info-value">
                                        <span v-text="user.occupationName"></span>
                                    </div>
                                </div>

                                <div class="profile-info-row">
                                    <div class="profile-info-name"> <strong>联系人信息</strong> </div>
                                    <div class="profile-info-name"></div>
                                    <div class="profile-info-name"></div>
                                    <div class="profile-info-name"></div>
                                </div>
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 姓名 </div>
                                    <div class="profile-info-value">
                                        <span v-text="link.linkName"></span>
                                    </div>
                                    <div class="profile-info-name"> 电话 </div>
                                    <div class="profile-info-value">
                                        <span v-text="link.phone"></span>
                                    </div>
                                </div>
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 关系 </div>
                                    <div class="profile-info-value">
                                        <span v-text="link.relationName"></span>
                                    </div>
                                    <div class="profile-info-name">  </div>
                                    <div class="profile-info-value">
                                        <span></span>
                                    </div>
                                </div>
                            </div>
                    </div>
                    <div id="userfilm" class="tab-pane fade">
                        <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid.</p>
                    </div>
                </div>
            </div>
        </div>
        </div>
        <div class="modal-footer">
            <button class="btn btn-sm btn-danger pull-right" data-dismiss="modal">
                <i class="ace-icon fa fa-times"></i>
                关闭
            </button>
        </div>
    </div><!-- /.col -->

<script type="text/javascript">
    function getCusUserInfo() {
        return axios.get("/cus/user/${userId}");
    }
    function getCusUserLink() {
        return axios.get('/cus/link/${userId}');
    }
    var app1 = new Vue({
        el: '#userDiv',
        data: {
            user: "",
            link:""
        },
        created : function(){
            var that=this;
            axios.all([getCusUserInfo(), getCusUserLink()]).then(axios.spread(function (cusUser, cusLink) {
                var user = cusUser.data;
                if(user.sysCode==0){
                    if(user.bizCode==0){
                        that.user = user.data;
                    }
                }
                var link = cusLink.data;
                if(link.sysCode==0){
                    if(link.bizCode==0){
                        that.link = link.data==null ? "" : link.data;
                    }
                }
            }));
        }
    });
</script>