<link rel="stylesheet" href="/assets/css/bootstrap-datepicker3.min.css" />
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
                        <form id="searchForm">
                            <div class="profile-user-info profile-user-info-striped">
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 姓名 </div>
                                    <div class="profile-info-value">
                                        <input type="text" name="name" placeholder="请输入用户姓名" v-model="user.name"/>
                                    </div>
                                    <div class="profile-info-name"> 手机号 </div>
                                    <div class="profile-info-value">
                                        <input type="text" name="phone" placeholder="请输入用户手机号" v-model="user.phone"/>
                                    </div>
                                    <div class="profile-info-name"> 身份证号 </div>
                                    <div class="profile-info-value">
                                        <input type="text" name="idNo" placeholder="请输入用户身份证号" v-model="user.idNo"/>
                                    </div>
                                </div>
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 产品 </div>
                                    <div class="profile-info-value">
                                        <select class="form-control" id="productId" name="productId" v-model="user.productId">
                                            <option value=null>请选择</option>
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                        </select>
                                    </div>
                                    <div class="profile-info-name"> 期限 </div>
                                    <div class="profile-info-value">
                                        <select class="form-control" id="termId" name="termId" v-model="user.termId">
                                            <option value=null>请选择</option>
                                            <option value="1">1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                        </select>
                                    </div>
                                    <div class="profile-info-name"> 授信额度 </div>
                                    <div class="profile-info-value">
                                        <select class="form-control" id="amount" name="amountScope" v-model="user.amountScope">
                                            <option value=null>请选择</option>
                                            <option value="1">1000及以下</option>
                                            <option value="2">1000-2000</option>
                                            <option value="3">2000-3000</option>
                                            <option value="4">3000-5000</option>
                                            <option value="5">5000及以上</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 审核状态 </div>
                                    <div class="profile-info-value">
                                        <select class="form-control" id="status" name="status" v-model="user.status">
                                            <option value=null>请选择</option>
                                            <option value="1">待授信</option>
                                            <option value="2">授信通过</option>
                                            <option value="3">授信不通过</option>
                                        </select>
                                    </div>
                                    <div class="profile-info-name"> 提现状态 </div>
                                    <div class="profile-info-value">
                                        <select class="form-control" id="wdrlStatus" name="wdrlStatus" v-model="user.wdrlStatus">
                                            <option value=null>请选择</option>
                                            <option value="10">待审核</option>
                                            <option value="20">提现不通过</option>
                                            <option value="30">待放款</option>
                                            <option value="40">已放款</option>
                                            <option value="50">终止放款</option>
                                        </select>
                                    </div>
                                    <div class="profile-info-name"> 授信状态 </div>
                                    <div class="profile-info-value">
                                        <select class="form-control" id="creditStatus" name="creditStatus" v-model="user.creditStatus">
                                            <option value=null>请选择</option>
                                            <option value="1">正常</option>
                                            <option value="2">锁定</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="profile-info-row">
                                    <div class="profile-info-name"> 申请日期 </div>
                                    <div class="profile-info-value">
                                        <input type="text" id="applyDate" placeholder="请选择申请日期" class="form-control date-picker" readonly="true"/>
                                    </div>
                                    <div class="profile-info-name"> 授信日期 </div>
                                    <div class="profile-info-value">
                                        <input type="text" id="creditDate" placeholder="请选择授信日期" class="form-control date-picker" readonly="true"/>
                                    </div>
                                    <div class="profile-info-name"> 放款日期 </div>
                                    <div class="profile-info-value">
                                        <input type="text" id="payDate" placeholder="请选择放款日期" class="form-control date-picker" readonly="true"/>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="widget-toolbox padding-8 clearfix">
                        <button class="btn btn-xs btn-success pull-right" @click="search">
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
                                <td class="hidden-480" class="center" v-text="index+1"> </td>
                                <td v-text="user.name"></td>
                                <td v-text="user.phone"></td>
                                <td class="hidden-480" v-text="user.idNo"></td>
                                <td class="hidden-480" v-text="user.applyTime"></td>
                                <td class="hidden-480">
                                    <span class="label label-sm label-info" v-if="user.status===1" v-text="user.statusName"></span>
                                    <span class="label label-sm label-success" v-if="user.status===2" v-text="user.statusName"></span>
                                    <span class="label label-sm label-danger  arrowed-in arrowed-in-right" v-if="user.status===3" v-text="user.statusName"></span>
                                </td>
                                <td align="right">{{user.amount | numberFormatFilter}}</td>
                                <td class="hidden-480" v-text="user.productName"></td>
                                <td class="hidden-480" v-text="user.termName"></td>
                                <td class="hidden-480" v-text="user.creditTime"></td>
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
                                        <button class="btn btn-xs btn-warning" data-toggle="modal" data-target="#wdrl-modal" @click="wdrlHistory(user.id , user.name)" title="查看提现信息">
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
                                                    <a href="#" class="tooltip-info" data-rel="tooltip" title="View" @click="">
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
                </div>
            </div>
        </div>

        <div id="credit-modal" class="modal fade" tabindex="2" role="dialog">
            <div class="modal-dialog">
                <div id="credit-content" class="modal-content">
                </div>
            </div>
        </div>

        <div id="wdrl-modal" class="modal fade " tabindex="3" role="dialog">
            <div class="modal-dialog">
                <div id="wdrl-content" class="modal-content">
                </div>
            </div>
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
<script src="/assets/js/bootstrap-datepicker.min.js"></script>
<script src="/assets/js/bootstrap-datepicker.zh-CN.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">

    var app = new Vue({
        el: '#dataDiv',
        data: {
            user : {
                name : null,
                phone : null,
                idNo : null,
                productId : null,
                termId : null,
                amountScope : null,
                status : null,
                wdrlStatus : null,
                creditStatus : null,
                applyDate : null,
                creditDate : null,
                payDate : null
            },
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
        mounted : function(){
            query(this);
        },
        methods : {
            datePicker : function(){
                $('.date-picker').datepicker({
                    autoclose: true,
                    todayHighlight: true
                }).on("hide",function(){
                    //alert(2);
                }).next().on(ace.click_event, function(){ //show datepicker when clicking on the icon
                    $(this).prev().focus();
                });
            },
            search : function(){
                var applyDate = $("#applyDate").val()==''?null:$("#applyDate").val();
                var creditDate = $("#creditDate").val()==''?null:$("#creditDate").val();
                var payDate = $("#payDate").val()==''?null:$("#payDate").val();
                this.user.applyDate = applyDate;
                this.user.creditDate = creditDate;
                this.user.payDate = payDate;
                query(this);
            },
            queryUser : function(){
                var applyDate = $("#applyDate").val()==''?null:$("#applyDate").val();
                var creditDate = $("#creditDate").val()==''?null:$("#creditDate").val();
                var payDate = $("#payDate").val()==''?null:$("#payDate").val();
                this.user.applyDate = applyDate;
                this.user.creditDate = creditDate;
                this.user.payDate = payDate;
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
            },
            wdrlHistory : function(userId , name){
                var paramJson = {"userId":userId , "name":name};
                var param = {"paramJson":JSON.stringify(paramJson)};
                $("#wdrl-content").load("/router/report/search/wdrlhistory" , param );
            },
            pageHandler: function (page) {
                var applyDate = $("#applyDate").val()==''?null:$("#applyDate").val();
                var creditDate = $("#creditDate").val()==''?null:$("#creditDate").val();
                var payDate = $("#payDate").val()==''?null:$("#payDate").val();
                this.user.applyDate = applyDate;
                this.user.creditDate = creditDate;
                this.user.payDate = payDate;
                this.page=page;
                query(this);
            }
        }
    });
    function query(obj){
        var that = obj;
        var idx = layer.load(2);
        var paramJson = {
            "name":that.user.name,"phone":that.user.phone,"idNo":that.user.idNo,
            "productId":that.user.productId,"termId":that.user.termId,"amountScope":that.user.amountScope,
            "status":that.user.status,"wdrlStatus":that.user.wdrlStatus,"creditStatus":that.user.creditStatus,
            "applyDate":that.user.applyDate,"creditDate":that.user.creditDate,"payDate":that.user.payDate,
            "pager":{"page":that.page,"pageSize":that.pageSize}
        };
        console.log(paramJson);
        axios.get('/search/users', {
            params: {paramJson: JSON.stringify(paramJson)}
        }).then(function (response) {
            var result = response.data;
            if(result.sysCode==0){
                if(result.bizCode==0){
                    that.users = result.data.users;
                    that.total = result.data.total;
                }
            }
        }).catch(function (error) {
            layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
        });
        layer.close(idx);
    }

    jQuery(function($) {
        $('.date-picker').datepicker({
            autoclose: true,
            todayHighlight: true,
            language:"zh-CN",
            format:"yyyy-mm-dd",
            clearBtn:true
        }).next().on(ace.click_event, function(){
            $(this).prev().focus();
        });
    });

    $('#nav-search-input').bind('keypress', function(event) {
        if (event.keyCode == "13") {
            event.preventDefault();
            window.open("http://www.baidu.com/s?wd="+$('#nav-search-input').val());
        }
    });

</script>