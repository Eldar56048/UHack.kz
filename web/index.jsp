<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 31.10.2020
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="test" class="kz.edu.astanait.Controllers.AppealController"></jsp:useBean>
<html lang="ru"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="Content-Type" content="text/html; charset=cp1251"\>

  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="robots" content="noindex">
  <meta name="googlebot" content="noindex">
  <!--    --><!--        --><title>Виртуальная приемная Акима Шымкента Мурата Айтенова </title>



  <link href="./index_files/jquery-ui.css" rel="stylesheet">
  <link href="./index_files/bootstrap.css" rel="stylesheet">
  <link href="./index_files/app_b8d7449f514f0c58.min.css" rel="stylesheet">
  <link href="./index_files/specialView.css" rel="stylesheet">
  <link href="./index_files/mdb.css" rel="stylesheet">
  <link href="./index_files/style.css" rel="stylesheet">
  <link href="./index_files/media.css" rel="stylesheet">
  <link href="./index_files/jqvmap.css" rel="stylesheet">
  <link href="./index_files/map.css" rel="stylesheet">

</head>
<body cz-shortcut-listen="true">

<div class="container pm main-container ru">

  <section class="header-wrap clearfix">
    <div class="header header-left">
      <div class="header-top clearfix container">

        <div class="special-scope col-md-4">

        </div>
        <ul class="auth-wrap col-md-4">

          <!--    <li class="registration">-->
          <!--        <a target="_blank" href="https://id.gov.uz/oid/cmn/regUser/register.do?locale=--><!--">--><!--</a>-->
          <!--    </li>-->
        </ul>
      </div>

      <div class="header-center container clearfix">
        <a href="https://www.akorda.kz/en" class="col-sm-5 row hidden-xs">Казахстан</a>
          <div class="logo-text col-sm-7">
            <span class="line-3">Виртуальная приемная</span>
            <span class="line-2">Акима Шымкента</span>
            <span class="line-1">Мурата Айтенова</span>                    </div>
      </div>
      <nav class="navbar navbar-default">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand hidden-lg hidden-md hidden-sm waves-effect waves-light" href="https://pm.gov.uz/ru#"><img src="./Виртуальная приемная Президента Республики Узбекистан Мирзиёева Шавката Миромоновича_files/logo.png"></a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
          </ul>
        </div>
      </nav>
    </div>
    <div class="header-right">
      <img style="" src="https://upload.wikimedia.org/wikipedia/commons/9/97/Aitenov_Murat.png">
    </div>
  </section>


  <!-- Slider -->
  <div class="d-flex justify-content-center bg-secondary mb-3">
    <div class="container">
      <h1 style="text-align: center">Добро пожаловать!</h1>
      <p style="text-align: center">Виртуальная приемная Акима Шымкента  содействует беспрекословному осуществлению конституционных прав граждан на обращение <br>Посредством данной информационной системы, Вы можете отправить свои заявления, предложения и жалобы Акиму Шымкента.</p>
    </div>
  </div>



  <section class="step-box send-appeals clearfix" id="appeal_app_root"><span><div class="step"><i>1</i><h4><span>Раздел</span></h4></div><h3 class="title"><span>Способы отправления обращений</span></h3><div class="send-appeals-wrap clearfix"><ul class="appeals-steps clearfix"><li class="item-a col-md-4"><div class="item-wrap"><div class="left"><span>А</span><i></i></div><p class="text"><span>Посетите  приемную в Акимате</span></p></div></li><li class="item-b col-md-5"><div class="item-wrap"><div class="left"><span>Б</span><i></i></div><p class="text"><span>Звоните на телефонный номер<br><span>999999</span> или <span>9-999-999-9999</span><br>и изложите суть Вашего обращения</span></p></div></li><li class="item-v col-md-3 false"><a class="item-wrap" href="#appRoot" role="button"><div class="left"><span>В</span><i></i></div><p class="text"><span>Отправьте обращение в виртуальную приемную</span></p></a></li></ul></div></span></section>
  <section class="step-box check-appeal-result" id="appRoot">
    <div class="container">

      <div class="row">

        <div class="col-lg-8 col-lg-offset-2">

          <h1 class="text-center">Обращение</h1>




          <form  method="post" action="appeal">

            <div class="messages"></div>

            <div class="controls">

              <div class="row">
                <div class="col-md-6">
                  <div class="form-group">
                    <label for="form_name">Имя *</label>
                    <input type="hidden" name="action" value="add">
                    <input id="form_name" type="text" name="name" class="form-control" placeholder="Введите ваше имя*" required="required" data-error="Firstname is required.">
                    <div class="help-block with-errors"></div>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-group">
                    <label for="form_lastname">Фамилия *</label>
                    <input id="form_lastname" type="text" name="surname" class="form-control" placeholder="Введите вашу фамилию *" required="required" data-error="Lastname is required.">
                    <div class="help-block with-errors"></div>
                  </div>
                </div>
              </div>

              <div class="row">

                <div class="col-md-6">
                  <div class="form-group">
                    <label for="form_email">Email *</label>
                    <input id="form_email" type="email" name="email" class="form-control" placeholder="Введите ваш email *" required="required" data-error="Valid email is required.">
                    <div class="help-block with-errors"></div>
                  </div>
                </div>

                <div class="col-md-6">
                  <div class="form-group">
                    <label for="form_phone">Телефон номер *</label>
                    <input id="form_phone" type="tel" name="phone_number" class="form-control" placeholder="Введите ваш телефон номер" required data-error="Fill the phone_number">
                    <div class="help-block with-errors"></div>
                  </div>
                </div>
              </div>
              <div class="row">

                <div class="col-md-6">
                  <div class="form-group">
                    <label for="form_micro_region">Микрорайон *</label>
                    <input id="form_micro_region" type="text"  name="micro_region" class="form-control" placeholder="Введите ваш регион " required="required" data-error="Valid Микрорайон is required.">
                    <div class="help-block with-errors"></div>
                  </div>
                </div>

                <div class="col-md-6">
                  <div class="form-group">
                    <label for="form_address">Адресс *</label>
                    <input id="form_address" type="text" name="address" class="form-control" placeholder="Введите ваш микрорайон">
                    <div class="help-block with-errors"></div>
                  </div>
                </div>
              </div>

              <div class="row">
                <div class="col-md-12">
                  <div class="form-group">
                    <label for="form_message">Обращение *</label>
                    <textarea id="form_message" name="appeal" class="form-control" placeholder="Обращение *" rows="4" required="required" data-error="Please,leave us a message."></textarea>
                    <div class="help-block with-errors"></div>
                  </div>
                </div>

                <div class="col-md-12">
                  <div class="form-group">


                  </div>
                </div>

                <div class="col-md-12">
                  <input type="submit" class="btn btn-success btn-send" value="Отправить обращение">
                  <c:if test="${AppealResult!=null}">
                    <h1>${AppealResult}</h1>
                  </c:if>
                </div>

              </div>

            </div>

          </form>

        </div>

      </div>

    </div>
  </section>
  <section class="step-box check-appeal-result" id="check_app_root">
    <h3 class="title">Проверить состояние обращения</h3>
    <div class="check-appeal-wrap clearfix">
      <div class="loaderBox">
        <div class="text-center loader">
          <div class="preloader-wrapper big active crazy">
            <div class="spinner-layer spinner-blue-only">
              <div class="circle-clipper left">
                <div class="circle"></div>
              </div><div class="gap-patch">
              <div class="circle"></div>
            </div><div class="circle-clipper right">
              <div class="circle"></div>
            </div>
            </div>
          </div>
        </div>
      </div>
      <div class="send-appeal-form">
        <form id="form-check" action="appeal" method="post">
          <input type="hidden" name="_csrf" value="3Uti3w7j2CH_YR7K1NABKZYOTDVRIngaPvSjpUAWLzjLCW6ezF8BFmNcMtaBTPZIH1uGeKpz6XFpYKuVgE8Taw==">                <div class="col-md-6">
          <div class="form-group field-autth-request_id required">
            <div class="item clearfix">
              <label class="form-label text-left col-md-3"><label class="control-label" for="autth-request_id">Номер обращения</label></label>
              <div class="col-md-9">
                <div class="md-form">
                  <input type="text" id="autth-request_id" class="form-control" name="id" aria-required="true">
                  <label class=""></label>

                  <p class="help-block help-block-error"></p>
                </div>
              </div>
            </div>
          </div>                </div>
          <div class="col-md-6">
            <div class="form-group field-autth-password required">

              <div class="item clearfix">
                <label class="form-label text-left col-md-3"><label class="control-label" for="autth-password">Код проверки состояния</label></label>
                <div class="col-md-9">
                  <div class="md-form">
                    <input type="text" id="autth-password" class="form-control" name="code" aria-required="true">
                    <label class=""></label>
                    <input type="hidden" name="action" value="get">
                    <p class="help-block help-block-error"></p>
                  </div>
                </div>
              </div>
            </div>                </div>
          <div class="form-bottom col-md-12">
            <div class="row captcha clearfix">
              <div class="form-group field-autth-verifycode required">


              </div>                        <div class="pull-right">
              <button type="submit" class="submit_btn">Проверка</button>                        </div>
            </div>
            <c:if test="${appeal!=null}">
            <h1>Ваше обращение:${" "}${appeal.appeal}</h1>
              <c:if test="${appeal.answer!='null'}">
              <h1>Ответ от Акимата:${" "}${appeal.answer}</h1>
              </c:if>
              <c:if test="${appeal.answer=='null'}">
                <h1>Вам еще не ответили</h1>
              </c:if>
            </c:if>
          </div>
        </form>        </div>
    </div>
  </section>


  <section class="news-and-stats clearfix" id="stat_app_root">

    <div class="statistics col-md-6">
      <div class="title-wrap">
        <h1>Обращений</h1>
        <i></i>
      </div>
      <div class="total-appeals col-xs-6">
        <span class="total">Всего</span>
        <span class="number">${test.countAllAppeal}</span>
        <span class="appeal">обращений</span>
      </div>
    </div>

    <div class="statistics col-md-6">
      <div class="title-wrap">
        <h1>Отвечено</h1>
        <i></i>
      </div>
      <div class="total-appeals col-xs-6">
        <span class="total">Всего Отвечено</span>
        <span class="number">${test.countAnsweredAppeal}</span>
        <span class="appeal">обращений</span>
      </div>
    </div>
  </section>
  <section class="useful clearfix">
    <div class="title-wrap">
      <h1>полезные ресурсы</h1>
      <i></i>
    </div>
    <ul class="useful-links">
      <li class="senat">
        <a target="_blank" href="https://www.akorda.kz/ru">
          <i></i>
          <span>Официальный веб-сайт Президента Республики Казахстана</span>
        </a>
      </li>

      <li class="govuz">
        <a target="_blank" href="https://www.egov.kz/">
          <i></i>
          <span>Правительственный портал Республики Казахстана</span>
        </a>
      </li>
      <li class="my-govuz">
        <a target="_blank" href="https://www.egov.kz/">
          <i></i>
          <span>Единый портал интерактивных государственных услуг</span>
        </a>
      </li>
      <li class="strategy-govuz">
        <a target="_blank" href="https://www.gov.kz/memleket/entities/minfin?lang=ru">
          <i></i>
          <span>Министерство Финансов</span>
        </a>
      </li>

      <li class="regulation-govuz">
        <a target="_blank" href="https://www.gov.kz/memleket/entities/dsm?lang=ru">
          <i></i>
          <span>Министрество Здравоохранения</span>
        </a>
      </li>

    </ul>
  </section>

</div>
<section class="footer">
  <div class="container">
      <div class="logo-text col-md-7">
        <span class="line-3">Виртуальная приемная</span>
        <span class="line-2">Акима Шымкента</span>
        <span class="line-1">Мурата Айтенова</span>            </div>
    </div>
  </div>
</section>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src='https://www.google.com/recaptcha/api.js'></script>
<script src="https://bootstraptema.ru/snippets/form/2017/recaptcha/validator.js"></script>
<script src="https://bootstraptema.ru/snippets/form/2017/recaptcha/contact.js"></script>
</body>
</html>

