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
    function pullImg(){
        $.ajax({
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
        })
    }
</script>
</body>
</html>