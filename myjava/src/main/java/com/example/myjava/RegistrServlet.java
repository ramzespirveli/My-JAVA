package com.example.myjava;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "RegistrServlet", value = "/Registr-Servlet")
public class RegistrServlet extends HttpServlet {
    private String firstName;
    private String lastName;
    private String citiName;
    private String userName;
    private String emailName;
    private int ageNumber;
    private String pas2;
    private String pas1;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        firstName = request.getParameter("firstName");
        lastName = request.getParameter("lastName");
        citiName = request.getParameter("citi");
        userName = request.getParameter("userId");
        emailName = request.getParameter("imail");
        ageNumber = Integer.parseInt(request.getParameter("age"));
        pas1 = request.getParameter("password1");
        pas2 = request.getParameter("password2");

        SqlUser sc = new SqlUser();
        Person user = new Person(firstName, lastName, citiName, userName, emailName, ageNumber, pas2);
        try {
            if (firstName.length() > 0 && lastName.length() > 0 && citiName.length() > 0 && !sc.userNoEmty(userName) && !sc.searchEmail(emailName) && ageNumber > 10 && ageNumber <100 && pas2.equals(pas1) && pas2.length() > 5) {

                sc.setUser(user);

                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request,response);
            }
            RequestDispatcher dispatcher = request.getRequestDispatcher("registr.jsp");
            dispatcher.forward(request,response);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

