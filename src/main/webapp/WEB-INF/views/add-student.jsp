<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> create Student</h1>
<form action="savestudent" method="post">
<table>
  <tr>
    <td>Student-number</td>
    <td><form:input path="id"/></td>
  </tr>
    <tr>
    <td>Student-id</td>
    <td><form:input path="student-id"/></td>
  </tr>
      <tr>
    <td>Student-name</td>
    <td><form:input path="name"/></td>
  </tr>
      <tr>
    <td>Student-age</td>
    <td><form:input path="age"/></td>
  </tr>
  <tr>
  <td>
  <input type="submit" value="Save Student"/>
  </td></tr>
</table>

</form>

</body>
</html>