/*
 *	(C) Copyright 2022 Thanh Cong. All Right Reserved.
 *
 *	@author congt
 *	@day Mar 26, 2022
 *	@version 1.0
 *
 */
package mock.project.thuctap.emtyti;

public class Category {
	private int cateID;
	private String cateName;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public int getCateID() {
		return cateID;
	}

	public void setCateID(int cateID) {
		this.cateID = cateID;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	@Override
	public String toString() {
		return "Category [cateID=" + cateID + ", cateName=" + cateName + "]";
	}

	public Category(int cateID, String cateName) {
		super();
		this.cateID = cateID;
		this.cateName = cateName;
	}

}
