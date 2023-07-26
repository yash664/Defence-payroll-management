package Utility;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {
	static Integer recordCount = 0;
	Integer officerID;
	Date date;
	
	protected Record(Integer officerID, Date date) {
		this.officerID = officerID;
		this.date = date;
	}

	public static Integer getRecordCount() {
		return recordCount;
	}

	public static void setRecordCount(Integer recordCount) {
		Record.recordCount = recordCount;
	}

	public Integer getOfficerID() {
		return officerID;
	}

	public void setOfficerID(Integer officerID) {
		this.officerID = officerID;
	}

	public Date getDate() {
		return date;
	}
	
	public String getStringDate()
	{
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String Sdate = simpleDateFormat.format(this.date);
		return Sdate;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
