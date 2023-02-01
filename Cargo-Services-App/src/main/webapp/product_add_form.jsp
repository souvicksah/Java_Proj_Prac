<%@page import="com.sou.dao.ProductDaoImpl"%>
<%@page import="com.sou.service.ProductServiceImpl"%>
<%@page import="com.sou.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<%List<Product> list = (List<Product>)request.getAttribute("products"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
    <link rel="stylesheet" href="ProductFormStyle.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
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
.container1{
    align-items: center;
    background: rgba(0, 0, 0, 0.2);
    color: black;
    border: 3px solid rgb(255, 255, 255);
    border-radius: 7px;
    height: 90%;
    padding: 20px;
    background-color: white;
    margin-top: 15px;
    width:40%;
    margin-bottom: 15px;
    margin-left:10px;
    border: 1px solid;
}
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
<body
	style="background-image: url('https://thumbs.dreamstime.com/b/caravan-trucks-cargo-transportation-concept-23576201.jpg'); background-repeat: no-repeat; background-attachment: fixed; background-size: cover;">
<jsp:include page="header.jsp"/>
<div class="bg-img first">

<div>
<spr:form action="product_add.htm" method="post" commandName="product" class="container1">
            <div class="formnew">
            <h1>Booking</h1>
            <div class="input">
            <div class="inputBoxNew">
            <label>Source</label>
 			<spr:select class="form-control" name="source" path="source">
                  <spr:option name="source"  value="">Select Option</spr:option>
                  <spr:option name="source" value="Ahmedabad">Ahmedabad</spr:option>
                  <spr:option name="source" value="Bangalore">Bangalore</spr:option>
                  <spr:option name="source" value="Chennai">Chennai</spr:option>
                  <spr:option name="source" value="Delhi">Delhi</spr:option>             
                  <spr:option name="source" value="Hyderabad">Hyderabad</spr:option>             
                  <spr:option name="source" value="Jaipur">Jaipur</spr:option>             
                  <spr:option name="source" value="Kolkata">Kolkata</spr:option>             
                  <spr:option name="source" value="Mumbai">Mumbai</spr:option>             
                  <spr:option name="source" value="Pune">Pune</spr:option>             
                </spr:select>            
                
                <label for="destination">Destination</label>
                <spr:select class="form-control" path="destination" name="destination" >
                  <spr:option name="destination"  value="">Select Option</spr:option>
                  <spr:option name="destination" value="Ahmedabad">Ahmedabad</spr:option>
                  <spr:option name="destination" value="Bangalore">Bangalore</spr:option>
                  <spr:option name="destination" value="Chennai">Chennai</spr:option>
                  <spr:option name="destination" value="Delhi">Delhi</spr:option>             
                  <spr:option name="destination" value="Hyderabad">Hyderabad</spr:option>             
                  <spr:option name="destination" value="Jaipur">Jaipur</spr:option>             
                  <spr:option name="destination" value="Kolkata">Kolkata</spr:option>             
                  <spr:option name="destination" value="Mumbai">Mumbai</spr:option>             
                  <spr:option name="destination" value="Pune">Pune</spr:option>             
                </spr:select> 
            </div>
            
              <div class="inputBoxNew">
                <label for="trucktype">Truck Type</label>
                <spr:select class="form-control" path="trucktype" name="trucktype">
                  <spr:option name="trucktype"  value="">Select Option</spr:option>
                  <spr:option name="trucktype" value="ACE / DOST / PICKUP (1.5 TON)">ACE / DOST / PICKUP (1.5 TON)</spr:option>
                  <spr:option name="trucktype" value="TATA 407 / EICHER 14FT (4 TON)">TATA 407 / EICHER 14FT (4 TON)</spr:option>
                  <spr:option name="trucktype" value="32FT CONTAINER (7 TON)">32FT CONTAINER (7 TON)</spr:option>
                  <spr:option name="trucktype" value="TATA TRUCK (10 TON)">TATA TRUCK (10 TON)</spr:option>             
                </spr:select>
              </div>
              <div class="inputBoxNew">
                <label for="goodstype">Goods Type</label>
                <spr:select class="form-control" path="goodstype" name="goodstype">
                  <spr:option name="goodstype" value="">Select Option</spr:option>
                  <spr:option name="goodstype" value="Industrial Machinery">Industrial Machinery</spr:option>
                  <spr:option name="goodstype" value="Household Goods">Household Goods</spr:option>
                  <spr:option name="goodstype" value="Textile / Garments">Textile / Garments</spr:option>
                  <spr:option name="goodstype" value="Scrap">Scrap</spr:option>
                  <spr:option name="goodstype" value="Others">Others</spr:option>
                </spr:select>
              </div>
            
              <div class="inputBoxNew ">
              <label for="bookingdate">Booking Date</label>
			   <spr:input path="bookingdate" id="datepicker" width="276" data-date-end-date="1d"/>
			    <script>
			        $('#datepicker').datepicker({
			            uiLibrary: 'bootstrap4',
			            
			            format:'yyyy-mm-dd',			           
			            minDate: new Date()
			            	  
			        });
			    </script>
              </div>
            
  
              <div class="inputBoxNew">
                <spr:button type="submit" id="psub" style="background-color: #2d545e; margin-top:10px;margin-bottom:20px;">Add Product</spr:button>
              </div>
            </div>
          </div>
          </spr:form>
          </div>
          <div>
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
          </div>
          </div>
          
  

          
   <jsp:include page="footer.jsp"/>
</body>
</html>