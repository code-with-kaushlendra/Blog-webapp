package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VerifyServlet extends HttpServlet {
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String code = request.getParameter("code");
	        String sessionCode = (String) request.getSession().getAttribute("resetCode");

	        if (code.equals(sessionCode)) {
	            response.sendRedirect("reset_password.jsp");
	        } else {
	            response.getWriter().print("Invalid code.");
	        }
	    }

}
