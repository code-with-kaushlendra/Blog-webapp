package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException , IOException {
		PrintWriter out=res.getWriter();
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		String myid=null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","123456");
			
			PreparedStatement ps=con.prepareStatement("Insert into users(id,email,password) values(?,?,?)");
			
			ps.setString(1,myid);
			ps.setString(2,myemail);
			ps.setString(3,mypass);
			
			
			int count=ps.executeUpdate();
				if(count>0)
			{
					res.setContentType("text/html");
				out.println("<h3 style='color:green'>User Registerd Successfully </h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/loginForm.jsp");
			rd.include(req,res);
		    	}

			else{
				res.setContentType("text/html");
				out.println("<h3 style='color:red'>User not Registered due to some error </h3>");
					RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
					rd.include(req,res);
					}
			
			
			
		}
		catch(Exception e) {
			res.setContentType("text/html");
			 out.println("<h3 style='color:red'>Exception Occured: " + e.getMessage() + "</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/register.jsp");
				rd.include(req,res);
			
		}
		
	}
	

}
