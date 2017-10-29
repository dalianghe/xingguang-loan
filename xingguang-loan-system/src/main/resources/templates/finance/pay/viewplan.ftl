<div id="creditDiv">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3 class="smaller lighter blue no-margin">还款信息</h3>
    </div>
    <div class="modal-body">
        <div class="widget-box widget-color-blue" id="widget-box-2">
                <div class="widget-header">
                    <h5 class="widget-title bigger lighter">
                        <i class="ace-icon fa fa-tasks"> 还款计划 </i>
                    </h5>
                </div>
                <div class="widget-body">
                    <div class="widget-main no-padding">
                        <table class="table table-striped table-bordered table-hover">
                            <thead class="thin-border-bottom">
                            <tr>
                                <th class="hidden-480">期次</th>
                                <th>应还本金</th>
                                <th>应还利息</th>
                                <th><i class="ace-icon fa fa-check-circle-o bigger-110 hidden-480"></i>还款日期</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr v-for="record in detail.plans">
                                <td class="hidden-480" v-text="record.term"></td>
                                <td>{{record.principal | numberFormatFilter}}</td>
                                <td>{{record.interest | numberFormatFilter}}</td>
                                <td v-text="record.planDate"></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </br>
        <div class="widget-box widget-color-pink" id="widget-box-2">
            <div class="widget-header">
                <h5 class="widget-title bigger lighter">
                    <i class="ace-icon fa fa-cny"> 费用信息 </i>
                </h5>
            </div>
            <div class="widget-body">
                <div class="widget-main no-padding">
                    <table class="table table-striped table-bordered table-hover">
                        <thead class="thin-border-bottom">
                        <tr>
                            <th class="hidden-480">费用类型</th>
                            <th>收取类型</th>
                            <th>费用金额</th>
                            <th></i>费用描述</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td class="hidden-480"> 手续费 </td>
                            <td> 放款时收取 </td>
                            <td>{{detail.serviceCharge | numberFormatFilter}}</td>
                            <td> 借款手续费 </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <button class="btn btn-sm btn-success pull-right" data-dismiss="modal" @click="paypal()">
            <i class="ace-icon fa fa-check"></i>
            放款
        </button>
        <button class="btn btn-sm btn-danger pull-right" data-dismiss="modal">
            <i class="ace-icon fa fa-times"></i>
            关闭
        </button>
    </div>
</div>
<script type="text/javascript">
        var app1 = new Vue({
            el: '#creditDiv',
            data: {
                detail : {}
            },
            filters : {
                numberFormatFilter : function(value){
                    return numeral(value).format('0,0.00');
                }
            },
            mounted : function(){
                var that = this;
                axios.get('/finance/pay/view/${applyId}').then(function (response) {
                    var result = response.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            that.detail = result.data;
                        }else{
                            layer.alert(result.msg, {icon:2,title:"系统提示"});
                        }
                    }
                }).catch(function (error) {
                    layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
                });
            },
            methods : {
                paypal : function(){
                    var json = {"ids":["${applyId}"] , "status":"40"};
                    axios.post('/finance/pay/pay' , json).then(function (response) {
                        var result = response.data;
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                layer.msg('操作成功！');
                                $("#main").load("/router/finance/pay/wdrlapplylist");
                            }else{
                                layer.alert(result.msg, {icon:2,title:"系统提示"});
                            }
                        }
                    }).catch(function (error) {
                        layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
                    });
                }
            }
        });
    </script>