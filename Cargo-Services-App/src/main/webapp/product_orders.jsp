<%@page import="com.sou.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%List<Product> list = (List<Product>)request.getAttribute("products"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
  rel="stylesheet"
/>
<link
  href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
  rel="stylesheet"
/>
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.1/mdb.min.css"
  rel="stylesheet"
/>
<style>
.cont{
display:flex;
flex-direction: row;
justify-content: space-around;
margin-bottom:20vh;
margin-top:10vh;
}
</style>
<script
  type="text/javascript"
  src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.1/mdb.min.js"
></script>
</head>
<body style="background-image: url('https://thumbs.dreamstime.com/b/caravan-trucks-cargo-transportation-concept-23576201.jpg'); background-repeat: no-repeat; background-attachment: fixed; background-size: cover;">
<jsp:include page="header.jsp"/>
<div class="cont">
<%for(int i=0;i<list.size();i++){ %>
          <div class="card" style="width: 18rem;">
               <img src="https://thumbs.dreamstime.com/b/delivery-man-blue-uniform-handing-parcel-box-to-recipient-courier-service-concept-84275323.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                <h5 class="card-title">Source:<%=list.get(i).getSource() %></h5>
                <h5 class="card-title">Destination:<%=list.get(i).getDestination() %></h5>
                <h5 class="card-title"> TruckType:<%=list.get(i).getTrucktype() %></h5>
                <h5 class="card-title">Booking Date:<%=list.get(i).getBookingdate() %></h5>
                <a href="product_delete.htm?id=<%=list.get(i).getId()%>" class="btn btn-primary">Delete</a>
                <a href="product_update_form.htm?id=<%=list.get(i).getId() %>" class="btn btn-primary">Update</a>
                <a href="#" class="btn btn-primary" style="margin-top: 10px;">Pay Now</a>
            </div>
            </div>
           <%} %> 
 </div>
 <jsp:include page="footer.jsp"/>
</body>
</html>