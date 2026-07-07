<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login IMC</title>
</head>

<body style="margin:0; background:#1e5eff; font-family:Arial;">

    <div style="
        width:350px;
        margin:120px auto;
        background:white;
        padding:30px;
        border-radius:10px;
        text-align:center;
    ">

        <h2>Iniciar Sesión</h2>

        <form action="LoginServlet" method="post">

            <p>Usuario:</p>
            <input type="text" name="usuario" style="width:100%; padding:8px;">

            <p>Contraseña:</p>
            <input type="password" name="password" style="width:100%; padding:8px;">

            <br><br>

            <button type="submit" style="width:100%; padding:10px;">
                Entrar
            </button>

        </form>

        <br>

        <a href="registro.jsp">¿No tienes cuenta? Regístrate</a>

    </div>

</body>
</html>