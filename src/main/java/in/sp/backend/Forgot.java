package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Forgot extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException , IOException{
		
		String myemail=req.getParameter("email1");
		
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","123456");
PreparedStatement ps=con.prepareStatement("select * from users where email=?");
ps.setString(1, myemail);
ResultSet rs=ps.executeQuery();
if(rs.next()) {
	  String resetCode = String.valueOf((int)(Math.random() * 9000 + 1000)); // 4-digit code
      req.getSession().setAttribute("resetCode", resetCode);
      req.getSession().setAttribute("email", myemail);

     
   // Store reset code and email in session
      HttpSession session = req.getSession();
      session.setAttribute("resetCode", resetCode);
      session.setAttribute("email", myemail);

      // Forward to reset code form
      res.sendRedirect("enter_resetcode.jsp");

      // Step 4: Display reset code directly for testing (replace this with email logic later)
      res.setContentType("text/html");
      PrintWriter out = res.getWriter();
      out.println("<h2>Reset code generated: " + resetCode + "</h2>");
      out.println("<a href='enter_resetcode.jsp'>Click here to enter reset code</a>");
}
else {
	 res.getWriter().print("<div align=center><h3 style='color:red'>Email Not Found!</h3></div>");
}

			
		}
		catch(Exception e ) {
			 e.printStackTrace();
		}
		
	}

}
