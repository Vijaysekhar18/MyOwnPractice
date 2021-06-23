package com.doctor;

public class DoctorFinderDemo {

	public static void main(String[] args) {
		Doctor doctor1 = new Doctor(123,"Sai Pavan","orthopedic doctor",500);
		Doctor doctor2 = new Doctor(123,"Mahesh Kalyan","pedetrician doctor",500);
		System.out.println("Doctors names are: "+'\n'+doctor1.getDoctorName() +'\n'+doctor2.getDoctorName());
		System.out.println("Doctors details are: "+'\n'+doctor1.displayDoctorDetail()+'\n'+doctor2.displayDoctorDetail());
		

	}

}
