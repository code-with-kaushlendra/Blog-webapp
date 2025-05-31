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

public class View extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		 List<Map<String, String>> dataList = new ArrayList<>();
	     String deleteId=req.getParameter("deleteId");
<<<<<<< HEAD
=======
	     String updateId=req.getParameter("updateId");
>>>>>>> 1e144a9 (first commit)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","123456");
			
		    // Handle deletion
            if(deleteId!=null && !deleteId.isEmpty()) {
            	 PreparedStatement delStmt = con.prepareStatement("DELETE FROM add_data WHERE Id=?");
                 delStmt.setString(1, deleteId);
                 delStmt.executeUpdate();
            }
<<<<<<< HEAD
=======
    	    // Handle Updation
            if(updateId!=null && !updateId.isEmpty()) {
            	 PreparedStatement updStmt = con.prepareStatement("SELECT *  FROM add_data WHERE Id=?");
                 updStmt.setString(1, updateId);
           
                 ResultSet rs=updStmt.executeQuery();
                 
            if(rs.next()) {
            	Map<String,String>updateRow=new HashMap<>();
            	 updateRow.put("Id", rs.getString("Id"));
            	  updateRow.put("Title", rs.getString("Title"));
                  updateRow.put("Description", rs.getString("Description"));
                  updateRow.put("Blog_img", rs.getString("Blog_img"));
                  updateRow.put("Status", rs.getString("Status"));
                  updateRow.put("Created_at", rs.getString("Created_at"));
                  req.setAttribute("updateRow", updateRow);  // Send this to JSP
                  req.getRequestDispatcher("edit.jsp").forward(req, res);
                  return; // Stop further processing
            }
            }
>>>>>>> 1e144a9 (first commit)
			PreparedStatement ps=con.prepareStatement("select * from add_data");
			
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
	                Map<String, String> row = new HashMap<>();
	                row.put("Id",rs.getString("Id"));
	                row.put("Title", rs.getString("Title"));
	                row.put("Description", rs.getString("Description"));
	                row.put("Blog_img", rs.getString("Blog_img"));
	                row.put("Status", rs.getString("Status"));
	                row.put("Created_at", rs.getString("Created_at"));
<<<<<<< HEAD
	                row.put("Updated_at", rs.getString("Updated_at"));
=======
	                //row.put("Updated_at", rs.getString("Updated_at"));
>>>>>>> 1e144a9 (first commit)
	               // row.put("Action", rs.getString("Action"));
	                dataList.add(row);
	            }

	            req.setAttribute("dataList", dataList);// Send data to JSP
	            
	            
	        
	            req.getRequestDispatcher("view.jsp").forward(req, res);
		}
<<<<<<< HEAD
=======
	
>>>>>>> 1e144a9 (first commit)
		catch(Exception e) {
		     e.printStackTrace();
		}
	}

}
<<<<<<< HEAD
=======

>>>>>>> 1e144a9 (first commit)
