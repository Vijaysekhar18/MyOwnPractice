package com.payslip;

import org.omg.Messaging.SyncScopeHelper;

public class PaySlip {
	public String holderName;

	public PaySlip() {

	}

	public double calculateBasicSal(double grossSal) {
		return 40 * (1.0 / 100) * grossSal;

	}

	public double calculatePF(double basicSal) {
		return 12 * (1.0 / 100) * basicSal;

	}

	public double calculateHRA(double basicSal) {
		return 50 * (1.0 / 100) * basicSal;

	}

	public double calculateTotalSal(double basicSal, double hra, double cityallowance, double sundry, double lta,
			double performencePay) {
		double totalsal = (basicSal + hra + cityallowance + sundry + lta + performencePay);
		return totalsal;

	}

	public double calculateTotalDeductions(double totalSal, double pf, double profTax, double incomTax) {
		double totaldeduction = totalSal - pf - profTax - incomTax;
		return totaldeduction;

	}

	public double calculateAnualSal(double totalSal) {
		return 12 * totalSal;

	}

	public double calculateAualRevisedSal(double anualSal, double percentageHike) {
		return anualSal + (percentageHike * anualSal / 100);

	}

	@Override
	public String toString() {
		return "PaySlip []";
	}
	
	private void syso() {
		// TODO Auto-generated method stub

	}
	
	
}
