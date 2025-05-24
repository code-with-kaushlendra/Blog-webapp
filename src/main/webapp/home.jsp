<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
body
{
margin:0px;
padding:0px;
  background:url('images/11.jpg') no-repeat center center fixed;
  background-size:cover;
  font-family:Arial,sans-serif;
}
.navbar{
list-style:none;
display:flex;
gap:20px;
}
.navbar li{

display:inline-block;
font-size:20px;

}
.navbar li a {
color:white;
text-decoration:none;
padding:10px 20px;
font-weight:500;
}
.navbar li a:hover{
background:#ff0000;
border-radius:20px;
color:white;

}
.header{
background-color:rgba(0,0,0,0.7);
padding:15px 30px;
display:flex;
justify-content:space-between;
align-items:center;
}

.btn{
background-color:#ff0000;
border:none;
color:white;
padding:10px 20px;
font-size:16px;
margin:10px;
border-radius:25px;
cursor:pointer;
transition:background 0.3s;
}
.btn:hover{
transform:scale(1.05);
 box-shadow: 0 4px 12px rgba(0,0,0,0.3);

}

.hero-title{
text-align:center;
color:#fff;
font-size:48px;
text-shadow: 2px 2px 6px rgba(0,0,0,0.5);
margin-top:80px;
}
.hero-subtext{
text-align:center;
font-size:20px;
color:#f0f0f0;
margin-bottom:40px;
  text-shadow: 1px 1px 3px rgba(0,0,0,0.4);
}
.right{
display:flex;
gap:10px;
}

</style>
<body>
<header class="header">
<div>
<ul class="navbar">
<li><a href="home.jsp">Home</a></li>
<li><a href="ViewBlog">ViewBlog</a></li>
<li><a href="morefeature.jsp">MoreFeatures</a></li>
<li><a href="Contact.jsp">ContactUs</a></li>
</ul>
</div>

<div class="right">
<a href="register.jsp">
<button class="btn">Register </button>
</a>

<a href="loginForm.jsp">
<button class="btn">Login </button>

</a>
</div>
</header>


<h1 class="hero-title">Welcome to My Blog Plateform</h1>
<p class="hero-subtext">Write, Read and Share Your Thoughts Freely</p>


</body>
</html>