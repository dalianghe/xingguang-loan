<link rel="stylesheet" href="/js/lib/vue/page/zpageNav.css" />
<div class="main-content-inner">
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li>
                <i class="ace-icon fa fa-home home-icon"></i>
                <a href="#">控制台</a>
            </li>
            <li>
                <a href="#">统计分析</a>
            </li>
            <li class="active">综合查询</li>
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

        <div class="widget-container-col" id="widget-container-col-9">
            <div class="widget-box widget-color-blue2 collapsed" id="widget-box-9">
                <div class="widget-header">
                    <i class="1 ace-icon fa fa-search bigger-125"></i>
                    <h5 class="widget-title">查询条件</h5>
                    <div class="widget-toolbar">
                        <a href="#" data-action="collapse">
                            <i class="1 ace-icon fa fa-chevron-down bigger-125"></i>
                        </a>
                    </div>
                </div>

                <div class="widget-body">
                    <div class="widget-main">
                        <div class="profile-user-info profile-user-info-striped">
                            <div class="profile-info-row">
                                <div class="profile-info-name"> 姓名 </div>
                                <div class="profile-info-value">
                                    <input type="text" name="name" placeholder="请输入用户姓名"/>
                                </div>
                                <div class="profile-info-name"> 手机号 </div>
                                <div class="profile-info-value">
                                    <input type="text" name="name" placeholder="请输入用户手机号"/>
                                </div>
                                <div class="profile-info-name"> 身份证号 </div>
                                <div class="profile-info-value">
                                    <input type="text" name="name" placeholder="请输入用户身份证号"/>
                                </div>
                            </div>
                            <div class="profile-info-row">
                                <div class="profile-info-name"> 产品 </div>
                                <div class="profile-info-value">
                                    <select class="form-control" id="provinceId" name="provinceId">
                                        <option value=null>请选择</option>
                                        <option value="1">待授信</option>
                                        <option value="2">授信通过</option>
                                        <option value="3">授信不通过</option>
                                    </select>
                                </div>
                                <div class="profile-info-name"> 期限 </div>
                                <div class="profile-info-value">
                                    <select class="form-control" id="provinceId" name="provinceId">
                                        <option value=null>请选择</option>
                                        <option value="">待审核</option>
                                        <option value="">审核通过</option>
                                        <option value="">审核不通过</option>
                                    </select>
                                </div>
                                <div class="profile-info-name"> 授信额度 </div>
                                <div class="profile-info-value">
                                    <select class="form-control" id="provinceId" name="provinceId">
                                        <option value=null>请选择</option>
                                        <option value="">1000及以下</option>
                                        <option value="">1000-2000</option>
                                        <option value="">2000-3000</option>
                                        <option value="">3000-5000</option>
                                        <option value="">5000-8000</option>
                                        <option value="">8000-10000</option>
                                        <option value="">10000及以上</option>
                                    </select>
                                </div>
                            </div>
                            <div class="profile-info-row">
                                <div class="profile-info-name"> 审核状态 </div>
                                <div class="profile-info-value">
                                    <select class="form-control" id="provinceId" name="provinceId">
                                        <option value=null>请选择</option>
                                        <option value="1">待授信</option>
                                        <option value="2">授信通过</option>
                                        <option value="3">授信不通过</option>
                                    </select>
                                </div>
                                <div class="profile-info-name"> 提现状态 </div>
                                <div class="profile-info-value">
                                    <select class="form-control" id="provinceId" name="provinceId">
                                        <option value=null>请选择</option>
                                        <option value="">待审核</option>
                                        <option value="">审核通过</option>
                                        <option value="">审核不通过</option>
                                    </select>
                                </div>
                                <div class="profile-info-name"> 放款状态 </div>
                                <div class="profile-info-value">
                                    <select class="form-control" id="provinceId" name="provinceId">
                                        <option value=null>请选择</option>
                                        <option value="">待放款</option>
                                        <option value="">已放款</option>
                                        <option value="">终止放款</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="widget-toolbox padding-8 clearfix">
                        <button class="btn btn-xs btn-success pull-right">
                            <i class="ace-icon fa fa-search icon-on-right"></i>
                            <span class="bigger-110">查询</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>

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
                <!-- PAGE CONTENT BEGINS -->
                <div class="row">
                    <div class="col-xs-12">
                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                            <tr>
                                <th class="hidden-480" class="center">序号</th>
                                <th>姓名</th>
                                <th>手机号</th>
                                <th class="hidden-480">身份证号</th>
                                <th  class="hidden-480">
                                    <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                    申请时间
                                </th>
                                <th class="hidden-480">授信状态</th>
                                <th>
                                    <i class="ace-icon fa fa-cny bigger-110 hidden-480"></i>
                                    授信额度
                                </th>
                                <th>
                                    批贷产品
                                </th>
                                <th>
                                    批贷期限
                                </th>
                                <th class="hidden-480">
                                    <i class="ace-icon fa fa-check-circle-o bigger-110 hidden-480"></i>
                                    授信时间
                                </th>
                                <th>查询信息</th>
                            </tr>
                            </thead>

                            <tbody>
                            <tr v-for="(user,index) in users">
                                <td class="hidden-480" class="center"> {{index+1}}</td>
                                <td>{{user.name}}</td>
                                <td>{{user.phone}}</td>
                                <td class="hidden-480">{{user.idNo}}</td>
                                <td class="hidden-480">{{user.applyTime}}</td>
                                <td class="hidden-480">
                                    <span class="label label-sm label-success" v-if="user.status===2">{{user.statusName}}</span>
                                    <span class="label label-sm label-danger  arrowed-in arrowed-in-right" v-if="user.status===3">{{user.statusName}}</span>
                                </td>
                                <td>{{user.amount | numberFormatFilter}}</td>
                                <td class="hidden-480">{{user.creditTime}}</td>
                                <td class="hidden-480">{{user.creditTime}}</td>
                                <td class="hidden-480">{{user.creditTime}}</td>
                                <td>
                                    <div class="hidden-sm hidden-xs btn-group">
                                        <button class="btn btn-xs btn-info" title="查看客户信息"  data-toggle="modal" data-target="#user-modal" @click="viewUser(user.id)">
                                            <i class="ace-icon fa fa-user bigger-120"></i>
                                        </button>
                                    </div>
                                    <div class="hidden-sm hidden-xs btn-group">
                                        <button class="btn btn-xs btn-success" title="查看授信信息" data-toggle="modal" data-target="#credit-modal" @click="creditHistory(user.id , user.name)">
                                            <i class="ace-icon fa fa-history bigger-120"></i>
                                        </button>
                                    </div>
                                    <div class="hidden-sm hidden-xs btn-group">
                                        <button class="btn btn-xs btn-warning" @click="lockCredit(user.id)" title="查看提现信息">
                                            <i class="ace-icon fa fa-cny bigger-120"></i>
                                        </button>
                                    </div>
                                    <div class="hidden-md hidden-lg">
                                        <div class="inline pos-rel">
                                            <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                            </button>
                                            <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                <li>
                                                    <a href="#" class="tooltip-info" data-rel="tooltip" title="View" data-toggle="modal" data-target="#my-modal" @click="creditHistory(user.id , user.name)">
                                                        <span class="blue">
                                                            <i class="ace-icon fa fa-history bigger-120"></i>
                                                        </span>
                                                    </a>
                                                </li>
                                                <li v-if="user.status===2">
                                                    <a href="#" class="tooltip-info" data-rel="tooltip" title="View" @click="lockCredit(user.id)">
                                                    <span class="blue">
                                                        <i class="ace-icon fa fa-lock bigger-120"></i>
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

        <div id="user-modal" class="modal fade " tabindex="1" role="dialog">
            <div class="modal-dialog modal-lg">
                <div id="user-content" class="modal-content">
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div>

        <div id="credit-modal" class="modal fade" tabindex="2" role="dialog">
            <div class="modal-dialog">
                <div id="credit-content" class="modal-content">
                <#--
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h3 class="smaller lighter blue no-margin">授信记录</h3>
                    </div>
                    <div class="modal-body">
                        <div class="widget-box widget-color-blue" id="widget-box-2">
                            <div class="widget-header">
                                <h5 class="widget-title bigger lighter">
                                    <i class="ace-icon fa fa-user"></i>{{historyName}}
                                </h5>
                            </div>
                            <div class="widget-body">
                                <div class="widget-main no-padding">
                                    <table class="table table-striped table-bordered table-hover">
                                        <thead class="thin-border-bottom">
                                        <tr>
                                            <th class="hidden-480"><i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>申请时间</th>
                                            <th>授信状态</th>
                                            <th>授信额度</th>
                                            <th><i class="ace-icon fa fa-check-circle-o bigger-110 hidden-480"></i>授信时间</th>
                                            <th class="hidden-480">操作人</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr v-for="record in histories">
                                            <td class="hidden-480">{{record.createTime}}</td>
                                            <td>
                                                <span class="label label-success" v-if="record.status===2">{{record.statusName}}</span>
                                                <span class="label label-danger  arrowed-in arrowed-in-right" v-if="record.status===3">{{record.statusName}}</span>
                                            </td>
                                            <td>{{record.amount | numberFormatFilter}}</td>
                                            <td>{{record.creditTime}}</td>
                                            <td class="hidden-480">{{record.creditUserName}}</td>
                                        </tr>
                                        </tbody>
                                    </table>
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
                    -->
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div>

        <div class="wrap pages pa-cen clearfix" id="wrap">
            <zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-on:pagehandler="pageHandler"><zpagenav>
        </div>
    </div><!-- /.page-content -->
