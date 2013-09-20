<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/include/taglibs.jspf" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TODO Spring MVC</title>
<link rel="stylesheet" href='<c:url value='/resources/stylesheets/foundation/foundation.css' />' />
<link rel="stylesheet" href='<c:url value='/resources/stylesheets/app.css' />' />
<script src='<c:url value='/resources/javascripts/vendor/custom.modernizr.js' />' ></script>
</head>
<body>
	<div class="fixed">
		<div class="row">
			<div class="large-12 columns">

				<!-- Navigation -->
				<nav class="top-bar">
				<ul class="title-area">
					<!-- Title Area -->
					<li class="name">
						<h1>
							<a href="index.html"> <span
								style="text-align: center; font-family: 'Open Sans'">TODO Spring MVC</span>
									</a>
						</h1>
					</li>
					<li class="toggle-topbar menu-icon"><a href="#"><span>menu</span></a></li>
				</ul>

				<section class="top-bar-section">
				<ul class="right">
					<li><a href="portfolio.html">New</a></li>
					<li><a href="index.html#about">List</a></li>
				</ul>
				</section> </nav>

				<!-- End Navigation -->

				<!-- Start Main Content -->
				<div id="container1"></div>
				<div id="container2"></div>
				<!-- End Main Content -->

			</div>
		</div>
	</div>

<!-- Check for Zepto support, load jQuery if necessary -->
<script>
  document.write('<script src=<c:url value='/resources/javascripts/vendor/jquery/'/>'
    + ('__proto__' in {} ? 'zepto' : 'jquery')
    + '.js><\/script>');
</script>
<script src='<c:url value='/resources/javascripts/vendor/foundation.min.js' />'></script>
<script src='<c:url value='/resources/javascripts/app.js' />'></script>
</body>
</html>