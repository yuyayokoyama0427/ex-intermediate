package com.example.form;

/**
 * 検索時に仕様するフォーム.
 * 
 * @author yuyayokoyama
 *
 */
public class ClothesForm {
	/** 性別 */
	private String gender;
	/** 色 */
	private String color;
	
	
	public Integer getIntGender() {
		return Integer.parseInt(this.gender);
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ClothesForm [gender=" + gender + ", color=" + color + "]";
	}
	
	

}
