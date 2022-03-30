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
			<div class="row">
				<div class="table-wrapper">
					<div class="table-title">
						<div class="row">
							<div class="col-sm-6">
								<h2>
									Manage <b>Custumer</b>
								</h2>
							</div>
							<div class="col-sm-6">
								<a href="#addCusModule" class="btn btn-success"
									data-toggle="modal"><i class="material-icons">&#xE147;</i>
									<span>Add New Customer</span></a>

							</div>
						</div>
					</div>

					<table class="table table-striped table-hover">
						<thead>
							<tr>

								<th>ID</th>
								<th>Code</th>
								<th>Name</th>
								<th>Address</th>
								<th>Phone</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listCus}" var="o">
								<tr>

									<td>${o.cusID}</td>
									<td>${o.cusCode}</td>
									<td>${o.cusName}</td>
									<td>${o.cusAddress}</td>
									<td>${o.cusPhone}</td>
									<td><a href="loadcustomer?cusID=${o.cusID}" class="edit"
										data-toggle="modal"><i class="material-icons"
											data-toggle="tooltip" title="Edit">&#xE254;</i></a> <a
										href="deleteCus?cusID=${o.cusID}" class="delete"
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


	<!-- Add Order Modal HTML -->
	<div id="addCusModule" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="addCus" method="post">
					<div class="modal-header">
						<h4 class="modal-title">Add Customer</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>

					<div class="modal-body">
						<div class="form-group">
							<label>Code</label> <input name="cusCode" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Name</label> <input name="cusName" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Address</label> <input name="cusAddress" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Phone</label> <input name="cusPhone" type="text"
								class="form-control" required>
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