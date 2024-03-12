package com.obsquara.testing.inheritance;

public class Payslip extends HraPf{
	double deduction=super.deductionamt();
	double bonus=super.bonusamt();
	double hraamt=super.hra();
	double pfamt=super.pf();
	public void totalamt()
	{
		double totalsalary=basicpay+hraamt-pfamt-deduction+bonus;
		System.out.println("Total salary is:"+totalsalary);
		System.out.println("Basic pay:"+basicpay);
	
		System.out.println("Deduction"+deduction);
		System.out.println("HRA:"+hraamt);
		System.out.println("PF:"+pfamt);
		System.out.println("Bonus:"+bonus);
		System.out.println("Total salary:"+totalsalary);
		
	}

	public static void main(String[] args) {
		Payslip a=new Payslip();
		a.totalamt();

	}

}
