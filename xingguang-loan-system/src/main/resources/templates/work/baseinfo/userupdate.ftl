    <div class="main-content-inner">
        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">控制台</a>
                </li>

                <li>
                    <a href="#">系统设置</a>
                </li>
                <li class="active">业务员修改</li>
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
        <div class="page-content">

            <div class="page-header">
                <h1>
                    <small>
                        <i class="ace-icon fa fa-angle-double-right"></i>
                        业务员修改
                    </small>
                </h1>
            </div><!-- /.page-header -->

            <div id="dataDiv" class="row">
                <div class="col-xs-12">
                    <!-- PAGE CONTENT BEGINS -->
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="table-detail">
                                <div class="row">
                                    <div class="col-xs-12 col-sm-2">
                                        <div class="text-center">
                                            <img height="150" class="thumbnail inline no-margin-bottom" alt="Domain Owner's Avatar" src="/assets/images/avatars/profile-pic.jpg" />
                                            <br />
                                            <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-right">
                                                <div class="inline position-relative">
                                                    <a class="user-title-label" href="#">
                                                        <i class="ace-icon fa fa-circle light-green"></i>
                                                        <span class="white">{{user.name}}</span>
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-xs-12 col-sm-10">
                                        <div class="space visible-xs"></div>
                                        <form id="userForm">
                                            <div class="profile-user-info profile-user-info-striped">
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"><span style="color: red">*</span> 姓名 </div>
                                                    <div class="profile-info-value">
                                                        <input type="text" id="name" name="name" placeholder="请输入用户姓名" v-model="user.name"/>
                                                    </div>
                                                    <div class="profile-info-name"><span style="color: red">*</span> 性别 </div>
                                                    <div class="profile-info-value">
                                                        <div class="col-xs-10 col-sm-12" style="margin-left: -12px;">
                                                            <label>
                                                                <input name="sex" type="radio" class="ace" v-model="user.sex" value="101001"/>
                                                                <span class="lbl"> 男</span>
                                                            </label>
                                                            &nbsp;&nbsp;
                                                            <label>
                                                                <input name="sex" type="radio" class="ace" v-model="user.sex" value="101002"/>
                                                                <span class="lbl"> 女</span>
                                                            </label>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"><span style="color: red">*</span> 手机号 </div>
                                                    <div class="profile-info-value">
                                                        <div class="input-group">
                                                            <input type="text" id="phone" name="phone" placeholder="请输入用户手机号" v-model="user.phone"/>
                                                        </div>
                                                    </div>
                                                    <div class="profile-info-name"><span style="color: red">*</span> 身份证号 </div>
                                                    <div class="profile-info-value">
                                                        <input type="text" id="idNo" name="idNo" placeholder="请输入用户手机号" v-model="user.idNo"/>
                                                    </div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"><span style="color: red">*</span> 所在省 </div>
                                                    <div class="profile-info-value">
                                                        <select class="form-control" id="provinceId" name="provinceId" v-model="provinceSelected">
                                                            <option disabled value=null>请选择</option>
                                                            <option v-for="province in provinces" :value="province.regionCode">{{province.regionName}}</option>
                                                        </select>

                                                        <input type="hidden" id="provinceName" name="provinceName"/>
                                                    </div>
                                                    <div class="profile-info-name"><span style="color: red">*</span> 所在市 </div>
                                                    <div class="profile-info-value">
                                                        <select class="form-control" id="cityId" name="cityId" v-model="citySelected">
                                                            <option disabled value=null>请选择</option>
                                                            <option v-for="city in cities" :value="city.regionCode">{{city.regionName}}</option>
                                                        </select>
                                                        <input type="hidden" id="cityName" name="cityName"/>
                                                    </div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 申请时间 </div>
                                                    <div class="profile-info-value">
                                                        {{user.createTime}}
                                                    </div>
                                                    <div class="profile-info-name"></div>
                                                    <div class="profile-info-value"></div>
                                                </div>
                                            </div>
                                        <input type="hidden" name="id" v-model="user.id">
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div><!-- /.span -->
                    </div><!-- /.row -->
                    <br/>
                    <button class="btn btn-white btn-info btn-bold" @click="saveUser">
                        <i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>
                        保存
                    </button>
                </div><!-- /.col -->
            </div><!-- /.row -->
        </div><!-- /.page-content -->
        <input type="hidden" id="id" name="id" value="${id}"/>
    </div>
    <script src="/js/lib/vue/axios.min.js"></script>
    <script src="/js/lib/jquery/jquery.serializejson.min.js"></script>
    <script src="/js/utils/vue.form.utils.js"></script>
    <script type="text/javascript">
        function getWorkInfo() {
            var userId = $("#id").val();
            return axios.get("/work/user/"+userId);
        }
        function getProvince(that){
            return axios.get("/code/region/1").then(function (provinces) {
                var provinces = provinces.data;
                if(provinces.sysCode==0){
                    if(provinces.bizCode==0){
                        that.provinces = provinces.data;
                        var provinceId= "";
                        for(var i=0;i<provinces.data.length;i++){
                            if(provinces.data[i].regionCode == that.provinceSelected){
                                provinceId = provinces.data[i].id;
                                break;
                            }
                        }
                        getCity(that , provinceId);
                    }
                }
            });
        }
        function getCity(that , pId){
            return axios.get("/code/region/"+pId).then(function (cities) {
                var cities = cities.data;
                if(cities.sysCode==0){
                    if(cities.bizCode==0){
                        that.cities = cities.data;
                    }
                }
            });
        }

        var app = new Vue({
            el: '#dataDiv',
            data: {
                user : {},
                provinces : {},
                cities : {},
                provinceSelected : {},
                citySelected : ""
            },
            mounted : function(){
                var that=this;
                axios.all([getWorkInfo()]).then(axios.spread(function (worker) {
                    var result = worker.data;
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            that.user = result.data;
                            that.provinceSelected = that.user.provinceId;
                            that.citySelected = that.user.cityId;
                            getProvince(that);
                        }
                    }
                }));
            },
            watch: {
                provinceSelected : function(val){
                    getProvince(this);
                }
            },
            methods : {
                saveUser : function(){
                    if($("#name").val()==""){
                        layer.tips('姓名不能为空！', $("#name"),{tips: 1});
                        return;
                    }
                    if($("#phone").val()==""){
                        layer.tips('手机号不能为空！', $("#phone"),{tips: 1});
                        return;
                    }
                    if($("#idNo").val()==""){
                        layer.tips('身份证不能为空！', $("#idNo"),{tips: 1});
                        return;
                    }
                    var provinceName=$("#provinceId option:selected").text();
                    var cityName=$("#cityId option:selected").text();
                    $("#provinceName").val(provinceName);
                    $("#cityName").val(cityName);
                    var data = $(this.$el).find('#userForm').serialize();
                    var json=DataDeal.formToJson(data);
                    axios.post('/work/updateuser' , json).then(function(response){
                        var result = response.data;
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                //this.user = result.data;
                                layer.alert('操作成功！', {icon: 1,title: "系统提示"});
                            }
                        }
                    }).catch(function(){
                        layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
                    });
                }
            }
        });
        var DataDeal = {
            //将从form中通过$('#form').serialize()获取的值转成json
            formToJson: function (data) {
                data= decodeURIComponent(data,true);
                data=data.replace(/&/g,"\",\"");
                data=data.replace(/=/g,"\":\"");
                data="{\""+data+"\"}";
                return $.parseJSON(data);
            },
        };
        $('#nav-search-input').bind('keypress', function(event) {
            if (event.keyCode == "13") {
                event.preventDefault();
                window.open("http://www.baidu.com/s?wd="+$('#nav-search-input').val());
            }
        });
    </script>