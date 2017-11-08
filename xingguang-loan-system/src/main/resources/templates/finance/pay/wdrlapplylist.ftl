<link rel="stylesheet" href="/js/lib/vue/page/zpageNav.css" />
<div class="main-content-inner">
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li>
                <i class="ace-icon fa fa-home home-icon"></i>
                <a href="#">控制台</a>
            </li>

            <li>
                <a href="#">财务管理</a>
            </li>
            <li class="active">放款管理</li>
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
                    放款列表
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
            &nbsp;&nbsp;
            <div style="float:right;">
                <button class="btn btn-white btn-info btn-bold" @click="batchPaypal">
                    <i class="ace-icon fa fa-paypal bigger-120 blue"></i>
                    批量放款
                </button>
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
                                    <th class="center">
                                        <label class="pos-rel">
                                            <input type="checkbox" class="ace" @click="selectAll"/>
                                            <span class="lbl"></span>
                                        </label>
                                    </th>
                                    <th>姓名</th>
                                    <th class="hidden-480">产品名称</th>
                                    <th class="hidden-480">期限</th>
                                    <th>提款金额（元）</th>
                                    <th>银行卡号</th>
                                    <th>预留手机</th>
                                    <th class="hidden-480">
                                        <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                        申请时间
                                    </th>
                                    <th class="hidden-480">
                                        <i class="ace-icon fa fa-check-circle-o bigger-110 hidden-480"></i>
                                        审核时间
                                    </th>
                                    <th>授信状态</th>
                                    <th>操作</th>
                                </tr>
                            </thead>

                            <tbody>
                                <tr v-for="(user,index) in applies">
                                    <td class="center">
                                        <label class="pos-rel" v-if="user.creditStatus===1">
                                            <input type="checkbox" class="ace" :value="user.id" v-model="checkedIds"/>
                                            <span class="lbl"></span>
                                        </label>
                                    </td>
                                    <td v-text="user.cusUserName"></td>
                                    <td class="hidden-480" v-text="user.productName"></td>
                                    <td class="hidden-480" v-text="user.termName"></td>
                                    <td v-text="user.amount"></td>
                                    <td v-text="user.bankCardId"></td>
                                    <td v-text="user.reservePhone"></td>
                                    <td class="hidden-480" v-text="user.createTime"></td>
                                    <td class="hidden-480" v-text="user.auditorTime"></td>
                                    <td>
                                        <span class="label label-sm label-info" v-if="user.creditStatus===1" v-text="user.creditStatusName"></span>
                                        <span class="label label-sm label-danger arrowed-in arrowed-in-right" v-if="user.creditStatus!==1" v-text="user.creditStatusName"></span>
                                    </td>
                                    <td>
                                        <div class="hidden-sm hidden-xs btn-group">
                                            <button class="btn btn-xs btn-success" v-if="user.creditStatus===1" @click="viewPaypal(user.id)" title="点击放款" data-toggle="modal" data-target="#plan-modal">
                                                <i class="ace-icon fa fa-paypal bigger-120"></i>
                                            </button>
                                            <button class="btn btn-xs btn-warning" @click="stopPaypal(user.id)" title="终止放款">
                                                <i class="ace-icon fa fa-hand-stop-o bigger-120"></i>
                                            </button>
                                        </div>
                                        <div class="hidden-md hidden-lg">
                                            <div class="inline pos-rel">
                                                <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                    <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                                </button>
                                                <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                    <li>
                                                        <a href="#" class="tooltip-info" data-rel="tooltip" title="View" v-if="user.creditStatus===1" @click="paypal(user.id)">
                                                            <span class="blue">
                                                                <i class="ace-icon fa fa-paypal bigger-120"></i>
                                                            </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#" class="tooltip-info" data-rel="tooltip" title="View" @click="stopPaypal(user.id)">
                                                            <span class="blue">
                                                                <i class="ace-icon fa fa-hand-stop-o bigger-120"></i>
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
        <!-- view repayment plan -->
        <div id="plan-modal" class="modal fade " tabindex="1" role="dialog">
            <div class="modal-dialog">
                <div id="plan-content" class="modal-content">
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
<!-- inline scripts related to this page -->
<script type="text/javascript">
    jQuery(function($) {
        var active_class = 'active';
        $('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function(){
            var th_checked = this.checked;//checkbox inside "TH" table header
            $(this).closest('table').find('tbody > tr').each(function(){
                var row = this;
                if(th_checked) $(row).addClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', true);
                else $(row).removeClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', false);
            });
        });
        $('#simple-table').on('click', 'td input[type=checkbox]' , function(){
            var $row = $(this).closest('tr');
            if($row.is('.detail-row ')) return;
            if(this.checked) $row.addClass(active_class);
            else $row.removeClass(active_class);
        });
    });

    var app = new Vue({
        el: '#dataDiv',
        data: {
            applies: {},
            checkedIds : [],
            userName:null,
            page: 1,
            pageSize: 10,
            total: ''
        },
        mounted : function(){
            query(this);
        },
        methods : {
            queryUser : function(){
                query(this);
            },
            selectAll : function(event) {
                var that = this;
                if(!event.currentTarget.checked) { // 全部取消
                    this.checkedIds = [];
                }else{ // 全部选中
                    that.checkedIds = [];
                    that.applies.forEach(function(item) {
                        that.checkedIds.push(item.id);
                    });
                }
            },
            batchPaypal : function(){
                var that = this;
                if(that.checkedIds.length==0){
                    layer.msg('请选择放款客户！');
                    return;
                }
                pay(that,'确认执行批量放款操作？');
            },
            viewPaypal : function(applyId){
                var that = this;
                that.checkedIds.push(applyId);
                var paramJson = {"applyId":applyId};
                var param = {"paramJson":JSON.stringify(paramJson)};
                $("#plan-content").load("/router/finance/pay/viewplan" , param );
            },
            paypal : function(applyId){
                var that = this;
                that.checkedIds.push(applyId);
                pay(that,'确认执行放款操作？');
            },
            stopPaypal : function(applyId){
                var that = this;
                layer.confirm('确认终止该客户放款操作？', {icon: 3, title:'系统提示'}, function(index) {
                    var json = {"id":applyId , "status":"35"};
                    axios.post('/finance/pay/stop' , json).then(function (response) {
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
                        console.log(error);
                        layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
                    });
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
        var paramJson = {"cusUserName":that.userName,"pager":{"page":that.page,"pageSize":that.pageSize}};
        axios.get('/finance/pay/applies', {
            params: {paramJson: JSON.stringify(paramJson)}
        }).then(function (response) {
            var result = response.data;
            if(result.sysCode==0){
                if(result.bizCode==0){
                    that.applies = result.data.applies;
                    that.total = result.data.total;
                }
            }
            layer.close(idx);
        }).catch(function (error) {
            layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
            layer.close(idx);
        });
    }
    function pay(obj , msg){
        layer.confirm(msg, {icon: 3, title:'系统提示'}, function(index) {
            var json = {"ids":obj.checkedIds , "status":"30"};
            axios.post('/finance/pay/pay' , json).then(function (response) {
                var result = response.data;
                if(result.sysCode==0){
                    if(result.bizCode==0){
                        layer.msg('操作成功！');
                        query(obj);
                    }else{
                        layer.alert(result.msg, {icon:2,title:"系统提示"});
                    }
                }
            }).catch(function (error) {
                console.log(error);
                layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
            });
        });
    }
    $('#nav-search-input').bind('keypress', function(event) {
        if (event.keyCode == "13") {
            event.preventDefault();
            window.open("http://www.baidu.com/s?wd="+$('#nav-search-input').val());
        }
    });
</script>