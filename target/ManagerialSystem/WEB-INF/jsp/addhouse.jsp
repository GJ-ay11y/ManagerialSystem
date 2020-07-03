<%--
  Created by IntelliJ IDEA.
  User: gj
  Date: 2020-06-09
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>新增房源</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增房源</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/page/addhouse" method="post">
        房屋id：<input type="text" name="houseid"><br><br><br>
        地址：<input type="text" name="address"><br><br><br>
        面积：<input type="text" name="area"><br><br><br>
        价格：<input type="text" name="price"><br><br><br>
        状态：<input type="text" name="status"><br><br><br>
        <input type="submit" value="添加">
    </form>
</div>
</body>
</html>
