<%@page import="com.sou.service.ProductServiceImpl"%>
<%@page import="com.sou.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
    <link
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
  rel="stylesheet"
/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link
  href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
  rel="stylesheet"
/>
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.1/mdb.min.css"
  rel="stylesheet"
/>
	<script type="text/javascript" src="webjars/jquery/2.2.4/jquery.min.js" ></script>
<script type="text/javascript">

$(document).ready(function () {

    $("#customer_form").submit(function (event) {
        //event.preventDefault();

        var customer = {}
        
        customer["fname"] = $("#fname").val();
        customer["lname"] = $("#lname").val();
        customer["peraddress"] = $("#peraddress").val();
        customer["curaddress"] = $("#curaddress").val();
        customer["mobileno"] = $("#mobileno").val();
        customer["custtype"] = $("#custtype").val();
        customer["email"] = $("#email").val();
        customer["password"] = $("#password").val();
        customer["conpassword"] = $("#conpassword").val();

        $("#bth_submit").prop("disabled", true);

        $.ajax({
            
            type: "POST",
            contentType: "application/json",
            url: "http://localhost:8080/customer_add_form",
            data: JSON.stringify(customer),
            dataType: 'json',
            cache: false,
            timeout: 600000,
            success: function (data) {
					consol.log()
                var json = JSON.stringify(data, null,4);
                $('#feedback').html(json);

                $("#bth_submit").prop("disabled", false);

            },
            error: function (e) {
                var json = e.responseText;
                $('#feedback').html(json);
                $("#bth_submit").prop("disabled", false);
            }
        });
    		
        
    });

});

</script>



<style>
.container1{
    align-items: center;
    background: rgba(0, 0, 0, 0.2);
    color: black;
    border: 3px solid rgb(255, 255, 255);
    border-radius: 7px;
    width: 30%;
    height: 85%;
    padding: 20px;
    background-color: white;
    margin-left: 60%;
    margin-top: 15px;
    margin-bottom: 15px;
    border: 1px solid;
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
<div class="bg-img">
<spr:form action="/product_update" method="post" commandName="product" class="container1">
      <spr:hidden path="id" />
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
                  <spr:option name="trucktype" value="1.5">ACE / DOST / PICKUP (1.5 TON)</spr:option>
                  <spr:option name="trucktype" value="4">TATA 407 / EICHER 14FT (4 TON)</spr:option>
                  <spr:option name="trucktype" value="7">32FT CONTAINER (7 TON)</spr:option>
                  <spr:option name="trucktype" value="10">TATA TRUCK (10 TON)</spr:option>             
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
             <spr:hidden path="uid"/>
  
              <div class="inputBoxNew">
                <spr:button type="submit" id="psub" style="background-color: #2d545e;">Add Product</spr:button>
              </div>
            </div>
          </div>
          </spr:form>
          </div>
   <jsp:include page="footer.jsp"/>
</body>
</html>