<%--
  Created by IntelliJ IDEA.
  User: gj
  Date: 2020-06-11
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>交租列表</title>
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
                    <small>租金列表 —— 显示所有租金信息</small>
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
                    <th>租金</th>
                    <th>约定交租日</th>
                    <th>实际交租日</th>
                    <th>租客姓名</th>
                    <th>当月是否交租</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="allpaid" items="${p.list}">
                    <tr>
                        <td>${allpaid.getHouse_id()}</td>
                        <td>${allpaid.getAddress()}</td>
                        <td>${allpaid.getPrice()}</td>
                        <td>${allpaid.getDate()}</td>
                        <td>${allpaid.getPaydate()}</td>
                        <td>${allpaid.getName()}</td>
                        <td>${allpaid.getStatus()}</td>
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
                        <a href="${pageContext.request.contextPath}/page/allpaid?pageNum=${p.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>

                </li>


                <c:forEach begin="1" end="${p.pages}" var="i" >

                    <!--判断页码-->
                    <c:if test="${p.pageNum == i}">
                        <li class="active"><a href="${pageContext.request.contextPath}/page/allpaid?pageNum=${i}">${i}</a></li>
                    </c:if>
                    <c:if test="${p.pageNum != i}">
                        <li><a href="${pageContext.request.contextPath}/page/allpaid?pageNum=${i}">${i}</a></li>
                    </c:if>

                </c:forEach>

                <!--下一页-->
                <li>
                    <a href="${pageContext.request.contextPath}/page/allpaid?pageNum=${p.pageNum+1}" aria-label="Next">
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