<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Results</title>
</head>
<body>
<h1>Hotels in ${city} </h1>

	<c:forEach var="hotel" items="${hotels}">
		
		<h2>${hotel.hotelName}</h2>	
			
		
	 <h3> Price per night : $   ${hotel.pricePerNight} </h3>
			</c:forEach>

	<a href="/"> Back to Home Page </a>
</body>
</html>