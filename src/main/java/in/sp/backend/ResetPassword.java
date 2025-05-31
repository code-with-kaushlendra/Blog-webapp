package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ResetPassword extends HttpServlet{

	    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException{
	    PrintWriter out=res.getWriter();
	       String myemail=req.getParameter("email1");
	        res.setContentType("text/html");
	        
	        try{
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","123456");
	        	PreparedStatement ps=con.prepareStatement("Select * from users where myemail=?");
	        	ps.setString(1, myemail);
	        	ResultSet rs=ps.executeQuery();
	        	if(rs.next()) {
	        		Random rand=new Random();
	        		int otp=100000 + rand.nextInt(900000);
	        		
	        		PreparedStatement updateOtp=con.prepareStatement("update users set otp=? where myemail=?");
	        		 updateOtp.setInt(1, otp);
	                 updateOtp.setString(2, myemail);
	                 updateOtp.executeUpdate();
	        		
	        		
	        	    out.println("<script type='text/javascript'>");
	                out.println("alert('Your email is verified. Your OTP is " + otp+"');");
	                out.println("location='verify_otp.jsp';"); // redirect if needed
	                out.println("</script>");
	        	}
	        	else {
	        		
	        	     out.println("<script type='text/javascript'>");
	                 out.println("alert('Email not found.');");
	                 out.println("location='reset_password.jsp';"); // back to form
	                 out.println("</script>");
	        	}
	        	con.close();
	        	
	    
	    }
	        catch(Exception e) {
	            out.println("alert('Something went wrong.');");
	            out.println("location='login.jsp';");
	        //    out.println("</script>");
	        	
	        	
	        	
	        }

	            
	            
	 }
}	            

 

