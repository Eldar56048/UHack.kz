<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 31.10.2020
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%> <%--There we include header--%>
<form method="post" action="login">
    <h2 class="name" style="margin: 10px 0;">Hello${" "}${sessionScope.User.name}</h2>
    <input type="hidden" name="action" value="logout">
    <button type="submit" class="btn btn-danger">Logout</button>
</form>
<%@include file="footer.jsp"%> <%--There we include header--%>
