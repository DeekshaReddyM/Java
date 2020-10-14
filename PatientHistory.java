import java.util.Date;

 //Inheritance:Composition
   Patient has a history//
public class PatientHistory {

	private Date lastVisit;
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	public int getTotalVisits() {
		return totalVisits;
	}
	public void setTotalVisits(int totalVisits) {
		this.totalVisits = totalVisits;
	}
	private int totalVisits;
		
}