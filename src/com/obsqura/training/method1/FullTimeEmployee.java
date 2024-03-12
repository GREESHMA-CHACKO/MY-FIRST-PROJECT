package com.obsqura.training.method1;
import java.util.Scanner;


public class FullTimeEmployee extends Employee{
	double salaryoffulltimeemploye;
	void calculatesalary(double payperhr,double workhr)
	{
		salaryoffulltimeemploye=payperhr*workhr;
	}

	

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double payhr=sc.nextDouble();
		double whr=sc.nextDouble();
		Contractor d=new Contractor();
		d.calculatesalary(payhr,whr);
		System.out.println("Salary of contractor"+d.salary); 
		
		Scanner sc1=new Scanner(System.in);
		double payhremp=sc1.nextDouble();
		double whremp=10;
		FullTimeEmployee f=new FullTimeEmployee();
		f.calculatesalary(payhremp,whremp);
		System.out.println("Full time salary of employee:"+f.salaryoffulltimeemploye);
		}

}
