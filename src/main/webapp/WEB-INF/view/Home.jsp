<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Thuc Tap</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<div class="container">
		<jsp:include page="Search.jsp"></jsp:include>

		<div class="col-sm-9">
			<div class="row">
				<c:forEach items="${listProduct}" var="o">
					<div class="col-12 col-md-6 col-lg-4">
						<div class="card">
							<img class="card-img-top" src="${o.proImage}"
								alt="Card image cap">
							<div class="card-body">
								<h4 class="card-title show_txt">
									<a href="detail?productId=${o.proId}" title="View Product">${o.proName}</a>
								</h4>
								<p class="card-text show_txt">${o.proDecription}</p>
								<div class="row">
									<div class="col">
										<p class="btn btn-danger btn-block">${o.proPrice}VND</p>
									</div>
									<div class="col">
										<a href="detail?productId=${o.proId}" title="View Product"
											class="btn btn-success btn-block">Add to cart</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>

	</div>
	</div>

</body>
</html>