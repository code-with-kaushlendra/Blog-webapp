package in.sp.backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException , IOException{
	  String id = req.getParameter("Id");
        String title = req.getParameter("Title");
        String description = req.getParameter("Description");
        String blogImg = req.getParameter("Blog_img");
        String status = req.getParameter("Status");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "123456");
            PreparedStatement ps = con.prepareStatement("UPDATE add_data SET Title=?, Description=?, Blog_img=?, Status=? WHERE Id=?");
            ps.setString(1, title);
            ps.setString(2, description);
            ps.setString(3, blogImg);
            ps.setString(4, status);
            ps.setString(5, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        res.sendRedirect("view");
	}
}
