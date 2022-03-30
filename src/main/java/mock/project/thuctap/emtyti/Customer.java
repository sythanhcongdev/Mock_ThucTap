/*
 *	(C) Copyright 2022 Thanh Cong. All Right Reserved.
 *
 *	@author congt
 *	@day Mar 26, 2022
 *	@version 1.0
 *
 */
package mock.project.thuctap.emtyti;

public class Customer {
	private int cusId;
	private String cusCode;
	private String cusName;
	private String cusAddress;
	private String cusPhone;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public int getCusId() {
		return cusId;
	}


	public void setCusId(int cusId) {
		this.cusId = cusId;
	}


	public String getCusCode() {
		return cusCode;
	}


	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}


	public String getCusName() {
		return cusName;
	}


	public void setCusName(String cusName) {
		this.cusName = cusName;
	}


	public String getCusAddress() {
		return cusAddress;
	}


	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}


	public String getCusPhone() {
		return cusPhone;
	}


	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}


	public Customer(int cusId, String cusCode, String cusName, String cusAddress, String cusPhone) {
		super();
		this.cusId = cusId;
		this.cusCode = cusCode;
		this.cusName = cusName;
		this.cusAddress = cusAddress;
		this.cusPhone = cusPhone;
	}


	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusCode=" + cusCode + ", cusName=" + cusName + ", cusAddress="
				+ cusAddress + ", cusPhone=" + cusPhone + "]";
	}
	
	
}
