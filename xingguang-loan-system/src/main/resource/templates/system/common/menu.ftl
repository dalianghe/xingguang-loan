<div class="sidebar-shortcuts" id="sidebar-shortcuts">
    <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
        <button class="btn btn-success">
            <i class="ace-icon fa fa-signal"></i>
        </button>

        <button class="btn btn-info">
            <i class="ace-icon fa fa-pencil"></i>
        </button>

        <button class="btn btn-warning">
            <i class="ace-icon fa fa-users"></i>
        </button>

        <button class="btn btn-danger">
            <i class="ace-icon fa fa-cogs"></i>
        </button>
    </div>

    <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
        <span class="btn btn-success"></span>

        <span class="btn btn-info"></span>

        <span class="btn btn-warning"></span>

        <span class="btn btn-danger"></span>
    </div>
</div><!-- /.sidebar-shortcuts -->

<ul id="menuUl" class="nav nav-list">
    <li class="active">
        <a href="#" url="/common/500">
            <i class="menu-icon fa fa-tachometer"></i>
            <span class="menu-text"> 控制台 </span>
        </a>
        <b class="arrow"></b>
    </li>

    <!-- 菜单列表 -->
    <li class="">
        <a href="#" class="dropdown-toggle">
            <i class="menu-icon fa fa-cog"></i>
            <span class="menu-text"> 系统设置 </span>
            <b class="arrow fa fa-angle-down"></b>
        </a>
        <b class="arrow"></b>
        <ul class="submenu">
            <li class="">
                <a href="#" url="/system/users">
                    <i class="menu-icon fa fa-caret-right"></i>
                    用户管理
                </a>
                <b class="arrow"></b>
            </li>
            <li class="">
                <a href="#" url="system/role/role.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    角色管理
                </a>
                <b class="arrow"></b>
            </li>
            <li class="">
                <a href="#" url="system/role/role.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    资源管理
                </a>
                <b class="arrow"></b>
            </li>
        </ul>
    </li>
    <li class="">
        <a href="#" class="dropdown-toggle">
            <i class="menu-icon fa fa-user"></i>
            <span class="menu-text"> 客户管理 </span>
            <b class="arrow fa fa-angle-down"></b>
        </a>
        <b class="arrow"></b>
        <ul class="submenu">
            <li class="">
                <a href="#" url="system/user/userlist.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    客户查询
                </a>
                <b class="arrow"></b>
            </li>
            <li class="">
                <a href="#" url="system/role/role.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    客户维护
                </a>
                <b class="arrow"></b>
            </li>
        </ul>
    </li>
    <li class="">
        <a href="#" class="dropdown-toggle">
            <i class="menu-icon fa fa-key"></i>
            <span class="menu-text"> 初审管理 </span>
            <b class="arrow fa fa-angle-down"></b>
        </a>
        <b class="arrow"></b>
        <ul class="submenu">
            <li class="">
                <a href="#" url="system/user/userlist.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    初审审核
                </a>
                <b class="arrow"></b>
            </li>
            <li class="">
                <a href="#" url="system/role/role.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    我的已办
                </a>
                <b class="arrow"></b>
            </li>
        </ul>
    </li>
    <li class="">
        <a href="#" class="dropdown-toggle">
            <i class="menu-icon fa fa-gavel"></i>
            <span class="menu-text"> 终审管理 </span>
            <b class="arrow fa fa-angle-down"></b>
        </a>
        <b class="arrow"></b>
        <ul class="submenu">
            <li class="">
                <a href="#" url="system/user/userlist.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    终审审核
                </a>
                <b class="arrow"></b>
            </li>
            <li class="">
                <a href="#" url="system/role/role.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    我的已办
                </a>
                <b class="arrow"></b>
            </li>
        </ul>
    </li>
    <li class="">
        <a href="#" class="dropdown-toggle">
            <i class="menu-icon fa fa-pencil-square-o"></i>
            <span class="menu-text"> 合同管理 </span>
            <b class="arrow fa fa-angle-down"></b>
        </a>
        <b class="arrow"></b>
        <ul class="submenu">
            <li class="">
                <a href="#" url="system/user/userlist.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    合同管理
                </a>
                <b class="arrow"></b>
            </li>
        </ul>
    </li>
    <li class="">
        <a href="#" class="dropdown-toggle">
            <i class="menu-icon fa fa-check-square-o"></i>
            <span class="menu-text"> 财务管理 </span>
            <b class="arrow fa fa-angle-down"></b>
        </a>
        <b class="arrow"></b>
        <ul class="submenu">
            <li class="">
                <a href="#" url="system/user/userlist.html">
                    <i class="menu-icon fa fa-caret-right"></i>
                    放款管理
                </a>
                <b class="arrow"></b>
            </li>
        </ul>
    </li>

</ul><!-- /.nav-list -->

<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
    <i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
</div>

<script src="/assets/js/ace-elements.min.js"></script>
<script src="/assets/js/ace.min.js"></script>

<script>

    $(document).ready(function(){

        // 遍历一级菜单名绑定点击事件
        $("#menuUl").children("li").each(function(index){
            // 是否有二级菜单
            var hasSubMenu = $(this).children("ul").length==0 ? false : true;
            if(hasSubMenu){
                $(this).click(function() {
                    $(this).siblings().removeClass("active");
                    $(this).addClass("active");
                    $(this).children("ul").children("li").each(function(){
                        $(this).unbind("click");
                        $(this).click(function(){
                            $(this).siblings().removeClass("active");
                            $(this).addClass("active");
                            var url = $(this).children().attr("url");
                            $("#main").load(url,function(response,status,xhr){
                                console.log(response.bizCode);
                                if(response.match("^\{(.+:.+,*){1,}\}$")){
                                    var result = $.parseJSON(response);
                                    if(result.sysCode==0){
                                        if(result.bizCode==1){
                                            $("#main").load("/common/500");
                                        }
                                    }
                                }
                            });
                        })
                    })
                    $(this).siblings("li").children("ul").children("li").removeClass("active");
                })
            }else{
                $(this).click(function() {
                    $(this).siblings("li").removeClass("active");
                    $(this).siblings("li").children("ul").children("li").removeClass("active");
                    $(this).addClass("active");
                    var url = $(this).children().attr("url");
                    console.log("url="+url);
                    $("#main").load(url,function(response,status,xhr){
                        console.log(response.bizCode);
                        if(response.match("^\{(.+:.+,*){1,}\}$")){
                            var result = $.parseJSON(response);
                            if(result.sysCode==0){
                                if(result.bizCode==1){
                                    $("#main").load("/common/500");
                                }
                            }
                        }
                    });
                })
            }
        })
    })

</script>