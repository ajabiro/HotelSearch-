<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1> Hotel Search </h1>
<p>
	<form action="/results" method="POST">
	
		  <label for="city">City</label>
 			 <select name="city">
   			 <option value="Traverse City">Traverse City</option>
   			 <option value="Grand Rapids">Grand Rapids</option>
    		 <option value="Petoskey">Petoskey</option>
    		 </select>
		</p>
		<p>
		 <button type="submit">Find Hotels</button> 
	
	
		</p>	
		</form>
</body>
</html>