package com.clinicalmgmt.bill;
/**
 Implementing Interface
 */
public class ClinicBill implements Bill {
	
	public interface Bill {

	void createBill();
	void modifyBill();
	void printBill();
	void sendBill();

}
	/* (non-Javadoc)
	 * @see Bill#createBill()
	 */
	public void createBill() {
		System.out.println("Create a Bill Ob");

	}

	/* (non-Javadoc)
	 * @see Bill#modifyBill()
	 */
	public void modifyBill() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see Bill#printBill()
	 */
	public void printBill() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see Bill#sendBill()
	 */
	public void sendBill() {
		// TODO Auto-generated method stub

	}

}
