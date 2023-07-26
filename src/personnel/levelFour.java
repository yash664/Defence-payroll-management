package personnel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import Utility.Award;
import Utility.AwardRecord;
import Utility.PromotionRecord;
import Utility.RetirementRecord;
import Utility.TransactionRecord;

public class levelFour extends levelThree {
	public levelFour(Integer id,String username, String password, String name,String wing,String location,Double BaseSalary,Integer bid,Double balance, 
			ArrayList<Award> award){ //from files
		super(id,username, password, name,wing,location,BaseSalary,bid,balance,award);
		this.level=4;
	}
	public void promote(levelTwo off, ArrayList <levelTwo> LevelTwo, ArrayList<levelThree> LevelThree,
			ArrayList<PromotionRecord> promotionRecord) {
		/*
		 * For now - when creation of a new level 3 officer - User name will be name and password will be id
		 */
		levelThree officer=new levelThree(off.id, off.name, off.id.toString() ,off.name,off.wing,off.location,60000.00,off.bankaccount,off.awardsRecieved);
		LevelThree.add(officer);
		Date date = new Date();
		PromotionRecord prObject = new PromotionRecord(officer.getID(), date, 3); 
		promotionRecord.add(prObject);
		System.out.println("Officer: "+officer.getID()+" "+officer.getName()+" has been promoted to level three"+" "+officer.getWing()+" wing");
		int i=0;
		for(i=0;i<LevelTwo.size();i++)
		{
			if(off.getID()==LevelTwo.get(i).getID())
			{
				break;
			}
		}
		if(i!=LevelTwo.size())
		{
			LevelTwo.remove(i);
		}
	}
	public void getAward(levelOne officer, ArrayList<AwardRecord> awardRecord, ArrayList<TransactionRecord> transactionRecord) {
		try {
			Award award = new Award();
			award = officer.AddAward();
			AwardRecord ar = new AwardRecord(officer.getID(), award.getDate(), award.getName(), award.getPrizeMoney());
			awardRecord.add(ar);
			TransactionRecord tr = new TransactionRecord(officer.getID(), award.getDate(), officer.bankaccount.getAccountNumber(),
					award.getPrizeMoney(), "Award");
			System.out.println("Officer: "+officer.getID()+" "+officer.getName()+" has been awarded"+" "+award.getName());
			System.out.println("They have received "+award.getPrizeMoney());
			transactionRecord.add(tr);
		}
		catch (Exception e) {
			System.out.print("error");
		}
	}

