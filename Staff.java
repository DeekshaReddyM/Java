public class Staff {
	private String sid, sname, desg, sex;
	private int age;
	
 //final variable  
    final int agelimit=60;
    
 //final method
    final void displayAgeLimit(){
    	System.out.println("Age Limit:"+agelimit);
    }  
    
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int salary;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void staff_info()
	{
		System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + desg + "\t"+salary);
	}
}