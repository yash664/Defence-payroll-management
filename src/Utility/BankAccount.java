package Utility;

public class BankAccount {
	public static Integer getAccountCount() {
		return accountCount;
	}

	public static void setAccountCount(Integer accountCount) {
		BankAccount.accountCount = accountCount;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	private static Integer accountCount = 0;
	private Integer accountNumber;
	private Double balance;
	
	public BankAccount(Double balance) {
		this.accountNumber = accountCount++;
		this.balance = balance;
	}
	public BankAccount(Integer accountNumber, Double balance) {
		this.accountNumber=accountNumber;
		this.balance = balance;
		accountCount++;
	}
	
	/**
	 * @param amount Amount to be transferred (should be positive)
	 * @return boolean Validity of transaction
	 */
	public boolean tranferAmount(Double amount) {
		if(amount < 0) return false;
		this.balance += amount;
		return true;
	}
	public Integer getBankAccountId() {
		return this.accountNumber;
	}
}
