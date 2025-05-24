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

public class Contact extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException , IOException {
		PrintWriter out=res.getWriter();
		String myname=req.getParameter("name1");
		String myemail=req.getParameter("email1");
		String mysubject=req.getParameter("subject1");
		String mymessage=req.getParameter("message1");
		String myid=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","123456");
			PreparedStatement ps=con.prepareStatement("insert into contact(Id,Name,Emailid,Subject,Message) values(?,?,?,?,?)");
			ps.setString(1,myid);
			ps.setString(2,myname);
			ps.setString(3,myemail);
			ps.setString(4,mysubject);
			ps.setString(5,mymessage);
		
			
			 int count=ps.executeUpdate();
			 
			 if(count>0) {
				 res.setContentType("text/html");
					out.println("<h3 style='color:green'>Message Sent Successfully </h3>");
					RequestDispatcher rd=req.getRequestDispatcher("/Contact.jsp");
				rd.include(req,res);
			 }
			 else {
				 res.setContentType("text/html");
					out.println("<h3 style='color:black'>Message not Sent </h3>");
					RequestDispatcher rd=req.getRequestDispatcher("/Contact.jsp");
				rd.include(req,res);
			 }
			 
			
		}
			
			
			
		
		catch(Exception e ) {
			e.printStackTrace();
			
		}
	}

}
