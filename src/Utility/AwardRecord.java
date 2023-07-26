package Utility;

import java.util.Date;

public class AwardRecord extends Record{
	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public Double getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(Double prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	private String awardName;
	private Double prizeMoney;
	
	public AwardRecord(Integer officerID, Date date, String awardName, Double prizeMoney) {
		super(officerID, date);
		this.awardName = awardName;
		this.prizeMoney = prizeMoney;
	}	
}
