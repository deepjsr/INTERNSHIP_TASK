package create_and_read_cookie;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/CreateCookie")
public class CreateCookie extends HttpServlet {

	@Override
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
			throws jakarta.servlet.ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		Cookie cref = new Cookie("uname", name);
		Cookie cpref = new Cookie("Pass", email);
		cref.setMaxAge(365 * 24 * 60 * 60);
		response.addCookie(cref);
		cref.setMaxAge(365 * 24 * 60 * 60);
		response.addCookie(cpref);
		RequestDispatcher req = request.getRequestDispatcher("ReadCookie");
		req.forward(request, response);
	}

}
