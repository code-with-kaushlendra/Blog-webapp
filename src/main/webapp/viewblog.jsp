<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Data</title>
</head>
<body>
<div align=center>
<h1>All Blog List</h1>
</div>

   

    <table border="1">
         <thead>
           <th>Id</th>
            <th>Title</th>
            <th>Description</th>
            <th>Blog_img</th>
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
           <td>
    <img src="images/<%= row.get("Blog_img") %>" width="100" height="100" />
</td>

             
            
      <td  style="width:200px; padding:8px;"> <div style="display: flex; justify-content: space-between; align-items: center;"> <span style="display: none;"><%= row.get("Id") %></span></div></td>
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
