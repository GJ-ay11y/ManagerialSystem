<%--
  Created by IntelliJ IDEA.
  User: gj
  Date: 2020-06-11
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>房屋租赁系统</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/modernizr.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui-datepicker.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui.css"/>
    <style>


        .error {

            font-size:13px;
            color: red;

        }

    </style>
    <script type="text/javascript">
        $().ready(function() {
            // 在键盘按下并释放及提交后验证提交表单

            $("#date").datepicker();
            $("#myform").validate({

                rules : {
                    date:{
                        required:true,
                    },
                    price:{
                        required:true,
                        min:1
                    }
                },
                messages : {
                    date:{
                        required:"租金交付截止日期不能为空",
                    },
                    price:{
                        required:"应缴租金不能为空",
                        min:"请输入正确的租金"
                    }
                }
            });
        })


    </script>

</head>
<body>

<div class="result-title">
    <h1>添加收租信息</h1>
</div>
<div class="result-content">
    <div class="sidebar-title">
        <form action="${pageContext.request.contextPath}/page/addpaid" method="post" >
            <table class="insert-tab" width="100%">
                <tbody>
                <th><i class="require-red">*</i>房屋id：</th>
                <td>
                    <input class="common-text required" property="房屋id" id="house_id" name="house_id" size="50" type="text">
                </td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>地址：</th>
                    <td><input class="common-text" name="address" property="地址" id="address" size="50" type="text" ></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>租客姓名：</th>
                    <td><input class="common-text" name="name" property="租客姓名" id="name" size="50" type="text"></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>租客id：</th>
                    <td><input class="common-text" name="userlist_id" property="租客id" id="userlist_id" size="50" type="text"></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>租金交付截止日期：</th>
                    <td><input class="common-text" name="date" property="租金交付截止日期" id="date" size="50" type="text"></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>应缴租金：</th>
                    <td><input class="common-text" name="price" property="应缴租金" id="price" size="50" type="text"></td>
                </tr>
                    <th></th>
                    <td>
                        <input class="btn btn-primary btn6 mr10" value="提交" type="submit">
                        <input class="btn btn6" onclick="history.go(-1)" value="返回" type="button">
                    </td>
                </tr>
                </tbody></table>
        </form>
    </div>
</div>

</body>
</html>