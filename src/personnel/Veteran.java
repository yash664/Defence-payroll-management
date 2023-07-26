package personnel;

public class Veteran extends Personnel {
	public double pensionAmount;
	public static int veteranCount=0;
	public Veteran(String name, Integer id, Integer accountNumber, Double balance, double pensionAmount)//from files
	{
		super(id, name, accountNumber, balance);
		this.pensionAmount = pensionAmount;
		veteranCount++;
	}
	public Veteran(levelOne officer,double pensionAmount) {//creating new veteran
		super(officer.getID(), officer.getName(), officer.getBankaccount());
		this.pensionAmount = pensionAmount;
		veteranCount++;
	}
	public Veteran(levelTwo officer,double pensionAmount) {
		super(officer.getID(),  officer.getName(), officer.getBankaccount());
		this.pensionAmount = pensionAmount;
		veteranCount++;
	}
	public Veteran(levelThree officer,double pensionAmount) {
		super(officer.getID(), officer.getName(), officer.getBankaccount());
		this.pensionAmount = pensionAmount;
		veteranCount++;
	}
	public Veteran(levelFour officer,double pensionAmount) {
		super(officer.getID(), officer.getName(), officer.getBankaccount());
		this.pensionAmount = pensionAmount;
		veteranCount++;
	}

	public static int getVeteranCount() {
		return veteranCount;
	}
	public double getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

}