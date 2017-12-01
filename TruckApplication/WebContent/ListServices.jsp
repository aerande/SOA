<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="Services.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Service</title>
<link rel="stylesheet" href="style.css" type="text/css">
<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/responsive-slider.css" rel="stylesheet">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link href="css/style.css" rel="stylesheet">
</head>
<body>
<%
String[][] a1 = (String[][]) session.getAttribute("customer_list");
String[][] a2 = (String[][]) session.getAttribute("driver_list");
String[][] a3 = (String[][]) session.getAttribute("employee_list");
String[][] a4 = (String[][]) session.getAttribute("invoice_list");
String[][] a5 = (String[][]) session.getAttribute("order_list");
String[][] a6 = (String[][]) session.getAttribute("truck_list");
String[][] a7 = (String[][]) session.getAttribute("comments_cust_id");
String[][] a8 = (String[][]) session.getAttribute("employee_emp_id");
String[][] a9 = (String[][]) session.getAttribute("expense_emp_id");
String[][] a10 = (String[][]) session.getAttribute("expense_truck_id");
String[][] a11 = (String[][]) session.getAttribute("invoice_tran_id");
String[][] a12 = (String[][]) session.getAttribute("location_cust_id");
String[][] a13 = (String[][]) session.getAttribute("order_cust_id");
String[][] a14 = (String[][]) session.getAttribute("payment_order_id");
String[][] a15 = (String[][]) session.getAttribute("purpose_exp_id");
String[][] a16 = (String[][]) session.getAttribute("transaction_emp_id");
String[][] a17 = (String[][]) session.getAttribute("transaction_tran_id");
String[][] a18 = (String[][]) session.getAttribute("truck_driver_id");
String[][] a19 = (String[][]) session.getAttribute("truck_make");
String[][] a20 = (String[][]) session.getAttribute("truck_vin");
%>
<header>
		<div class="container">
			<div class="row">
				<nav class="navbar navbar-default" role="navigation">
					<div class="container-fluid">
						<div class="navbar-header">
							<div class="navbar-brand">
								<a href="Index.jsp"><h1>Truck Shipping Application</h1></a>
							</div>
						</div>
						<div class="menu">
							<ul class="nav nav-tabs" role="tablist">
								<li role="presentation" class="active"><a href="Index.jsp">Home</a></li>
								<li role="presentation"><a href="Services.jsp">Services</a></li>
								<!-- <li role="presentation"><a href="blog.html">Blog</a></li>
								<li role="presentation"><a href="portfolio.html">Portfolio</a></li> -->
								<li role="presentation"><a href="Login.jsp">Login</a></li>						
							</ul>
						</div>
					</div>			
				</nav>
			</div>
		</div>
	</header>
	<table class="table_services">
