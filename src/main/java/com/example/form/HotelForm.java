package com.example.form;

/**
 * 検索時に仕様するフォーム.
 * 
 * @author yuyayokoyama
 *
 */
public class HotelForm {
	/** 価格 */
	private String price;
	
	
	public Integer getIntPrice() {
		return Integer.parseInt(this.price);
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}

}
