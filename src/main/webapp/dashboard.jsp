<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background:url('images/11.jpg');
background-size:cover;
display:flex;
min-height:100vh;
}
.sidebar a{
display:block;
color:white;
padding:15px 30px;
text-decoration:none;
font-size:16px;
transition:0.3s;
}
.sidebar{
width:220px;
background-color:rgba(44, 62, 80, 0.9);
padding-top:30px;
position:fixed;
height:100vh;
}
.sidebar h2{
color:white;
text-align:center;
margin-bottom:30px;
}
.sidebar a:hover{
background-color:#34495e;
padding-left:35px;
}
.main{
margin-left:220px;
padding:40px;
flex:1;
color:#2c3e50;
}
.header{
margin-bottom:40px;
}
.header h1{
font-size:28px;
font-weight:600;
color:#2c3e50;

}
.buttons{
display:flex;
gap:30px;
flex-wrap:wrap;
}
.btn{
width:160px;
height:50px;
background-color:#3498db;
color:white;
font-size:16px;
border:none;
}
.btn:hover{
background-color:#2980b9;
}
</style>


</head>
<body>


<!-- sidebar -->
<div class="sidebar">
<h2>Dashboard</h2>
  <a href="addblog.jsp">Add Blog</a>
  <a href="view">View Blog</a>
  <a href="home.jsp">Logout</a>
</div>

<div class="main">
<div class="header">
<h1>Welcome to Admin Dashboard</h1>
<p>Choose an action below:</p>
</div>

<div class="buttons">
<a href="addblog.jsp">
<button class="btn" >Add Blog</button>
</a>

<a href="view">
<button class="btn" >View Blog</button>
</a>
</div>
</div>

</body>
</html>