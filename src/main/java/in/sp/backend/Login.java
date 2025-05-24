package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {


    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String myemail = req.getParameter("email1");
        String mypass = req.getParameter("pass1");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "123456");
                 PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE email=? AND password=?")) {

                ps.setString(1, myemail);
                ps.setString(2, mypass);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                     //   HttpSession session = req.getSession();
                      //  session.setAttribute("session_name", rs.getString("email")); // Adjust if your DB column is different

                        RequestDispatcher rd = req.getRequestDispatcher("/dashboard.jsp");
                        rd.forward(req, res); // Changed to forward
                    } else {
                        out.print("<div align=center><h3 style='color:red'>User does not exist</h3></div>");
                        RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
                        rd.include(req, res);
                    }
                }

            }
        } catch (Exception e) {
            out.print("<h3 style='color:red'> " + e.getMessage() + "</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.include(req, res);
        }
    }
}
