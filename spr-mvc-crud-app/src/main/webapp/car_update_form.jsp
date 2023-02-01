<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Update Form</title>
</head>
<body>
   <spr:form action="car_update.htm" commandName="car" method="post">
        <spr:hidden path="id"/>
        <div>
             <label>Make:</label>
             <spr:input path="make"/>
        </div>
        <div>
             <label>Model:</label>
             <spr:input path="model"/>
        </div>
        <div>
             <label>Price:</label>
             <spr:input path="price"/>
        </div>
        <spr:button value="Add">Update</spr:button>
   </spr:form>
</body>
</html>