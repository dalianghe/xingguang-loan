<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>星光钱包-任务调度系统</title>
    <link rel="stylesheet" type="text/css" href="/plugin/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/plugin/themes/icon.css">
    <script type="text/javascript" src="/plugin/jquery.min.js"></script>
    <script type="text/javascript" src="/plugin/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/plugin/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/plugin/commons.js"></script>
</head>
<body>
<div align="center">

    <div style="margin:130px 0;"></div>
    <h2>星光钱包-任务调度系统</h2>
    <div class="easyui-panel" title="用户登陆" style="width:400px">
        <div style="padding:10px 60px 20px 60px">
            <form id="ff" method="post">
                <table cellpadding="5">
                    <tr>
                        <td>用户名：</td>
                        <td><input class="easyui-textbox" type="text" name="account" data-options="required:true"></input></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input class="easyui-textbox" type="password" name="password" data-options="required:true"></input></td>
                    </tr>
                </table>
            </form>
            <div id="message" style="color: red"></div>
            <div style="text-align:center;padding:5px">
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">登陆</a>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清空</a>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" color="0,22,255" opacity='0.7' zIndex="-2" count="300" src="//cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
<script>
    function submitForm(){
        //var res = $('#ff').form('submit');
        $.ajax({
            url: "/login",
            type: "POST",
            contentType: "application/x-www-form-urlencoded",
            data : $("#ff").serialize(),
            dataType: "json",
            timeout: 10000,
            success: function (data) {
                if(data.sysCode==0){ // 系统正常返回
                    if(data.bizCode==0){ // 业务处理通过
                        window.location.href = "/index";
                    }else{
                        $("#message").html("用户名密码错误！").show(300).delay(3000).hide(300);
                    }
                }
            },
            fail: function (err) {
                console.log(err)
            }
        })
    }
    function clearForm(){
        $('#ff').form('clear');
    }
</script>
</body>
</html>
