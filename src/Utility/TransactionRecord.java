package Utility;

import java.util.Date;

public class TransactionRecord extends Record {
	private Integer bankAccountNumber;
	private Double amount;
	private String type;
	
	public TransactionRecord(Integer officerID, Date date, Integer bankAccountNumber, Double amount, String type) {
		super(officerID, date);
		this.bankAccountNumber = bankAccountNumber;
		this.amount = amount;
		this.type = type;
	}

	public Integer getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(Integer bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
