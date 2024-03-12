package com.obsquara.testing.inheritance;

public class HraPf extends Basicsalary
{
	double basicpay=super.basicpay();
	public double hra()
	{
		double hra=(5/100)*basicpay;
		System.out.println("HRA:"+hra);
		return hra;
	}
public double pf()
{
	double pf=(20/100)*basicpay;
	System.out.println("PF:"+pf);
	return pf;
	
}
}
