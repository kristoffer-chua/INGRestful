package com.ing.kristoffer.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.ing.kristoffer.model.Classification;
import com.ing.kristoffer.model.Customer;

public class INGControllerIT {

	private RestTemplate restTemplate = new RestTemplate();
	private static final String URL = "http://localhost:8080/";
	private String yearMonthString = "2018-05";

	@Test
	public void testMorningPerson() {
		String customerID = "12345";
		Customer customer = this.restTemplate.getForObject(URL + "customer/" + customerID + "/" + yearMonthString,
				Customer.class);
		assertEquals(Classification.MorningPerson, customer.getClassification());
	}

	@Test
	public void testAfternoonPerson() {
		String customerID = "12346";
		Customer customer = this.restTemplate.getForObject(URL + "customer/" + customerID + "/" + yearMonthString,
				Customer.class);
		assertEquals(Classification.AfternoonPerson, customer.getClassification());
	}

	@Test
	public void testBigSpender() {
		String customerID = "12347";
		Customer customer = this.restTemplate.getForObject(URL + "customer/" + customerID + "/" + yearMonthString,
				Customer.class);
		assertEquals(Classification.BigSpender, customer.getClassification());
	}

	@Test
	public void testPotentialSaver() {
		String customerID = "12348";
		Customer customer = this.restTemplate.getForObject(URL + "customer/" + customerID + "/" + yearMonthString,
				Customer.class);
		assertEquals(Classification.PotentialSaver, customer.getClassification());
	}

	@Test
	public void testBigTicketSpender() {
		String customerID = "12349";
		Customer customer = this.restTemplate.getForObject(URL + "customer/" + customerID + "/" + yearMonthString,
				Customer.class);
		assertEquals(Classification.BigTicketSpender, customer.getClassification());
	}

	@Test
	public void testFastSpender() {
		String customerID = "12350";
		Customer customer = this.restTemplate.getForObject(URL + "customer/" + customerID + "/" + yearMonthString,
				Customer.class);
		assertEquals(Classification.FastSpender, customer.getClassification());
	}

	@Test
	public void testPotentialLoan() {
		String customerID = "12351";
		Customer customer = this.restTemplate.getForObject(URL + "customer/" + customerID + "/" + yearMonthString,
				Customer.class);
		assertEquals(Classification.PotentialLoan, customer.getClassification());

	}

}