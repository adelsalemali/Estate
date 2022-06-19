<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
        <form:form action="save-appartement" modelAttribute="showData" method="Post">
          
          <form:hidden path="postID"/>
          
          <p>
	          <label>Name</label><br>
	          <form:input path="name"/>
	          <form:errors path="name" cssClass="erorr"/>
          </p>
           
          <label>Cantact</label><br>
          <form:input path="cantact"/><br><br>
         
         <p>
	          <label>Property Name</label><br>
	          <form:input path="propertyName"/>
	          <form:errors path="propertyName" cssClass="erorr"/>
         </p>
          
          <p>
	          <label>Price</label><br>
	          <form:input path="price"/>
	         
          </p>
          
          <p>
          <label>Type</label><br>
          <form:input path="type"/>
          <form:errors path="type" cssClass="erorr"/>
          </p>
          
          <p>
          <label>Property Status</label><br>
          <form:input path="propertyStatus"/>
          <form:errors path="propertyStatus" cssClass="erorr"/>
          </p>
          
          <p>
	          <label>Bed Room</label><br>
	          <form:input path="bedRoom"/>
	          <form:errors path="bedRoom" cssClass="erorr"/>
          </p>
          
           <p>
	           <label>Bath Room</label><br>
	           <form:input path="bathRoom"/>
	           <form:errors path="bathRoom" cssClass="erorr"/>
          </p>
          
          <p>
	          <label>City</label><br>
	          <form:input path="cityName"/>
	          <form:errors path="cityName" cssClass="erorr"/>
          </p>
          
          <label>itemImage</label><br>
          <form:input path="itemImage"/><br><br>
          
          <form:hidden path="userId"/><br>
          
          <input type="submit"/>
          
         </form:form>
        </div>
</body>
</html>