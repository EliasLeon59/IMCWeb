<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calcular IMC</title>
</head>

<body style="margin:0; background:#1e5eff; font-family:Arial;">

    <div style="
        width:400px;
        margin:80px auto;
        background:white;
        padding:30px;
        border-radius:10px;
    ">

        <h2 style="text-align:center;">Calcular IMC</h2>

        <form action="IMCServlet" method="post">

            <p>Peso (kg):</p>
            <input type="number" step="0.1" name="peso" style="width:100%; padding:8px;">

            <p>Estatura (m):</p>
            <input type="number" step="0.01" name="estatura" style="width:100%; padding:8px;">

            <br><br>

            <button type="submit" style="width:100%; padding:10px;">
                Calcular IMC
            </button>

        </form>

    </div>

</body>
</html>