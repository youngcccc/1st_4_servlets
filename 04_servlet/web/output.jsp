<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/11/1
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <table>
            <p>姓   名:<%=request.getAttribute("name") %></p>
            <p>性   别:<%=request.getAttribute("sex") %></p>
            <p>生   日:<%=request.getAttribute("birthday") %></p>
            <p>名   族:<%=request.getAttribute("civ") %></p>
            <p>介   绍:<%=request.getAttribute("intro") %></p>
        </table>
    </center>
</body>
</html>
