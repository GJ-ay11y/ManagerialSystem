<%--
  Created by IntelliJ IDEA.
  User: gj
  Date: 2020-06-08
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>房屋租赁系统</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>


</head>
<body>
<div class="wrapper">

    <div class="container">
        <h1>房屋租赁系统</h1>
        <form class="form" id="loginform" action="${pageContext.request.contextPath}/login/owner" method="post">
            <div>
                <span id="info"></span>
                <label>
                    <input type="text" name="username" placeholder="用户名" >
                </label>
            </div>
            <div>
                <label>
                    <input type="password" name="password" placeholder="密码" >
                </label>
            </div>
            <button type="submit" id="login-button">登录</button>
        </form>
    </div>

    <ul class="bg-bubbles">
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ul>

</div>

<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript"
        src="js/localization/messages_zh.js"></script>
<script type="text/javascript">
    $().ready(function() {
        // 在键盘按下并释放及提交后验证提交表单
        $("#loginform").validate({
            rules : {
                username : {
                    required : true,
                },

                password : {
                    required : true,

                },

            },
            messages : {
                username : {
                    required : "请输入用户名",
                },

                password : {
                    required : "请输入密码",

                },

            }
        });
    })


</script>
</body>
</html>
