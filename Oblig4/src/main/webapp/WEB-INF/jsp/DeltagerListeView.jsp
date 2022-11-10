<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="css/simple.css" />
  <title>Deltagere</title>
</head>
<body>
  <table>
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Phonenumber</th>
        <th>Gender</th>
        <th>Form</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${deltager}" var="deltagere">
        <tr>
          <td>${fornavn}</td>
          <td>${etternavn}</td>
          <td>${mobil}</td>
          <td>${kjonn}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  <form method="post" action="logout">
    <button type="submit">logout</button>
  </form>
</body>
</html>