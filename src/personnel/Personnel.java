package personnel;

import java.util.Scanner;
import Utility.BankAccount;

public class Personnel {
	Scanner sc=new Scanner(System.in);
	protected Integer  id;
	protected String name;
	public BankAccount bankaccount;
	//give bank account belonging to the class bank account
	public static int PersonnelCount=0;
	public Personnel(Integer id, String name, BankAccount bankaccount) //for promotion
	{
		this.id=id;
		this.name=name;
		this.bankaccount=bankaccount;
	}
	public Personnel(Integer id, String name, Integer bid, Double balance) // from reading file
	{
		this.id=id;
		this.name=name;
		this.bankaccount=new BankAccount(id, balance);
		PersonnelCount++;		
	}
	public Personnel(String name, Double balance) // creating new officer
	{
		this.name=name;
		this.id=++PersonnelCount;
		this.bankaccount=new BankAccount(balance);
	}
	public static int GetPersonnelCount() {
		return PersonnelCount;
	}
	
	public Double getBalance()
	{
		return this.bankaccount.getBalance();
	}
	public int getID() {
		return this.id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BankAccount getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}
	public static int getPersonnelCount() {
		return PersonnelCount;
	}
	public static void setPersonnelCount(int personnelCount) {
		PersonnelCount = personnelCount;
	}
	
	
	
}
