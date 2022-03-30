/*
 *	(C) Copyright 2022 Thanh Cong. All Right Reserved.
 *
 *	@author congt
 *	@day Mar 26, 2022
 *	@version 1.0
 *
 */
package mock.project.thuctap.emtyti;

public class Product {
	private int proId;
	private String ProName;
	private String proDecription;
	private String proDetail;
	private String proPrice;
	private String proImage;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int proId, String proName, String proDecription, String proDetail, String proPrice,
			String proImage) {
		super();
		this.proId = proId;
		ProName = proName;
		this.proDecription = proDecription;
		this.proDetail = proDetail;
		this.proPrice = proPrice;
		this.proImage = proImage;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return ProName;
	}

	public void setProName(String proName) {
		ProName = proName;
	}

	public String getProDecription() {
		return proDecription;
	}

	public void setProDecription(String proDicription) {
		this.proDecription = proDicription;
	}

	public String getProDetail() {
		return proDetail;
	}

	public void setProDetail(String proDetail) {
		this.proDetail = proDetail;
	}

	public String getProPrice() {
		return proPrice;
	}

	public void setProPrice(String proPrice) {
		this.proPrice = proPrice;
	}

	public String getProImage() {
		return proImage;
	}

	public void setProImage(String proImage) {
		this.proImage = proImage;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", ProName=" + ProName + ", proDecription=" + proDecription + ", proDetail="
				+ proDetail + ", proPrice=" + proPrice + ", proImage=" + proImage + "]";
	}

	
	
}
