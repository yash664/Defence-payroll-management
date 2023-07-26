package Utility;

import java.util.Date;

public class RetirementRecord extends Record{
	private Integer rankDuringRetirement;

	public RetirementRecord(Integer officerID, Date date, Integer rankDuringRetirement) {
		super(officerID, date);
		this.rankDuringRetirement = rankDuringRetirement;
	}

	public Integer getRankDuringRetirement() {
		return rankDuringRetirement;
	}

	public void setRankDuringRetirement(Integer rankDuringRetirement) {
		this.rankDuringRetirement = rankDuringRetirement;
	}	
	
	
}
