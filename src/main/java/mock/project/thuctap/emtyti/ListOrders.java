/*
 *	(C) Copyright 2022 Thanh Cong. All Right Reserved.
 *
 *	@author congt
 *	@day Mar 28, 2022
 *	@version 1.0
 *
 */
package mock.project.thuctap.emtyti;

import java.util.List;

public class ListOrders {
	private int OrderId;
	private int proId;
	private int cusId;
	private String quantity;
	private String prod_proName;
	private String prod_proPrice;
	private String prod_proImage;
	private String cus_cusCode;
	private String cus_cusName;;
	private String cus_cusAddress;
	private String cus_cusPhone;
	@Override
	public String toString() {
		return "ListOrders [OrderId=" + OrderId + ", proId=" + proId + ", cusId=" + cusId + ", quantity=" + quantity
				+ ", prod_proName=" + prod_proName + ", prod_proPrice=" + prod_proPrice + ", prod_proImage="
				+ prod_proImage + ", cus_cusCode=" + cus_cusCode + ", cus_cusName=" + cus_cusName + ", cus_cusAddress="
				+ cus_cusAddress + ", cus_cusPhone=" + cus_cusPhone + "]";
	}
	public ListOrders(int orderId, int proId, int cusId, String quantity, String prod_proName, String prod_proPrice,
			String prod_proImage, String cus_cusCode, String cus_cusName, String cus_cusAddress, String cus_cusPhone) {
		super();
		OrderId = orderId;
		this.proId = proId;
		this.cusId = cusId;
		this.quantity = quantity;
		this.prod_proName = prod_proName;
		this.prod_proPrice = prod_proPrice;
		this.prod_proImage = prod_proImage;
		this.cus_cusCode = cus_cusCode;
		this.cus_cusName = cus_cusName;
		this.cus_cusAddress = cus_cusAddress;
		this.cus_cusPhone = cus_cusPhone;
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
	public String getProd_proName() {
		return prod_proName;
	}
	public void setProd_proName(String prod_proName) {
		this.prod_proName = prod_proName;
	}
	public String getProd_proPrice() {
		return prod_proPrice;
	}
	public void setProd_proPrice(String prod_proPrice) {
		this.prod_proPrice = prod_proPrice;
	}
	public String getProd_proImage() {
		return prod_proImage;
	}
	public void setProd_proImage(String prod_proImage) {
		this.prod_proImage = prod_proImage;
	}
	public String getCus_cusCode() {
		return cus_cusCode;
	}
	public void setCus_cusCode(String cus_cusCode) {
		this.cus_cusCode = cus_cusCode;
	}
	public String getCus_cusName() {
		return cus_cusName;
	}
	public void setCus_cusName(String cus_cusName) {
		this.cus_cusName = cus_cusName;
	}
	public String getCus_cusAddress() {
		return cus_cusAddress;
	}
	public void setCus_cusAddress(String cus_cusAddress) {
		this.cus_cusAddress = cus_cusAddress;
	}
	public String getCus_cusPhone() {
		return cus_cusPhone;
	}
	public void setCus_cusPhone(String cus_cusPhone) {
		this.cus_cusPhone = cus_cusPhone;
	};
	

	
}
