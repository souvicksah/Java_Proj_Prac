<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product_orders</title>
<style>
.card{

margin-bottom:5vh;
margin-top:5vh;
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="background-color: #ecf9ff">
<jsp:include page="header.jsp"/>
<div >
 <div class="row">
     <c:forEach items="${products}" var="product">
  		<div class="col-sm-3">
             <div class="card" style="width: 18rem;">
             	<img src="https://thumbs.dreamstime.com/b/delivery-man-blue-uniform-handing-parcel-box-to-recipient-courier-service-concept-84275323.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                	<h5 class="card-title">Source:${product.source}</h5>
                	<h5 class="card-title">Destination:${product.destination}</h5>
                	<h5 class="card-title"> TruckType:${product.trucktype}</h5>
               		<h5 class="card-title">Booking Date:${product.bookingdate}</h5>
               		<a href="/deleteproduct?id=${product.id}" class="btn btn-primary">Cancel Order</a>
               		
           		</div>
            </div>
         </div>
	</c:forEach>
</div>
 </div>
	<jsp:include page="footer.jsp"/>
</body>
</html>