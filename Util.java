import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
  //String
	static String className = "Util Class: ";
 //StringBuffer
	static StringBuffer messageSB = new StringBuffer("This is static block");
 // Static Block
	static {
		System.out.println(className+messageSB);
	}
	
 // Static Variable
    static String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
    };
    private static Scanner scanner;

    public static String[] getMonths() {
        return months;
    }

    public static String readInput(String inp2Read) {
        scanner = new Scanner(System.in);
        System.out.print(inp2Read);
        String  value = scanner.nextLine();
        return value;
    }
    
 //Static function
    public static Doctor createDoctor(){
        Doctor doc= new Doctor();
        doc.setDid(readInput("id:-"));
        doc.setDname(readInput("name:-"));
        doc.setSpecilist(readInput("specilization:-"));
        doc.setAppoint(readInput("work time:-"));
        doc.setDoc_qual(readInput("qualification:-"));
        int rno;
        try {
            rno= Integer.parseInt(readInput("room no:-"));
        }catch(NumberFormatException nfe) {
            rno= Integer.parseInt(readInput("Please enter room no(numaric):-"));
        }
        doc.setDroom(rno);
        return doc;
    }
    
 //Static function
    public static Patient createPatient(){
        Patient pat= new OutPatient();
        pat.setPid(readInput("id:-"));
        pat.setPname(readInput("name:-"));
        pat.setDisease(readInput("disease:-"));
        pat.setSex(readInput("sex:-"));
        pat.setAdmit_status(readInput("admit_status:-"));
        System.out.print("age:-");
        scanner = new Scanner(System.in);
        try {
            pat.setAge(scanner.nextInt());
        }catch(InputMismatchException imme) {
            System.out.print("enter age(numeric value only):-");
        }
        return pat;
    }

    public static Medicine createMedicine(){
        Medicine medine= new Medicine();
        medine.setMed_name(readInput("Med_name:-"));
        medine.setMed_comp(readInput("Med_comp:-"));
        medine.setExp_date(readInput("Exp_date:-"));
        medine.setMed_cost(Integer.parseInt(readInput("Med_cost:-")));

        return medine;
    }

    public static Lab createLab(){
        Lab lab= new Lab();
        lab.setFacility(readInput("Facility:-"));
        lab.setLab_cost(Integer.parseInt(readInput("Cost:-")));
        return lab;
    }

    public static Facility createFacility(){
        Facility facility= new Facility();
        facility.setFec_name(readInput("Facility:-"));

        return facility;
    }

    public static Staff createStaff(){
        Staff staff= new Staff();
        staff.setSid(readInput("id:-"));
        staff.setSname(readInput("name:-"));
        staff.setDesg(readInput("desigination:-"));
        staff.setSex(readInput("sex:-"));
        staff.setSalary(Integer.parseInt(readInput("Salary:-")));

        return staff;
    }

}

