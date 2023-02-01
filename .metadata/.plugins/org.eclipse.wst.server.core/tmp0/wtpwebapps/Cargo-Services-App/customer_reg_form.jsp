<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link rel="stylesheet" type="text/css" href="regi.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<spr:form action="regi.jsp" method="post" commandName="customer">

		<section class="h-100 bg-dark">
			<div class="container py-5 h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col">
						<div class="card card-registration my-4">
							<div class="row g-0">
								<div class="col-xl-6 d-none d-xl-block">
									<img src="cargo1.jpg" alt="Sample photo" class="img-fluid h-100" 
										style="border-top-left-radius: 0.25rem; border-bottom-left-radius: 0.25rem;" />
								</div>
								<div class="col-xl-6">
									<div class="card-body p-md-5 text-black">
										<h3 class="mb-5 text-uppercase">customer registration
											form</h3>

										<div class="row">
											<div class="col-md-6 mb-4">
												<div class="form-outline">
													<label class="form-label" for="form3Example1m">First
														name</label> <label style="color: red;"><b>*</b></label> 
														<spr:input
														name="fname" type="text" id="form3Example1m"
														class="form-control form-control-lg" 
														placeholder="Enter First name" path="fname"/>

												</div>
											</div>
											<div class="col-md-6 mb-4">
												<div class="form-outline">
													<label class="form-label" for="form3Example1n">Last
														name</label> <label style="color: red;"><b>*</b></label> 
														<spr:input
														name="lname" type="text" id="form3Example1n"
														class="form-control form-control-lg"
														placeholder="Enter Last name" path="lname"/>

												</div>
											</div>
										</div>


										<div class="form-outline mb-4">
											<label class="form-label" for="form3Example8">Permanent
												Address</label> <label style="color: red;"><b>*</b></label> 
												<spr:input
												name="peraddress" type="text" id="form3Example8"
												class="form-control form-control-lg" 
												placeholder="Enter Permanent Address" path="peraddress"/>

										</div>

										<div class="form-outline mb-4">
											<label class="form-label" for="form3Example8">Current
												Address</label> <label style="color: red;"><b>*</b></label> 
												<spr:input
												name="curaddress" type="text" id="form3Example8"
												class="form-control form-control-lg" 
												placeholder="Enter Current Address" path="curaddress"/>

										</div>

										<div class="form-outline">
											<label class="form-label" for="MobileNumber">Mobile
												Number</label> <label style="color: red;"><b>*</b></label> <spr:input
												name="mobileno" type="tel" id="phoneNumber"
												class="form-control form-control-lg" 
												placeholder="Enter Mobile Number" path="mobileno" />

										</div>


										<div
											class="d-md-flex justify-content-start align-items-center mb-4 py-2">

											<h6 class="mb-0 me-4">Customer Type:</h6>
											<br></br>

											<div class="form-check form-check-inline mb-0 me-4">
												<spr:input name="custtype" class="form-check-input" type="radio"
													id="private" value="option1" path="custtype" /> <label
													class="form-check-label" for="private">Private</label>
											</div>

											<div class="form-check form-check-inline mb-0 me-4">
												<spr:input name="custtype" class="form-check-input" type="radio"
													id="business" value="option2" path="custtype" /> <label
													class="form-check-label" for="business">Business</label>
											</div>



										</div>




										<div class="form-outline mb-4">
											<label class="form-label" for="form3Example97">Email
												ID</label> <label style="color: red;"><b>*</b></label> <spr:input
												name="email" type="text" id="form3Example97"
												class="form-control form-control-lg"
												placeholder="Enter Email ID" path="email"/>

										</div>

										<div class="form-outline mb-4">
											<label for="exampleInputPassword1" class="form-label">Password</label>
											<label style="color: red;"><b>*</b></label> 
											<spr:input
												name="password" path="password" type="password" id="exampleInputPassword1"
												class="form-control form-control-lg" 
												placeholder="Enter Password"/>

										</div>
										<div class="form-outline mb-4">
											<label for="exampleInputPassword1" class="form-label">Confirm
												Password</label> <label style="color: red;"><b>*</b></label> 
												<spr:input
												name="conpassword" type="password"
												id="exampleInputPassword1"
												class="form-control form-control-lg"
												placeholder="Enter Confirm Password" path="conpassword"/>

										</div>



										<div class="d-flex justify-content-end pt-3">
											<spr:button type="Reset" class="btn btn-light btn-lg">Reset</spr:button>
											<spr:button type="submit" class="btn btn-warning btn-lg ms-2">Submit
												form</spr:button>
										</div>


									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</spr:form>

</body>
</html>