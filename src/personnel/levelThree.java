package personnel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Utility.Award;
import Utility.BankAccount;
import Utility.Login;
import Utility.PromotionRecord;

public class levelThree extends levelTwo implements Login {
	private String username,password;
	public levelThree(Integer id, String username, String password, String name,String wing,String location,
			Double BaseSalary, BankAccount bankAccount, ArrayList<Award> award){ //for promotion
		super(id,name,wing,location,BaseSalary,bankAccount,award);
		this.username = username;
		this.password = password;
		this.level=3;
	}
	public levelThree(Integer id, String username, String password, String name,String wing,String location,
			Double BaseSalary, Integer bid, Double balance, ArrayList<Award> award){ //for promotion
		super(id,name,wing,location,BaseSalary,bid,balance,award);
		this.username = username;
		this.password = password;
		this.level=3;
	}
	public void recruit(Personnel candidate, ArrayList<levelOne> LevelOne, ArrayList<PromotionRecord> promotionRecord) {
		String w;
		System.out.println("enter the wing name");
		w=sc.next();
		String l;
		System.out.println("enter the location");
		l=sc.next();
		levelOne officer=new levelOne(candidate.id,candidate.name,w,l,50000.00,candidate.bankaccount);
		LevelOne.add(officer);
//		Date date = new Date();
//		PromotionRecord prObject = new PromotionRecord(officer.getID(), date, 1); 
//		promotionRecord.add(prObject);
		System.out.println("Officer: "+officer.getID()+" "+officer.getName()+" has been recruited to level one"+" "+officer.getWing()+" wing");
	}
	public void promote(levelOne off, ArrayList<levelOne> LevelOne, ArrayList<levelTwo> LevelTwo, 
			ArrayList<PromotionRecord> promotionRecord) {

		levelTwo officer=new levelTwo(off.id,off.name,off.wing,off.location,55000.00,off.bankaccount,off.awardsRecieved);
		LevelTwo.add(officer);
		Date date = new Date();
		PromotionRecord prObject = new PromotionRecord(officer.getID(), date, 2); 
		promotionRecord.add(prObject);
		System.out.println("Officer: "+officer.getID()+" "+officer.getName()+" has been promoted to level two"+" "+officer.getWing()+" wing");
		int i=0;
		for(i=0;i<LevelOne.size();i++)
		{
			if(off.getID()==LevelOne.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelOne.size())
		{
			LevelOne.remove(i);
		}
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate(String username,String password)
	{
		return (this.username.equals(username) && this.password.equals(password));
	}
	
	public void changeCredentials()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new username: ");
		this.username=sc.next();
		System.out.println("Enter the new password: ");
		this.password=sc.next();
		System.out.println("Credentials changed successfully!");
	}
	

}
