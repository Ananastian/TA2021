/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsyganova.exam.ta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Admin
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String x = request.getParameter("x"); //відправляєм строкой
        double param = Double.parseDouble(x); //конвертуєм
        double result = Calculator.Calculate(param); //відправляєм на виконання, обробляєм
        request.setAttribute("result", result); // відправляємо для воводу результату
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
// принцип роботи - получили, переконвектірували,відпрацювали, відправили