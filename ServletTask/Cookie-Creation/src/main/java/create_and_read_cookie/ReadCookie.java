package create_and_read_cookie;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookie")
public class ReadCookie extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie arr[]=request.getCookies();
		out.print("<h1>User Name="+arr[0].getValue()+"</h1>");
		out.print("<h1>Password ="+arr[1].getValue()+"</h1>");
		out.close();
	}
}
