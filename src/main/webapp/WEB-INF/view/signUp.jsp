<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
     .erorr
		     {
		        color: red;
		        position: fixed;
		        text-align: left;
		        margin-left: 30px;
		     }
</style>
</head>
<body>

       <div align="center">
        <form:form action="registrationDone" method="get" modelAttribute="register">
          
           <p>
           <label>Name</label><br><br>
           <form:input path="userName"/>
           <form:errors path="userName" cssClass="erorr"/>
           
           </p>
           
           <p>
           <label>Phone</label><br><br>
           <form:input path="communicateDTO.phone"/>
           
           </p>
           
           <p>
           <label>Email</label><br><br>
           <form:input path="email"/>
           <form:errors path="email" cssClass="erorr"/>
           </p>
           
           <p>
           <label>Password</label><br><br>
           <form:input path="userPassword"/>
           <form:errors path="userPassword" cssClass="erorr"/>
          </p>
           <input type="submit" value="Submit">
            
        </form:form>
        </div>
</body>
</html>