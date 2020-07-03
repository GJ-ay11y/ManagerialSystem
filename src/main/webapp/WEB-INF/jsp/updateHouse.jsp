<%--
  Created by IntelliJ IDEA.
  User: gj
  Date: 2020-06-09
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改信息</title>
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
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/page/update" method="post">
        <input type="hidden" name="id" value="${house.getId()}"/>
        房屋id：<input type="text" name="houseid" value="${house.getHouseid()}"/>
        地址：<input type="text" name="address" value="${house.getAddress()}"/>
        面积：<input type="text" name="area" value="${house.getArea()}"/>
        价格：<input type="text" name="price" value="${house.getPrice()}"/>
        状态：<input type="text" name="status" value="${house.getStatus()}"/>
        <input type="submit" value="提交"/>
    </form>

</div>
</body>
</html>

