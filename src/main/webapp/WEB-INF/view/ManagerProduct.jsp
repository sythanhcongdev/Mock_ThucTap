<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap CRUD Data Table for Database with Modal Form</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="css/manager.css" rel="stylesheet" type="text/css" />
<style>
img {
	width: 200px;
	height: 120px;
}
</style>
<body>
	<div class="container">
		<div class="col-sm-3">
			<div class="row">
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
		</div>

		<div class="col-sm-9">
			<div class="row">F
				<div class="table-wrapper">
					<div class="table-title">
						<div class="row">
							<div class="col-sm-6">
								<h2>
									Manage <b>Product</b>
								</h2>
							</div>
							<div class="col-sm-6">
								<a href="#addEmployeeModal" class="btn btn-success"
									data-toggle="modal"><i class="material-icons">&#xE147;</i>
									<span>Add New Product</span></a>
									 <a href="#addOrderModule"
									class="btn btn-success" data-toggle="modal"><i
									class="material-icons">&#xE147;</i> <span>Add New Order
										Product</span></a>

							</div>
						</div>
					</div>

					<table class="table table-striped table-hover">
						<thead>
							<tr>

								<th>ID</th>
								<th>Name</th>
								<th>Image</th>
								<th>Price</th>
								<th>Actions</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listProduct}" var="o">
								<tr>

									<td>${o.proId}</td>
									<td>${o.proName}</td>
									<td><img src="${o.proImage}"></td>
									<td>${o.proPrice}VNĐ</td>
									<td>
											<a href="loadproduct?proId=${o.proId}" class="edit"
										data-toggle="modal"><i class="material-icons"
											data-toggle="tooltip" title="Edit">&#xE254;</i></a>
											 
										<a href="delete?proId=${o.proId}" class="delete"
										data-toggle="modal"><i class="material-icons"
											data-toggle="tooltip" title="Delete">&#xE872;</i></a></td>

								</tr>
							</c:forEach>

						</tbody>
					</table>



				</div>
				
			</div>
		</div>
	</div>
	<!-- Edit Modal HTML -->
	<div id="addEmployeeModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="addProduct" method="post">
					<div class="modal-header">
						<h4 class="modal-title">Add Product</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>

					<div class="modal-body">
						<div class="form-group">
							<label>Name</label> <input name="ProName" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Description</label> <input name="proDecription"
								type="text" class="form-control" required>
						</div>
						<div class="form-group">
							<label>Detail</label>
							<textarea name="proDetail" class="form-control" required></textarea>
						</div>
						<div class="form-group">
							<label>Price</label> <input name="proPrice" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Image</label>
							<textarea name="proImage" class="form-control" required></textarea>
						</div>
						<div class="form-group">
							<label>Category</label> <select name="category"
								class="form-select" aria-label="Default select example">
								<c:forEach items="${listCate}" var="o">
									<option value="${o.cateID}">${o.cateName}</option>
								</c:forEach>
							</select>
						</div>

					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Cancel"> <input type="submit"
							class="btn btn-success" value="Add">
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- Add Order Modal HTML -->
	<div id="" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="addProduct" method="post">
					<div class="modal-header">
						<h4 class="modal-title">Add Product</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>

					<div class="modal-body">
						<div class="form-group">
							<label>Name</label> <input name="ProName" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Description</label> <input name="proDecription"
								type="text" class="form-control" required>
						</div>
						<div class="form-group">
							<label>Detail</label>
							<textarea name="proDetail" class="form-control" required></textarea>
						</div>
						<div class="form-group">
							<label>Price</label> <input name="proPrice" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Image</label>
							<textarea name="proImage" class="form-control" required></textarea>
						</div>
						<div class="form-group">
							<label>Category</label> <select name="category"
								class="form-select" aria-label="Default select example">
								<c:forEach items="${listCate}" var="o">
									<option value="${o.cateID}">${o.cateName}</option>
								</c:forEach>
							</select>
						</div>

					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Cancel"> <input type="submit"
							class="btn btn-success" value="Add">
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Delete Modal HTML -->
	<div id="deleteEmployeeModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="delete" method="post">
					<div class="modal-header">
						<h4 class="modal-title">Delete Product</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">
						<p>Are you sure you want to delete these Records?</p>
						<p class="text-warning">
							<small>This action cannot be undone.</small>
						</p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Cancel"> <a href="delete?proId=${o.proId}"
							class="delete" data-toggle="modal"> <input type="submit"
							class="btn btn-danger" value="Delete">
						</a>

					</div>
				</form>
			</div>
		</div>
	</div>

	<script src="js/manager.js" type="text/javascript"></script>
	<script>
		
	</script>
</body>
</html>