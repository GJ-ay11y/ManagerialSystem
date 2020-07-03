<%--
  Created by IntelliJ IDEA.
  User: gj
  Date: 2020-06-10
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
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
            $("#fromdate").datepicker();
            $("#todate").datepicker();
            $("#myform").validate({

                rules : {
                    house_id : {
                        required : true,
                    },

                    address : {
                        required : true,

                    },
                    chuzu : {
                        required : true,


                    },
                    price: {
                        required : true,
                        min: 1

                    },
                    chuzu_idcard: {
                        required : true,


                    },
                    zuke: {
                        required : true,


                    },
                    zuke_idcard: {
                        required : true,


                    },
                    fromdate: {
                        required : true,
                    },
                    todate: {
                        required : true,
                    },
                    payday: {
                        required : true,
                        min:0,
                        max:31,
                    }

                },
                messages : {
                    house_id : {
                        required : "房屋id不能为空",
                    },

                    address : {
                        required : "房屋地址不能为空",

                    },
                    chuzu : {
                        required : "出租方不能为空",


                    },
                    price: {
                        required : "租金不能为空",
                        min: "请输入正确的租金"

                    },
                    chuzu_idcard: {
                        required : "出租方证件号不能为空",


                    },
                    zuke: {
                        required : "承租方不能为空",


                    },
                    zuke_idcard: {
                        required : "承租方证件号不能为空",


                    },
                    fromdate: {
                        required : "起租时间不能为空",
                    },
                    todate: {
                        required : "退租时间不能为空",
                    },
                    payday: {
                        required : "每月交租日不能为空",
                        min:"每月交租日必须大于0",
                        max:"每月交租日必须小于31",
                    }

                }
            });
        })


    </script>

</head>
<body>

<div class="result-title" style="text-align: center">
    <h1>添加合同信息，请确定合同信息正确无误再提交！</h1>
</div>
<div class="result-content">
    <div class="sidebar-title">
        <form action="${pageContext.request.contextPath}/page/addhetong" method="post" >
            <table class="insert-tab" width="100%">
                <tbody>
                <th><i class="require-red">*</i>房屋id：</th>
                <td>
                    <input class="common-text " placeholder="房屋id" id="house_id" name="house_id" size="50" type="text">
                </td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>地址：</th>
                    <td><input class="common-text" name="address" placeholder="地址" id="address" size="50" type="text"></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>出租方（甲方）：</th>
                    <td><input class="common-text" name="chuzu" placeholder="出租方（甲方）" id="chuzu" size="50" type="text" ></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>出租方（甲方）证件号码：</th>
                    <td><input class="common-text" name="chuzu_idcard" placeholder="出租方（甲方）证件号码" id="chuzu_idcard" size="50" type="text"></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>承租方（乙方）：</th>
                    <td><input class="common-text" name="zuke" placeholder="承租方（乙方）" id="zuke" size="50" type="text"></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>承租方（乙方）证件号码：</th>
                    <td><input class="common-text" name="zuke_idcard" placeholder="承租方（乙方）证件号码" id="zuke_idcard" size="50" type="text"></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>起租时间：</th>
                    <td><input class="common-text" name="fromdate" id="fromdate" placeholder="起租时间" size="50"  type="text"></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>退租时间：</th>
                    <td><input class="common-text" name="todate" id="todate" placeholder="退租时间" size="50"  type="text" ></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>每月租金：</th>
                    <td><input class="common-text" name="price" id="price" placeholder="每月租金" size="50"  type="text" ></td>
                </tr>
                <tr>
                    <th><i class="require-red">*</i>每月交租日（数字）：</th>
                    <td><input class="common-text" name="payday" id="payday" placeholder="每月交租日（数字）" size="50"  type="text" ></td>
                </tr>
                <tr>
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
