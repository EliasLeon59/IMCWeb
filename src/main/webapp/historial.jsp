<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Historial IMC</title>
</head>

<body style="margin:0; background:#1e5eff; font-family:Arial;">

    <div style="
        width:500px;
        margin:60px auto;
        background:white;
        padding:30px;
        border-radius:10px;
        text-align:center;
    ">

        <h2>Resultado IMC</h2>


        <p>
    Tu IMC es:
    <b>
        <%= String.format("%.2f", request.getAttribute("imc")) %>
    </b>
</p>


        <p>
            Clasificación:
            <b>
                <%= request.getAttribute("clasificacion") %>
            </b>
        </p>


        <br>


        <h2>Historial de IMC</h2>


        <table border="1" style="width:100%; border-collapse:collapse;">

    <tr>
        <th>Fecha</th>
        <th>Peso</th>
        <th>IMC</th>
        <th>Estado</th>
    </tr>


<%
    java.util.List<com.imc.modelo.HistorialIMC> lista =
        (java.util.List<com.imc.modelo.HistorialIMC>) request.getAttribute("historial");


    if (lista != null) {

        for (com.imc.modelo.HistorialIMC h : lista) {
%>

    <tr>

        <td>
            <%= h.getFechaMedicion() %>
        </td>

        <td>
            <%= h.getPeso() %> kg
        </td>

        <td>
           <%= String.format("%.2f", h.getImc()) %>
        </td>
        <td>
    <%
        com.imc.modelo.IMC calculadora = new com.imc.modelo.IMC();
        out.print(calculadora.clasificarIMC(h.getImc()));
    %>
</td>

    </tr>


<%
        }

    }
%>


</table>


        <br>


        <a href="calcularIMC.jsp">
            Calcular nuevamente
        </a>


    </div>

</body>
</html>