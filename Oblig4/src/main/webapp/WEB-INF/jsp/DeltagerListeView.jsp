<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/simple.css">
<title>Deltagerliste</title>
</head>
    <body>
        <h2>Deltagerliste</h2>
            <p>De som er påmeldt er:</p>
            <br>
            <p>%{p.fornavn}</p>
            <p>${p.etternavn}</p>
            <p>${p.tlfNr}</p>
            <p>${p.kjonn}</p>
            <br>
            <a href="deltagerliste">Gå til deltagerlisten</a>
    </body>
</html>