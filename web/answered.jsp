<%@ page import="kz.edu.astanait.Controllers.AppealController" %>
<%@ page import="kz.edu.astanait.Models.Appeal" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%> <%--There we include header--%>
<jsp:useBean id="test" class="kz.edu.astanait.Controllers.AppealController"></jsp:useBean>
<div class="all">
    <div class="row">
        <div class="blocks2"><p class="names">Номер обращение</p></div>
        <div class="blocks2"><p class="names">Имя человека</p></div>
        <div class="blocks2"><p class="names">Телефон</p></div>
        <div class="blocks3"><p class="names">Проверено</p></div>
    </div>
    <c:forEach items="${test.answeredAppeals()}" var="appeal">
        <div class="row">
            <div class="blocks"><h2><a style="none" href="appeal?action=about&id=${appeal.id}">${appeal.id}</a></h2></div>
            <div class="blocks"><p class="names">${appeal.name}</p></div>
            <div class="blocks"><p class="names">${appeal.phone_number}</p></div>
            <div class="blocks1"><p class="names" style="color: green">Да</p></div>
        </div>
    </c:forEach>
</div>
<%@include file="footer.jsp"%> <%--There we include footer--%>