package in.sp.backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewBlog extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		 List<Map<String, String>> dataList = new ArrayList<>();
	    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","123456");
			
		  
			PreparedStatement ps=con.prepareStatement("select * from add_data");
			
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
	                Map<String, String> row = new HashMap<>();
	                row.put("Id",rs.getString("Id"));
	                row.put("Title", rs.getString("Title"));
	                row.put("Description", rs.getString("Description"));
	                row.put("Blog_img", rs.getString("Blog_img"));
	              //  row.put("Status", rs.getString("Status"));
	             //   row.put("Created_at", rs.getString("Created_at"));
	              //  row.put("Updated_at", rs.getString("Updated_at"));
	           
	                dataList.add(row);
	            }

	            req.setAttribute("dataList", dataList);// Send data to JSP
	            
	            
	        
	            req.getRequestDispatcher("viewblog.jsp").forward(req, res);
		}
		catch(Exception e) {
		     e.printStackTrace();
		}
	}

}

