<%-- 
    Document   : indenx
    Created on : Jun 19, 2023, 12:01:05 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Bootsrap-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <title>Login</title>
    <br>
    </head>
    <body>
        
        <h1 class="container text-secondary" >Login Page</h1>
     
        
        <form action="CandidateController" class="container">
            <input type="hidden" name="action" value="login">
            Mobile number : <input type="number" name="phone">
            Password : <input type="password" name="password">
            <br>
            <br>
            <br>
            <input type="submit" value="Login" class="btn btn-outline-dark container" >
            
            
        </form>
      
        <h2>${param.msg}</h2>
    </body>
</html>
