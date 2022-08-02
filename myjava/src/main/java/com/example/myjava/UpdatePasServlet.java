package com.example.myjava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UpdatePasServlet", value = "/UpdatePas-Servlet")
public class UpdatePasServlet extends HttpServlet {

    private String pass1;
    private String pass2;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        pass1 = request.getParameter("pasUpdate1");
        pass2 = request.getParameter("pasUpdate2");
        SqlUser sc = new SqlUser();

        try {
            sc.updatePass(pass1,pass2);
            request.setAttribute("adres",sc.get_f_l_name(sc.getId()));
            request.setAttribute("status","პაროლი წარმატებით შეიცვალა");
            RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
            dispatcher.forward(request,response);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
