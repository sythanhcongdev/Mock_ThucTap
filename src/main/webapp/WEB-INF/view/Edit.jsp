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
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-6">
						<h2>
							Edit <b>Product</b>
						</h2>
					</div>
					<div class="col-sm-6"></div>
				</div>
			</div>
		</div>
		<div id="editEmployeeModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<form action="edit" method="post">
						<div class="modal-header">
							<h4 class="modal-title">Edit Product</h4>
							<a href="manager"><button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button></a>
						</div>
						<div class="modal-body">
							<div class="form-group">
								<label>ID</label> <input name="proID" type="text"  value="${detail.proId}"
									class="form-control" readonly required>
							</div>
							<div class="form-group">
								<label>Name</label> <input  value="${detail.proName}" name="ProName" type="text"
									class="form-control" required>
							</div>
							<div class="form-group">
								<label>Description</label> <input  value="${detail.proDecription}" name="proDecription" value="${detail.proDecription}"
									type="text" class="form-control" required>
							</div>
							<div class="form-group">
								<label>Detail</label>
								<textarea name="proDetail" class="form-control" required >${detail.proDetail}</textarea>
							</div>
							<div class="form-group">
								<label>Price</label> <input  value="${detail.proPrice}" name="proPrice" type="text" 
									class="form-control" required>
							</div>
							<div class="form-group">
								<a href="#"><img src="${detail.proImage}"></a>
								<label>Image</label> <input   value="${detail.proImage}" name="proImage" type="text" 
									class="form-control" required>
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
							<input type="submit" class="btn btn-success" value="Edit">
						</div>
					</form>
				</div>
			</div>
		</div>

<%-- 
<div id="addCartModule">
			<div class="modal-dialog">
				<div class="modal-content">
					<form action="" method="post">
						<div class="modal-header">
							<h4 class="modal-title">Edit Product</h4>
							<a href="manager"><button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button></a>
						</div>
						<div class="modal-body">
							<h4 class="modal-title">Info Product</h4>
						
							<div class="form-group">
								<a href="#"><img src="${detail.proImage}"></a>
								
							</div>
							
							
							<div class="form-group">
								<label>Product Name </label> <input  value="${detail.proName}" name="proName" type="text"
									class="form-control" required>
							</div>
							
							
							<div class="form-group">
								<label>Price</label> <input  value="${detail.proPrice}" name="proPrice" type="text" 
									class="form-control" required>
							</div>
							
						
						

						</div>
						<div class="modal-body">
							<h4 class="modal-title">Info Customer</h4>
						
							
							<div class="form-group">
								<label>Customer ID</label> <input name="proId" type="text"  value="${detail.proId}"
									class="form-control" readonly required>
							</div>
							<div class="form-group">
								<label>Customer Code </label> <input  value="${detail.proName}" name="proName" type="text"
									class="form-control" required>
							</div>
							<div class="form-group">
								<label>Customer Name </label> <input  value="${detail.proName}" name="proName" type="text"
									class="form-control" required>
							</div>
							<div class="form-group">
								<label>Customer Address</label> <input  value="${detail.proPrice}" name="proPrice" type="text" 
									class="form-control" required>
							</div>
							<div class="form-group">
								<label>Customer Phone</label> <input  value="${detail.proPrice}" name="proPrice" type="text" 
									class="form-control" required>
							</div>
						

						</div>
						<div class="modal-body">
							<div class="form-group">
								<label>Quantity</label> <input  value="${detail.proPrice}" name="proPrice" type="text" 
									class="form-control" required>
							</div>
							<div class="form-group">
								<label>Amount</label> <input  value="${detail.proPrice}" name="proPrice" type="text" 
									class="form-control" required>
							</div>
						</div>
						<div class="modal-footer">
							<input type="submit" class="btn btn-success" value="Add Order">
							<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
						</div>
					</form>
				</div>
			</div>
		</div>
		
	</div>
 --%>

	<script src="js/manager.js" type="text/javascript"></script>
</body>
</html>