package com.clinical.mgmt.main;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class ClinicManagement {

	public static void main(String[] args) {
//Command-line arguments
		System.out.println("Main invoked with :"+args.length +" ARGUMENTS");
		for(String arg:args) {
			System.out.println(arg);
		}
		String months[] = Util.getMonths();

		Calendar calendar = Calendar.getInstance();
		//System.out.println("--------------------------------------------------------------------------------");
		int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
		System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

                List<Doctor> doctors = new ArrayList<Doctor>();
		List<Patient> patients = new ArrayList<Patient>();
		List<Lab> labList = new ArrayList<Lab>();
		List<Facility> facilityList = new ArrayList<Facility>();
		List<Medicine> medicineList = new ArrayList<Medicine>();
		List<Staff> staffList = new ArrayList<Staff>();

		createDoctorObjs(doctors);
		createPatients(patients);
		Scanner input = new Scanner(System.in);
		int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
		while (status == 1){
			displayMenu();

			choice = input.nextInt();
 //Control statements
			switch (choice){
			case 1:{
				s1 = 1;
				while (s1 == 1){
					displayMenu("DOCTOR");
					System.out.println("1.Add New Entry\n2.Existing Doctors List");
					c1 = input.nextInt();
					switch (c1){
					case 1:{
						doctors.add(Util.createDoctor());
						count1++;
						break;
					}
					case 2:{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
						System.out.println("--------------------------------------------------------------------------------");
						for (j = 0; j < doctors.size(); j++){
							Doctor doc = doctors.get(j);
							doc.doctor_info();
						}
						break;
					}
					}
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s1 = input.nextInt();
				}
				break;
			}
			case 2:{
				displayMenu("PATIENT");
				s2 = 1;
				while (s2 == 1){
					System.out.println("1.Add New Entry\n2.Existing Patients List");
					c1 = input.nextInt();
					switch (c1){
					case 1:{
						patients.add(Util.createPatient());
						break;
					}
					case 2:{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
						System.out.println("--------------------------------------------------------------------------------");
						for (j = 0; j < patients.size(); j++) {
							patients.get(j).patient_info();
							//Calling Abstract method
							patients.get(j).showInsurance();
						}
						break;
					}
					}
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s2 = input.nextInt();
				}
				break;
			}
			case 3:{
				s3 = 1;
				displayMenu("MEDICINE");
				while (s3 == 1){
					System.out.println("1.Add New Entry\n2. Existing Medicines List");
					c1 = input.nextInt();
					switch (c1){
					case 1:{
						medicineList.add(Util.createMedicine());
						break;
					}
					case 2:{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Name \t Company \t Expiry Date \t Cost");
						System.out.println("--------------------------------------------------------------------------------");
						for (j = 0; j < medicineList.size(); j++) {
							medicineList.get(j).find_medi();
						}
						break;
					}
					}
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s3 = input.nextInt();
				}
				break;
			}
			case 4:{
				s4 = 1;
				displayMenu("LABORATORY");
				while (s4 == 1){
					System.out.println("1.Add New Entry \n2.Existing Laboratories List");
					c1 = input.nextInt();
					switch (c1){
					case 1:{
						labList.add(Util.createLab());
						break;
					}
					case 2:{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Fecilities\t\t Cost");
						System.out.println("--------------------------------------------------------------------------------");
						for (j = 0; j < labList.size(); j++) {
							labList.get(j).faci_list();
						}
						break;
					}
					}
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s4 = input.nextInt();
				}
				break;
			}
			case 5:{
				s5 = 1;
				displayMenu("CLINIC FACILITY");
				while (s5 == 1){
					System.out.println("1.Add New Facility\n2.Existing Facilities List");
					c1 = input.nextInt();
					switch (c1){
					case 1:{
						facilityList.add(Util.createFacility());
						break;
					}
					case 2:{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("Hospital  Facility are:");
						System.out.println("--------------------------------------------------------------------------------");
						for (j = 0; j < facilityList.size(); j++) {
							facilityList.get(j).show_feci();
						}
						break;
					}
					}
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s5 = input.nextInt();
				}
				break;
			}
			case 6:{
				s6 = 1;
				displayMenu("STAFF");

				while (s6 == 1){
					System.out.println("1.Add New Entry \n2.Existing Staff List");
					c1 = input.nextInt();
					switch (c1){
					case 1:{
						staffList.add(Util.createStaff());
						break;
					}
					case 2:{
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("id \t Name \t Gender \t Designation \t Salary");
						System.out.println("--------------------------------------------------------------------------------");
						for (j = 0; j < staffList.size(); j++){
							staffList.get(j).staff_info();
						}
						break;
					}
					}
					System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
					s6 = input.nextInt();
				}
				break;
			}
			default:{
				System.out.println(" You Have Enter Wrong Choice!!!");
			}
			}
			System.out.println("\nReturn to MAIN MENU Press 1");
			status = input.nextInt();
		}
	}

	private static void displayMenu() {
		System.out.println("\n                                    MAIN MENU");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("1.Doctors  2.Patients  3.Medicines  4.Laboratories  5.Facilities  6.Staff ");
		System.out.println("-----------------------------------------------------------------------------------");
	}

//Function Overloading-displayMenu() 
	private static void displayMenu(String section) {
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("                      "+section+" SECTION");
		System.out.println("--------------------------------------------------------------------------------");
	}

	
	private static void createDoctorObjs(List<Doctor> docList) {
		//Calling overloaded Constructors
		Doctor d1 = new Doctor("21", "Sweta", "ENT", "10-3PM", "MS", 4);
		Doctor d2 = new Doctor("23", "Saha", "Gyna", "10-4PM", "MD", 5);

		docList.add(d1);
		docList.add(d2);
	}

	private static void createPatients(List<Patient> patientList) {
		Patient p1 = new InPatient();
		p1.setPid("P1");
		p1.setAge(29);
		p1.setDisease("Eye Problem");
		p1.setAdmit_status("OPD");
		p1.setPname("John");
		p1.setSex("M");

		patientList.add(p1);
	}
}
