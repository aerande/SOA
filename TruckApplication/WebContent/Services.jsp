<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Services List</title>
<link rel="stylesheet" href="style.css" type="text/css">
<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/responsive-slider.css" rel="stylesheet">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link href="css/style.css" rel="stylesheet">
</head>
<body>
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
	
	<div class="container">
		<div class="breadcrumbs">
			<h4 style="font-size: x-large;">List of Services</h4>
		</div>
		<div class="col-lg-6">
			<form class="form-horizontal" action="list" method="POST">
				<!-- <div class="form-group">
					<button type="submit" class="btn btn-default" name="btn1">List of Customers</button>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-default" name="btn2">List of Drivers</button>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-default" name="btn3">List of Employees</button>
					
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-default" name="btn4">List of Invoices</button>
					
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-default" name="btn5">List of Orders</button>
					
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-default" name="btn6">List of Trucks</button>
					
				</div> -->
				
				
				<!-- 
				 -->
				 <div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">List of Customers</label>
					<div class="col-sm-10">
					  <button type="submit" class="btn btn-default" name="btn1">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">List of Drivers</label>
					<div class="col-sm-10">
					  <button type="submit" class="btn btn-default" name="btn2">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">List of Employees</label>
					<div class="col-sm-10">
					  <button type="submit" class="btn btn-default" name="btn3">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">List of Invoices</label>
					<div class="col-sm-10">
					  <button type="submit" class="btn btn-default" name="btn4">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">List of Orders</label>
					<div class="col-sm-10">
					  <button type="submit" class="btn btn-default" name="btn5">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">List of Trucks</label>
					<div class="col-sm-10">
					  <button type="submit" class="btn btn-default" name="btn6">View</button>
					</div>
				</div>
				 
				 <!-- 
				 -->
				 
				 
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Comments by Customer ID</label>
					<div class="col-sm-10">
					  <input type="text" name="comments_cust_id" class="form-control" id="inputPassword3" placeholder="Enter Customer ID">
					  <button type="submit" class="btn btn-default" name="btn7">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Employee by Employee ID</label>
					<div class="col-sm-10">
					  <input type="text" name="employee_emp_id" class="form-control" id="inputPassword3" placeholder="Enter Employee ID">
					  <button type="submit" class="btn btn-default" name="btn8">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Expense by Employee ID</label>
					<div class="col-sm-10">
					  <input type="text" name="expense_emp_id" class="form-control" id="inputPassword3" placeholder="Enter Employee ID">
					  <button type="submit" class="btn btn-default" name="btn9">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Expense by Truck ID</label>
					<div class="col-sm-10">
					  <input type="text" name="expense_truck_id" class="form-control" id="inputPassword3" placeholder="Enter Truck ID">
					  <button type="submit" class="btn btn-default" name="btn10">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Invoice by Transaction ID</label>
					<div class="col-sm-10">
					  <input type="text" name="invoice_tran_id" class="form-control" id="inputPassword3" placeholder="Enter Transaction ID">
					  <button type="submit" class="btn btn-default" name="btn11">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Location To & From by Customer ID</label>
					<div class="col-sm-10">
					  <input type="text" name="location_cust_id" class="form-control" id="inputPassword3" placeholder="Enter Customer ID">
					  <button type="submit" class="btn btn-default" name="btn12">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Order by Customer ID</label>
					<div class="col-sm-10">
					  <input type="text" name="order_cust_id" class="form-control" id="inputPassword3" placeholder="Enter Customer ID">
					  <button type="submit" class="btn btn-default" name="btn13">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Payment by Order ID</label>
					<div class="col-sm-10">
					  <input type="text" name="payment_order_id" class="form-control" id="inputPassword3" placeholder="Enter Order ID">
					  <button type="submit" class="btn btn-default" name="btn14">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Purpose of Expense by Expense ID</label>
					<div class="col-sm-10">
					  <input type="text" name="purpose_exp_id" class="form-control" id="inputPassword3" placeholder="Enter Expense ID">
					  <button type="submit" class="btn btn-default" name="btn15">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Transaction by Employee ID</label>
					<div class="col-sm-10">
					  <input type="text" name="transaction_emp_id" class="form-control" id="inputPassword3" placeholder="Enter Employee ID">
					  <button type="submit" class="btn btn-default" name="btn16">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Transaction by Transaction ID</label>
					<div class="col-sm-10">
					  <input type="text" name="transaction_tran_id" class="form-control" id="inputPassword3" placeholder="Enter Transaction ID">
					  <button type="submit" class="btn btn-default" name="btn17">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Truck by Driver ID</label>
					<div class="col-sm-10">
					  <input type="text" name="truck_driver_id" class="form-control" id="inputPassword3" placeholder="Enter Driver ID">
					  <button type="submit" class="btn btn-default" name="btn18">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Truck by Make</label>
					<div class="col-sm-10">
					  <input type="text" name="truck_make" class="form-control" id="inputPassword3" placeholder="Enter Truck Make">
					  <button type="submit" class="btn btn-default" name="btn19">View</button>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">Find Truck by VIN</label>
					<div class="col-sm-10">
					  <input type="text" name="truck_vin" class="form-control" id="inputPassword3" placeholder="Enter Truck VIN">
					  <button type="submit" class="btn btn-default" name="btn20">View</button>
					</div>
					</div>
			</form>	
		</div>
	</div>
    
    <!--start footer-->
	<footer>	
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