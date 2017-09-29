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
        <li class="active">用户管理</li>
    </ul><!-- /.breadcrumb -->

    <div class="nav-search" id="nav-search">
        <form class="form-search">
				<span class="input-icon">
					<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
					<i class="ace-icon fa fa-search nav-search-icon"></i>
				</span>
        </form>
    </div><!-- /.nav-search -->
</div>

<div class="page-content">
    <div class="ace-settings-container" id="ace-settings-container">
        <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
            <i class="ace-icon fa fa-cog bigger-130"></i>
        </div>

        <div class="ace-settings-box clearfix" id="ace-settings-box">
            <div class="pull-left width-50">
                <div class="ace-settings-item">
                    <div class="pull-left">
                        <select id="skin-colorpicker" class="hide">
                            <option data-skin="no-skin" value="#438EB9">#438EB9</option>
                            <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                            <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                            <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                        </select>
                    </div>
                    <span>&nbsp; Choose Skin</span>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-navbar" autocomplete="off" />
                    <label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-sidebar" autocomplete="off" />
                    <label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-breadcrumbs" autocomplete="off" />
                    <label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" autocomplete="off" />
                    <label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-add-container" autocomplete="off" />
                    <label class="lbl" for="ace-settings-add-container">
                        Inside
                        <b>.container</b>
                    </label>
                </div>
            </div><!-- /.pull-left -->

            <div class="pull-left width-50">
                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover" autocomplete="off" />
                    <label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact" autocomplete="off" />
                    <label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight" autocomplete="off" />
                    <label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
                </div>
            </div><!-- /.pull-left -->
        </div><!-- /.ace-settings-box -->
    </div><!-- /.ace-settings-container -->

    <div class="page-header">
        <h1>
            <small>
                <i class="ace-icon fa fa-angle-double-right"></i>
                用户管理
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
                            <th class="center">序号</th>
                            <th>用户姓名</th>
                            <th>用户账户</th>
                            <th class="hidden-480">手机号</th>
                            <th>
                                <i class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i>
                                更新时间
                            </th>
                            <th class="hidden-480">状态</th>
                            <th class="detail-col">详情</th>
                            <th>操作</th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td class="center">
                                1
                            </td>
                            <td>
                                猪八戒
                            </td>
                            <td>zhubajie</td>
                            <td class="hidden-480">13901234567</td>
                            <td>2017-06-20 13:34:21</td>

                            <td class="hidden-480">
                                <span class="label label-sm label-success">正常</span>
                            </td>

                            <td class="center">
                                <div class="action-buttons">
                                    <a href="#" class="green bigger-140 show-details-btn" title="Show Details">
                                        <i class="ace-icon fa fa-angle-double-down"></i>
                                        <span class="sr-only">Details</span>
                                    </a>
                                </div>
                            </td>

                            <td>
                                <div class="hidden-sm hidden-xs btn-group">
                                    <button class="btn btn-xs btn-success">
                                        <i class="ace-icon fa fa-check bigger-120"></i>
                                    </button>

                                    <button class="btn btn-xs btn-info">
                                        <i class="ace-icon fa fa-pencil bigger-120"></i>
                                    </button>

                                    <button class="btn btn-xs btn-danger">
                                        <i class="ace-icon fa fa-trash-o bigger-120"></i>
                                    </button>

                                    <button class="btn btn-xs btn-warning">
                                        <i class="ace-icon fa fa-flag bigger-120"></i>
                                    </button>
                                </div>

                                <div class="hidden-md hidden-lg">
                                    <div class="inline pos-rel">
                                        <button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto">
                                            <i class="ace-icon fa fa-cog icon-only bigger-110"></i>
                                        </button>

                                        <ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
                                            <li>
                                                <a href="#" class="tooltip-info" data-rel="tooltip" title="View">
															<span class="blue">
																<i class="ace-icon fa fa-search-plus bigger-120"></i>
															</span>
                                                </a>
                                            </li>

                                            <li>
                                                <a href="#" class="tooltip-success" data-rel="tooltip" title="Edit">
															<span class="green">
																<i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
															</span>
                                                </a>
                                            </li>

                                            <li>
                                                <a href="#" class="tooltip-error" data-rel="tooltip" title="Delete">
															<span class="red">
																<i class="ace-icon fa fa-trash-o bigger-120"></i>
															</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </td>
                        </tr>

                        <tr class="detail-row">
                            <td colspan="8">
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
                                                            <span class="white">猪八戒</span>
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="col-xs-12 col-sm-7">
                                            <div class="space visible-xs"></div>

                                            <div class="profile-user-info profile-user-info-striped">
                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 姓名 </div>
                                                    <div class="profile-info-value">
                                                        <span>猪八戒</span>
                                                    </div>
                                                    <div class="profile-info-name"> 用户账户 </div>
                                                    <div class="profile-info-value">
                                                        <span>zhubajie</span>
                                                    </div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 出生日期 </div>
                                                    <div class="profile-info-value">
                                                        <span>1990-01-01</span>
                                                    </div>
                                                    <div class="profile-info-name"> 性别 </div>
                                                    <div class="profile-info-value">
                                                        <span>男</span>
                                                    </div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 手机号 </div>
                                                    <div class="profile-info-value">
                                                        <span>13901234567</span>
                                                    </div>
                                                    <div class="profile-info-name"> 办公地址 </div>
                                                    <div class="profile-info-value">
                                                        <i class="fa fa-map-marker light-orange bigger-110"></i>
                                                        <span>北京市大兴区亦庄经济开发区</span>
                                                    </div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 入职日期  </div>
                                                    <div class="profile-info-value">
                                                        <span>2010-06-20</span>
                                                    </div>
                                                    <div class="profile-info-name"> 职务 </div>
                                                    <div class="profile-info-value">
                                                        <span>销售总监</span>
                                                    </div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 邮箱地址 </div>
                                                    <div class="profile-info-value">
                                                        <span>hedaliangvip@gmail.com</span>
                                                    </div>
                                                    <div class="profile-info-name"> 账户状态 </div>
                                                    <div class="profile-info-value">
                                                        <span class="label label-sm label-success">正常</span>
                                                    </div>
                                                </div>

                                                <div class="profile-info-row">
                                                    <div class="profile-info-name"> 创建时间 </div>
                                                    <div class="profile-info-value">
                                                        <span>2010-06-20 20:20:20</span>
                                                    </div>
                                                    <div class="profile-info-name"> 更新时间 </div>
                                                    <div class="profile-info-value">
                                                        <span>2010-06-20 20:20:20</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-12 col-sm-3">
                                            <div class="space visible-xs"></div>
                                            <h4 class="header blue lighter less-margin">修改密码</h4>
                                            <div class="space-6"></div>
                                            <form>
                                                <fieldset>
                                                    <input type="password" id="form-field-2" placeholder="请输入密码" class="col-xs-10 col-sm-12" />
                                                </fieldset>
                                                </br>
                                                <fieldset>
                                                    <input type="password" id="form-field-2" placeholder="请再次输入密码" class="col-xs-10 col-sm-12" />
                                                </fieldset>
                                                <div class="hr hr-dotted"></div>
                                                <div class="clearfix">
                                                    <label class="pull-left">
                                                        <input type="checkbox" class="ace" />
                                                        <span class="lbl"> 发送邮件通知</span>
                                                    </label>

                                                    <button class="pull-right btn btn-sm btn-primary btn-white btn-round" type="button">
                                                        提交
                                                        <i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
                                                    </button>
                                                </div>
                                            </form>
                                        </div>
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
</div><!-- /.page-content -->
</div>

<!-- page specific plugin scripts -->
<script src="/assets/js/jquery.dataTables.min.js"></script>
<script src="/assets/js/jquery.dataTables.bootstrap.min.js"></script>
<script src="/assets/js/dataTables.buttons.min.js"></script>

<!-- ace scripts -->
<script src="/assets/js/ace.min.js"></script>
<script src="/js/lib/layer/layer.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">
    jQuery(function($) {
        /***************/
        $('.show-details-btn').on('click', function(e) {
            e.preventDefault();
            $(this).closest('tr').next().toggleClass('open');
            $(this).find(ace.vars['.icon']).toggleClass('fa-angle-double-down').toggleClass('fa-angle-double-up');
        });
        /***************/
    })
</script>