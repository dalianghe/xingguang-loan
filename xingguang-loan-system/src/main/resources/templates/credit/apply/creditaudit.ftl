<link rel="stylesheet" href="/assets/css/colorbox.min.css" />
<link rel="stylesheet" href="/assets/font-awesome/4.5.0/css/font-awesome.min.css" />
<link rel="stylesheet" href="/assets/css/bootstrap-datepicker3.min.css" />
<link rel="stylesheet" href="/assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />
    <div class="main-content-inner">
        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">控制台</a>
                </li>
                <li>
                    <a href="#">审核管理</a>
                </li>
                <li class="active">授信审核</li>
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
                        授信审核
                    </small>
                </h1>
            </div><!-- /.page-header -->
            <div class="row">
                <div class="col-xs-12">
                    <div class="tabbable">
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
                            <li>
                                <a data-toggle="tab" href="#callrecord">
                                    <i class="green ace-icon fa fa-phone bigger-120"></i>
                                    通话记录
                                </a>
                            </li>
                            <li>
                                <a data-toggle="tab" href="#gridinfo">
                                    <i class="green ace-icon fa fa-umbrella bigger-120"></i>
                                    欺诈信息
                                </a>
                            </li>
                            <li>
                                <a data-toggle="tab" href="#auditresult">
                                    <i class="green ace-icon fa fa-check bigger-120"></i>
                                    授信审核
                                </a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div id="userinfo" class="tab-pane fade in active">
                                <div class="col-xs-12 col-sm-2">
                                    <div class="text-left">
                                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-left">
                                            <div class="inline position-relative">
                                                <a class="user-title-label" href="#">
                                                    <i class="ace-icon fa fa-circle light-green"></i>
                                                    <span class="white">客户信息</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                        <div class="col-xs-12 col-sm-12">
                                            <div class="space visible-xs"></div>
                                            <div class="profile-user-info profile-user-info-striped">
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 姓名 </div>
                                                    <div class="profile-info-value">{{user.name}}</div>
                                                    <div class="profile-info-name"> 性别 </div>
                                                    <div class="profile-info-value">{{user.sexName}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 手机号 </div>
                                                    <div class="profile-info-value">{{user.phone}}</div>
                                                    <div class="profile-info-name"> 身份证号 </div>
                                                    <div class="profile-info-value">{{user.idNo}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 认证状态 </div>
                                                    <div class="profile-info-value">{{user.realStatusName}}</div>
                                                    <div class="profile-info-name"> 收入 </div>
                                                    <div class="profile-info-value">{{user.incomeName}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 学历  </div>
                                                    <div class="profile-info-value">{{user.educationName}}</div>
                                                    <div class="profile-info-name"> 职业 </div>
                                                    <div class="profile-info-value">{{user.occupationName}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 申请时间 </div>
                                                    <div class="profile-info-value">{{user.createTime}}</div>
                                                    <div class="profile-info-name"> 与业务员距离 </div>
                                                    <div class="profile-info-value">{{apply.cusWorkDistance}}</div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 经度 </div>
                                                    <div class="profile-info-value">{{apply.cusLng}}</div>
                                                    <div class="profile-info-name"> 纬度 </div>
                                                    <div class="profile-info-value">{{apply.cusLat}}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                <#--<div class="col-xs-12 col-sm-2">
                                    <div class="text-left">
                                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-left">
                                            <div class="inline position-relative">
                                                <a class="user-title-label" href="#">
                                                    <i class="ace-icon fa fa-circle light-green"></i>
                                                    <span class="white">联系人信息</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>-->
                                <#--<div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="space visible-xs"></div>
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 联系人姓名 </div>
                                                <div class="profile-info-value">{{link.linkName}}</div>
                                                <div class="profile-info-name"> 电话 </div>
                                                <div class="profile-info-value">{{link.phone}}</div>
                                                <div class="profile-info-name"> 关系 </div>
                                                <div class="profile-info-value">{{link.relationName}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>-->
                                <div class="col-xs-12 col-sm-2">
                                    <div class="text-left">
                                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-left">
                                            <div class="inline position-relative">
                                                <a class="user-title-label" href="#">
                                                    <i class="ace-icon fa fa-circle light-green"></i>
                                                    <span class="white">业务员信息</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="space visible-xs"></div>
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 业务员姓名 </div>
                                                <div class="profile-info-value">{{worker.name}}</div>
                                                <div class="profile-info-name"> 电话 </div>
                                                <div class="profile-info-value">{{worker.phone}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 所在省份 </div>
                                                <div class="profile-info-value">{{worker.provinceName}}</div>
                                                <div class="profile-info-name"> 所在城市 </div>
                                                <div class="profile-info-value">{{worker.cityName}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 经度 </div>
                                                <div class="profile-info-value">{{apply.workLng}}</div>
                                                <div class="profile-info-name"> 维度 </div>
                                                <div class="profile-info-value">{{apply.workLat}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="userfilm" class="tab-pane fade">
                                <div>
                                    <ul class="ace-thumbnails clearfix">
                                        <li>
                                            <a :href="user.realImg1Url" data-rel="colorbox">
                                                <img width="150" height="150" alt="150x150" :src="user.realImg1Url" />
                                            </a>
                                        </li>
                                        <li>
                                            <a :href="user.realImg2Url" data-rel="colorbox">
                                                <img width="150" height="150" alt="150x150" :src="user.realImg2Url" />
                                            </a>
                                        </li>
                                        <li>
                                            <a :href="user.realImg3Url" data-rel="colorbox">
                                                <img width="150" height="150" alt="150x150" :src="user.realImg3Url" />
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div id="callrecord" class="tab-pane fade">
                                <div class="col-xs-12 col-sm-12" style="text-align: center;margin-top: -20px;">
                                    <h4 class="header smaller lighter blue">用户申请表检测</h4>
                                </div>
                                <div id="appCheck" class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 姓名 </div>
                                                <div class="profile-info-value">{{checkUserName.keyValue}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 身份证 </div>
                                                <div class="profile-info-value">
                                                    {{checkIdCard.keyValue}} | {{checkIdCard.gender}} | {{checkIdCard.age}} |
                                                    {{checkIdCard.province}} | {{checkIdCard.city}} | {{checkIdCard.region}}
                                                </div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 手机号 </div>
                                                <div class="profile-info-value">
                                                    {{checkCellPhone.website}} | {{checkCellPhone.reliability}} | {{checkCellPhone.regTime}} |
                                                    {{checkCellPhone.checkName}} |
                                                    {{checkCellPhone.checkIdcard}} |
                                                    {{checkCellPhone.checkEbusiness}}
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">用户行为检测</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <table id="behavior_check" class="table table-striped table-bordered table-hover">
                                                <thead>
                                                <tr>
                                                    <th>检查项</th>
                                                    <th>结果</th>
                                                    <th class="hidden-480">依据</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">运营商数据</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <table id="cell_behavior" class="table table-striped table-bordered table-hover">
                                                <thead>
                                                <tr>
                                                    <th>运营商</th>
                                                    <th>号码</th>
                                                    <th class="hidden-480">归属地</th>
                                                    <th>月份</th>
                                                    <th class="hidden-480">呼叫次数</th>
                                                    <th>主叫次数</th>
                                                    <th>主叫时长（分）</th>
                                                    <th>被叫次数</th>
                                                    <th>被叫时长（分）</th>
                                                    <th>短信数量</th>
                                                    <th>话费消费</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">联系人区域汇总</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <table id="contact_region" class="table table-striped table-bordered table-hover">
                                                <thead>
                                                <tr>
                                                    <th>地区</th>
                                                    <th>号码次数</th>
                                                    <th>呼入次数</th>
                                                    <th class="hidden-480">呼出次数</th>
                                                    <th>呼入时长（分）</th>
                                                    <th class="hidden-480">呼出时长（分）</th>
                                                    <th>呼入次数百分比</th>
                                                    <th>呼出次数百分比</th>
                                                    <th>呼入时间百分比</th>
                                                    <th>呼出时间百分比</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">运营商数据分析</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <table id="contact_list" class="table table-striped table-bordered table-hover">
                                                <thead>
                                                <tr>
                                                    <th>号码</th>
                                                    <th>互联网标识</th>
                                                    <th>需求类型</th>
                                                    <th class="hidden-480">归属地</th>
                                                    <th>联系次数</th>
                                                    <th class="hidden-480">联系时长（分）</th>
                                                    <th>主叫次数</th>
                                                    <th>被叫次数</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="gridinfo" class="tab-pane fade">
                                <div class="col-xs-12 col-sm-12" style="text-align: center;margin-top: -20px;">
                                    <h4 class="header smaller lighter blue">用户基本信息</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 姓名 </div>
                                                <div class="profile-info-value">{{grid.user_basic.user_name}}</div>
                                                <div class="profile-info-name"> 性别 </div>
                                                <div class="profile-info-value">{{grid.user_basic.user_gender}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 年龄 </div>
                                                <div class="profile-info-value">{{grid.user_basic.user_age}}</div>
                                                <div class="profile-info-name"> 身份证号码 </div>
                                                <div class="profile-info-value">{{grid.user_basic.user_idcard}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 身份证所在地 </div>
                                                <div class="profile-info-value">{{grid.user_basic.user_province}}{{grid.user_basic.user_city}}</div>
                                                <div class="profile-info-name"> 身份证是否合规 </div>
                                                <div class="profile-info-value" v-if="grid.user_basic.user_idcard_valid===true">是</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 手机号 </div>
                                                <div class="profile-info-value">{{grid.user_basic.user_phone}}</div>
                                                <div class="profile-info-name"> 手机所属运营商 </div>
                                                <div class="profile-info-value">{{grid.user_basic.user_phone_operator}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">注册信息</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 注册APP数量 </div>
                                                <div class="profile-info-value">{{grid.user_register_orgs.register_cnt}}</div>
                                            </div>
                                            <div class="profile-info-row"  v-for="(register,index) in grid.user_register_orgs.register_orgs_statistics">
                                                <div class="profile-info-name"> APP类型</div>
                                                <div class="profile-info-value">{{register.label}}</div>
                                                <div class="profile-info-name"> 注册数量</div>
                                                <div class="profile-info-value">{{register.count}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">社交特征</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 灰度分 </div>
                                                <div class="profile-info-value">{{grid.user_gray.phone_gray_score}}</div>
                                                <div class="profile-info-name"> 社交活跃度 </div>
                                                <div class="profile-info-value">{{grid.user_gray.social_liveness}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 社交影响力 </div>
                                                <div class="profile-info-value">{{grid.user_gray.social_influence}}</div>
                                                <div class="profile-info-name"> 是否种子号 </div>
                                                <div class="profile-info-value">{{grid.user_gray.has_report}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">黑名单信息</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name" style="width:20%"> 姓名和手机是否在黑名单 </div>
                                                <div class="profile-info-value">{{grid.user_blacklist.blacklist_name_with_phone}}</div>
                                                <div class="profile-info-name"> 更新时间 </div>
                                                <div class="profile-info-value">{{grid.user_blacklist.blacklist_update_time_name_phone}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name" style="width:20%"> 身份证和姓名是否在黑名单 </div>
                                                <div class="profile-info-value">{{grid.user_blacklist.blacklist_name_with_idcard}}</div>
                                                <div class="profile-info-name"> 更新时间 </div>
                                                <div class="profile-info-value">{{grid.user_blacklist.blacklist_update_time_name_idcard}}</div>
                                            </div>
                                            <div class="profile-info-row" v-for="(black,index) in grid.user_blacklist.blacklist_details">
                                                <div class="profile-info-name"> 详情名称 </div>
                                                <div class="profile-info-value">{{black.details_key}}</div>
                                                <div class="profile-info-name"> 详情内容 </div>
                                                <div class="profile-info-value">{{black.details_value}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">联系人相关字段</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name" style="width: 30%"> 主动联系人数 </div>
                                                <div class="profile-info-value" style="width: 20%">{{grid.user_gray.contacts_number_statistic.cnt_to_all}}</div>
                                                <div class="profile-info-name" style="width: 30%"> 主动联系人数在群体中的百分位 </div>
                                                <div class="profile-info-value" style="width: 20%">{{grid.user_gray.contacts_number_statistic.pct_cnt_to_all}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 主动联系的黑号淑 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_to_black}}</div>
                                                <div class="profile-info-name"> 主动联系的黑号数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_cnt_to_black}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 主动联系人中曾为申请人的人数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_to_applied}}</div>
                                                <div class="profile-info-name"> 主动联系人曾为申请人的人数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_cnt_to_applied}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 被动联系人数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_be_black}}</div>
                                                <div class="profile-info-name"> 被动联系的黑号数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_cnt_be_black}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 被动联系的黑号数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_be_black}}</div>
                                                <div class="profile-info-name"> 被动联系的黑号数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_cnt_be_black}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 被动联系人中曾为申请人的人数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_be_applied}}</div>
                                                <div class="profile-info-name"> 主动联系人曾为申请人的人数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_cnt_be_applied}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 一阶联系(间接联系)黑号总数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_black}}</div>
                                                <div class="profile-info-name"> 一阶联系黑号数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_black_ratio}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 一阶联系人总数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_all}}</div>
                                                <div class="profile-info-name"> 一阶联系人数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_cnt_all}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 二阶联系(间接联系)黑号总数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_black2}}</div>
                                                <div class="profile-info-name"> 二阶联系黑号数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_cnt_black2}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 联系人曾为申请人的人数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_applied}}</div>
                                                <div class="profile-info-name"> 联系人曾为申请人的人数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_cnt_applied}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 一阶联系人黑号数占比 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.black_ratio}}</div>
                                                <div class="profile-info-name"> 一阶联系人黑号数占比在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_black_ratio}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 引起黑名单的一阶联系人数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.cnt_router}}</div>
                                                <div class="profile-info-name"> 引起黑名单的一阶联系人数在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_cnt_router}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 引起黑名单的一阶联系人数占比 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.router_ratio}}</div>
                                                <div class="profile-info-name"> 引起黑名单的一阶联系人数占比在群体中的百分位 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_number_statistic.pct_router_ratio}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">联系权重R、F、M相关字段</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name" style="width: 30%"> 与所有联系人的最近主动通话时间 </div>
                                                <div class="profile-info-value" style="width: 20%">{{grid.user_gray.contacts_rfm.recent_time_to_all}}</div>
                                                <div class="profile-info-name" style="width: 30%"> 与所有联系人的最近被动通话时间 </div>
                                                <div class="profile-info-value" style="width: 20%">{{grid.user_gray.contacts_rfm.recent_time_be_all}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与黑号的最近主动通话时间 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.recent_time_to_black}}</div>
                                                <div class="profile-info-name"> 与黑号的最近被动通话时间 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.recent_time_be_black}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与申请人的最近主动通话时间 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.recent_time_to_applicant}}</div>
                                                <div class="profile-info-name"> 与申请人的最近被动通话时间 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.recent_time_be_applicant}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与所有联系人的主动总通话次数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.call_cnt_to_all}}</div>
                                                <div class="profile-info-name"> 与所有联系人的被动总通话次数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.call_cnt_be_all}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与黑号的主动总通话次数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.call_cnt_to_black}}</div>
                                                <div class="profile-info-name"> 与黑号的被动总通话次数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.call_cnt_be_black}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与申请人的主动通话次数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.call_cnt_to_applied}}</div>
                                                <div class="profile-info-name"> 与申请人的被动通话次数 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.call_cnt_be_applied}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与所有联系人的主动总通话时长(s) </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.time_spent_to_all}}</div>
                                                <div class="profile-info-name"> 与所有联系人的被动总通话时长(s) </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.time_spent_be_all}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与黑号的主动总通话时长(s) </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.time_spent_to_black}}</div>
                                                <div class="profile-info-name"> 与黑号的被动总通话时长(s) </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.time_spent_be_black}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与申请人的主动通话时长(s) </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.time_spent_to_applied}}</div>
                                                <div class="profile-info-name"> 与申请人的被动通话时长(s) </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_rfm.time_spent_be_applied}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">与联系人最大亲密度</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name" style="width: 30%"> 与所有联系人的最大主动联系亲密度 </div>
                                                <div class="profile-info-value" style="width: 20%">{{grid.user_gray.contacts_closest.weight_to_all}}</div>
                                                <div class="profile-info-name" style="width: 30%"> 与所有联系人的最大被动联系亲密度 </div>
                                                <div class="profile-info-value" style="width: 20%">{{grid.user_gray.contacts_closest.weight_be_all}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与所有联系人的最大互动联系亲密度 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_closest.weight_all}}</div>
                                                <div class="profile-info-name"> 与黑号的最大主动联系亲密度 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_closest.weight_to_black}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与黑号的最大被动联系亲密度 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_closest.weight_be_black}}</div>
                                                <div class="profile-info-name"> 与黑号的最大互动联系亲密度 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_closest.weight_black}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与申请人的最大主动联系亲密度 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_closest.weight_to_applied}}</div>
                                                <div class="profile-info-name"> 与申请人的最大被动联系亲密度 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_closest.weight_be_applied}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 与申请人的最大互动联系亲密度 </div>
                                                <div class="profile-info-value">{{grid.user_gray.contacts_closest.weight_applied}}</div>
                                                <div class="profile-info-value"></div>
                                                <div class="profile-info-value"></div>
                                            </div>
                                    </div>
                                </div>
                            </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">机构历史查询</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 查询次数统计 </div>
                                                <div class="profile-info-value">{{grid.user_searched_statistic.searched_org_cnt}}</div>
                                            </div>
                                            <div class="profile-info-row" v-for="(history,index) in grid.user_searched_history_by_orgs">
                                                <div class="profile-info-name"> 查询日期 </div>
                                                <div class="profile-info-value">{{history.searched_date}}</div>
                                                <div class="profile-info-name"> 机构类型 </div>
                                                <div class="profile-info-value">{{history.searched_org}}</div>
                                                <div class="profile-info-name"> 是否本机构查询 </div>
                                                <div class="profile-info-value">{{history.org_self}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">手机存疑</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name" style="width: 20%"> 使用过此手机的其他姓名 </div>
                                            </div>
                                            <div class="profile-info-row" v-for="(item,index) in grid.user_phone_suspicion.phone_with_other_names">
                                                <div class="profile-info-name" style="width: 20%"> 绑定姓名 </div>
                                                <div class="profile-info-value" style="width: 30%">{{item.susp_name}}</div>
                                                <div class="profile-info-name" style="width: 20%"> 绑定时间 </div>
                                                <div class="profile-info-value" style="width: 30%">{{history.susp_updt}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 使用过此手机的其他身份证 </div>
                                            </div>
                                            <div class="profile-info-row" v-for="(item,index) in grid.user_phone_suspicion.phone_with_other_idcards">
                                                <div class="profile-info-name"> 绑定身份证 </div>
                                                <div class="profile-info-value">{{item.susp_idcard}}</div>
                                                <div class="profile-info-name"> 绑定时间 </div>
                                                <div class="profile-info-value">{{history.susp_updt}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 提供数据的机构 </div>
                                            </div>
                                            <div class="profile-info-row" v-for="(item,index) in grid.user_phone_suspicion.phone_applied_in_orgs">
                                                <div class="profile-info-name"> 机构所属类型 </div>
                                                <div class="profile-info-value">{{item.susp_org_type}}</div>
                                                <div class="profile-info-name"> 绑定时间 </div>
                                                <div class="profile-info-value">{{history.susp_updt}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="text-align: center;">
                                    <h4 class="header smaller lighter blue">身份证存疑</h4>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="profile-user-info profile-user-info-striped">
                                            <div class="profile-info-row">
                                                <div class="profile-info-name" style="width: 20%"> 使用过此身份证的其他姓名 </div>
                                            </div>
                                            <div class="profile-info-row" v-for="(item,index) in grid.user_idcard_suspicion.idcard_with_other_names">
                                                <div class="profile-info-name"> 绑定姓名 </div>
                                                <div class="profile-info-value">{{item.susp_name}}</div>
                                                <div class="profile-info-name"> 绑定时间 </div>
                                                <div class="profile-info-value">{{history.susp_updt}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 使用过此手机的其他身份证 </div>
                                            </div>
                                            <div class="profile-info-row" v-for="(item,index) in grid.user_idcard_suspicion.idcard_with_other_phones">
                                                <div class="profile-info-name">该号码所属省份 </div>
                                                <div class="profile-info-value">{{item.susp_phone_province}}</div>
                                                <div class="profile-info-name"> 该号码所在地区 </div>
                                                <div class="profile-info-value">{{history.susp_phone_city}}</div>
                                                <div class="profile-info-name"> 该号码所属运营商 </div>
                                                <div class="profile-info-value">{{history.susp_phone_operator}}</div>
                                                <div class="profile-info-name"> 绑定时间 </div>
                                                <div class="profile-info-value">{{history.susp_updt}}</div>
                                                <div class="profile-info-name"> 存疑手机号码 </div>
                                                <div class="profile-info-value">{{history.susp_phone}}</div>
                                            </div>
                                            <div class="profile-info-row">
                                                <div class="profile-info-name"> 提供数据的机构 </div>
                                            </div>
                                            <div class="profile-info-row" v-for="(item,index) in grid.user_idcard_suspicion.idcard_applied_in_orgs">
                                                <div class="profile-info-name"> 机构所属类型 </div>
                                                <div class="profile-info-value">{{item.susp_org_type}}</div>
                                                <div class="profile-info-name"> 绑定时间 </div>
                                                <div class="profile-info-value">{{history.susp_updt}}</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div id="auditresult" class="tab-pane fade">
                                <div class="col-xs-12 col-sm-2">
                                    <div class="text-left">
                                        <div class="width-80 label label-info label-xlg arrowed-in arrowed-in-left">
                                            <div class="inline position-relative">
                                                <a class="user-title-label" href="#">
                                                    <i class="ace-icon fa fa-circle light-red"></i>
                                                    <span class="white">审核结果</span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 col-sm-12">
                                        <div class="space visible-xs"></div>
                                        <form id="auditForm">
                                            <div class="profile-user-info profile-user-info-striped">
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"><span style="color: red">*</span> 审核结果 </div>
                                                    <div class="profile-info-value">
                                                        <div class="col-xs-10 col-sm-12" style="margin-left: -12px;">
                                                            <label>
                                                                <input name="status" type="radio" class="ace" v-model="audit.status"  value="2" @click="chooseResult"/>
                                                                <span class="lbl"> 通过</span>
                                                            </label>
                                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                                            <label id="statusDiv">
                                                                <input name="status" type="radio" class="ace" v-model="audit.status" value="3" @click="chooseResult"/>
                                                                <span class="lbl"> 不通过</span>
                                                            </label>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="profile-info-row" id="productDiv" style="display: none">
                                                    <div class="profile-info-name"><span style="color: red">*</span> 授信产品 </div>
                                                    <div class="profile-info-value">
                                                        <div id="tipsProductDiv" class="col-xs-10 col-sm-12" style="margin-left: -12px;">
                                                            <label v-for="(product,index) in products">
                                                                <input id="product" name="productId" type="radio" class="ace" v-model="audit.productId" :value="product.id" @click="chooseTerm(product.id)"/>
                                                                <span class="lbl"> {{product.name}} </span>&nbsp;&nbsp;&nbsp;&nbsp;
                                                            </label>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="profile-info-row" id="termDiv" style="display: none">
                                                    <div class="profile-info-name"><span style="color: red">*</span> 期限 </div>
                                                    <div class="profile-info-value">
                                                        <div id="tipsTermDiv" class="col-xs-10 col-sm-12" style="margin-left: -12px;">
                                                            <label v-for="term in terms">
                                                                <input name="termId" type="radio" class="ace" v-model="audit.termId"  :value="term.id"/>
                                                                <span class="lbl"> {{term.termName}} </span>&nbsp;&nbsp;&nbsp;&nbsp;
                                                            </label>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="profile-info-row" id="amountDiv" style="display: none">
                                                    <div class="profile-info-name"><span style="color: red">*</span> 授信金额 </div>
                                                    <div class="profile-info-value">
                                                        <input type="text" id="amount" name="amount" v-model="audit.amount" placeholder="请输入授信金额"/>（元）
                                                    </div>
                                                </div>
                                                <div class="profile-info-row" id="refuseCodeDiv" style="display: none">
                                                    <div class="profile-info-name"><span style="color: red">*</span> 拒贷码 </div>
                                                    <div class="profile-info-value">
                                                        <select id="refuseCodeId" class="form-control"  v-model="audit.refuseCode" style="width: 20%;">
                                                            <option disabled value=null>请选择</option>
                                                            <option v-for="refuse in refuses" :value="refuse.refuseCode">{{refuse.refuseName}}</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 审核意见 </div>
                                                    <div class="profile-info-value">
                                                        <textarea class="form-control" id="form-field-4" placeholder="请录入审核意见" v-model="audit.creditRemark"></textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-sm-12" style="padding-top: 20px;text-align: right;">
                                    <button class="btn btn-sm btn-info" @click="backward">
                                        <i class="ace-icon fa fa-backward bigger-120"></i>
                                        返回
                                    </button>
                                    <button class="btn btn-sm btn-success" @click="auditCredit">
                                        提交
                                        <i class="ace-icon fa fa-forward bigger-120"></i>
                                    </button>
                                </div>
                                <div class="row"></div>
                            </div>
                    </div>
                </div>
            </div>
        </div><!-- /.col -->
    </div><!-- /.row -->
    <script src="/assets/js/jquery.dataTables.min.js"></script>
    <script src="/assets/js/jquery.dataTables.bootstrap.min.js"></script>
    <script src="/assets/js/dataTables.buttons.min.js"></script>
    <script src="/js/lib/vue/axios.min.js"></script>
    <script src="/assets/js/jquery.colorbox.min.js"></script>
    <script type="text/javascript">
        function getCusUserInfo() {
            return axios.get("/cus/user/${userId}");
        }
        function getCusUserLink() {
            return axios.get('/cus/link/${userId}');
        }
        function getWorkUserInfo() {
            return axios.get("/work/cus/${userId}");
        }
        function getCreditApplyInfo() {
            return axios.get("/credit/apply/${applyId}");
        }
        function getCodeResuse() {
            return axios.get("/code/refuse",{params:{"id":0}});
        }
        function getProductList() {
            return axios.get("/product/list");
        }

        function getApplicationCheckUserName() {
            return axios.get("/cell/check/username/${applyId}");
        }

        function getApplicationCheckCellPhone() {
            return axios.get("/cell/check/cellphone/${applyId}");
        }

        function getApplicationCheckIdCard() {
            return axios.get("/cell/check/idcard/${applyId}");
        }

        var userApp = new Vue({
            el: '#userinfo',
            data:{
                user : {},
                link : {},
                worker : {},
                apply : {}
            },
            mounted : function(){
                var that=this;
                axios.all([getCusUserInfo(), getWorkUserInfo(), getCreditApplyInfo()])
                        .then(axios.spread(function (cusUser, worker, apply) {
                            var user = cusUser.data;
                            if(user.sysCode==0){
                                if(user.bizCode==0){
                                    that.user = user.data;
                                    userfilmApp.user = user.data;
                                    gridInfo.getGridInfo(that.user.id,that.user.name,that.user.idNo,that.user.phone);
                                }
                            }
                            var worker = worker.data;
                            if(worker.sysCode==0){
                                if(worker.bizCode==0){
                                    that.worker = worker.data;
                                }
                            }
                            var apply = apply.data;
                            if(apply.sysCode==0){
                                if(apply.bizCode==0){
                                    that.apply = apply.data;
                                }
                            }
                        }
                 ));
            }
        });
        var userfilmApp = new Vue({
            "el" : '#userfilm',
            data:{
                user : {}
            }
        });
        var auditApp = new Vue({
            el: '#auditresult',
            data: {
                refuses : {},
                products : {},
                terms : {},
                audit : {
                    id : "",
                    cusUserId : "",
                    status : "",
                    amount : "",
                    refuseCode : null,
                    productId : null,
                    termId : null,
                    creditRemark : ""
                }
            },
            mounted : function(){
                var that=this;
                axios.all([getCodeResuse(), getProductList()])
                        .then(axios.spread(function (refuses, products) {
                    var refuses = refuses.data;
                    if(refuses.sysCode==0){
                        if(refuses.bizCode==0){
                            that.refuses = refuses.data;
                        }
                    }
                    var products = products.data;
                    if(products.sysCode==0){
                        if(products.bizCode==0){
                            that.products = products.data;
                        }
                    }
                }));
            },
            methods : {
                chooseResult : function(){
                    var result = $('input:radio[name="status"]:checked').val();
                    if(result==3){
                        $("#refuseCodeDiv").show();
                        $("#amountDiv").hide();
                        $("#productDiv").hide();
                        $("#termDiv").hide();
                        this.audit.amount = null;
                        this.audit.productId = null;
                        this.audit.termId = null;
                        $('input:radio[name="productId"]').attr("checked",false);
                        $('input:radio[name="termId"]').attr("checked",false);
                    }else{
                        $("#refuseCodeDiv").hide();
                        $("#amountDiv").show();
                        $("#productDiv").show();
                        this.audit.refuseCode = null;
                    }
                },
                chooseTerm : function(productId){
                    var that = this;
                    var idx = layer.load(2);
                    axios.get('/product/terms/'+productId).then(function (response) {
                        var result = response.data;
                        if(result.sysCode==0){
                            if(result.bizCode==0){
                                that.terms = result.data;
                                $("#termDiv").show();
                            }
                        }
                    }).catch(function (error) {
                        layer.alert('系统错误，请稍后重试！', {icon:2,title:"系统提示"});
                    });
                    layer.close(idx);
                },
                auditCredit : function(){
                    var result = $('input:radio[name="status"]:checked').val();
                    if(result==null){
                        layer.tips('请选择审核结果！', $("#statusDiv") );
                        return;
                    }else if(result==3){
                        if($("#refuseCodeId").val()==null){
                            layer.tips('请选择拒贷码！', $("#refuseCodeId") );
                            return;
                        }
                    }else{
                        var product = $('input:radio[name="productId"]:checked').val();
                        if(product==null){
                            layer.tips('请选择授信产品！', $("#tipsProductDiv") ,{tips:1});
                            return;
                        }
                        var termId = $('input:radio[name="termId"]:checked').val();
                        if(termId==null){
                            layer.tips('请选择授信期限！', $("#tipsTermDiv") ,{tips:1});
                            return;
                        }
                        if($("#amount").val()==""){
                            layer.tips('请输入授信金额！', $("#amount") ,{tips:1});
                            return;
                        }
                    }
                    this.audit.cusUserId = "${userId}";
                    this.audit.id = "${applyId}";
                    layer.confirm('确认执行提交操作吗？', {icon: 3, title:'系统提示'}, function(index){
                        axios.all([updateCreditApplyInfo()]).then(axios.spread(function (applyResult) {
                            var result = applyResult.data;
                            if(result.sysCode==0){
                                if(result.bizCode==0){
                                    layer.msg('操作成功！');
                                    $("#main").load("/router/credit/apply/applytodolist");
                                }
                            }
                        }));
                        layer.close(index);
                    });
                },
                backward : function(){
                    $("#main").load("/router/credit/apply/applytodolist");
                }
            }
        });
        var appCheck = new Vue({
            el: '#appCheck',
            data:{
                checkUserName : {},
                checkCellPhone : {},
                checkIdCard : {}
            },
            mounted : function(){
                var that=this;
                axios.all([getApplicationCheckUserName(), getApplicationCheckCellPhone(), getApplicationCheckIdCard()])
                        .then(axios.spread(function (checkUserName, checkCellPhone, checkIdCard) {
                                    var userName = checkUserName.data;
                                    if(userName.sysCode==0){
                                        if(userName.bizCode==0){
                                            that.checkUserName = userName.data;
                                        }
                                    }

                                    var cellPhone = checkCellPhone.data;
                                    if(cellPhone.sysCode==0){
                                        if(cellPhone.bizCode==0){
                                            that.checkCellPhone = cellPhone.data;
                                        }
                                    }

                                    var idCard = checkIdCard.data;
                                    if(idCard.sysCode==0){
                                        if(idCard.bizCode==0){
                                            that.checkIdCard = idCard.data;
                                        }
                                    }
                                }
                        ));
            }
        });
        var gridInfo = new Vue({
            "el" : "#gridinfo",
            data:{
                grid:{
                    user_basic:{},
                    user_register_orgs:{},
                    user_gray:{
                        contacts_number_statistic:{},
                        contacts_rfm:{},
                        contacts_closest:{}
                    },
                    user_blacklist:{},
                    user_searched_statistic:{},
                    user_searched_history_by_orgs:{},
                    user_phone_suspicion:{
                        phone_with_other_idcards:{},
                        phone_with_other_names:{},
                        phone_applied_in_orgs:{}
                    },
                    user_idcard_suspicion:{
                        idcard_with_other_names:{},
                        idcard_with_other_phones:{},
                        idcard_applied_in_orgs:{}
                    }
                }
            },
            mounted : function(){

            },
            methods : {
                getGridInfo : function(userId,userName,idCard,phone){
                    var that=this;
                    axios.get("/grid" , {
                        params : {
                            userId:userId,
                            userName:userName,
                            idCard:idCard,
                            phone:phone,
                            bizId:${applyId}
                        }
                    }).then(function(res){
                        var grid = res.data;
                        console.log(res.data);
                        if(grid.sysCode==0){
                            if(grid.bizCode==0){
                                that.grid = grid.data;
                            }
                        }
                    });
                }
            }
        });

        function updateCreditApplyInfo(){
            var formData = auditApp.audit;
            return axios.post('/credit/audit' , formData);
        }
        jQuery(function($) {
            var $overflow = '';
            var colorbox_params = {
                rel: 'colorbox',
                reposition:true,
                scalePhotos:true,
                scrolling:false,
                previous:'<i class="ace-icon fa fa-arrow-left"></i>',
                next:'<i class="ace-icon fa fa-arrow-right"></i>',
                close:'&times;',
                current:'{current} of {total}',
                maxWidth:'100%',
                maxHeight:'100%',
                onOpen:function(){
                    $overflow = document.body.style.overflow;
                    document.body.style.overflow = 'hidden';
                },
                onClosed:function(){
                    document.body.style.overflow = $overflow;
                },
                onComplete:function(){
                    $.colorbox.resize();
                }
            };
            $('.ace-thumbnails [data-rel="colorbox"]').colorbox(colorbox_params);
            $("#cboxLoadingGraphic").html("<i class='ace-icon fa fa-spinner orange fa-spin'></i>");//let's add a custom loading icon
            $(document).one('ajaxloadstart.page', function(e) {
                $('#colorbox, #cboxOverlay').remove();
            });
            var cellTable =$('#behavior_check').DataTable({
                bAutoWidth: false,
                "ordering": false,
                "lengthChange": true,
                "searching": false,
                language: {
                    "sLengthMenu":   "显示 _MENU_ 项结果",
                    "sSearch" : "搜索:",
                    "sZeroRecords":  "没有匹配结果",
                    "sInfo" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
                    "oPaginate" : {
                        "sFirst":    "首页",
                        "sPrevious": "上页",
                        "sNext":     "下页",
                        "sLast":     "末页"
                    }
                },
                ajax:{
                    url:"/cell/behavior/check/${applyId}",
                    dataSrc:function(result){
                        return result.data;
                    }
                },
                aoColumns:[
                    {data:'checkPointCn'},{data:'result'},{data:'evidence'}
                ]
            });
            var cellTable =$('#cell_behavior').DataTable({
                bAutoWidth: false,
                "paging": false, // 禁止分页
                "ordering": false,
                "searching": false,
                language: {
                    "sZeroRecords":  "没有匹配结果",
                    "sInfo" : ""
                },
                ajax:{
                    url:"/cell/report/behavior/${applyId}",
                    dataSrc:function(result){
                        return result.data;
                    }
                },
                aoColumns:[
                    {data:'cellOperatorZh'},{data:'cellPhoneNum'},{data:'cellLoc'},{data:'cellMth'},{data:'callCnt'},{data:'callOutCnt'},
                    {data:'callOutTime'},{data:'callInCnt'},{data:'callInTime'},{data:'smsCnt'},{data:'totalAmount'}
                ]
            });
            var regionTable =$('#contact_region').DataTable({
                bAutoWidth: false,
                "ordering": false,
                "lengthChange": true,
                "searching": false,
                language: {
                    "sLengthMenu":   "显示 _MENU_ 项结果",
                    "sSearch" : "搜索:",
                    "sZeroRecords":  "没有匹配结果",
                    "sInfo" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
                    "oPaginate" : {
                        "sFirst":    "首页",
                        "sPrevious": "上页",
                        "sNext":     "下页",
                        "sLast":     "末页"
                    }
                },
                ajax:{
                    url:"/cell/report/region/${applyId}",
                    dataSrc:function(result){
                        return result.data;
                    }
                },
                aoColumns:[
                    {data:'regionLoc'},{data:'regionUniqNumCnt'},{data:'regionCallInCnt'},{data:'regionCallOutCnt'},
                    {data:'regionCallInTime'},{data:'regionCallOutTime'},{data:'regionCallInCntPct'},{data:'regionCallOutCntPct'},
                    {data:'regionCallInTimePct'},{data:'regionCallOutTimePct'}
                ]
            });
            var listTable =$('#contact_list').DataTable({
                bAutoWidth: false,
                "ordering": false,
                "lengthChange": true,
                "searching": true,
                language: {
                    "sLengthMenu":   "显示 _MENU_ 项结果",
                    "sSearch" : "搜索:",
                    "sZeroRecords":  "没有匹配结果",
                    "sInfo" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
                    "oPaginate" : {
                        "sFirst":    "首页",
                        "sPrevious": "上页",
                        "sNext":     "下页",
                        "sLast":     "末页"
                    }
                },
                ajax:{
                    url:"/cell/report/list/${applyId}",
                    dataSrc:function(result){
                        return result.data;
                    }
                },
                aoColumns:[
                    {data:'phoneNum'},{data:'contactName'},{data:'needsType'},{data:'phoneNumLoc'},{data:'callCnt'},
                    {data:'callLen'},{data:'callOutCnt'},{data:'callInCnt'}
                ]
            });
        });
        $('#nav-search-input').bind('keypress', function(event) {
            if (event.keyCode == "13") {
                event.preventDefault();
                window.open("http://www.baidu.com/s?wd="+$('#nav-search-input').val());
            }
        });
    </script>

