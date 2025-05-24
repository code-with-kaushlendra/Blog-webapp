package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException {
		PrintWriter out=res.getWriter();
		String mytitle=req.getParameter("title1");
		String mydesc=req.getParameter("description1");
		String myblog=req.getParameter("blogimg1");
		String myid=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root","123456");//jammer lao address
			PreparedStatement ps=con.prepareStatement("Insert into add_data(Id,Title,Description,Blog_img,Status,Created_at,Updated_at) values(?,?,?,?,?,?,?)");
			
			ps.setString(1,myid);
			ps.setString(2,mytitle);
			ps.setString(3,mydesc);
			ps.setString(4,myblog);
			ps.setString(5,"draft");
			ps.setTimestamp(6, new Timestamp(System.currentTimeMillis())); // Created_at (current timestamp)
			ps.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
			
			 int count=ps.executeUpdate();
			 
			 if(count>0) {
				 res.setContentType("text/html");
					out.println("<h3 style='color:red'>Blog Added Successfully </h3>");
					RequestDispatcher rd=req.getRequestDispatcher("/dashboard.jsp");
				rd.include(req,res);
			 }
			 else {
				 res.setContentType("text/html");
					out.println("<h3 style='color:black'>Blog Not Added Successfully </h3>");
					RequestDispatcher rd=req.getRequestDispatcher("/addblog.jsp");
				rd.include(req,res);
			 }
			 
			
		}
		catch(Exception e) {
			 res.setContentType("text/html");
				out.println("<h3 style='color:red'>Exception Occured: " + e.getMessage()+ "</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/addblog.jsp");
			rd.include(req,res);
		 
			
		}
	
		
	}

}
