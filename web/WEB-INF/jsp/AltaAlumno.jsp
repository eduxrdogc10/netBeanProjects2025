<%-- 
    Document   : AltaAlumno
    Created on : 21/08/2025, 12:59:36 AM
    Author     : Garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta alumno</title>
    </head>
    <body>
         <div class="container mt-4 col-lg-4">
    <div class="card border-info">
        <div class="card-header bg-info">
            <h3>Alta de Alumno</h3>
        </div>
        <div class="card-body">
            <form method="POST">
                <label>Cuenta:</label>
                <input type="number" name="cuenta" class="form-control">
                <label>Nombre:</label>
                <input type="text" name="nombre" class="form-control">
                <label>Paterno:</label>
                <input type="text" name="paterno" class="form-control">
                <label>Materno:</label>
                <input type="texto" name="materno" class="form-control">
                <label>Fecha de Nacimiento:</label>
                <input type="date" name="fechaNac" class="form-control">
                <label>Correo:</label>
                <input type="texto" name="correo" class="form-control">
                <label>Celular:</label>
                <input type="number" name="celular" class="form-control">
                <label>Codigo:</label>
                <input type="number" name="codigo" class="form-control">
                <button type="submit" class ="btn btn-success">Agregar</button>
                <a href="index.htm" class="btn btn-warning">Regresar</a>
            </form>
            </div>
        </div>
    </div>
    </body>
</html>
