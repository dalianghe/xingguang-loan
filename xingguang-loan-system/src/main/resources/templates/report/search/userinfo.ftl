<div id="userDiv">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3 class="smaller lighter blue no-margin">用户信息</h3>
    </div>
    <div class="modal-body">
        <div class="row">

            <div class="col-xs-12 col-sm-12">
                <div class="col-xs-12 col-sm-2">
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
                <div class="col-xs-12 col-sm-10">
                    <div class="space visible-xs"></div>
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
            </div>

            <#--<div class="col-xs-12 col-sm-12" style="margin-top: 10px;">
                <div class="col-xs-12 col-sm-4">
                    <div class="text-center">
                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                            <div class="inline position-relative">
                                <a class="user-title-label" href="#">
                                    <i class="ace-icon fa fa-circle light-green"></i>
                                    <span class="white">联系人信息</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="space visible-xs"></div>
                <div class="profile-user-info profile-user-info-striped">
                    <div class="profile-info-row">
                        <div class="profile-info-name"> 姓名 </div>
                        <div class="profile-info-value">
                            <span v-text="link.linkName"></span>
                        </div>
                        <div class="profile-info-name"> 电话 </div>
                        <div class="profile-info-value">
                            <span v-text="link.phone"></span>
                        </div>
                        <div class="profile-info-name"> 关系 </div>
                        <div class="profile-info-value">
                            <span v-text="link.relationName"></span>
                        </div>
                    </div>
                </div>
            </div>-->
        </div>
    </div>
    <div class="modal-footer">
        <button class="btn btn-sm btn-danger pull-right" data-dismiss="modal">
            <i class="ace-icon fa fa-times"></i>
            关闭
        </button>
    </div>
</div>
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