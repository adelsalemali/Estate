<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
		<form action="showAddStudentPage">

			<input type="submit" value="Add">

		</form>
		<!-- ModelAttribute : students -->
		<h1>Hi.........</h1>
		
		<table border="1">

			<thead>
				<tr>
					<td><a href="/RealEstateWebsite/noon.com/orderData/postID">postID</a></td>
					<td><a href="/RealEstateWebsite/noon.com/orderData/name">Name</a></td>
					<td><a href="/RealEstateWebsite/noon.com/orderData/cantact">cantact</a></td>
					<td><a href="/RealEstateWebsite/noon.com/orderData/propertyName">property Name</a></td>
					<td><a href="/RealEstateWebsite/noon.com/orderData/price">price</a></td>
					<td><a href="/RealEstateWebsite/noon.com/orderData/type">type</a></td>
					<td><a href="/RealEstateWebsite/noon.com/orderData/Cityname">City</a></td>
					<td><a href="/RealEstateWebsite/noon.com/orderData/image">image</a></td>
					<td><a href="/RealEstateWebsite/noon.com/orderData/price">userId</a></td>
					<td>Details</td>
				</tr>
			</thead>
			<c:forEach var="appartement" items="${addAppartement}"> 
				<tr> 
					<td>${appartement.postID}</td>
					<td>${appartement.name}</td>
					<td>${appartement.cantact}</td>
					<td>${appartement.propertyName}</td>
					<td>${appartement.price}</td>
					<td>${appartement.type}</td>
					<td>${appartement.cityName}</td>
					<td>${appartement.itemImage}</td>
					<td>${appartement.userId}</td>
					<td><a href="/RealEstateWebsite/noon.com/showDetails?userId=${appartement.postID}">Details</a></td> 
				</tr>
			</c:forEach>
			
			<c:forEach var="n" begin="1" end="${m}">
				<a href="aparment?page=${n}">${n}</a>
			</c:forEach>
			
		</table>
		
		   <a href="/RealEstateWebsite/noon.com/listAddAppartements/1">1</a>     
		   <a href="/RealEstateWebsite/noon.com/listAddAppartements/2">2</a>     
		   <a href="/RealEstateWebsite/noon.com/listAddAppartements/3">3</a>
		   
		   <div align="left">
		   <h2>Choose your type</h2>
			   <a href="/RealEstateWebsite/noon.com/chooseYourType/Flex room">Flex room	</a>  <br> <br>
			   <a href="/RealEstateWebsite/noon.com/chooseYourType/apartment">Apartment</a>
		   </div> 

	</div>
</body>
</html>