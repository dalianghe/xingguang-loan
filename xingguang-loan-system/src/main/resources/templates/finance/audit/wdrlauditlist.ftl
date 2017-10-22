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
        </div>

        <div class="row">
            <div class="col-xs-12">
                <!-- PAGE CONTENT BEGINS -->
                <div class="row">
                    <div class="col-xs-12">
                        <table id="simple-table" class="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th class="center">序号</th>
                                    <th>姓名</th>
                                    <th class="hidden-480">产品名称</th>
                                    <th class="hidden-480">期限</th>
                                    <th>提款金额（元）</th>
                                    <th class="hidden-480">
                                        <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                        申请时间
                                    </th>
                                    <th>操作</th>
                                </tr>
                            </thead>

                            <tbody>
                                <tr v-for="(user,index) in applies">
                                    <td class="center">{{index+1}}</td>
                                    <td v-text="user.cusUserName"></td>
                                    <td class="hidden-480" v-text="user.productId"></td>
                                    <td class="hidden-480" v-text="user.termId"></td>
                                    <td v-text="user.amount"></td>
                                    <td class="hidden-480" v-text="user.createTime"></td>
                                    <td>
                                        <div class="hidden-sm hidden-xs btn-group">
                                            <button class="btn btn-xs btn-success" @click="audit(user.cusUserId , user.id)" title="点击放款">
                                                <i class="ace-icon fa fa-check bigger-120"></i>
                                            </button>
                                        </div>
                                        <div class="hidden-md hidden-lg">
                                            <div class="inline pos-rel">
                                                <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                                    <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                                </button>
                                                <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                                    <li>
                                                        <a href="#" class="tooltip-info" data-rel="tooltip" title="View" @click="audit(user.cusUserId , user.id)">
                                                            <span class="blue">
                                                                <i class="ace-icon fa fa-paypal bigger-120"></i>
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

        <div class="wrap pages pa-cen clearfix" id="wrap">
            <zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-on:pagehandler="pageHandler"><zpagenav>
        </div>
    </div><!-- /.page-content -->
</div>
<script src="/js/lib/vue/vue.min.js"></script>
<script src="/js/lib/vue/axios.min.js"></script>
<script src="/js/lib/vue/page/zpageNav.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">

    var app = new Vue({
        el: '#dataDiv',
        data: {
            applies: {},
            userName:null,
            page: 1,
            pageSize: 10,
            total: ''
        },
        created : function(){
            query(this);
        },
        methods : {
            queryUser : function(){
                query(this);
            },
            audit : function(cusUserId , applyId){
                var paramJson = {"userId":cusUserId , "applyId":applyId};
                var param = {"paramJson":JSON.stringify(paramJson)};
                var url = "/router/finance/audit/wdrlaudit";
                $("#main").load(url, param, function(response,status,xhr){
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
        axios.get('/finance/audit/applies', {
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
        });
    }

    $('#nav-search-input').bind('keypress', function(event) {
        if (event.keyCode == "13") {
            event.preventDefault();
            window.open("http://www.baidu.com/s?wd="+$('#nav-search-input').val());
        }
    });
</script>