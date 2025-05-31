<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body
{
margin:0px;
padding:0px;
  background:url('images/11.jpg') no-repeat center center fixed;
  background-size:cover;
  font-family:Arial,sans-serif;
}
.hero-title{
text-align:center;
color:black;
font-size:40px;
}
.hero-subtext{
text-align:center;
font-size:18px;
color:red;
}
form{
max-width:400px;
margin:50px auto;
padding:30px;
background:#f9f9f9;
border-radius:15px;

}
input[type="text"]{
<<<<<<< HEAD
width:100%;
=======
width:90%;
>>>>>>> 1e144a9 (first commit)
padding:12px 10px;
margin:10px 0;
font-size:16px;
}
input[type="button"]{
color:white;



}
.button-king{
display:flex;
justify-content:center;

margin-top:15px;
}


</style>
</head>
<body>
<h1 class="hero-title">Contact Us</h1>
<p class="hero-subtext">Do you have any questions? Please do not hesitate to contact us directly.Our team will contact you shortly</p>

<form action="Contact" method="post">
<input type="text" name="name1" placeholder="Your Name"/>
<input type="text" name="email1" placeholder="Your Emailid "/>
<input type="text" name="subject1"placeholder="Subject"/>
<input type="text" name="message1" placeholder="Your Message"/>
<div class="button-king">
<button type="submit">Send</button>
</div>
</form>


</body>
</html>