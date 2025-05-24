<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background:#f0f2f5;
margin:0px;
padding:0px;
}
.blog-form{
max-width:500px;
margin:50px auto;
padding:30px 25px;
background:#ffffffee;
border-radius:15px;
}
.blog-form h2{
text-align:center;
margin-bottom:20px;
color:#2c3e50;
}
.blog-form button{
width:100%;
padding:14px;
background-color:#3498db;
border:none;
color:white;
font-size:16px;
font-weight:bold;
}
.blog-form button:hover{
background-color:#2980b9;
}
.blog-form input[type="text"]{
width:100%;
padding:12px 15px;
margin:10px 0 20px;
font-size:16px;
border:1px solid #ccc;
border-radius:8px;
}

</style>
</head>
<body>

<form action="addblog" method="post" class="blog-form">
<h2>Add a New Blog</h2>
<input type="text" name="title1" Placeholder="Enter Title"/>
<input type="text" name="description1" Placeholder="Enter Description"/>
<input type="text" name="blogimg1" Placeholder="Paste image URL or path"/>
  <button type="submit">AddBlog</button>

</form>

</body>
</html>