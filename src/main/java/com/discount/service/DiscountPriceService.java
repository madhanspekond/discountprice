package com.discount.service;

import java.util.List;

import com.discount.controller.DiscountDetails;
import com.discount.controller.DiscountPriceData;

public interface DiscountPriceService {

	List<DiscountDetails> getOrderDiscountValue(String customer, String product, String category, Integer orderValue, Integer discountValuePrice);

	List<DiscountPriceData> getOrderDiscountValue(DiscountDetails discountdetais);
	

}
