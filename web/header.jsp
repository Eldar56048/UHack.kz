<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 31.10.2020
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${sessionScope.User==null}">
    <c:redirect  url="index.jsp"></c:redirect>
</c:if>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Авторизация и регистрация</title>
    <link rel="stylesheet" type="text/css" href="assets/css/adminstyle.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Oswald&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"
            integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
            crossorigin="anonymous"></script>


</head>
<body>
<nav style="background-color: #1C75D2">
    <input type="checkbox" id="check">
    <label for="check" class="checkbtn">
        <i class="fas fa-bars"></i>
    </label>
    <label class="logo">WEB-PORTAL</label>
    <ul>
        <li><a href="profile.jsp">Профиль</a></li>
        <li><a href="answered.jsp"> Отвеченные</a></li>
        <li><a href="unanswered.jsp"> Неотвеченные</a></li>
    </ul>
</nav>
