<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="java.util.Date" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Student</title>
<style >
body {background-color: rgb(201, 76, 76);}
</style>
</head>
<body>


<div class="container">
<h1>Student list</h1>
<!-- ${student } -->
<form action="addstudent">   
<input type="submit" value="Add Student">

</form>

</div>
<br>
<br>
<br>
  </tbody>
</table>

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Student-id</th>
      <th scope="col">name</th>
      <th scope="col">age</th>

    </tr>
  </thead>
  <tbody>
  <c:forEach items="${student }" var ="stud">  
    <tr>
      <th scope="row">${stud.id }</th>
      <td>${stud.Student_id}</td>
      <td>${stud.name }</td>
     <td>${stud.age }</td>
     <td>false</td>
      <td><a href="delet/<c:out value='${stud.id }'/>">DELETE</a></td>
     
    </tr>
<br>
</c:forEach>

  </tbody>
</table>
</body>
</html>