<%--
  Created by IntelliJ IDEA.
  User: Luka
  Date: 7/31/2022
  Time: 12:44 PM
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
        .parol {
            width: 100%;
            background-color: aqua;
            text-align: center;
            padding: 10px;
        }
        body {
            background-color: rgb(40, 39, 39);
        }
        input {
            margin-top: 20px;
            width: 300px;
            height: 50px;
        }
        .parolUpdate {
            margin-left: 100px;
        }
        .aklas {
            font-size: 40px;
        }
    </style>
</head>
<body>
<div class="parol"><h1>პაროლის აღდგენა</h1> <a href="index.jsp" class="aklas">უკან</a></div>

<div  class="parolUpdate">
    <form action="newPass-Servlet" method="post">
        <input type="text" id="maili" name="maili" placeholder="შეიყვანეთ თქვენი იმეილი">
        <div> <input type="submit" id="submiti" name="submiti" value="გაგზავნა"></div>
    </form>
    <div><span>თქვენი ახალი პაროლი:</span></div>
</div>
</body>
</html>
