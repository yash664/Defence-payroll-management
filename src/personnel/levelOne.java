package personnel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import Utility.Award;
import Utility.BankAccount;

public class levelOne extends Personnel {
	protected Integer level;
	protected String wing;
	protected String location;
	protected Double BaseSalary;
	public ArrayList<Award>awardsRecieved = new ArrayList<Award>();
	protected static Integer OfficerCount=0;
	public static Integer GetOfficerCount() {
		return OfficerCount;
	}
	public levelOne(Integer id, String name,String wing,String location,Double BaseSalary, BankAccount bankaccount){ //For recruiting
		super(id, name,bankaccount);
		this.level=1; 
		this.wing=wing;
		this.location=location;
		this.BaseSalary=BaseSalary;
		this.awardsRecieved=new ArrayList<Award>();
		OfficerCount++;
	}
	public levelOne(Integer id, String name,String wing,String location,Double BaseSalary, Integer bid, Double balance, ArrayList<Award> awards){//from files
		super(id,name,bid,balance);
		this.level=1; 
		this.wing=wing;
		this.location=location;
		this.BaseSalary=BaseSalary;
		this.awardsRecieved=awards;
		OfficerCount++;
	}


	public Award AddAward() throws Exception{
		String aname;
		Double pmoney;
		System.out.println("enter the award name");
		aname=sc.next();
		System.out.println("enter the prize money");
		pmoney=sc.nextDouble();
		this.bankaccount.setBalance(this.bankaccount.getBalance()+pmoney);
		Date d=new Date();
		Award dw=new Award(aname,pmoney,d);
		awardsRecieved.add(dw);	
		return dw;
	}

	double CalculateIncome() {
		return this.BaseSalary;
	}

	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getBaseSalary() {
		return BaseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		BaseSalary = baseSalary;
	}
	public ArrayList<Award> getAwardsRecieved() {
		return awardsRecieved;
	}
	public void setAwardsRecieved(ArrayList<Award> awardsRecieved) {
		this.awardsRecieved = awardsRecieved;
	}
	public static Integer getOfficerCount() {
		return OfficerCount;
	}
	public static void setOfficerCount(Integer officerCount) {
		OfficerCount = officerCount;
	}
	

}
