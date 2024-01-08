package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer les paramètres du formulaire
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        // Déterminer si c'est une multiplication ou une division
        String operation = request.getParameter("operation");
        int result = 0;

        if ("multiply".equals(operation)) {
            result = num1 * num2;
            request.setAttribute("result", result);
            request.getRequestDispatcher("/WEB-INF/views/multiplication.jsp").forward(request, response);
        } else if ("divide".equals(operation)) {
            if (num2 != 0) {
                result = num1 / num2;
                request.setAttribute("result", result);
                request.getRequestDispatcher("/WEB-INF/views/division.jsp").forward(request, response);
            } else {
                request.setAttribute("error", "Division par zéro n'est pas autorisée");
                request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
            }
        }
    }
}
