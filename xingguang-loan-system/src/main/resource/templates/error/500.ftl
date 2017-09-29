        <div class="error-container">
            <div class="well">
                <h1 class="grey lighter smaller">
											<span class="blue bigger-125">
												<i class="icon-random"></i>
												500
											</span>
                    系统发生内部错误
                </h1>
                <hr />
                <h3 class="lighter smaller">
                    我们正在努力的进行修复！
                </h3>
                <div class="space"></div>
                <div>
                    <h4 class="lighter smaller">遇到此种情况, 请按以下步骤进行处理：</h4>
                    <ul class="list-unstyled spaced inline bigger-110 margin-15">
                        <li>
                            <i class="icon-hand-right blue"></i>
                            关闭当前界面重新登陆
                        </li>
                        <li>
                            <i class="icon-hand-right blue"></i>
                            联系系统管理员反馈问题！
                        </li>
                    </ul>
                </div>

                <hr />
                <div class="space"></div>

                <div class="center">
                    <!--<a href="#" class="btn btn-grey">
                        <i class="icon-arrow-left"></i>
                        Go Back
                    </a>-->
                    <a href="#" class="btn btn-primary" onclick="toLogin()">
                        <i class="icon-dashboard"></i>
                        重新登陆
                    </a>
                </div>
            </div>
        </div>

        <script>
            function toLogin(){
                window.location.href = "/system/login";
            }
        </script>