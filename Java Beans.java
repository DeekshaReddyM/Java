package com.christ.cm.models;

import java.util.Scanner;

/**
 * @author Deeksha
 * This is Bean/Model Class for Patient//
public abstract class Patient {
	/* Patient History */

	private PatientHistory ph;
	String pid, pname, disease, sex, admit_status;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAdmit_status() {
		return admit_status;
	}
	public void setAdmit_status(String admit_status) {
		this.admit_status = admit_status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	int age;
	private Scanner input;

	public void patient_info(){
		System.out.println(pid + "\t" + pname + " \t" + disease + " \t" + sex + "\t" + admit_status + "\t" + age);
	}
	
	/abstract method
	abstract public void showInsurance();   	

}

