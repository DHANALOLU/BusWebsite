<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>WELCOME</title>
    <style>
      .slider {
        width: 500px;
        height: 300px;
        background-color: yellow;
        margin-left: auto;
        margin-right: auto;
        margin-top: 0px;
        text-align: center;
        overflow: hidden;
      }
      .image-container {
        width: 1500px;
        background-color: pink;
        height: 300px;
        clear: both;
        position: relative;
        -webkit-transition: left 2s;
        -moz-transition: left 2s;
        -o-transition: left 2s;
        transition: left 2s;
      }
      .slide {
        float: left;
        margin: 0px;
        padding: 0px;
        position: relative;
      }
      #slide-1:target ~ .image-container {
        left: 0px;
      }
      #slide-2:target ~ .image-container {
        left: -500px;
      }
      #slide-3:target ~ .image-container {
        left: -1000px;
      }
      .buttons {
        position: relative;
        top: -20px;
      }
      .buttons a {
        display: inline-block;
        height: 15px;
        width: 15px;
        border-radius: 50px;
        background-color: lightgreen;
      }
    </style>
  </head>
  <body style="background-color:lightblue">
    <div class="slider">
      <span id="slide-1"></span>
      <span id="slide-2"></span>
      <span id="slide-3"></span>
      <div class="image-container">
        <img src="Image/Bus1.jfif" class="slide" width="500" height="300" />
        <img src="Image/Bus2.jfif" class="slide" width="500" height="300" />
        <img src="Image/Bus3.jfif" class="slide" width="500" height="300" />
      </div>
      <div class="buttons">
        <a href="#slide-1"></a>
        <a href="#slide-2"></a>
        <a href="#slide-3"></a>
      </div>
    </div>
   <form action="UserValidateServlet" method="post">
    <div align ="center">
    <h1>LOGIN</h1>
     <table>
<tr>
<td style="color:black ;font-size:25px">UserName</td>
<td><input type="text" name="regname">
</td>
<tr>
<td style="color:black ;font-size:25px">Password</td>
<td><input type="password" name="regpassword">
</td>
</tr>
</table>

<input type="submit" style="background-color:black;color:white;width:150px;height:40px; " value="LOGIN" name="login">
<p>New User?Register</p>


<input type="submit" style="background-color:black;color:white;width:150px;height:40px; " value="REGISTER" name="register">
    </div>
    </form>
  </body>
</html>