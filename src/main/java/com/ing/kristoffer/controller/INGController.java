package com.ing.kristoffer.controller;

import java.time.YearMonth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ing.kristoffer.model.Customer;
import com.ing.kristoffer.service.CustomerService;

@RestController
public class INGController {
	@Autowired
	private CustomerService service;

	@RequestMapping(value = "/customer/{customerID}/{yearMonth}", method = RequestMethod.GET)
	public Customer getArticle(@PathVariable String customerID,
			@PathVariable @DateTimeFormat(pattern = "yyyy-MM") YearMonth yearMonth) {
		return service.findCustomerTransactions(customerID, yearMonth);
	}

}
