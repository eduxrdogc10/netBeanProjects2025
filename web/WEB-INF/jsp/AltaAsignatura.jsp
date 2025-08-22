<%-- 
    Document   : AltaAsignatura
    Created on : 16/08/2025, 01:55:45 PM
    Author     : Garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Universidad CUX</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
    <div class="card border-info">
        <div class="card-header bg-info">
            <h3>Alta de Asignatura</h3>
        </div>
        <div class="card-body">
            <form method="POST">
                <label>Clave:</label>
                <input type="texto" name="clave" class="form-control">
                <label>Nombre:</label>
                <input type="texto" name="nombre" class="form-control">
                <label>Creditos:</label>
                <input type="texto" name="creditos" class="form-control">
                <label>Horas:</label>
                <input type="texto" name="horas" class="form-control">
                <button type="submit" class ="btn btn-success">Agregar</button>
                <a href="index.htm" class="btn btn-warning">Regresar</a>
            </form>
            </div>
        </div>
    </div>
    </body>
</html>