	public void getAward(levelTwo officer, ArrayList<AwardRecord> awardRecord, ArrayList<TransactionRecord> transactionRecord) {
		try {
			Award award = new Award();
			award = officer.AddAward();
			AwardRecord ar = new AwardRecord(officer.getID(), award.getDate(), award.getName(), award.getPrizeMoney());
			awardRecord.add(ar);
			TransactionRecord tr = new TransactionRecord(officer.getID(), award.getDate(), officer.bankaccount.getAccountNumber(),
					award.getPrizeMoney(), "Award");
			System.out.println("Officer: "+officer.getID()+" "+officer.getName()+" has been awarded"+" "+award.getName());
			System.out.println("They have received "+award.getPrizeMoney());
			transactionRecord.add(tr);
		}
		catch (Exception e) {
			System.out.print("error");
		}
	}
	public void getAward(levelThree officer, ArrayList<AwardRecord> awardRecord, ArrayList<TransactionRecord> transactionRecord) {
		try {
			Award award = new Award();
			award = officer.AddAward();
			AwardRecord ar = new AwardRecord(officer.getID(), award.getDate(), award.getName(), award.getPrizeMoney());
			awardRecord.add(ar);
			TransactionRecord tr = new TransactionRecord(officer.getID(), award.getDate(), officer.bankaccount.getAccountNumber(),
					award.getPrizeMoney(), "Award");
			System.out.println("Officer: "+officer.getID()+" "+officer.getName()+" has been awarded"+" "+award.getName());
			System.out.println("They have received "+award.getPrizeMoney());
			transactionRecord.add(tr);
		}
		catch (Exception e) {
			System.out.print("error");
		}
	}
	public void getReport(Date startDate, Date endDate, int searchCategory, ArrayList<AwardRecord> awardRecord, 
			ArrayList<TransactionRecord> transactionRecord, ArrayList<RetirementRecord> retirementRecord,
			ArrayList<PromotionRecord> promotionRecord)
	{
		if(searchCategory == 1)
		{
			//award report
			int i=0;
			ArrayList<AwardRecord> awardRecordReport = new ArrayList<AwardRecord>();
			for(i=0;i<awardRecord.size();i++)
			{
				if(!startDate.after(awardRecord.get(i).getDate()) && !endDate.before(awardRecord.get(i).getDate()))
				{
					/* Start date<= iterator date <= End date */
					awardRecordReport.add(awardRecord.get(i));
				}
			}
			if(awardRecordReport.isEmpty())
			{
				System.out.println("No records are available between the given dates");
			}
			else
			{
				System.out.println(awardRecordReport.size());
				System.out.println("------------------------------------------");
				for(i=0;i<awardRecordReport.size();i++)
				{
					System.out.println("Officer ID: "+awardRecord.get(i).getOfficerID());
					System.out.println("Date: "+awardRecord.get(i).getStringDate());
					System.out.println("Award name: "+awardRecord.get(i).getAwardName());
					System.out.println("Prize money: "+awardRecord.get(i).getPrizeMoney());
					System.out.println("------------------------------------------");
					
				}
				PrintWriter fout;
				try {
					File directory = new File("");
					fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\AwardRecordReport.txt");
					fout.println(awardRecordReport.size());
					fout.println("------------------------------------------");
					for(i=0;i<awardRecordReport.size();i++)
					{
						fout.println("Officer ID: "+awardRecordReport.get(i).getOfficerID());
						fout.println("Date: "+awardRecordReport.get(i).getStringDate());
						fout.println("Award name: "+awardRecordReport.get(i).getAwardName());
						fout.println("Prize money: "+awardRecordReport.get(i).getPrizeMoney());
						fout.println("------------------------------------------");
					}
					fout.close();
				} catch (FileNotFoundException e) {
					System.out.println("File not found");
				}				
			}
		}
		else if(searchCategory ==  2)
		{
			//transaction report
			int i=0;
			ArrayList<TransactionRecord> transactionRecordReport = new ArrayList<TransactionRecord>();
			for(i=0;i<transactionRecord.size();i++)
			{
				if(!startDate.after(transactionRecord.get(i).getDate()) && !endDate.before(transactionRecord.get(i).getDate()))
				{
					/* Start date<= iterator date <= End date */
					transactionRecordReport.add(transactionRecord.get(i));
				}
			}
			if(transactionRecordReport.isEmpty())
			{
				System.out.println("No records are available between the given dates");
			}
			else
			{
				
				System.out.println(transactionRecordReport.size());
				System.out.println("------------------------------------------");
				for(i=0;i<transactionRecordReport.size();i++)
				{
					System.out.println("Officer ID: "+transactionRecordReport.get(i).getOfficerID());
					System.out.println("Date: "+transactionRecordReport.get(i).getStringDate());
					System.out.println("Bank account number: "+transactionRecordReport.get(i).getBankAccountNumber());
					System.out.println("Amount: "+transactionRecordReport.get(i).getAmount());
					System.out.println("Type: "+transactionRecordReport.get(i).getType());
					System.out.println("------------------------------------------");
				}
			
				PrintWriter fout;
				try {
					File directory = new File("");
					fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\TransactionRecordReport.txt");
					fout.println(transactionRecordReport.size());
					fout.println("------------------------------------------");
					for(i=0;i<transactionRecordReport.size();i++)
					{
						fout.println("Officer ID: "+transactionRecordReport.get(i).getOfficerID());
						fout.println("Date: "+transactionRecordReport.get(i).getStringDate());
						fout.println("Bank account number: "+transactionRecordReport.get(i).getBankAccountNumber());
						fout.println("Amount: "+transactionRecordReport.get(i).getAmount());
						fout.println("Type: "+transactionRecordReport.get(i).getType());
						fout.println("------------------------------------------");
					}
					fout.close();
				} catch (FileNotFoundException e) {
					System.out.println("File not found");
				}  			
			}
			
		}
		else if(searchCategory == 3)
		{
			//Retirement report
			int i=0;
			ArrayList<RetirementRecord> retirementRecordReport = new ArrayList<RetirementRecord>();
			for(i=0;i<retirementRecord.size();i++)
			{
				if(!startDate.after(retirementRecord.get(i).getDate()) && !endDate.before(retirementRecord.get(i).getDate()))
				{
					/* Start date<= iterator date <= End date */
					retirementRecordReport.add(retirementRecord.get(i));
				}
			}
			if(retirementRecordReport.isEmpty())
			{
				System.out.println("No records are available between the given dates");
			}
			else
			{
				System.out.println(retirementRecordReport.size());
				System.out.println("------------------------------------------");
				for(i=0;i<retirementRecordReport.size();i++)
				{
					System.out.println("Officer ID: "+retirementRecordReport.get(i).getOfficerID());
					System.out.println("Date: "+retirementRecordReport.get(i).getStringDate());
					System.out.println("Level during retirement: "+retirementRecordReport.get(i).getRankDuringRetirement());
					System.out.println("------------------------------------------");
				}
				
				PrintWriter fout;
				try {
					File directory = new File("");
					fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\RetirementRecordReport.txt");
					fout.println(retirementRecordReport.size());
					fout.println("------------------------------------------");
					for(i=0;i<retirementRecordReport.size();i++)
					{
						fout.println("Officer ID: "+retirementRecordReport.get(i).getOfficerID());
						fout.println("Date: "+retirementRecordReport.get(i).getStringDate());
						fout.println("Level during retirement: "+retirementRecordReport.get(i).getRankDuringRetirement());
						fout.println("------------------------------------------");
					}
					fout.close();
				} catch (FileNotFoundException e) {
						System.out.println("File not found");
				}			
			}
			
		}
		else
		{
			//Promotion report
			int i=0;
			ArrayList<PromotionRecord> promotionRecordReport = new ArrayList<PromotionRecord>();
			for(i=0;i<promotionRecord.size();i++)
			{
				if(!startDate.after(promotionRecord.get(i).getDate()) && !endDate.before(promotionRecord.get(i).getDate()))
				{
					/* Start date<= iterator date <= End date */
					promotionRecordReport.add(promotionRecord.get(i));
				}
			}
			if(promotionRecordReport.isEmpty())
			{
				System.out.println("No records are available between the given dates");
			}
			else
			{
				System.out.println(promotionRecordReport.size());
				System.out.println("------------------------------------------");
				for(i=0;i<promotionRecordReport.size();i++)
				{
					System.out.println("Officer ID: "+promotionRecordReport.get(i).getOfficerID());
					System.out.println("Date: "+promotionRecordReport.get(i).getStringDate());
					System.out.println("Next level: "+promotionRecordReport.get(i).getNextLevel());
					System.out.println("------------------------------------------");
				}
				PrintWriter fout;
				try {
					File directory = new File("");
					fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\PromotionRecordReport.txt");
					fout.println(promotionRecordReport.size());
					fout.println("------------------------------------------");
					for(i=0;i<promotionRecordReport.size();i++)
					{
						fout.println("Officer ID: "+promotionRecordReport.get(i).getOfficerID());
						fout.println("Date: "+promotionRecordReport.get(i).getStringDate());
						fout.println("Next level: "+promotionRecordReport.get(i).getNextLevel());
						fout.println("------------------------------------------");
					}
					fout.close();
				} catch (FileNotFoundException e) {
					System.out.println("File not found");
				}	
			}
			
		}			
	}
}


