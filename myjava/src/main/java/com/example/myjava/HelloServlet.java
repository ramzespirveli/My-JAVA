package com.example.myjava;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String users;
    private String pass;
    private int id;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        users = request.getParameter("userName");
        pass = request.getParameter("password");
        SqlUser sc = new SqlUser();

        try {
            if(sc.userNoEmty(pass) && sc.searcPass(users,pass)){
                id = sc.getId(users);
                request.setAttribute("adres",sc.get_f_l_name(id));
                RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
                dispatcher.forward(request,response);

            }
            else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("registr.jsp");
                dispatcher.forward(request,response);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void destroy() {
    }
}

