package com.obsquara.testing.inheritance;
import java.util.*;

public class Basicsalary {
	Scanner sc=new Scanner(System.in);
	
public double basicpay()
{
	System.out.println("Enter the basic pay:");
	double bp=sc.nextDouble();
	return bp;

}
public double deductionamt()
{
	System.out.println("Enter the deduction:");
	double dd=sc.nextDouble();
	return dd;
	
	}
public double bonusamt()
{
	System.out.println("Enter bonus:");
	double bonus=sc.nextDouble();
	return bonus;
	
}

}
