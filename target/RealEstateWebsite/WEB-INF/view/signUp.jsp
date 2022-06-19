<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <form:form action="registrationDone" method="get" modelAttribute="register">
          
            
           <label>Name</label>
           <form:input path="userName"/>
           
           <label>Phone</label>
           <form:input path="communicateDTO.phone"/>
           
           <label>Email</label>
           <form:input path="email"/>
           
           <label>Password</label>
           <form:input path="userPassword"/>
          
           <input type="submit" value="Submit">
            
        </form:form>
</body>
</html>