<link href="/js/lib/jsonformater/jsonFormater.css" type="text/css" rel="stylesheet"/>
<link href="/js/lib/jsonformater/demo.css" type="text/css" rel="stylesheet"/>
<div class="main-content-inner">
    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
        <ul class="breadcrumb">
            <li>
                <i class="ace-icon fa fa-home home-icon"></i>
                <a href="#">控制台</a>
            </li>
            <li>
                <a href="#">系统工具</a>
            </li>
            <li class="active">位置定位</li>
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

        <div class="page-header">
            <h1>
                <small>
                    <i class="ace-icon fa fa-angle-double-right"></i>
                    经纬度转换
                </small>
            </h1>
        </div><!-- /.page-header -->
        <div style="margin-bottom: 20px;">
            经度：<input type="text" id="lng"/>&nbsp;&nbsp;&nbsp;&nbsp;纬度：<input type="text" id="lat"/>&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="Button" value="转换" id='convert' onclick="convert()"/>
        </div>
        <div class="HeadersRow">
            <div class="title">位置信息：</div>
            <textarea id="RawJson"></textarea>
        </div>
        <div id="ControlsRow">
            <input type="Button" value="格式化" id='format'/>
            <span id="TabSizeHolder">
                缩进量
                <select id="TabSize">
                    <option value="1">1</option>
                    <option value="2" selected>2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                </select>
              </span>
            <input type="checkbox" id="QuoteKeys" checked='checked' />
            <label for="QuoteKeys">
                引号
            </label>&nbsp;
            <input type="checkbox" id="CollapsibleView" checked='checked' />
            <label for="CollapsibleView">
                显示控制
            </label>
            <span id="CollapsibleViewDetail">
                <a href="javascript:void(0);" id="expandAll">展开</a>
                <a href="javascript:void(0);" id="collapseAll">叠起</a>
                <a href="javascript:void(0);" class="expand" data-level="3">2级</a>
                <a href="javascript:void(0);" class="expand" data-level="4">3级</a>
                <a href="javascript:void(0);" class="expand" data-level="5">4级</a>
                <a href="javascript:void(0);" class="expand" data-level="6">5级</a>
                <a href="javascript:void(0);" class="expand" data-level="7">6级</a>
                <a href="javascript:void(0);" class="expand" data-level="8">7级</a>
                <a href="javascript:void(0);" class="expand" data-level="9">8级</a>
              </span>
        </div>
        <div id="Canvas" class="Canvas"></div>
    </div>

</div>
<script src="/js/lib/jsonformater/jsonFormater.js" type="text/javascript"></script>
<script type="application/javascript">

    function convert(){
        var lng = $("#lng").val();
        var lat = $("#lat").val();
        var data={
            location:""+lat+","+lng+"",
            /*换成自己申请的key*/
            key:"KXUBZ-HANCF-H4EJY-J4KUH-GXT5Q-67FM5",
            get_poi:0
        }
        var url="http://apis.map.qq.com/ws/geocoder/v1/?";
        data.output="jsonp";
        $.ajax({
            type:"get",
            dataType:'jsonp',
            data:data,
            jsonp:"callback",
            jsonpCallback:"QQmap",
            url:url,
            success:function(json){
                /*json对象转为文本 var aToStr=JSON.stringify(a);*/
                var toStr = JSON.stringify(json);
                $("#RawJson").html(toStr);
            },
            error : function(err){alert("服务端错误，请刷新浏览器后重试")}
        });
    }

    (function () {
        var format = function () {
            var options = {
                dom: document.getElementById('Canvas'),
                isCollapsible: document.getElementById('CollapsibleView').checked,
                quoteKeys: document.getElementById('QuoteKeys').checked,
                tabSize: document.getElementById('TabSize').value
            };
            window.jf = new JsonFormatter(options);
            jf.doFormat(document.getElementById('RawJson').value);
        };
        document.getElementById('format').addEventListener('click', function() {
            format();
        });
        document.getElementById('expandAll').addEventListener('click', function() {
            window.jf.expandAll();
        });
        document.getElementById('collapseAll').addEventListener('click', function() {
            window.jf.collapseAll();
        });
        var x = document.querySelectorAll('#TabSize, #CollapsibleView, #QuoteKeys');
        Array.prototype.forEach.call(x, function(el, i) {
            el.addEventListener('change', function () {
                format();
            });
        });
    })();
</script>