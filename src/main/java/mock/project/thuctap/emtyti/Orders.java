/*
 *	(C) Copyright 2022 Thanh Cong. All Right Reserved.
 *
 *	@author congt
 *	@day Mar 26, 2022
 *	@version 1.0
 *
 */
package mock.project.thuctap.emtyti;

import java.util.List;

public class Orders {
	private int OrderId;
	private int proId;
	private int cusId;
	private String quantity;
	private List<Product> listProduct;
	private List<Customer> listCustomer;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Orders [OrderId=" + OrderId + ", proId=" + proId + ", cusId=" + cusId + ", quantity=" + quantity
				+ ", listProduct=" + listProduct + ", listCustomer=" + listCustomer + "]";
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}



	public Orders(int orderId, int proId, int cusId, String quantity, List<Product> listProduct,
			List<Customer> listCustomer) {
		super();
		OrderId = orderId;
		this.proId = proId;
		this.cusId = cusId;
		this.quantity = quantity;
		this.listProduct = listProduct;
		this.listCustomer = listCustomer;
	}
	
	
	
}
