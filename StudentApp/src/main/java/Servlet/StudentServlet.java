package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Get form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");
        String address = request.getParameter("address");

        // Set attributes for JSP
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("age", age);
        request.setAttribute("gender", gender);
        request.setAttribute("course", course);
        request.setAttribute("address", address);

        // Forward to JSP page
        request.getRequestDispatcher("studentResult.jsp").forward(request, response);
    }

    // Handles GET (when user directly visits /StudentServlet)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Redirect user back to the form
        response.sendRedirect("index.html");
    }
}
