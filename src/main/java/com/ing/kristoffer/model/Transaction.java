package com.ing.kristoffer.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Entity
public class Transaction {
	@Id
	@Column(name = "TRANSACTION_ID")
	private String transactionID;
	@Column(name = "CUSTOMER_ID")
	private String customerID;
	@Column(name = "TRANSACTION_DATE")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm a")
	private LocalDateTime transactionDate;
	@Column(name = "TRANSACTION_AMOUNT")
	private BigDecimal transactionAmount;
	@Enumerated(EnumType.STRING)
	@Column(name = "TRANSACTION_TYPE")
	private TransactionType transactionType;

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

}
