<%-- 
    Document   : index
    Created on : 23/10/2023, 20:42:13
    Author     : José Arévalo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>LOGIN</title>
    </head>
    <%
        String rspta="";
        if(request.getParameter("rspta")!=null){
        int r=Integer.parseInt(request.getParameter("rspta"));
        if(r==0){
            rspta="Error: El usuario y contraseña no Existe";
            }
        }
       
    %>
    <body>
    <center><div class="container" style="margin-top: 80px;"> 
            <form method="post" action="/login/LoginController">
                <div class="card" style="width: 15rem;">
                <div class="card-body">
                    <h6>Iniciar Sesion</h6>
                    <input type ="text" name = "txt_usuario" class="form-control mt-2" placeholder="Usuario" required>
                    <input type ="password" name = "txt_clave" class="form-control mt-2" placeholder="Clave" required>
                    <input type ="submit" class="btn btn-primary btn-block mt-2" name="btn-login" value="ingresar">
                    <p style="color: red;"><%=rspta%></p>
                    </div>
                </div>
            </form>
            </div>
        </center>
    </body>
</html>
