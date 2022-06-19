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
          postID :                ${details.postID}<br><br>
          name :                  ${details.name}<br><br>
          cantact  :              ${details.cantact}<br><br>
          property Name :         ${details.propertyName}<br><br>
		  price			          ${details.price}<br><br>
		  type				      ${details.type}<br><br>
		  propertyStatus		  ${details.propertyStatus}<br><br>
		  bedRoom			      ${details.bedRoom}<br><br>
		  bathRoom			      ${details.bathRoom}<br><br>
		  cityName			      ${details.cityName}<br><br>
		  itemImage	              ${details.itemImage}<br><br>
		  userId	              ${details.userId}<br><br>
		  
		  <a href="/RealEstateWebsite/noon.com/showNewAppartementPage?userId=${details.postID}">Add New Appartement</a>
		  <br><br>
		  <a href="/RealEstateWebsite/noon.com/updateAppartement?userId=${details.postID}">updateAppartement</a> 
		  <br><br>
		  <a href="/RealEstateWebsite/noon.com/deleteAppartement?userId=${details.postID}">deleteAppartement</a> 
		    
</body>
</html>