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
</head>
<body>
        <div align="center">
        <form:form action="save-appartement" modelAttribute="showData" method="Post"> 
          
          <form:input path="postID"/>
          
          <label>Name</label><br>
          <form:input path="name"/><br><br>
          <form:errors path="name" />
           
          <label>Cantact</label><br>
          <form:input path="cantact"/><br><br>
          <form:errors path="cantact" />
          
          <label>Property Name</label><br>
          <form:input path="propertyName"/><br><br>
          <form:errors path="propertyName" />+
          
          <label>Price</label><br>
          <form:input path="price"/><br><br>
          <form:errors path="price" /> 
          
          <label>Type</label><br>
          <form:input path="type"/><br><br>
          <form:errors path="type" /> 
          
          <label>Property Status</label><br>
          <form:input path="propertyStatus"/><br><br>
          <form:errors path="propertyStatus" />
          
          <label>Bed Room</label><br>
          <form:input path="bedRoom"/><br><br>
          <form:errors path="bedRoom" />
          
          <label>Bath Room</label><br>
          <form:input path="bathRoom"/><br><br>
          <form:errors path="bathRoom" />
          
          <label>City</label><br>
          <form:input path="cityName"/><br><br>
          <form:errors path="cityName" />
          
          <label>itemImage</label><br>
          <form:input path="itemImage"/><br><br>
          <form:errors path="itemImage" />
          
          <form:hidden path="userId"/><br>
          
          <input type="submit"/>
          
         </form:form>
        </div>
</body>
</html>