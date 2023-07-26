import java.util.Scanner;

import Utility.Allowance;
import Utility.Award;
import Utility.AwardRecord;
import Utility.PromotionRecord;
import Utility.RetirementRecord;
import Utility.TransactionRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import personnel.Manager;
import personnel.Personnel;
import personnel.Veteran;
import personnel.levelFour;
import personnel.levelOne;
import personnel.levelThree;
import personnel.levelTwo;

public class Driver {
	
	public static void LoginMenu() {
		System.out.println("************************************************");
		System.out.println("\t\tLogin Menu\n");
		System.out.println("Choose your designation \n1.Manager \n2.Level-3 or Level-4 \n3.Exit");
		System.out.println("************************************************");
	}
	
	
	public static void ManagerView(Manager manager, ArrayList <levelOne> LevelOne, ArrayList <levelTwo> LevelTwo, 
			ArrayList <levelThree> LevelThree, ArrayList <levelFour> LevelFour, ArrayList<Veteran> veteran,
			ArrayList<RetirementRecord> retirementRecord, ArrayList<TransactionRecord> transactionRecord) {
		// Menu
		int choice=0;
		char c='N',ch='N';
		Scanner sc = new Scanner (System.in);
		do {
			ch='N';
			System.out.println("*********************************************");
			System.out.println("\t\tMenu\n");
			System.out.println("1.Initiate retirement");
			System.out.println("2.Initiate discharge");
			System.out.println("3.Initiate payroll");
			System.out.println("4.Initiate allowance");
			System.out.println("5.Exit");
			System.out.println("*********************************************");
			System.out.println("Enter a valid choice");
			choice = sc.nextInt();
			while(choice<1 || choice>5)
			{
				System.out.println("Enter a valid choice: ");
				choice = sc.nextInt();
			}
			switch(choice)
			{
				case 1:
				{
					do {
						c='N';
						int level=0,id=0,i=0;
						boolean flag=false;
						System.out.println("Enter the ranking level of the officer requesting retirement: ");
						level=sc.nextInt();
						while(level<=0 || level >=5)
						{
							System.out.println("Enter valid level: ");
							level=sc.nextInt();
						}
						System.out.println("Enter the ID of the officer: ");
						id=sc.nextInt();
						if(level == 1)
						{
							for(i=0;i<LevelOne.size();i++)
							{
								if(LevelOne.get(i).getID()== id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								manager.initiateRetirement(LevelOne.get(i), LevelOne, veteran, retirementRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}
						
						else if(level == 2)
						{
							flag=false;
							for(i=0;i<LevelTwo.size();i++)
							{
								if(LevelTwo.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								manager.initiateRetirement(LevelTwo.get(i), LevelTwo, veteran, retirementRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}
						
						else if(level == 3)
						{
							flag=false;
							for(i=0;i<LevelThree.size();i++)
							{
								if(LevelThree.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								manager.initiateRetirement(LevelThree.get(i), LevelThree, veteran, retirementRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}
						
						else
						{
							flag=false;
							for(i=0;i<LevelFour.size();i++)
							{
								if(LevelFour.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								manager.initiateRetirement(LevelFour.get(i), LevelFour, veteran, retirementRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}						
					}while(c=='Y');  				
				
				}
				break;
				case 2:
				{
					do
					{
						c='N';
						int level=0,id=0,i=0;
						boolean flag=false;
						System.out.println("Enter the ranking level of the officer to be discharged: ");
						level=sc.nextInt();
						while(level<=0 || level >=5)
						{
							System.out.println("Enter valid level: ");
							level=sc.nextInt();
						}
						System.out.println("Enter the ID of the officer: ");
						id=sc.nextInt();
						if(level == 1)
						{
							for(i=0;i<LevelOne.size();i++)
							{
								if(LevelOne.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								manager.initiateDischarge(LevelOne.get(i), LevelOne, veteran, retirementRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}
						
						else if(level == 2)
						{
							flag=false;
							for(i=0;i<LevelTwo.size();i++)
							{
								if(LevelTwo.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								manager.initiateDischarge(LevelTwo.get(i), LevelTwo, veteran, retirementRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}
						
						else if(level == 3)
						{
							flag=false;
							for(i=0;i<LevelThree.size();i++)
							{
								if(LevelThree.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								manager.initiateDischarge(LevelThree.get(i), LevelThree, veteran, retirementRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}
						
						else
						{
							flag=false;
							for(i=0;i<LevelFour.size();i++)
							{
								if(LevelFour.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								manager.initiateDischarge(LevelFour.get(i), LevelFour, veteran, retirementRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						} 	
						
					}while(c=='Y');		
					
				}
				break;
				case 3:
				{
					//Not checking if its first of the month..can pay only once per month
					Date date = new Date();
					Integer month = date.getMonth();
					if(month != Manager.getMonth())
					{
						manager.initiatePayroll(LevelOne, LevelTwo, LevelThree, LevelFour, veteran, transactionRecord);
					}
					else
					{
						System.out.println("Salary/Pension paid already for this month");  							
					}					
				}
				break;
				case 4:
				{
					do
					{
						c='N';
						int level=0,id=0,i=0;
						boolean flag=false;
						System.out.println("Enter the ranking level of the officer requesting allowance: ");
						level=sc.nextInt();
						while(level<=1 || level >=5)
						{
							System.out.println("Enter valid level: ");
							level=sc.nextInt();
						}
						System.out.println("Enter the ID of the officer: ");
						id=sc.nextInt();

						if(level == 2)
						{
							flag=false;
							for(i=0;i<LevelTwo.size();i++)
							{
								if(LevelTwo.get(i).getID()== id ) 
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								String allowanceName;
								System.out.println("Enter the allowance name to claim: ");
								allowanceName=sc.next();
								LevelTwo.get(i).requestAllowance(allowanceName, transactionRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}
						
						else if(level == 3)
						{
							flag=false;
							for(i=0;i<LevelThree.size();i++)
							{
								if(LevelThree.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{

								String allowanceName;
								System.out.println("Enter the allowance name to claim: ");
								allowanceName=sc.next();
								LevelThree.get(i).requestAllowance(allowanceName, transactionRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}
						
						else
						{
							flag=false;
							for(i=0;i<LevelFour.size();i++)
							{
								if(LevelFour.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								String allowanceName;
								System.out.println("Enter the allowance name to claim: ");
								allowanceName=sc.next();
								LevelFour.get(i).requestAllowance(allowanceName, transactionRecord);
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)");
								c=sc.next().charAt(0);
							}
						}
						
					}while(c=='Y');

				}
				break;
				case 5:
					break;
				default:
					 break;
			}
			System.out.println("Do you want to continue(Y/N)?");
			ch=sc.next().charAt(0);
		}while(ch=='Y');	
	}
	
	public static void Level3View(levelThree LevelThree, ArrayList <levelOne> LevelOne,  ArrayList <levelTwo> LevelTwo, 
			ArrayList<PromotionRecord> promotionRecord)
	{
		Scanner sc = new Scanner(System.in);
		char ch='N';
		int choice=0;
		do 
		{
			System.out.println("*********************************************");
			System.out.println("\t\tMenu\n");
			System.out.println("1.Change username and password");
			System.out.println("2.Recruit candidate");
			System.out.println("3.Promote candidate");			
			System.out.println("4.Exit");
			System.out.println("*********************************************");
			System.out.println("Enter a valid choice");
			choice = sc.nextInt();
			while(choice<1 || choice>4)
			{
				System.out.println("Enter a valid choice: ");
				choice = sc.nextInt();
			}
			switch(choice)
			{
				case 1:
				{
					LevelThree.changeCredentials();					
				}
				break;			
				case 2:
				{
					String name;
					System.out.println("Enter the candinate's name");
					name=sc.next();
					Personnel personnel = new Personnel (name, 0.00);
					LevelThree.recruit(personnel, LevelOne, promotionRecord);			
				}
				break;
				case 3:
				{
					char c='N';
					do 
					{
						c='N';
						int id=0,i;
						boolean flag=false;
						System.out.println("enter the officer Id of level 1 to promote: ");
						id=sc.nextInt();
						for(i=0;i<LevelOne.size();i++)
						{
							if(LevelOne.get(i).getID()==id)
							{
								flag=true;
								break;
							}
						}
						if(flag)
						{
							LevelThree.promote(LevelOne.get(i), LevelOne, LevelTwo, promotionRecord); 
						}
						else
						{
							System.out.println("Invalid details. \n Do you want to try again (Y/N)"); 
							c=sc.next().charAt(0);
						}						
					}while(c=='Y'); 					
				}
				break;
				case 4:
					break;
				default:
					break;
			}
			System.out.println("Do you want to continue(Y/N)");
			ch=sc.next().charAt(0);
			
		}while(ch=='Y');
	}
	
	public static void Level4View(levelFour LevelFour, ArrayList<levelOne> LevelOne, ArrayList<levelTwo> LevelTwo,
			ArrayList<levelThree> LevelThree, ArrayList<PromotionRecord> promotionRecord, 
			ArrayList <AwardRecord> awardRecord, ArrayList<RetirementRecord> retirementRecord,
			ArrayList<TransactionRecord> transactionRecord)
	{
		Scanner sc = new Scanner(System.in);
		int choice=0;
		char ch='N';
		
		do
		{
			System.out.println("*********************************************");
			System.out.println("\t\tMenu\n");
			System.out.println("1.Promote candidate");
			System.out.println("2.Award candidate");
			System.out.println("3.Generate reports");
			System.out.println("4.Exit");
			System.out.println("*********************************************");
			System.out.println("Enter a valid choice");
			choice = sc.nextInt();
			while(choice<1 || choice>4)
			{
				System.out.println("Enter a valid choice: ");
				choice = sc.nextInt();
			}
			switch(choice)
			{
				case 1:
				{
					char c='N';
					do
					{
						c='N';
						int id=0,i=0,level=0;
						boolean flag=false;
						System.out.println("Enter the level of officer to promote: ");
						level=sc.nextInt();
						while(level<=0 || level>=3)
						{
							System.out.println("Enter a valid level");
							level=sc.nextInt();						
						}
						if(level == 1)
						{
							System.out.println("enter the officer Id to promote: ");
							id=sc.nextInt();
							for(i=0;i<LevelOne.size();i++)
							{
								if(LevelOne.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								LevelFour.promote(LevelOne.get(i),LevelOne, LevelTwo, promotionRecord); 
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)"); 
								c=sc.next().charAt(0);
							}
						}
						else
						{
							System.out.println("enter the officer Id to promote: ");
							id=sc.nextInt();
							for(i=0;i<LevelTwo.size();i++)
							{
								if(LevelTwo.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								LevelFour.promote(LevelTwo.get(i),LevelTwo ,LevelThree, promotionRecord); 
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)"); 
								c=sc.next().charAt(0); 
							}
						}  								
					}while(c=='Y');						
				}
				break;
				case 2:
				{
					char c='N';
					do
					{
						c='N';
						int id=0,i=0,level=0;
						boolean flag=false;
						System.out.println("Enter the level of officer to award: ");
						level=sc.nextInt();
						while(level<=0 || level>=4)
						{
							System.out.println("Enter a valid level");
							level=sc.nextInt();						
						}
						if(level == 1)
						{
							System.out.println("enter the officer Id to award: ");
							id=sc.nextInt();
							for(i=0;i<LevelOne.size();i++)
							{
								if(LevelOne.get(i).getID()== id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								LevelFour.getAward(LevelOne.get(i), awardRecord, transactionRecord); 
								break;
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)"); 
								c=sc.next().charAt(0);
							}
						}
						else if(level == 2)
						{
							System.out.println("enter the officer Id to award: ");
							id=sc.nextInt();
							for(i=0;i<LevelTwo.size();i++)
							{
								if(LevelTwo.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								LevelFour.getAward(LevelTwo.get(i), awardRecord, transactionRecord); 
								break;
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)"); 
								c=sc.next().charAt(0);
							}
						}
						else
						{
							System.out.println("enter the officer Id to award: ");
							id=sc.nextInt();
							for(i=0;i<LevelThree.size();i++)
							{
								if(LevelThree.get(i).getID() == id)
								{
									flag=true;
									break;
								}
							}
							if(flag)
							{
								LevelFour.getAward(LevelThree.get(i),awardRecord, transactionRecord); 
								break;
							}
							else
							{
								System.out.println("Invalid details. Do you want to try again(Y/N)"); 
								c=sc.next().charAt(0);
							}
						}						
					}while(c=='Y');
				}
				break;
				case 3:
				{
					int searchCategory=0;
					System.out.println("Enter the start date from which the report should be generated: ");
					String sd;
					sd=sc.next();
					Date startDate = new Date();
					try {
						startDate = new SimpleDateFormat("dd-MM-yyyy").parse(sd);
					} catch (ParseException e) {
						System.out.println("Parse Exception encountered");
					}
					
					System.out.println("Enter the date till which the report should be generated: ");
					String ed;
					ed=sc.next();
					Date endDate = new Date();
					try {
						endDate = new SimpleDateFormat("dd-MM-yyyy").parse(ed);
					} catch (ParseException e) {
						System.out.println("Parse Exception encountered");
					}
					
					System.out.println("Enter the search category\n1. Award report\n2. Transaction report\n3. Retirement report"
							+ "\n4. Promotion report\nEnter a valid choice: ");
					searchCategory = sc.nextInt();
					while(searchCategory<=0 || searchCategory>=5)
					{
						System.out.println("Enter valid choice: ");
						searchCategory=sc.nextInt();
					}
					
					LevelFour.getReport(startDate, endDate, searchCategory, awardRecord, transactionRecord, retirementRecord,
							promotionRecord);
				}
				break;
				case 4:
					break;
				default:
					break;
			}
			System.out.println("Do you want to continue(Y/N)");
			ch=sc.next().charAt(0);			
		}while(ch=='Y');
	}
	
	public static void main(String[] args) {
		Allowance.intializeAllowanceMap();
		ArrayList<Manager> manager = new ArrayList<Manager>();
		ArrayList<levelThree> LevelThree = new ArrayList<levelThree>();
		ArrayList<levelFour> LevelFour = new ArrayList<levelFour>();
		ArrayList<levelOne> LevelOne = new ArrayList<levelOne>();
		ArrayList<levelTwo> LevelTwo = new ArrayList<levelTwo>();
		ArrayList<Veteran> veteran = new ArrayList<Veteran>();
		ArrayList<PromotionRecord> promotionRecord = new ArrayList<PromotionRecord>();
		ArrayList<AwardRecord> awardRecord = new ArrayList<AwardRecord>();
		ArrayList<RetirementRecord> retirementRecord = new ArrayList<RetirementRecord>();
		ArrayList<TransactionRecord> transactionRecord = new ArrayList<TransactionRecord>();		
		Scanner sc = new Scanner(System.in);		
		/*
		 * Read from files and put it into arrayLists
		 */
		Integer totalCount=0, awardCount=0, id, bankAccountNumber, level,month;
		String wing, location,temp, name, awardName,da,username,password, type;
		Double baseSalary, balance, prizeMoney, amount, pensionAmount;
		Date date = new Date();	
		FileReader fileRead;
		//levelOne
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\LevelOne.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\LevelOne.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();
            while(totalCount>0)
            {
                ArrayList<Award> award = new ArrayList<Award>();
                temp=fin.next();
                temp=fin.next();   
                name=fin.next(); 
                //System.out.println(name);
                temp=fin.next();
                id=fin.nextInt();    
                //System.out.println(id);
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                bankAccountNumber=fin.nextInt();
                //System.out.println(bankAccountNumber);
                temp=fin.next();
                temp=fin.next();
                balance=fin.nextDouble(); 
                //System.out.println(balance);
                temp=fin.next();
                level=fin.nextInt();       
                temp=fin.next();
                wing=fin.next();
                temp=fin.next();
                location=fin.next();
                //System.out.println(location);
                temp=fin.next();
                temp=fin.next();
                baseSalary=fin.nextDouble();   
                //System.out.println(baseSalary);
                temp=fin.next();
                awardCount = fin.nextInt();
                while(awardCount>0)
                {
                    temp=fin.next();
                    awardName=fin.next();
                    temp=fin.next();
                    temp=fin.next();
                    prizeMoney = fin.nextDouble();
                    temp=fin.next();
                    da=fin.next();
                    try
                    {
                        date=new SimpleDateFormat("dd-MM-yyyy").parse(da);
                    }
                    catch (ParseException e)
                    {
                        System.out.println("Date not in format as expected");
                    }  
                    Award a = new Award(awardName, prizeMoney, date);
                    award.add(a);
                    awardCount--;
                }                
                levelOne officer = new levelOne(id,name, wing, location, baseSalary, bankAccountNumber,balance, award);
                LevelOne.add(officer);
                totalCount--;
            }
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }
		
		//levelTwo
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\LevelTwo.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\LevelTwo.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();
            while(totalCount>0)
            {
                ArrayList<Award> award = new ArrayList<Award>();
                temp=fin.next();
                temp=fin.next();   
                name=fin.next(); 
                //System.out.println(name);
                temp=fin.next();
                id=fin.nextInt();    
                //System.out.println(id);
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                bankAccountNumber=fin.nextInt();
                //System.out.println(bankAccountNumber);
                temp=fin.next();
                temp=fin.next();
                balance=fin.nextDouble(); 
                //System.out.println(balance);
                temp=fin.next();
                level=fin.nextInt();       
                temp=fin.next();
                wing=fin.next();
                temp=fin.next();
                location=fin.next();
                temp=fin.next();
                temp=fin.next();
                baseSalary=fin.nextDouble();   
                temp=fin.next();
                awardCount = fin.nextInt();
                
                while(awardCount>0)
                {
                    temp=fin.next();
                    awardName=fin.next();
                    temp=fin.next();
                    temp=fin.next();
                    prizeMoney = fin.nextDouble();
                    temp=fin.next();
                    da=fin.next();
                    try
                    {
                        date=new SimpleDateFormat("dd-MM-yyyy").parse(da);
                    }
                    catch (ParseException e)
                    {
                        System.out.println("Date not in format as expected");
                    }  
                    Award a = new Award(awardName, prizeMoney, date);
                    award.add(a);
                    awardCount--;
                }                
                levelTwo officer = new levelTwo(id,name, wing, location, baseSalary, bankAccountNumber,balance, award);
                LevelTwo.add(officer);
                totalCount--;
            }
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }
        
		//levelThree
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\LevelThree.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\LevelThree.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();
            while(totalCount>0)
            {
                ArrayList<Award> award = new ArrayList<Award>();
                temp=fin.next();
                temp=fin.next();   
                name=fin.next(); 
                //System.out.println(name);
                temp=fin.next();
                id=fin.nextInt();    
                //System.out.println(id);
                temp=fin.next();
                username=fin.next();
              //System.out.println(username);
                temp=fin.next();
                password=fin.next();
              //System.out.println(password);
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                bankAccountNumber=fin.nextInt();
                //System.out.println(bankAccountNumber);
                temp=fin.next();
                temp=fin.next();
                balance=fin.nextDouble(); 
                //System.out.println(balance);
                temp=fin.next();
                level=fin.nextInt();       
                temp=fin.next();
                wing=fin.next();
                temp=fin.next();
                location=fin.next();
                temp=fin.next();
                temp=fin.next();
                baseSalary=fin.nextDouble();   
                temp=fin.next();
                awardCount = fin.nextInt();
                
                while(awardCount>0)
                {
                    temp=fin.next();
                    awardName=fin.next();
                    temp=fin.next();
                    temp=fin.next();
                    prizeMoney = fin.nextDouble();
                    temp=fin.next();
                    da=fin.next();
                    try
                    {
                        date=new SimpleDateFormat("dd-MM-yyyy").parse(da);
                    }
                    catch (ParseException e)
                    {
                        System.out.println("Date not in format as expected");
                    }  
                    Award a = new Award(awardName, prizeMoney, date);
                    award.add(a);
                    awardCount--;
                }                
                levelThree officer = new levelThree(id,username, password, name, wing, location, baseSalary, bankAccountNumber, balance, award);
                LevelThree.add(officer);
                totalCount--;
            }
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }
		
		
		//levelFour
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\LevelFour.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\LevelFour.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();
            while(totalCount>0)
            {
                ArrayList<Award> award = new ArrayList<Award>();
                temp=fin.next();
                temp=fin.next();   
                name=fin.next(); 
                //System.out.println(name);
                temp=fin.next();
                id=fin.nextInt();    
                //System.out.println(id);
                temp=fin.next();
                username=fin.next();
              //System.out.println(username);
                temp=fin.next();
                password=fin.next();
              //System.out.println(password);
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                bankAccountNumber=fin.nextInt();
                //System.out.println(bankAccountNumber);
                temp=fin.next();
                temp=fin.next();
                balance=fin.nextDouble(); 
                //System.out.println(balance);
                temp=fin.next();
                level=fin.nextInt();       
                temp=fin.next();
                wing=fin.next();
                temp=fin.next();
                location=fin.next();
                temp=fin.next();
                temp=fin.next();
                baseSalary=fin.nextDouble();   
                temp=fin.next();
                awardCount = fin.nextInt();
                
                while(awardCount>0)
                {
                    temp=fin.next();
                    awardName=fin.next();
                    temp=fin.next();
                    temp=fin.next();
                    prizeMoney = fin.nextDouble();
                    temp=fin.next();
                    da=fin.next();
                    try
                    {
                        date=new SimpleDateFormat("dd-MM-yyyy").parse(da);
                    }
                    catch (ParseException e)
                    {
                        System.out.println("Date not in format as expected");
                    }  
                    Award a = new Award(awardName, prizeMoney, date);
                    award.add(a);
                    awardCount--;
                }                
                levelFour officer = new levelFour(id, username, password, name, wing, location, baseSalary, bankAccountNumber, balance, award);
                LevelFour.add(officer);
                totalCount--;
            }
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }
		
        //Transaction Record
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\TransactionRecord.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\TransactionRecord.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();            
            while(totalCount>0)
            {           
            	temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                id=fin.nextInt();
                //System.out.println(id);
                temp=fin.next();
                da=fin.next();
                try
                {
                    date=new SimpleDateFormat("dd-MM-yyyy").parse(da);
                }
                catch (ParseException e)
                {
                    System.out.println("Date not in format as expected");
                } 
                //System.out.println(date);
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                bankAccountNumber = fin.nextInt();
                //System.out.println(bankAccountNumber);
                temp=fin.next();
                amount=fin.nextDouble();
                //System.out.println(amount);
                temp=fin.next();
                type=fin.next();
                //System.out.println(type); 
                TransactionRecord tr = new TransactionRecord(id,date,bankAccountNumber,amount,type);
                transactionRecord.add(tr);
                totalCount--;
            }
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }
		
        
        //Promotion Record
        
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\PromotionRecord.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\PromotionRecord.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();
            while(totalCount>0)
            {
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                id=fin.nextInt();
                //System.out.println(id);
                temp=fin.next();
                da=fin.next();
                try
                {
                    date=new SimpleDateFormat("dd-MM-yyyy").parse(da);
                }
                catch (ParseException e)
                {
                    System.out.println("Date not in format as expected");
                } 
                //System.out.println(date);
                temp=fin.next();
                temp=fin.next();
                level=fin.nextInt();
                //System.out.println(level);
                PromotionRecord pr = new PromotionRecord(id,date,level);
                promotionRecord.add(pr);
                totalCount--;
            }
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }
        
        //Retirement Record
        
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\RetirementRecord.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\RetirementRecord.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();
            while(totalCount>0)
            {
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                id=fin.nextInt();
                //System.out.println(id);
                temp=fin.next();
                da=fin.next();
                try
                {
                    date=new SimpleDateFormat("dd-MM-yyyy").parse(da);
                }
                catch (ParseException e)
                {
                    System.out.println("Date not in format as expected");
                } 
                //System.out.println(date);
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                level=fin.nextInt();
                //System.out.println(level);   
                RetirementRecord rr = new RetirementRecord(id,date,level);
                retirementRecord.add(rr);
                totalCount--;
            }
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }
        
        //Awards Record
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\AwardRecord.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\AwardRecord.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();
            while(totalCount>0)
            {
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                id=fin.nextInt();
                //System.out.println(id);
                temp=fin.next();
                da=fin.next();
                try
                {
                    date=new SimpleDateFormat("dd-MM-yyyy").parse(da);
                }
                catch (ParseException e)
                {
                    System.out.println("Date not in format as expected");
                } 
                //System.out.println(date);
                temp=fin.next();
                temp=fin.next();
                awardName=fin.next();
                //System.out.println(awardName);
                temp=fin.next();
                temp=fin.next();
                prizeMoney=fin.nextDouble();
                //System.out.println(prizeMoney);   
                AwardRecord ar = new AwardRecord(id,date,awardName, prizeMoney);
                awardRecord.add(ar);
                totalCount--;
            }
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }
		
        //Manager
        
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\Manager.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\Manager.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();
            while(totalCount>0)
            {
            	temp=fin.next();
                temp=fin.next();
                name=fin.next();
                //System.out.println(name);
                temp=fin.next();
                id=fin.nextInt();
                //System.out.println(id);
                temp=fin.next();
                username=fin.next();
                //System.out.println(username);
                temp=fin.next();
                password=fin.next();
                //System.out.println(password);
                
                Manager m = new Manager(name, id, username, password);
                manager.add(m);
                totalCount--;
            }
            temp=fin.next();
            month=fin.nextInt();
            Manager.setMonth(month);
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }      
        
        
        //Veteran        
        try
        {
            File directory = new File("");
            //System.out.println(directory.getAbsolutePath()+ "\\Files\\Veteran.txt"); 
            fileRead = new FileReader(directory.getAbsolutePath()+ "\\Files\\Veteran.txt");
            Scanner fin = new Scanner(fileRead);
            totalCount=fin.nextInt();
            while(totalCount>0)
            {
            	temp=fin.next();
                temp=fin.next();
                name=fin.next();
                //System.out.println(name);
                temp=fin.next();
                id=fin.nextInt();
                //System.out.println(id);
                temp=fin.next();
                temp=fin.next();
                temp=fin.next();
                bankAccountNumber=fin.nextInt();
                //System.out.println(bankAccountNumber);
                temp=fin.next();
                temp=fin.next();
                balance=fin.nextDouble();
                //System.out.println(balance);    
                temp=fin.next();
                temp=fin.next();
                pensionAmount=fin.nextDouble();
                //System.out.println(pensionAmount);
                Veteran v = new Veteran(name, id, bankAccountNumber,balance, pensionAmount);
                veteran.add(v);
                totalCount--;
            }
            fin.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found error");
        }      	
		
		int choice=-1;
		char ch='N',c='N',check='N';
		do
		{
			Driver.LoginMenu();
			choice=sc.nextInt();
			while(choice<=0 || choice>=4){
				System.out.println("Enter a valid choice: ");
				choice = sc.nextInt();
			}
			switch(choice) {
				case 1:
				{
					int i=0;
					do 
					{
						c='N';
						System.out.println("Enter your username: ");
						username=sc.next();
						System.out.println("Enter your password: ");
						password=sc.next();
						boolean flag=false;
						for(i=0;i<manager.size();i++)
						{						
							if(manager.get(i).validate(username, password))
							{
								
								flag=true;
								break;
							}
						}	
						if(flag) {
							System.out.println("Logged in successfully!");
							Driver.ManagerView(manager.get(i), LevelOne, LevelTwo, LevelThree, LevelFour, veteran,
									retirementRecord, transactionRecord);
							break;
						}
						else {
							System.out.println("Invalid credentials\n Do you want to try again(Y/N)");
							c=sc.next().charAt(0); 							
						}
					}while(c=='Y');

				}
				break;
				case 2:
				{
					do
					{
						c='N';
						int i=0;
						System.out.println("Enter your username: ");
						username=sc.next();
						System.out.println("Enter your password: ");
						password=sc.next();
						System.out.println("Enter your ranking level: ");
						level=sc.nextInt();
						if(level==3)
						{
							boolean flag=false;
							for(i=0;i<LevelThree.size();i++)
							{						
								if(LevelThree.get(i).validate(username, password))
								{									
									flag=true;
									break;
								}
							}	
							if(flag) {
								System.out.println("Logged in successfully!");
								Driver.Level3View(LevelThree.get(i), LevelOne, LevelTwo, promotionRecord);
								break;
							}
							else {
								System.out.println("Invalid credentials\n Do you want to try again(Y/N)");
								c=sc.next().charAt(0); 								
							}							
						}
						if(level==4)
						{
							boolean flag=false;
							for(i=0;i<LevelFour.size();i++)
							{						
								if(LevelFour.get(i).validate(username, password))
								{									
									flag=true;
									break;
								}
							}	
							if(flag) {
								System.out.println("Logged in successfully!");
								Driver.Level4View(LevelFour.get(i), LevelOne, LevelTwo, LevelThree, promotionRecord, 
										awardRecord, retirementRecord, transactionRecord);
								break;
							
							}
							else {
								System.out.println("Invalid credentials\n Do you want to try again(Y/N)");
								c=sc.next().charAt(0); 			
							}							
						}
						
					}while(c=='Y');

				}
				break;
				case 3:
					break;
				default:
					break;
			}  
			System.out.println("Do you want to log in(Y/N)");		
			check=sc.next().charAt(0);
		}while(check=='Y');  	
		
		/*
		 * Write into the files
		 * 
		 * PrintWriter fout = new PrintWriter("output.txt"); 
			fout.println(29.95);
			fout.println(new Rectangle(5, 10, 15, 25));
			fout.println("Hello, World!"); 
		 */
		
		//Writing into levelOne officer files:
		int i=0;
		PrintWriter fout;
		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+ "\\Files\\LevelOne.txt");
			fout.println(LevelOne.size());
			fout.println("------------------------------------------");			
			for(i=0;i<LevelOne.size();i++)
			{
				fout.println("Name: "+LevelOne.get(i).getName());
				fout.println("ID: "+LevelOne.get(i).getID());
				fout.println("Bank account number: "+LevelOne.get(i).bankaccount.getAccountNumber());
				fout.println("Bank balance: "+LevelOne.get(i).getBalance());
				fout.println("Level: "+LevelOne.get(i).getLevel());
				fout.println("Wing: "+LevelOne.get(i).getWing());
				fout.println("Location: "+LevelOne.get(i).getLocation());
				fout.println("Base salary: "+LevelOne.get(i).getBaseSalary());
				fout.println("Awards: ");
				fout.println(LevelOne.get(i).awardsRecieved.size());
				for(int j=0;j<LevelOne.get(i).awardsRecieved.size();j++)
				{ //print awards received number
					if(j!=LevelOne.get(i).awardsRecieved.size()-1)
					{
						fout.println("Name: "+LevelOne.get(i).awardsRecieved.get(j).getName());
						fout.println("Prize money: "+LevelOne.get(i).awardsRecieved.get(j).getPrizeMoney());
						fout.println("Date: "+LevelOne.get(i).awardsRecieved.get(j).getStringDate());
					}
					else
					{
						fout.println("Name: "+LevelOne.get(i).awardsRecieved.get(j).getName());
						fout.println("Prize money: "+LevelOne.get(i).awardsRecieved.get(j).getPrizeMoney());
						fout.println("Date: "+LevelOne.get(i).awardsRecieved.get(j).getStringDate());
						fout.println("------------------------------------------");
					}
				}			
			}
			fout.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found error");
		}

		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+ "\\Files\\LevelTwo.txt");
			fout.println(LevelTwo.size());
			fout.println("------------------------------------------");
			for(i=0;i<LevelTwo.size();i++)
			{
				fout.println("Name: "+LevelTwo.get(i).getName());
				fout.println("ID: "+LevelTwo.get(i).getID());
				fout.println("Bank account number: "+LevelTwo.get(i).bankaccount.getAccountNumber());
				fout.println("Bank balance: "+LevelTwo.get(i).getBalance());
				fout.println("Level: "+LevelTwo.get(i).getLevel());
				fout.println("Wing: "+LevelTwo.get(i).getWing());
				fout.println("Location: "+LevelTwo.get(i).getLocation());
				fout.println("Base salary: "+LevelTwo.get(i).getBaseSalary());
				fout.println("Awards: ");
				fout.println(LevelTwo.get(i).awardsRecieved.size());
				for(int j=0;j<LevelTwo.get(i).awardsRecieved.size();j++)
				{
					if(j!=LevelTwo.get(i).awardsRecieved.size()-1)
					{
						fout.println("Name: "+LevelTwo.get(i).awardsRecieved.get(j).getName());
						fout.println("Prize money: "+LevelTwo.get(i).awardsRecieved.get(j).getPrizeMoney());
						fout.println("Date: "+LevelTwo.get(i).awardsRecieved.get(j).getStringDate());
					}
					else
					{
						fout.println("Name: "+LevelTwo.get(i).awardsRecieved.get(j).getName());
						fout.println("Prize money: "+LevelTwo.get(i).awardsRecieved.get(j).getPrizeMoney());
						fout.println("Date: "+LevelTwo.get(i).awardsRecieved.get(j).getStringDate());
						fout.println("------------------------------------------");
					}
				}
			}
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		}
		
		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\LevelThree.txt");
			fout.println(LevelThree.size());
			fout.println("------------------------------------------");
			for(i=0;i<LevelThree.size();i++)
			{
				fout.println("Name: "+LevelThree.get(i).getName());
				fout.println("ID: "+LevelThree.get(i).getID());
				fout.println("Username: "+LevelThree.get(i).getUsername());
				fout.println("Password: "+LevelThree.get(i).getPassword());
				fout.println("Bank account number: "+LevelThree.get(i).bankaccount.getAccountNumber());
				fout.println("Bank balance: "+LevelThree.get(i).getBalance());
				fout.println("Level: "+LevelThree.get(i).getLevel());
				fout.println("Wing: "+LevelThree.get(i).getWing());
				fout.println("Location: "+LevelThree.get(i).getLocation());
				fout.println("Base salary: "+LevelThree.get(i).getBaseSalary());
				fout.println("Awards: ");
				fout.println(LevelThree.get(i).awardsRecieved.size());
				for(int j=0;j<LevelThree.get(i).awardsRecieved.size();j++)
				{
					if(j!=LevelThree.get(i).awardsRecieved.size()-1)
					{
						fout.println("Name: "+LevelThree.get(i).awardsRecieved.get(j).getName());
						fout.println("Prize money: "+LevelThree.get(i).awardsRecieved.get(j).getPrizeMoney());
						fout.println("Date: "+LevelThree.get(i).awardsRecieved.get(j).getStringDate());
					}
					else
					{
						fout.println("Name: "+LevelThree.get(i).awardsRecieved.get(j).getName());
						fout.println("Prize money: "+LevelThree.get(i).awardsRecieved.get(j).getPrizeMoney());
						fout.println("Date: "+LevelThree.get(i).awardsRecieved.get(j).getStringDate());
						fout.println("------------------------------------------");
					}
				}				
			}
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
			
		}

		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\LevelFour.txt");
			fout.println(LevelFour.size());
			fout.println("------------------------------------------");
			for(i=0;i<LevelFour.size();i++)
			{
				fout.println("Name: "+LevelFour.get(i).getName());
				fout.println("ID: "+LevelFour.get(i).getID());
				fout.println("Username: "+LevelFour.get(i).getUsername());
				fout.println("Password: "+LevelFour.get(i).getPassword());
				fout.println("Bank account number: "+LevelFour.get(i).bankaccount.getAccountNumber());
				fout.println("Bank balance: "+LevelFour.get(i).getBalance());
				fout.println("Level: "+LevelFour.get(i).getLevel());
				fout.println("Wing: "+LevelFour.get(i).getWing());
				fout.println("Location: "+LevelFour.get(i).getLocation());
				fout.println("Base salary: "+LevelFour.get(i).getBaseSalary());
				fout.println("Awards: ");
				fout.println(LevelFour.get(i).awardsRecieved.size());
				for(int j=0;j<LevelFour.get(i).awardsRecieved.size();j++)
				{
					if(j!=LevelFour.get(i).awardsRecieved.size()-1)
					{
						fout.println("Name: "+LevelFour.get(i).awardsRecieved.get(j).getName());
						fout.println("Prize money: "+LevelFour.get(i).awardsRecieved.get(j).getPrizeMoney());
						fout.println("Date: "+LevelFour.get(i).awardsRecieved.get(j).getStringDate());
					}
					else
					{
						fout.println("Name: "+LevelFour.get(i).awardsRecieved.get(j).getName());
						fout.println("Prize money: "+LevelFour.get(i).awardsRecieved.get(j).getPrizeMoney());
						fout.println("Date: "+LevelFour.get(i).awardsRecieved.get(j).getStringDate());
						fout.println("------------------------------------------");
					}
				}
			}
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		}
		
		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\AwardRecord.txt");
			fout.println(awardRecord.size());
			fout.println("------------------------------------------");
			for(i=0;i<awardRecord.size();i++)
			{
				fout.println("Officer ID: "+awardRecord.get(i).getOfficerID());
				fout.println("Date: "+awardRecord.get(i).getStringDate());
				fout.println("Award name: "+awardRecord.get(i).getAwardName());
				fout.println("Prize money: "+awardRecord.get(i).getPrizeMoney());
				fout.println("------------------------------------------");
			}
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		}
		
		
		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\PromotionRecord.txt");
			fout.println(promotionRecord.size());
			fout.println("------------------------------------------");
			for(i=0;i<promotionRecord.size();i++)
			{
				fout.println("Officer ID: "+promotionRecord.get(i).getOfficerID());
				fout.println("Date: "+promotionRecord.get(i).getStringDate());
				fout.println("Next level: "+promotionRecord.get(i).getNextLevel());
				fout.println("------------------------------------------");
			}
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		}
		
		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\RetirementRecord.txt");
			fout.println(retirementRecord.size());
			fout.println("------------------------------------------");
			for(i=0;i<retirementRecord.size();i++)
			{
				fout.println("Officer ID: "+retirementRecord.get(i).getOfficerID());
				fout.println("Date: "+retirementRecord.get(i).getStringDate());
				fout.println("Level during retirement: "+retirementRecord.get(i).getRankDuringRetirement());
				fout.println("------------------------------------------");
			}
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		}
		
		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\TransactionRecord.txt");
			fout.println(transactionRecord.size());
			fout.println("------------------------------------------");
			for(i=0;i<transactionRecord.size();i++)
			{
				fout.println("Officer ID: "+transactionRecord.get(i).getOfficerID());
				fout.println("Date: "+transactionRecord.get(i).getStringDate());
				fout.println("Bank account number: "+transactionRecord.get(i).getBankAccountNumber());
				fout.println("Amount: "+transactionRecord.get(i).getAmount());
				fout.println("Type: "+transactionRecord.get(i).getType());
				fout.println("------------------------------------------");
			}
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		}	
		
		//Manager
		
		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\Manager.txt");
			fout.println(manager.size());
			fout.println("------------------------------------------");
			for(i=0;i<manager.size();i++)
			{
				fout.println("Name: "+manager.get(i).getName());
				fout.println("ID: "+manager.get(i).getID());
				fout.println("Username: "+manager.get(i).getUsername());
				fout.println("Password: "+manager.get(i).getPassword());
				fout.println("------------------------------------------");
			}
			fout.println(Manager.getMonth());
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		}	
		
		
		//Veteran
		try {
			File directory = new File("");
			fout = new PrintWriter(directory.getAbsolutePath()+"\\Files\\Veteran.txt");
			fout.println(veteran.size());
			fout.println("------------------------------------------");
			for(i=0;i<veteran.size();i++)
			{
				fout.println("Name: "+veteran.get(i).getName());
				fout.println("ID: "+veteran.get(i).getID());
				fout.println("Bank account number: "+veteran.get(i).bankaccount.getAccountNumber());
				fout.println("Bank balance: "+veteran.get(i).getBalance());
				fout.println("Pension amount: "+veteran.get(i).getPensionAmount());
				fout.println("------------------------------------------");
			}
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		}
		System.out.println("Thank you!");
	}  
}