</div>
<script src="/assets/js/jquery-2.1.4.min.js"></script>
<script src="/js/lib/vue/vue.min.js"></script>
<script src="/js/lib/vue/axios.min.js"></script>
<script src="/js/lib/vue/page/zpageNav.js"></script>
<script src="/js/utils/numeral.min.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">

    var app = new Vue({
        el: '#dataDiv',
        data: {
            users: {},
            "userName":null,
            histories : {},
            historyName : "",
            // 分页
            page: 1,
            pageSize: 10,
            total: ''
        },
        filters : {
            numberFormatFilter : function(value){
                return numeral(value).format('0,0.00');
            }
        },
        created : function(){
            query(this);
        },
        methods : {
            queryUser : function(){
                query(this);
            },
            viewUser : function(userId){
                var paramJson = {"userId":userId};
                var param = {"paramJson":JSON.stringify(paramJson)};
                $("#user-content").load("/router/report/search/userinfo" , param );
            },
            creditHistory : function(userId , name){
                var paramJson = {"userId":userId , "name":name};
                var param = {"paramJson":JSON.stringify(paramJson)};
                $("#credit-content").load("/router/report/search/credithistory" , param );

                /*var that = this;
                that.historyName = name;
                axios.get('/credit/apply/cus/'+userId).then(function (response) {
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            that.histories = result.data;
                        }else{
                            layer.alert(result.msg, {icon:2,title:"系统提示"});
                        }
                    }
                }).catch(function (error) {
                    layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
                });*/
            },
            lockCredit : function(userId){
                var that = this;
                layer.confirm('锁定授信客户将无法提现，确认执行该操作？', {icon: 3, title:'系统提示'}, function(index){
                    axios.post('/credit/lock/'+userId).then(function (response) {
                        var result = response.data;
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                layer.msg('操作成功！');
                                query(that);
                            }else{
                                layer.alert(result.msg, {icon:2,title:"系统提示"});
                            }
                        }
                    }).catch(function (error) {
                        layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
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
        var paramJson = {"name":that.userName,"pager":{"page":that.page,"pageSize":that.pageSize}};
        axios.get('/credit/customeres', {
            params: {paramJson: JSON.stringify(paramJson)}
        }).then(function (response) {
            var result = response.data;
            if(result.sysCode==0){
                if(result.bizCode==0){
                    that.users = result.data.users;
                    that.total = result.data.total;
                }
            }
            layer.close(idx);
        }).catch(function (error) {
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