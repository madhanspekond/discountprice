package com.discount.controller;

public class DiscountDetails {

	
	private  String customer;
	private String product;
	private String category;
	private double orderValue;
	private double discountOrderValue;
	public String getCustomer() {
		return customer;
	}
	public double getDiscountOrderValue() {
		return discountOrderValue;
	}
	public void setDiscountOrderValue(double discountOrderValue) {
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
	public double getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}
	
}
