package sessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DisplaySession")
public class DisplaySession extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Get the current session
		HttpSession session = request.getSession(false); // Do not create a new session if one doesn't exist

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if (session != null) {
			// Retrieve session attributes
			String name = (String) session.getAttribute("userName");
			String email = (String) session.getAttribute("userEmail");

//      // Display session attributes
			out.println("<h2>Session Details:</h2>");
			out.println("<p>Name: " + name + "</p>");
			out.println("<p>Email: " + email + "</p>");
		} else {
			out.println("<p>No session found. Please create a session first.</p>");
		}
	}

}
