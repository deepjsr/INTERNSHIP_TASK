package sessionManagement;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SessionCreation")
public class SessionCreation extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp"); // Assuming form.jsp is the form page
	}


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get parameters from the request
        String name = request.getParameter("user_name");
        String email = request.getParameter("user_email");
        String password = request.getParameter("user_password");
        
        // Create a session object
        HttpSession session = request.getSession();
        
        // Set attributes in session
        session.setAttribute("userName", name);
        session.setAttribute("userEmail", email);
        session.setAttribute("userPassword", password);
        
        // Redirect to DisplaySession servlet
        response.sendRedirect("DisplaySession");
    }
}
