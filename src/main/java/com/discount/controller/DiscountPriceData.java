package com.discount.controller;

public class DiscountPriceData {

	
	private  String customer;
	private String product;
	private String category;
	private String orderValue;
	private String discountOrderValue;
	private String finalOrderValue;
	public String getFinalOrderValue() {
		return finalOrderValue;
	}
	public void setFinalOrderValue(String finalOrderValue) {
		this.finalOrderValue = finalOrderValue;
	}
	public String getCustomer() {
		return customer;
	}
	public String getDiscountOrderValue() {
		return discountOrderValue;
	}
	public void setDiscountOrderValue(String discountOrderValue) {
		this.discountOrderValue = discountOrderValue;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}
	
}
