<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/11/1
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <form action="Servlet04Demo" method="get">
            <table>
                <tr>
                    <td>请输入姓名</td>
                    <td>
                    <input type="text" name="name">
                    </td>
                </tr>
                <tr>
                    <td>请选择性别</td>
                    <td>
                        <input type="radio" name="sex" value="男">男
                        <input type="radio" name="sex" value="女">女
                    </td>
                </tr>
                <tr>
                    <td>请输入出生年月</td>
                    <td>
                        <input type="date" name="birthday">
                    </td>
                </tr>
                <tr>
                    <td>请输入名族</td>
                    <td>
                        <input type="text" name="civ">
                    </td>
                </tr>
                <tr>
                    <td>请输入个人介绍</td>
                    <td>
                        <input type="text" name="intro">
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" name="注册"/></td>
                    <td><input type="reset"  name="重置"/></td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
