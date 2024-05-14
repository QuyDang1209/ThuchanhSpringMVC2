<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 5/13/2024
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>ADDRESS</th>
        <th>ACTION</th>
    </tr>
    <c:forEach items="${customer}" var="cus">
        <tr>
            <td>${cus.id}</td>
            <td>${cus.name}</td>
            <td>${cus.email}</td>
            <td>${cus.address}</td>
            <td>
                <a href="/customer?acction=infor&id=${cus.id}">edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
</form>
</body>
</html>
