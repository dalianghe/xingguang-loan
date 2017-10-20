<link rel="stylesheet" href="/js/lib/vue/page/zpageNav.css" />
<div class="main-content-inner">
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li>
                <i class="ace-icon fa fa-home home-icon"></i>
                <a href="#">控制台</a>
            </li>

            <li>
                <a href="#">客户管理</a>
            </li>
            <li class="active">授信管理</li>
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

        <div style="margin-bottom: 10px; float:left;">
            <div class="input-group" style="width: 300px;float:left;">
                <span class="input-group-addon">
                    <i class="ace-icon fa fa-check"></i>
                </span>
                <input type="text" class="form-control search-query" placeholder="请输入客户姓名" v-model="userName"/>
                <span class="input-group-btn">
                    <button type="button" class="btn btn-inverse btn-white" @click="queryUser">
                        <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                        查询
                    </button>
                </span>
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
                                <th class="hidden-480" class="center">序号</th>
                                <th>姓名</th>
                                <th>手机号</th>
                                <th class="hidden-480">身份证号</th>
                                <th  class="hidden-480">
                                    <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                    申请时间
                                </th>
                                <th class="hidden-480">授信状态</th>
                                <th class="hidden-480">
                                    <i class="ace-icon fa fa-check-circle-o bigger-110 hidden-480"></i>
                                    授信时间
                                </th>
                                <th>
                                    <i class="ace-icon fa fa-cny bigger-110 hidden-480"></i>
                                    授信额度
                                </th>
                                <th>操作</th>
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
                                    <span class="label label-sm label-danger" v-if="user.status===3">{{user.statusName}}</span>
                                </td>
                                <td class="hidden-480">{{user.creditTime}}</td>
                                <td>{{user.amount | numberFormatFilter}}</td>
                                <td>
                                    <div class="hidden-sm hidden-xs btn-group">
                                        <button class="btn btn-xs btn-success" title="查看授信历史" data-toggle="modal" data-target="#my-modal" @click="creditHistory(user.id , user.name)">
                                            <i class="ace-icon fa fa-history bigger-120"></i>
                                        </button>
                                    </div>
                                    <div class="hidden-sm hidden-xs btn-group" v-if="user.status===2">
                                        <button class="btn btn-xs btn-danger" @click="lockCredit(user.id)" title="锁定授信额度">
                                            <i class="ace-icon fa fa-lock bigger-120"></i>
                                        </button>
                                    </div>
                                    <div class="hidden-md hidden-lg">
                                        <div class="inline pos-rel">
                                            <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                            </button>
                                            <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                <li>
                                                    <a href="#" class="tooltip-info" data-rel="tooltip" title="View" @click="auditUser(user.id , user.applyId)">
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

        <div id="my-modal" class="modal fade" tabindex="1">
            <div class="modal-dialog">
                <div class="modal-content">
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
                                                        <span class="label label-success arrowed-in arrowed-in-right" v-if="record.status===2">{{record.statusName}}</span>
                                                        <span class="label label-warning" v-if="record.status===3">{{record.statusName}}</span>
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

                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div>

        <div class="wrap pages pa-cen clearfix" id="wrap">
            <zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-on:pagehandler="pageHandler"><zpagenav>
        </div>
    </div><!-- /.page-content -->
</div>

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
            creditHistory : function(userId , name){
                var that = this;
                that.historyName = name;
                axios.get('/credit/apply/cus/'+userId).then(function (response) {
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            that.histories = result.data;
                            console.log(that.histories);
                        }else{
                            layer.alert(result.msg, {icon:2,title:"系统提示"});
                        }
                    }
                }).catch(function (error) {
                    layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
                });
            },
            lockCredit : function(userId){
                var that = this;
                layer.confirm('确认执行该操作吗？', {icon: 3, title:'系统提示'}, function(index){
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