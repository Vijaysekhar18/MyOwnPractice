package com.payslip;

public class PayslipDemo {

	public static void main(String[] args) {
		double GrossSalary = 60000;
		double cityallowance = 1000;
		double sundry = 1000;
		double lta = 10000;
		double performencePay = 1000;
		double profTax = 100;
		double incomTax = 1000;
		
		PaySlip pay = new PaySlip();
		double BasicSal = pay.calculateBasicSal(GrossSalary);
		double pf = pay.calculatePF(pay.calculateBasicSal(BasicSal));
		double hra = pay.calculateHRA(BasicSal);
		double TotalSal = pay.calculateTotalSal(BasicSal, hra, cityallowance, sundry, lta, performencePay);
		double totaldeduction = pay.calculateTotalDeductions(TotalSal, pf, profTax, incomTax);
		double anualsal = pay.calculateAnualSal(TotalSal);
		double anualrevisdsal = pay.calculateAualRevisedSal(anualsal, 20);
		System.out.println("Payslip details are: ");
		System.out.println("Basic salary is: "+BasicSal+" PF is:"+pf+" HRA is: "+hra+
				" Total Salary is "+TotalSal+" Total Deductions is: "+totaldeduction+" Anual Salary is: "+anualsal
				+" anual Revised Salary is: "+anualrevisdsal);
		
	
	
		
	}

}
