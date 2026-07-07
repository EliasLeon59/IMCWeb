<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro IMC</title>
</head>

<body style="margin:0; background:#1e5eff; font-family:Arial;">

    <div style="
        width:450px;
        margin:60px auto;
        background:white;
        padding:30px;
        border-radius:10px;
    ">

        <h2 style="text-align:center;">Registro de Usuario</h2>

        <form action="RegistroServlet" method="post">

            <p>Nombre completo:</p>
            <input type="text" name="nombre" style="width:100%; padding:8px;">

            <p>Usuario:</p>
            <input type="text" name="usuario" style="width:100%; padding:8px;">

            <p>Contraseña:</p>
            <input type="password" name="password" style="width:100%; padding:8px;">

            <p>Edad:</p>
            <input type="number" name="edad" style="width:100%; padding:8px;">

            <p>Sexo:</p>
            <select name="sexo" style="width:100%; padding:8px;">
                <option>Masculino</option>
                <option>Femenino</option>
            </select>

            <p>Estatura:</p>
            <input type="number" step="0.01" name="estatura" style="width:100%; padding:8px;">

            <br><br>

            <small>
                Edad mínima: 15 años <br>
                Estatura: 1.00 - 2.50 m
            </small>

            <br><br>

            <button type="submit" style="width:100%; padding:10px;">
                Registrarse
            </button>

        </form>

    </div>

</body>
</html>