package com.doctor;

public class Doctor {

	private int regNo;
	private String doctorName;
	private String specilization;
	private double consultingFee;
	public Doctor(int regNo,String doctorName,String specialization,double consultingFee){
	this.regNo = regNo;
	this.doctorName = doctorName;
	this.specilization = specialization;
	this.consultingFee = consultingFee;
	}
	public String displayDoctorDetail() {
		String doctor = "Doctor Name : "+doctorName+ " Specialization :"+ specilization;
		return doctor;
	}
	public int getRegno() {
		return regNo;
	}
	public void setRegno(int regNo) {
		this.regNo = regNo;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public double getConsultingFee() {
		return consultingFee;
	}
	public void setConsultingFee(double consultingFee) {
		this.consultingFee = consultingFee;
	}
	
	
	
	
	
	
	
	
	
	
}
