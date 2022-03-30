/*
 *	(C) Copyright 2022 Thanh Cong. All Right Reserved.
 *
 *	@author congt
 *	@day Mar 26, 2022
 *	@version 1.0
 *
 */
package mock.project.thuctap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import mock.project.thuctap.connectDB.DBContext;
import mock.project.thuctap.emtyti.*;




public class DAO {
	//connect my sql
		Connection conn = null;
		
		//import cau lenh query mysql
		PreparedStatement ps = null;
		
		//nhan ket qua tra ve
		ResultSet rs = null;
		public List<Product> getAllProduct(){
			List<Product> listProduct = new ArrayList<Product>();
			String query = "select * from product";
			
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				rs=ps.executeQuery();//rs = result grid
				
				while(rs.next()) {
					listProduct.add(new Product(rs.getInt(1),
										rs.getString(2),
										rs.getString(3),
										rs.getString(4),
										rs.getString(5),
										rs.getString(6)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return listProduct;
		}
		public List<Customer> getAllCustumer(){
			List<Customer> listCustomer = new ArrayList<Customer>();
			String query = "select * from customer";
			
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				rs=ps.executeQuery();//rs = result grid
				
				while(rs.next()) {
					listCustomer.add(new Customer(rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getString(5)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return listCustomer;
		}
		public List<Orders> getOrders(){
			List<Orders> listOrders = new ArrayList<Orders>();
			String query = "select * from orders";
			
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				rs=ps.executeQuery();//rs = result grid
				
				while(rs.next()) {
					listOrders.add(new Orders(rs.getInt(1),
							rs.getInt(2),
							rs.getInt(3),
							rs.getString(4),
							getAllProduct(),
							getAllCustumer()));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return listOrders;
		}
		public List<Category> getAllCate(){
			List<Category> listCate = new ArrayList<Category>();
			String query = "select * from category";
			
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				rs=ps.executeQuery();//rs = result grid
				
				while(rs.next()) {
					listCate.add(new Category(rs.getInt(1),
											rs.getString(2)));
							
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return listCate;
		}
		
		public List<Product> getProductByCategory(String cid){
			List<Product> listProduct = new ArrayList<Product>();
			String query = "select * from product\n" + "where cateID=?";
			
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				ps.setString(1, cid);
				rs=ps.executeQuery();//rs = result grid
				
				while(rs.next()) {
					listProduct.add(new Product(rs.getInt(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getString(5),
								rs.getString(6)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return listProduct;
		}
		
		public List<ListOrders> getOrders(String OrderID){
			List<ListOrders> listOrdersAll = new ArrayList<ListOrders>();
			String query = "select ord.OrderID, ord.proID, ord.cusID, ord.quantity, \r\n"
					+ "prod.proName, prod.proPrice, prod.proImage,\r\n"
					+ "cus.cusCode, cus.cusName, cus.cusAddress, cus.cusPhone\r\n"
					+ "from orders ord inner join product prod on ord.proID = prod.proID\r\n"
					+ "inner join customer cus on ord.cusID = cus.cusID\r\n"
					+ "where ord.OrderID =?";
			
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				ps.setString(1, OrderID);
				rs=ps.executeQuery();//rs = result grid
				
				while(rs.next()) {
					listOrdersAll.add(new ListOrders(rs.getInt(1),
							rs.getInt(2),
							rs.getInt(3),
							rs.getString(4),
							rs.getString(5),
							rs.getString(6),
							rs.getString(7),
							rs.getString(8),
							rs.getString(9),
							rs.getString(10),
							rs.getString(11)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return listOrdersAll;
		}
		
		public Product getProductByID(String id){
			String query = "select * from product\n" + "where proID=?";
			
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				ps.setString(1, id);
				rs=ps.executeQuery();//rs = result grid
				
				while(rs.next()) {
					return new Product(rs.getInt(1),
										rs.getString(2),
										rs.getString(3),
										rs.getString(4),
										rs.getString(5),
										rs.getString(6));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return null;
		}
		
		public List<Product> getProductSearchByName(String txtSearch){
			List<Product> listProduct = new ArrayList<Product>();
			String query = "select * from product\r\n"
					+ "where proName like ? ";
			
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				ps.setString(1,"%"+ txtSearch+"%");
				rs=ps.executeQuery();//rs = result grid
				
				while(rs.next()) {
					listProduct.add(new Product(rs.getInt(1),
										rs.getString(2),
										rs.getString(3),
										rs.getString(4),
										rs.getString(5),
										rs.getString(6)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return listProduct;
		}
		
		public void insertProiduct	(String proName, String proDecription,String proDetail, String proPrice,
				String proImage, String cateID) {
			String query = "Insert into product(proName, proDecription, proDetail, proPrice, proImage, cateID)\r\n"
					+"values(?,?,?,?,?,?)";
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				ps.setString(1,proName);
				ps.setString(2,proDecription);
				ps.setString(3,proDetail);
				ps.setString(4,proPrice);
				ps.setString(5,proImage);
				ps.setString(6,cateID);
				ps.executeUpdate();
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void insertCustomer	(String cusCode, String cusName,String cusAddress, String cusPhone) {
			String query = "Insert into customer(cusCode, cusName, cusAddress, cusPhone)\r\n"
					+"values(?,?,?,?)";
			try {
				conn = new DBContext().getConnection();//mo ket noi mysql
				ps=conn.prepareStatement(query);
				ps.setString(1,cusCode);
				ps.setString(2,cusName);
				ps.setString(3,cusAddress);
				ps.setString(4,cusPhone);
				
				ps.executeUpdate();
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public void editProduct( String proName, String proDecription,String proDetail, String proPrice,
				String proImage, String cateID , String proID) {
	        String query = "update product \r\n"
	        		+ "set proName = ?,\r\n"
	        		+ " proDecription = ?, \r\n"
	        		+ " proDetail = ?, \r\n"
	        		+ " proPrice = ?, \r\n"
	        		+ " proImage = ?, \r\n"
	        		+ " cateID = ?\r\n"
	        		+ " where proID = ?";
	        try {
	            conn = new DBContext().getConnection();//mo ket noi voi sql
	            ps = conn.prepareStatement(query);
	            ps.setString(1, proName);
	            ps.setString(2, proDecription);
	            ps.setString(3, proDetail);
	            ps.setString(4, proPrice);
	            ps.setString(5, proImage);
	            ps.setString(6, cateID);
	            ps.setString(7, proID);
	            ps.executeUpdate();
	        } catch (Exception e) {
	        }
	    }
		public void deleteProduct(String proID) {
	        String query = "delete from product\n"
	                + "where proID = ?";
	        try {
	            conn = new DBContext().getConnection();//mo ket noi voi sql
	            ps = conn.prepareStatement(query);
	            ps.setString(1, proID);
	            ps.executeUpdate();
	        } catch (Exception e) {
	        }
	    }
		//chay thu
		public static void main(String[] args) {
			DAO dao = new DAO();
			List<Product> listProduct = dao.getAllProduct();
			List<Category> listCate = dao.getAllCate();
			List<Orders> listO = dao.getOrders();

			
			for(Product cate : listProduct) {
				System.out.println(cate);
			}
			
		}
}
