<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h3{
color:green;
text-align:center;
font-size:28px;
font-weight:bold;
margin-bottom: 25px;
  letter-spacing: 1px;
  font-family: 'Segoe UI', sans-serif;

}
body{
background:url('images/reg.jpg');


margin:0px;
padding:0px;

}
body::before {
  content: "";
  position: fixed;
  top: 0; left: 0;
  width: 100%;
  height: 100%;
  background: rgba(255, 255, 255, 0.4); /* Transparent white overlay */
  z-index: -1;
}
 form{
 width:300px;
 margin:40px auto;
 padding:25px;
 display:flex;
 flex-direction:column;
 background:#f9f9f9;
 gap:15px;
<<<<<<< HEAD
 }
=======
 align-items:center;
 }
 
>>>>>>> 1e144a9 (first commit)
  input[type="text"],input[type="password"]{
 padding:12px;
 border-radius:6px;
 border:1px solid #ccc;
 font-size:15px;
 }
 .login-form button {
  padding: 12px;
  background-color: #3498db;
  color: white;
  border: none;
  font-size: 16px;
  font-weight: bold;
  border-radius: 8px;
  cursor: pointer;
  transition: background-color 0.3s ease, transform 0.2s ease;
}
<<<<<<< HEAD
=======
.title{
text-align:center;
margin-top:0;
color:red;

}
.container{
display:flex;
align-items:center;
justify-content:center;
height:100vh;

}
>>>>>>> 1e144a9 (first commit)
 </style>

</head>
<body>
<<<<<<< HEAD
<div align=center>
<h3>Login</h3>
</div>

<form action="loginForm" method="post" class="login-form">
<input type="text" name="email1" placeholder="Enter Your Email"/>
<input type="password" name="pass1" placeholder="Enter Your Password"/>
 <button type="submit">Login</button>
</form>
=======
<div class="container">
<form action="loginForm" method="post" class="login-form">

<h3 class="title">Login</h3>


<input type="text" name="email1" placeholder="Enter Your Email" required/>
<input type="password" name="pass1" placeholder="Enter Your Password" required/>
 <button type="submit">Login</button>
 <a href="reset_password.jsp">Reset Password</a>
 <a href="register.jsp">Sign Up</a>
</form>
</div>

>>>>>>> 1e144a9 (first commit)

</body>
</html>