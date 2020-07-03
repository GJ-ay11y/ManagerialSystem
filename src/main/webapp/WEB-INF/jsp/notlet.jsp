<%--
  Created by IntelliJ IDEA.
  User: gj
  Date: 2020-06-09
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>房源列表</title>
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
                    <small>房源列表 —— 在租列表</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>房屋id</th>
                    <th>地址</th>
                    <th>面积</th>
                    <th>价格</th>
                    <th>状态</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="house" items="${p.list}">
                    <tr>
                        <td>${house.getHouseid()}</td>
                        <td>${house.getAddress()}</td>
                        <td>${house.getArea()}</td>
                        <td>${house.getPrice()}</td>
                        <td>${house.getStatus()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/page/toUpdate?id=${house.getId()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/page/delete/${house.getId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <div>
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <c:if test="${p.pageNum == 1}">
                <li class="disabled">
                    </c:if>

                    <c:if test="${p.pageNum != 1}">
                <li>
                    </c:if>

                    <!--上一页-->
                    <c:if test="${p.pageNum >1}">
                        <a href="${pageContext.request.contextPath}/page/houselist?pageNum=${p.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>

                </li>


                <c:forEach begin="1" end="${p.pages}" var="i" >

                    <!--判断页码-->
                    <c:if test="${p.pageNum == i}">
                        <li class="active"><a href="${pageContext.request.contextPath}/page/houselist?pageNum=${i}">${i}</a></li>
                    </c:if>
                    <c:if test="${p.pageNum != i}">
                        <li><a href="${pageContext.request.contextPath}/page/houselist?pageNum=${i}">${i}</a></li>
                    </c:if>

                </c:forEach>

                <!--下一页-->
                <li>
                    <a href="${pageContext.request.contextPath}/page/houselist?pageNum=${p.pageNum+1}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                <span style="font-size: 25px;margin-left: 5px;">
                    共${p.total}条记录，共${p.pages}页
                </span>

            </ul>
        </nav>
    </div>
</div>
</body>
</html>