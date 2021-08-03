package com.discount.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.discount.controller.DiscountDetails;
import com.discount.controller.DiscountPriceData;
import com.discount.service.DiscountPriceService;


@Service
public class DiscountPriceServiceImpl implements DiscountPriceService{
	/*
	 * public List<DiscountDetails> getOrderDiscountValue(String customer, String
	 * product, String category, Integer orderValue, Integer discountValuePrice) {
	 * List<DiscountDetails> details = new ArrayList<DiscountDetails>();
	 * DiscountDetails data = new DiscountDetails(); data.setCategory(category);
	 * data.setCustomer(customer); data.setOrderValue("$"+orderValue);
	 * data.setProduct(product);
	 * 
	 * int finalPrice = (orderValue * discountValuePrice) / 100;
	 * 
	 * data.setDiscountOrderValue("$"+finalPrice); details.add(data);
	 * 
	 * 
	 * return details; }
	 */
	public List<DiscountPriceData> getOrderDiscountValue(DiscountDetails discountdetais) {
		// TODO Auto-generated method stub
		List<DiscountPriceData> details = new ArrayList<DiscountPriceData>();
		DiscountPriceData data = new DiscountPriceData();
		data.setCategory(discountdetais.getCategory());
		data.setCustomer(discountdetais.getCustomer());
		data.setOrderValue("$"+discountdetais.getOrderValue());
		data.setProduct(discountdetais.getProduct());
		
		Double finalPrice = (discountdetais.getOrderValue() * discountdetais.getDiscountOrderValue()) / 100;
		
		data.setDiscountOrderValue("$"+discountdetais.getDiscountOrderValue());
		data.setFinalOrderValue("$"+finalPrice);
		details.add(data);
		
		return details;
	}

	public List<DiscountDetails> getOrderDiscountValue(String customer, String product, String category,
			Integer orderValue, Integer discountValuePrice) {
		// TODO Auto-generated method stub
		return null;
	}


}
