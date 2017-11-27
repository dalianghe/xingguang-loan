<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<input type="button" value="获取图片" onclick="pullImg()"/>

<img id="img" src=""/>


<script src="/assets/js/jquery-2.1.4.min.js"></script>
<script>
    jQuery(function($) {
        var data={
            location:"39.9588,116.3227",
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
                //toStr=getFormatJsonStrFromString(toStr);
                console.log(toStr);
            },
            error : function(err){alert("服务端错误，请刷新浏览器后重试")}
        });


    });

    function pullImg(){
        /*$.ajax({
            url: "/test1",
            type: "GET",
            contentType: "application/json",
            data : null,
            dataType: "json",
            timeout: 10000,
            success: function (result) {
                console.log(result);
                $("#img").attr("src","data:image/png;base64,"+result.data);
            }
        })*/
    }
</script>
</body>
</html>