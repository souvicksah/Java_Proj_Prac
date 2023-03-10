<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Add Form</title>
</head>
<body>
   <spr:form action="car_add.htm" commandName="car" method="post">
        <div>
             <label>Make:</label>
             <spr:input path="make"/>
             <span style="color:red"><spr:errors path="make"></spr:errors></span>
        </div>
        <div>
             <label>Model:</label>
             <spr:input path="model"/>
             <span style="color:red"><spr:errors path="model"></spr:errors></span>
        </div>
        <div>
             <label>Price:</label>
             <spr:input path="price"/>
             <span style="color:red"><spr:errors path="price"></spr:errors></span>
        </div>
        <spr:button value="Add">Add</spr:button>
   </spr:form>
</body>
</html>