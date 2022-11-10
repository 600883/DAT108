<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/simple.css">
<title>Påmeldingsbekreftelse</title>
</head>
    <body>
        <h2>Påmeldingsbekreftelse</h2>
            <p>Du er logget inn som:</p>
           <p>
                <c:out value="${deltager.fornavn}"/>
                <br>&nbsp; &nbsp; &nbsp;
                <c:out value="${deltager.etternavn}" />
                <br>&nbsp; &nbsp; &nbsp;
                <c:out value="${deltager.mobil}" />
                <br>&nbsp; &nbsp; &nbsp;
                <c:out value="${deltager.kjonn}" />



           </p>
            <a href="deltagerliste">Gå til deltagerlisten</a>
    </body>
</html>