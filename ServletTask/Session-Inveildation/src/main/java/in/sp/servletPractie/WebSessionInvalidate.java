package in.sp.servletPractie;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/welcome")
public class WebSessionInvalidate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("I am at  do get");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String myName = request.getParameter("name");
		String myEmail = request.getParameter("email");
		String myPass = request.getParameter("password");

		PrintWriter out = response.getWriter();
		
		if (myEmail.equals("sudhakar@gmail.com") && myPass.equals("d123JS")) {
			System.out.println("Success");
//			request.setAttribute("name_key", myName);
			HttpSession session= request.getSession();
			session.setAttribute("name_key","Pawan Kalyan FC");
			session.setAttribute("email_key",myEmail);
			RequestDispatcher rd=request.getRequestDispatcher("/profile.jsp");
			rd.forward(request, response);
		} else {
			response.setContentType("text/html");
			out.print("<h3 style='color:red'>Email id and Password didnot matched</h3>");
			System.out.println("Success");
			RequestDispatcher rd=request.getRequestDispatcher("/profile.jsp");
			rd.include(request, response);
		}
	}
}
