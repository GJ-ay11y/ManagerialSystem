<%--
  Created by IntelliJ IDEA.
  User: gj
  Date: 2020-06-10
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>合同列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <!-- 1. 导入CSS的全局样式 -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>合同列表 —— 显示所有合同</small>
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
                    <th>房东</th>
                    <th>租客</th>
                    <th>起租时间</th>
                    <th>退租时间</th>
                    <th>交租时间</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="hetong" items="${p.list}">
                    <tr>
                        <td>${hetong.getHouse_id()}</td>
                        <td>${hetong.getAddress()}</td>
                        <td>${hetong.getChuzu()}</td>
                        <td>${hetong.getZuke()}</td>
                        <td>${hetong.getFromdate()}</td>
                        <td>${hetong.getTodate()}</td>
                        <td>${hetong.getPayday()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/page/toUpdateHetong?id=${hetong.getId()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/page/deletehetong/${hetong.getId()}">删除</a> |
                            <a href="${pageContext.request.contextPath}/page/HetongMessage?id=${hetong.getId()}">详细合同</a>
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
                        <a href="${pageContext.request.contextPath}/page/hetonglist?pageNum=${p.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>

                </li>


                <c:forEach begin="1" end="${p.pages}" var="i" >

                    <!--判断页码-->
                    <c:if test="${p.pageNum == i}">
                        <li class="active"><a href="${pageContext.request.contextPath}/page/hetonglist?pageNum=${i}">${i}</a></li>
                    </c:if>
                    <c:if test="${p.pageNum != i}">
                        <li><a href="${pageContext.request.contextPath}/page/hetonglist?pageNum=${i}">${i}</a></li>
                    </c:if>

                </c:forEach>

                <!--下一页-->
                <li>
                    <a href="${pageContext.request.contextPath}/page/hetonglist?pageNum=${p.pageNum+1}" aria-label="Next">
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
