<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
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
            display: flex;
            justify-content: space-between;
            padding: 20px;
            background-color: blue;
        }
        body {
            background-image: url('https://images.idgesg.net/images/article/2019/05/java_binary_code_gears_programming_coding_development_by_bluebay2014_gettyimages-1040871468_2400x1600-100795798-large.jpg?auto=webp&quality=85,70');
        }
        .form-wraper {
            display: flex;
        }
        .buton {
            margin-left: 10px;
            margin-right: 10px;
            background-color: rgb(124, 126, 124);
            padding: 5px;
            cursor: pointer;
        }
        .color {
            background-color: green;
            cursor: pointer;

        }
        .pasUpdat {
            color: rgb(170, 28, 28);
            font-size: 20px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="heder-wraper">
    <h1>HOME</h1>
    <div class="form-wraper">
        <form action="hello-servlet" method="post">
            <input type="text" id="userName" name="userName" placeholder="user">
            <input type="password" id="password" name="password" placeholder="password">
            <input class="color" type="submit" id="submit" name="submit" value="შესვლა">
        </form>

        <a href="registr.jsp"><div class="buton">რეგისტრაცია</div></a>
        <a href="pass.jsp"><span class="pasUpdat">პაროლის აღდგენა</span></a>
    </div>

</div>



</body>
</html>