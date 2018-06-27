package com.ing.kristoffer.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.ing.kristoffer.model.Customer;

public class INGControllerIT {
	private RestTemplate restTemplate = new RestTemplate();
	private static final String URL = "http://localhost:8080/";

	@Test
	public void getCustomer() {
		String yearMonthString = "2018-05";
		String customerID = "12345";
		Customer customer = this.restTemplate.getForObject(URL + "customer/" + customerID + "/" + yearMonthString,
				Customer.class);
		assertNotNull(customer);
	}
}