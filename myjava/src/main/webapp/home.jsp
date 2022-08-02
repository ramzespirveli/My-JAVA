<%--
  Created by IntelliJ IDEA.
  User: Luka
  Date: 7/31/2022
  Time: 12:43 PM
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
        .wraper{
            display: flex;
            justify-content: space-between;
            padding: 20px;
            background-color: darkgoldenrod;
        }
        input {
            width: 200px;
            height: 40px;
            display: block;
            margin: 20px;
        }
        span {
            margin-left: 20px;
        }
        body {
            background-image: url('https://changellenge.com/upload/iblock/8fb/8fbfea7d04945d7c47c62d0617866ff7.jpg');
            background-repeat: no-repeat;
            background-size: cover;
        }
        .submit {
            background-color: green;
            color: white;
        }
        .back {
            background-color: rgb(86, 82, 82);
            color: white;
            width: 80px;
            padding: 10px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="wraper">
    <h1>მთავარი გვერდი</h1>
    <h2>მომხმარებელი:</h2>
    <span><%= request.getAttribute("adres")%></span>
    <a href="index.jsp"><div class="back">გასვლა</div></a>
</div>
<div class="update">
    <form action="UpdatePas-Servlet" method="post" >
        <input type="text" id="pasUpdate1" name="pasUpdate1" placeholder="myPass">
        <input type="text" id="pasUpdate2" name="pasUpdate2" placeholder="newPass">
        <span>status: . .<%= request.getAttribute("status")%></span>
        <input type="submit" id="pasSubmit" name="pasSubmit" class="submit" value="UPDATE">

    </form>
</div>

</body>
</html>