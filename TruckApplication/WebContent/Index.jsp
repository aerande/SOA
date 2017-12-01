<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Truck Shipping Application</title>
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
	
	<!-- Responsive slider - START -->
	<div class="slider">
		<div class="">
			<div class="">
				<div class="responsive-slider" data-spy="responsive-slider" data-autoplay="true">
					<div class="slides" data-group="slides">						
						<ul>
							<li>
								<div class="slide-body" data-group="slide">
									<img src="img/Truck-Wallpaper-1.jpg" alt="" class="img-responsive" >
								</div>					
							</li>
							<li>
								<div class="slide-body" data-group="slide">
									<img src="img/Truck-Wallpaper-2.jpg" alt="" class="img-responsive" >
								</div>
							</li>
							<li>
								<div class="slide-body" data-group="slide">
									<img src="img/Truck-Wallpaper-3.jpg" alt="" class="img-responsive" >									
								</div>
							</li>					
						</ul>
					</div>			   
					<a class="slider-control left" href="#" data-jump="prev"><i class="fa fa-angle-left fa-2x"></i></a>
					<a class="slider-control right" href="#" data-jump="next"><i class="fa fa-angle-right fa-2x"></i></a>		
				</div>
			</div>
		</div>
	</div>
    <!-- Responsive slider - END -->
    
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