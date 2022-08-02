<%--
  Created by IntelliJ IDEA.
  User: Luka
  Date: 7/31/2022
  Time: 12:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JAVA</title>
    <style>
        html, body, div, span, applet, object, iframe,
        h1, h2, h3, h4, h5, h6, p, blockquote, pre,
        a, abbr, acronym, address, big, cite, code,
        del, dfn, em, img, ins, kbd, q, s, samp,
        small, strike, strong, sub, sup, tt, var,
        b, u, i, center,
        dl, dt, dd, ol, ul, li,
        fieldset, form, label, legend,
        table, caption, tbody, tfoot, thead, tr, th, td,
        article, aside, canvas, details, embed,
        figure, figcaption, footer, header, hgroup,
        menu, nav, output, ruby, section, summary,
        time, mark, audio, video {
            margin: 0;
            padding: 0;
            border: 0;
            font-size: 100%;
            font: inherit;
            vertical-align: baseline;
        }
        /* HTML5 display-role reset for older browsers */
        article, aside, details, figcaption, figure,
        footer, header, hgroup, menu, nav, section {
            display: block;
        }
        body {
            line-height: 1;
        }
        ol, ul, li {
            list-style: none;
        }
        blockquote, q {
            quotes: none;
        }
        blockquote:before, blockquote:after,
        q:before, q:after {
            content: '';
            content: none;
        }
        table {
            border-collapse: collapse;
            border-spacing: 0;
        }
        * {
            box-sizing: border-box;
        }
        a {
            text-decoration: none;
        }
        .heder-wraper {
            background-color: blue;
            padding: 20px;
        }
        .sing {
            background-color: green;
            width: 75px;
            color: white;
        }
        .heder-wraper {
            display: flex;
            justify-content: space-between;
            font-size: 30px;
        }
        input {
            display: block;
            width: 300px;
            height: 40px;
            margin-top: 10px;
            padding: 0 10px;
        }
        .formwraper {
            display: flex;
            justify-content: center;
        }
        #registr {
            background-color: green;
            cursor: pointer;
            font-size: 30px;
            color: white;
        }
        body {
            background-image: url('https://developers.redhat.com/sites/default/files/styles/article_feature/public/ST-java1_1x%20%281%29.png?itok=HSEPV0HL');
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>
<body>
<div class="heder-wraper">
    <h1>რეგისტრაციის გვერდი</h1>
    <h2>თუ დარეგისტრირებული ხართ, დაუბრუნდით საწყის გვერდს -></h2>
    <a href="index.jsp"><div class="sing">შესვლა</div></a>
</div>
<div class="formwraper">
    <form action="Registr-Servlet" method="post">
        <input type="text" id="firstName" name="firstName" placeholder="სახელი">
        <input type="text" id="lastName" name="lastName" placeholder="გვარი">
        <input type="text" id="citi" name="citi" placeholder="ქალაქი">
        <input type="text" id="userID" name="userId" placeholder="მოიფიქრეთ უზერი">
        <input type="text" id="imail" name="imail" placeholder="იმეილი">
        <input type="number" id="age" name="age" placeholder="ასაკი">
        <input type="password" id="password1" name="password1" placeholder="შეიყვანეთ პაროლი">
        <input type="password" id="password2" name="password2" placeholder="გაიმეორეთ პაროლი">
        <input type="submit" name="registr" id="registr" value="რეგისტრაცია">
    </form>
</div>

</body>
</html>
