
<%@ page import="java.util.Map" %>
<%
    Map<String, String> blog = (Map<String, String>) request.getAttribute("updateRow");
%>

<style>
.edit{
margin:40px auto;
padding:30px 40px;
background-color:#ffffff;
box-shadow: 0 4px 8px rgba(0,0,0,0.1);

width:400px;
border-radius:30px;

}
body{
  font-family: Arial, sans-serif;
            background-color: #f4f6f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;

}
       .edit h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #2c3e50;
        }
                .edit input[type="submit"]:hover {
            background-color: #2980b9;
            
        }
        
        .edit input[type="submit"] {
            margin-top: 20px;
            width: 100%;
            background-color: #3498db;
            color: white;
            border: none;
            padding: 12px;
            font-size: 16px;
            border-radius: 8px;
            }
         .edit textarea {
            width: 100%;
            padding: 40px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            resize: vertical;
            font-size: 14px;
        }


</style>
<form action="UpdateServlet" method="post" class="edit">
<h2>Edit Blog</h2>
    <input type="hidden" name="Id" value="<%= blog.get("Id") %>">
    Title: <input type="text" name="Title" value="<%= blog.get("Title") %>"><br>
    Description: <textarea name="Description"><%= blog.get("Description") %></textarea><br>
    Blog Image URL: <input type="text" name="Blog_img" value="<%= blog.get("Blog_img") %>"><br>
    Status: <input type="text" name="Status" value="<%= blog.get("Status") %>"><br>
    <input type="submit" value="Update">
</form>