<%if(a1!=null) {%>
	<thead>
		<tr>
			<td><b>Customer ID</b></td>
			<td><b>Customer Title</b></td>
			<td><b>Phone Number</b></td>
			<td><b>Fax Number</b></td>
			<td><b>Email</b></td>
			<td><b>Billing Address</b></td>
			<td><b>City</b></td>
			<td><b>State or Province</b></td>
			<td><b>Postal Code</b></td>
			<td><b>Country</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a1.length;i++){%>
		<tr>
		<%for(int j=0;j<a1[i].length;j++) {
			if(a1[i][j]!=null) {%>
				<td><%= a1[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a2!=null) {%>
	<thead>
		<tr>
			<td><b>Employee ID</b></td>
			<td><b>First Name</b></td>
			<td><b>Last Name</b></td>
			<td><b>Email</b></td>
			<td><b>Cell Phone</b></td>
			<td><b>Driver Licence Number</b></td>
			<td><b>Address</b></td>
			<td><b>City</b></td>
			<td><b>State</b></td>
			<td><b>Postal Code</b></td>
			<td><b>Birth Date</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a2.length;i++){%>
		<tr>
		<%for(int j=0;j<a2[i].length;j++) {
			if(a2[i][j]!=null) {%>
				<td><%= a2[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a3!=null) {%>
	<thead>
		<tr>
			<td><b>Employee ID</b></td>
			<td><b>First Name</b></td>
			<td><b>Last Name</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a3.length;i++){%>
		<tr>
		<%for(int j=0;j<a3[i].length;j++) {
			if(a3[i][j]!=null) {%>
				<td><%= a3[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a4!=null) {%>
	<thead>
		<tr>
			<td><b>Invoice ID</b></td>
			<td><b>Order ID</b></td>
			<td><b>Customer ID</b></td>
			<td><b>Payment ID</b></td>
			<td><b>Price ID</b></td>
			<td><b>Transaction ID</b></td>
			<td><b>Truck ID</b></td>
			<td><b>Expense ID</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a4.length;i++){%>
		<tr>
		<%for(int j=0;j<a4[i].length;j++) {
			if(a4[i][j]!=null) {%>
				<td><%= a4[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a5!=null) {%>
	<thead>
		<tr>
			<td><b>Order ID</b></td>
			<td><b>Order Date</b></td>
			<td><b>Customer ID</b></td>
			<td><b>Truck ID</b></td>
			<td><b>Order Total Amount</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a5.length;i++){%>
		<tr>
		<%for(int j=0;j<a5[i].length;j++) {
			if(a5[i][j]!=null) {%>
				<td><%= a5[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a6!=null) {%>
	<thead>
		<tr>
			<td><b>Truck ID</b></td>
			<td><b>Make</b></td>
			<td><b>Year</b></td>
			<td><b>Model</b></td>
			<td><b>Licence Plate No</b></td>
			<td><b>Color</b></td>
			<td><b>VIN</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a6.length;i++){%>
		<tr>
		<%for(int j=0;j<a6[i].length;j++) {
			if(a6[i][j]!=null) {%>
				<td><%= a6[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a7!=null) {%>
	<thead>
		<tr>
			<td><b>Comment ID</b></td>
			<td><b>Comments</b></td>
			<td><b>Comment Type</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a7.length;i++){%>
		<tr>
		<%for(int j=0;j<a7[i].length;j++) {
			if(a7[i][j]!=null) {%>
				<td><%= a7[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a8!=null) {%>
	<thead>
		<tr>
			<td><b>First Name</b></td>
			<td><b>Last Name</b></td>
			<td><b>Email</b></td>
			<td><b>Home Phone</b></td>
			<td><b>Cell Phone</b></td>
			<td><b>Address</b></td>
			<td><b>City</b></td>
			<td><b>State</b></td>
			<td><b>Postal Code</b></td>
			<td><b>Birth Date</b></td>
			<td><b>Date Hired</b></td>
			<td><b>Salary</b></td>
			<td><b>Notes</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a8.length;i++){%>
		<tr>
		<%for(int j=0;j<a8[i].length;j++) {
			if(a8[i][j]!=null) {%>
				<td><%= a8[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a9!=null) {%>
	<thead>
		<tr>
			<td><b>Amount Spent</b></td>
			<td><b>Purpose of Expense</b></td>
			<td><b>Date Purchased</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a9.length;i++){%>
		<tr>
		<%for(int j=0;j<a9[i].length;j++) {
			if(a9[i][j]!=null) {%>
				<td><%= a9[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a10!=null) {%>
	<thead>
		<tr>
			<td><b>Amount Spent</b></td>
			<td><b>Purpose of Expense</b></td>
			<td><b>Date Purchased</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a10.length;i++){%>
		<tr>
		<%for(int j=0;j<a10[i].length;j++) {
			if(a10[i][j]!=null) {%>
				<td><%= a10[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a11!=null) {%>
	<thead>
		<tr>
			<td><b>Order ID</b></td>
			<td><b>Order Date</b></td>
			<td><b>Truck ID</b></td>
			<td><b>Purchase Order Number</b></td>
			<td><b>Order Total Amount</b></td>
			<td><b>Customer ID</b></td>
			<td><b>Email</b></td>
			<td><b>Phone Number</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a11.length;i++){%>
		<tr>
		<%for(int j=0;j<a11[i].length;j++) {
			if(a11[i][j]!=null) {%>
				<td><%= a11[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a12!=null) {%>
	<thead>
		<tr>
			<td><b>Location From</b></td>
			<td><b>Location To</b></td>
			<td><b>Price</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a12.length;i++){%>
		<tr>
		<%for(int j=0;j<a12[i].length;j++) {
			if(a12[i][j]!=null) {%>
				<td><%= a12[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a13!=null) {%>
	<thead>
		<tr>
			<td><b>Order ID</b></td>
			<td><b>Order Date</b></td>
			<td><b>Truck ID</b></td>
			<td><b>Purchase Order Number</b></td>
			<td><b>Order Total Amount</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a13.length;i++){%>
		<tr>
		<%for(int j=0;j<a13[i].length;j++) {
			if(a13[i][j]!=null) {%>
				<td><%= a13[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a14!=null) {%>
	<thead>
		<tr>
			<td><b>Payment ID</b></td>
			<td><b>Payment Method</b></td>
			<td><b>Payment Amount</b></td>
			<td><b>Payment Date</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a14.length;i++){%>
		<tr>
		<%for(int j=0;j<a14[i].length;j++) {
			if(a14[i][j]!=null) {%>
				<td><%= a14[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a15!=null) {%>
	<thead>
		<tr>
			<td><b>Expense Type</b></td>
			<td><b>Purpose of Expense</b></td>
			<td><b>Amount</b></td>
			<td><b>Description</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a15.length;i++){%>
		<tr>
		<%for(int j=0;j<a15[i].length;j++) {
			if(a15[i][j]!=null) {%>
				<td><%= a15[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a16!=null) {%>
	<thead>
		<tr>
			<td><b>Transaction ID</b></td>
			<td><b>Transaction Date</b></td>
			<td><b>Transaction Description</b></td>
			<td><b>Transaction Amount</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a16.length;i++){%>
		<tr>
		<%for(int j=0;j<a16[i].length;j++) {
			if(a16[i][j]!=null) {%>
				<td><%= a16[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a17!=null) {%>
	<thead>
		<tr>
			<td><b>Transaction ID</b></td>
			<td><b>Transaction Date</b></td>
			<td><b>Transaction Description</b></td>
			<td><b>Transaction Amount</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a17.length;i++){%>
		<tr>
		<%for(int j=0;j<a17[i].length;j++) {
			if(a17[i][j]!=null) {%>
				<td><%= a17[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a18!=null) {%>
	<thead>
		<tr>
			<td><b>Truck ID</b></td>
			<td><b>Make</b></td>
			<td><b>Year</b></td>
			<td><b>Model</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a18.length;i++){%>
		<tr>
		<%for(int j=0;j<a18[i].length;j++) {
			if(a18[i][j]!=null) {%>
				<td><%= a18[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a19!=null) {%>
	<thead>
		<tr>
			<td><b>Truck ID</b></td>
			<td><b>Year</b></td>
			<td><b>Model</b></td>
			<td><b>Licence Plate No</b></td>
			<td><b>Color</b></td>
			<td><b>VIN</b></td>
			<td><b>Driver ID</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a19.length;i++){%>
		<tr>
		<%for(int j=0;j<a19[i].length;j++) {
			if(a19[i][j]!=null) {%>
				<td><%= a19[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
<%if(a20!=null) {%>
	<thead>
		<tr>
			<td><b>Truck ID</b></td>
			<td><b>Make</b></td>
			<td><b>Year</b></td>
			<td><b>Model</b></td>
		</tr>
	</thead>
	<tbody>
	<%for(int i=0;i<a20.length;i++){%>
		<tr>
		<%for(int j=0;j<a20[i].length;j++) {
			if(a20[i][j]!=null) {%>
				<td><%= a20[i][j] %></td>
			<%}
		}%>
		</tr>
	<%}%>
	</tbody>
<%}%>
</table>
<form action="goback" action="POST" style="text-align: center;">
	<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10"  style="width: 100%; margin-left: 0px;">
					  <button type="submit" class="btn btn-default">Go back to the list</button>
					</div>
				</div>
</form>
<!--start footer-->
	<footer class="footer">	
		<div class="sub-footer">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<ul class="social-network">
							<li><a href="#" data-placement="top" title="Facebook"><i class="fa fa-facebook fa-1x"></i></a></li>
							<li><a href="#" data-placement="top" title="Twitter"><i class="fa fa-twitter fa-1x"></i></a></li>
							<li><a href="#" data-placement="top" title="Linkedin"><i class="fa fa-linkedin fa-1x"></i></a></li>
							<li><a href="#" data-placement="top" title="Pinterest"><i class="fa fa-pinterest fa-1x"></i></a></li>
							<li><a href="#" data-placement="top" title="Google plus"><i class="fa fa-google-plus fa-1x"></i></a></li>
						</ul>
					</div>
					<div class="col-lg-12">
						<div class="copyright">
							<p>
								<span>&copy;ITMD566 2017 All right reserved. By </span><a href="http://my.iit.edu" target="_blank">Group 10</a>
							</p>
						</div>
					</div>
					
				</div>
			</div>
		</div>
	</footer>
	<!--end footer-->
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-2.1.1.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
	<script src="js/responsive-slider.js"></script>
	<script src="js/wow.min.js"></script>
	<script>
	wow = new WOW(
	 {
	
		}	) 
		.init();
	</script>
</body>
</html>