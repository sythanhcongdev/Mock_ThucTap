<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--begin of menu-->
<br>
<br>
<br>
<div class="panel-heading">
	<h2 class="text-center">Search Items</h2>
</div>
<form action="search" method="post">

	<div class="input-group">
		<input oninput="getProductSearchByName(this)" value="${txtSearch}"
			name="txtSearch" type="text" class="form-control rounded"
			placeholder="Search" aria-label="Search"
			aria-describedby="search-addon" />
		<button type="submit" class="btn btn-outline-primary">search</button>
	</div>
</form>
<br>
<br>
<br>
<div class="row">
	<div class="col-sm-3">
		<div class="card bg-light mb-3">
			<div class="card-header bg-info text-white text-uppercase">
				<i class="fa fa-list"></i> Categories
			</div>
			<ul class="list-group category_block">
				<c:forEach items="${listCate}" var="o">
					<li class="list-group-item text-white ${cateTag == o.cateID ? "active":""}"><a
						href="category?cateID=${o.cateID}">${o.cateName}</a></li>
				</c:forEach>
			</ul>
		</div>
		<div class="card bg-light mb-3">
			<div class="card-header bg-success text-white text-uppercase">
				<i class="fa fa-list"></i> Manager Product
			</div>
			<ul class="list-group category_block">
				<a class="nav-link" href="manager">Manager Product</a>
			</ul>
			<ul class="list-group category_block">
				<a class="nav-link" href="managercus">Manager Custumer</a>
			</ul>
			<ul class="list-group category_block">
				<a class="nav-link" href="home">Home</a>
			</ul>
			
		</div>
	</div>
