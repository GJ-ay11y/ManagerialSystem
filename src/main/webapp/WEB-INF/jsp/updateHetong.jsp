<%--
  Created by IntelliJ IDEA.
  User: gj
  Date: 2020-06-10
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改合同信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/modernizr.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui-datepicker.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui.css"/>
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改合同信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/page/updatehetong" method="post" >
        <table class="insert-tab" width="100%">
            <tbody>
            <input type="hidden" name="id" value="${heTong.getId()}"/>
            <th><i class="require-red">*</i>房屋id：</th>
            <td>
                <input class="common-text " value ="${heTong.getHouse_id()}" id="house_id" name="house_id" size="50" type="text">
            </td>
            </tr>
            <tr>
                <th><i class="require-red">*</i>地址：</th>
                <td><input class="common-text" name="address" value ="${heTong.getAddress()}" id="address" size="50" type="text"></td>
            </tr>
            <tr>
                <th><i class="require-red">*</i>出租方（甲方）：</th>
                <td><input class="common-text" name="chuzu" value ="${heTong.getChuzu()}" id="chuzu" size="50" type="text" ></td>
            </tr>
            <tr>
                <th><i class="require-red">*</i>出租方（甲方）证件号码：</th>
                <td><input class="common-text" name="chuzu_idcard" value ="${heTong.getChuzu_idcard()}" id="chuzu_idcard" size="50" type="text"></td>
            </tr>
            <tr>
                <th><i class="require-red">*</i>承租方（乙方）：</th>
                <td><input class="common-text" name="zuke" value ="${heTong.getZuke()}" id="zuke" size="50" type="text"></td>
            </tr>
            <tr>
                <th><i class="require-red">*</i>承租方（乙方）证件号码：</th>
                <td><input class="common-text" name="zuke_idcard" value ="${heTong.getZuke_idcard()}" id="zuke_idcard" size="50" type="text"></td>
            </tr>
            <tr>
                <th><i class="require-red">*</i>起租时间：</th>
                <td><input class="common-text" name="fromdate" id="fromdate" value ="${heTong.getFromdate()}" size="50"  type="text"></td>
            </tr>
            <tr>
                <th><i class="require-red">*</i>退租时间：</th>
                <td><input class="common-text" name="todate" id="todate" value ="${heTong.getTodate()}" size="50"  type="text" ></td>
            </tr>
            <tr>
                <th><i class="require-red">*</i>每月租金：</th>
                <td><input class="common-text" name="price" id="price" value ="${heTong.getPrice()}" size="50"  type="text" ></td>
            </tr>
            <tr>
                <th><i class="require-red">*</i>每月交租日（数字）：</th>
                <td><input class="common-text" name="payday" id="payday" value ="${heTong.getPayday()}" size="50"  type="text" ></td>
            </tr>
            <tr>
                <th></th>
                <td>
                    <input class="btn btn-primary btn6 mr10" value="确认修改" type="submit">
                    <input class="btn btn6" onclick="history.go(-1)" value="返回" type="button">
                </td>
            </tr>
            </tbody></table>
    </form>

</div>
</body>
</html>

