package personnel;

import java.util.ArrayList;
import Utility.Allowance;
import Utility.Award;
import Utility.BankAccount;
import Utility.TransactionRecord;

public class levelTwo extends levelOne {
	public ArrayList<Allowance>allowance;
	public levelTwo(Integer id,String name,String wing,String location,Double BaseSalary, BankAccount bankAccount, ArrayList<Award> award){//promoting
		super(id,name,wing,location,BaseSalary,bankAccount);
		this.awardsRecieved=award;
		this.level=2;
		allowance = new ArrayList<Allowance>();
	}
	public levelTwo(Integer id,String name,String wing,String location,Double BaseSalary, Integer bid, Double balance, ArrayList<Award> award){//from files
		super(id,name,wing,location,BaseSalary,bid,balance,award);		
		this.level=2;
		allowance = new ArrayList<Allowance>();
	}
	public void requestAllowance(String allowancename, ArrayList<TransactionRecord> transactionRecord) {
		boolean flag= false;
		flag=Allowance.eligibleforAllowance(allowancename, this, transactionRecord);
		if(flag)
		{
			System.out.println("Allowance claimed");			
		}
		else
		{
			System.out.println("Officer not eligible for allowance");
		}
	}

}
