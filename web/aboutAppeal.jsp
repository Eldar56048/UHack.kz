<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%> <%--There we include header--%>
<c:if test="${Error!=null}">
<h2>${Error}</h2>
</c:if>
<div class="all">
    <div class="numberoforder"><p class="number">Номер Обращения: ${appeal.id}</p></div>
    <div class="buttons">
        <c:if test="${appeal.response_date!=null}">
        <form  action="appeal" method="Post">
            <input type="hidden" name="id" value="${appeal.id}">
            <input type="hidden" name="action" value="delete">
            <button  type="submit" class="buttondelete">Удалить</button>
        </form>
        </c:if>

    </div>
    <div class="info">
        <div class="tables1"><b><p class="info">Имя:</p></b></div>
        <div class="tables"><b><p class="info">${appeal.name}</p></b></div>
    </div>
    <div class="info1">
        <div class="tables1"><b><p class="info1">Фамилия:</p></b></div>
        <div class="tables"><b><p class="info1">${appeal.surname}</p></b></div>
    </div>
    <div class="info">
        <div class="tables1"><b><p class="info">Email:</p></b></div>
        <div class="tables"><b><p class="info">${appeal.email}</p></b></div>
    </div>
    <div class="info1">
        <div class="tables1"><b><p class="info1">Номер Телефона:</p></b></div>
        <div class="tables"><b><p class="info1">${appeal.phone_number}</p></b></div>
    </div>
    <div class="info">
        <div class="tables1"><b><p class="info">Микро-Район:</p></b></div>
        <div class="tables"><b><p class="info">${appeal.micro_region}</p></b></div>
    </div>
    <div class="info1">
        <div class="tables1"><b><p class="info1">Адресс:</p></b></div>
        <div class="tables"><b><p class="info1">${appeal.address}</p></b></div>
    </div>

    <div class="info">
        <div class="tables1"><b><p class="info">Обращение:</p></b></div>
        <div class="tables"><b><p class="info">${appeal.appeal}</p></b></div>
    </div>

    <div class="info1">
        <div class="tables1"><b><p class="info1">Код:</p></b></div>
        <div class="tables"><b><p class="info1">${appeal.code}</p></b></div>
    </div>

    <div class="info">
        <div class="tables1"><b><p class="info">Дата отправки:</p></b></div>
        <div class="tables"><b><p class="info">${appeal.sent_date}</p></b></div>
    </div>

    <div class="info1">
        <div class="tables1"><b><p class="info1">Дата ответа:</p></b></div>
        <div class="tables"><b><p class="info1">${appeal.response_date}</p></b></div>
    </div>

    <div class="info">
        <div class="tables1"><b><p class="info">Ответ:</p></b></div>
        <div class="tables"><b><p class="info">${appeal.answer}</p></b></div>
    </div>
</div>
<div class="footer"></div>
<form method="post" action="appeal">
    <textarea name="answer"></textarea>
    <input type="hidden" name="id" value="${appeal.id}">
    <input type="hidden" name="action" value="update">
    <input type="submit" value="Submit">
</form>
<div class="footer"></div>
<script src="ckeditor/ckeditor.js"></script>
<script>
    CKEDITOR.replace('answer');
</script>


