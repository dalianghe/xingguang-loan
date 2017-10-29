<div id="wdrlDiv">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3 class="smaller lighter blue no-margin">提现记录</h3>
    </div>
    <div class="modal-body">
            <div class="widget-box widget-color-blue" id="widget-box-2">
                <div class="widget-header">
                    <h5 class="widget-title bigger lighter">
                        <i class="ace-icon fa fa-user" v-text="historyName"></i>
                    </h5>
                </div>
                <div class="widget-body">
                    <div class="widget-main no-padding">
                        <table class="table table-striped table-bordered table-hover">
                            <thead class="thin-border-bottom">
                            <tr>
                                <th class="hidden-480"><i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>申请时间</th>
                                <th>提现金额</th>
                                <th>状态</th>
                                <th><i class="ace-icon fa fa-check-circle-o bigger-110 hidden-480"></i>操作时间</th>
                                <th class="hidden-480">操作人</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr v-for="record in histories">
                                <td class="hidden-480" v-text="record.createTime"></td>
                                <td>{{record.amount | numberFormatFilter}}</td>
                                <td>
                                    <span class="label label-info" v-if="record.status===10" v-text="record.statusName"></span>
                                    <span class="label label-inverse  arrowed-in arrowed-in-right" v-if="record.status===20"  v-text="record.statusName"></span>
                                    <span class="label label-pink  arrowed-in arrowed-in-right" v-if="record.status===30"  v-text="record.statusName"></span>
                                    <span class="label label-danger  arrowed-in arrowed-in-right" v-if="record.status===40"  v-text="record.statusName"></span>
                                    <span class="label label-purple  arrowed-in arrowed-in-right" v-if="record.status===50"  v-text="record.statusName"></span>
                                    <span class="label label-success" v-if="record.status===60" v-text="record.statusName"></span>
                                </td>
                                <td v-text="record.creditTime"></td>
                                <td class="hidden-480" v-text="record.creditUserName"></td>
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
</div>
<script type="text/javascript">
        var app1 = new Vue({
            el: '#wdrlDiv',
            data: {
                histories : {},
                historyName : ""
            },
            filters : {
                numberFormatFilter : function(value){
                    return numeral(value).format('0,0.00');
                }
            },
            mounted : function(){
                var that = this;
                that.historyName = "${name}";
                axios.get('/finance/wdrl/user/${userId}').then(function (response) {
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
                });
            }
        });
    </script>