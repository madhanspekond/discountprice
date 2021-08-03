package com.discount.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.discount.service.DiscountPriceService;

@RestController
@RequestMapping("/orderdiscountvalue")
public class DiscountPriceApiController {
	
	@Autowired  
    private DiscountPriceService discountPriceService;

	/*
	 * @RequestMapping("/orderdiscountvalue") public List<DiscountDetails>
	 * getOrderDiscountValue(@RequestParam String customer,@RequestParam String
	 * product,@RequestParam String category,@RequestParam Integer
	 * orderValuePrice, @RequestParam Integer discountValuePrice) {
	 * List<DiscountDetails> discountDataList = null; try { discountDataList =
	 * discountPriceService.getOrderDiscountValue(customer,product,category,
	 * orderValuePrice,discountValuePrice); }catch(Exception e) {
	 * System.out.println("Exception "+ e.getMessage()); }
	 * 
	 * return discountDataList;
	 * 
	 * }
	 */
	
	@PostMapping
	public List<DiscountPriceData> getOrderDiscountValue(@RequestBody DiscountDetails discountdetais)
	{
	    List<DiscountPriceData> discountDataList = null;
		try {
			 discountDataList = discountPriceService.getOrderDiscountValue(discountdetais);
		}catch(Exception e) {
			System.out.println("Exception "+ e.getMessage());
		}
		
		return discountDataList;
				
	}
	
}