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
    <!-- 菜单列表 -->
    <li class="" v-for="(menu,index) in menus" :class="{'active':!index}" v-on:click="router">
        <a href="#" :id="menu.id" class="dropdown-toggle" :title="menu.resUrl">
            <i :class="menu.menuIcon"></i>
            <span class="menu-text"> {{menu.resName}} </span>
            <b class="arrow fa fa-angle-down" v-if="menu.subMenus.length > 1"></b>
        </a>
        <b class="arrow"></b>
        <ul class="submenu" v-if="menu.subMenus.length > 1">
            <li class="" v-for="sub in menu.subMenus" v-on:self="router">
                <a href="#" :id="sub.id" :title="sub.resUrl">
                    <i class="menu-icon fa fa-caret-right"></i>
                    {{sub.resName}}
                </a>
                <b class="arrow"></b>
            </li>
        </ul>
    </li>
</ul><!-- /.nav-list -->

<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
    <i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
</div>

<script src="/js/lib/vue/vue.min.js"></script>

<script>
    // 定义参数json串
    var loginJson = {"userId":"${id}"};

    var app = new Vue({
        el: '#menuUl',
        data: {
            menus: ""
        },
        created : function(){
            var that=this;
            $.ajax({
                url: "/system/menus",
                type: "GET",
                contentType: "application/json",
                data : {jsonData:JSON.stringify(loginJson)},
                dataType: "json",
                timeout: 10000,
                success: function (result) {
                    console.log(result);
                    console.log(result.data);
                    if(result.sysCode==0){
                        if(result.bizCode==0){
                            that.menus = result.data;
                        }
                    }
                },
                fail: function (err) {
                    console.log(err)
                }
            })
        },
        methods : {
            router : function(event){
                var id = event.target.id
                var url = event.target.title;
                $("#menuUl").find("li").removeClass("active");
                $("#"+id).parent().parent().parent().addClass("open active");
                $("#"+id).parent().addClass("active");
                if(url != ""){
                    $("#main").empty();
                    $("#main").load(url+"?"+(new Date()).getTime(),function(response,status,xhr){
                        if(response.match("^\{(.+:.+,*){1,}\}$")){
                            var result = $.parseJSON(response);
                            if(result.sysCode==0){
                                if(result.bizCode==1){
                                    $("#main").load("/error/500");
                                }
                            }
                        }
                    });
                }
            }
        }
    });

</script>