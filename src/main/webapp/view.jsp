<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Data</title>
    <style>
    body{
    background-color:#f4f6f9;
    padding:30px;
    }
    h2{
    text-align:center;
    margin-bottom:25px;
    color:#2c3e50;}
    </style>
</head>
<body>
<h2>Blog Entries</h2>

   

    <table border="1">
         <thead>
         
           <th>Id</th>
            <th>Title</th>
            <th>Description</th>
            <th>Blog_img</th>
                <th>Status</th>
            <th>Created_at</th>
            <th>Updated_at</th>
            <th>Action</th>
        </thead>
        
      

        <%
            List<Map<String, String>> dataList = (List<Map<String, String>>) request.getAttribute("dataList");
            if (dataList != null && !dataList.isEmpty()) {
                for (Map<String, String> row : dataList) {
        %>
       
   
   
        
        <tr>
      
             <td><%= row.get("Id") %></td>
            
            <td><%= row.get("Title") %></td>
            <td><%= row.get("Description") %></td>
            <td><%= row.get("Blog_img") %></td>
              <td><%= row.get("Status") %></td>
            <td><%= row.get("Created_at") %></td>
              <td><%= row.get("Updated_at") %></td>
             
            
      <td  style="width:200px; padding:8px;"> <div style="display: flex; justify-content: space-between; align-items: center;"> <span style="display: none;"><%= row.get("Id") %></span><a href="view?deleteId=<%=row.get("Id")%>" onclick="return confirm('Are you sure you want to delete this record?');" style="color:red; text-decoration:none; font-weight:bold;">Delete</a></div></td>
        </tr>
        
        
          
        <%
                }
            } else {
        %>
    
        <%
            }
        %>
    </table>
</body>
</html>
