import java.util.Date;

 //Inheritance:Aggregation
   InPatient is a Patient//

public class InPatient extends Patient {
	Date dischargeDate;

	public Date getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
		
	}
	
	public void patient_info() {
 //Super Keyword
		super.patient_info();
		System.out.println("DIS DATE:"+dischargeDate);
	}
 //Abstract method implemented
	public void showInsurance() {
		System.out.println("Abstract Method Implemented..for InPatient");
		
	}
}