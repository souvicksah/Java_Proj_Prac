<%@page import="com.sou.model.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%List<Car> lst=(List<Car>)request.getAttribute("cars"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car List</title>
</head>
<body>
<table>
   <thead>
       <tr>
           <th>make</th>
           <th>model</th>
           <th>price</th>
           <th>delete</th>
           <th>Update</th>
           <th>UpLoad</th>
       </tr>
   </thead>
   <tbody>
       <%for(Car car:lst){ %>
           <tr>
               <td><%=car.getMake() %></td>
               <td><%=car.getModel() %></td>
               <td><%=car.getPrice()%></td>
               <td><a href="car_delete.htm?id=<%=car.getId()%>">Delete</a></td>
               <td><a href="car_update_form.htm?id=<%=car.getId()%>">Update</a></td>
               <td><a href="car_upload_form.jsp?id=<%=car.getId()%>">
               <img alt="no image" width="50" height="50" src="images/<%= car.getImage()%>"></a></td>
           </tr>
       <%} %>
   </tbody>
</table>
</body>
</html>