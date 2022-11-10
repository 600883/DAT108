<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <c:out value="${fornavn}"/>
                <br>&nbsp; &nbsp; &nbsp;
                <c:out value="${etternavn}" />
                <br>&nbsp; &nbsp; &nbsp;
                <c:out value="${mobil}" />
                <br>&nbsp; &nbsp; &nbsp;
                <c:out value="${kjonn}" />



           </p>
            <a href="deltagerliste">Gå til deltagerlisten</a>
    </body>
</html>