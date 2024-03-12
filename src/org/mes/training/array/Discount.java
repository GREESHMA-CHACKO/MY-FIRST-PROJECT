package org.mes.training.array;
import java.util.Scanner;

public class Discount {
	static Scanner s=new Scanner(System.in);
	static int item1=s.nextInt();
	static int item2=s.nextInt();
	static int item3=s.nextInt();
	public static int itemprice()
	{
	int sum=item1+item2+item3;
	return sum;
	}
	public static void sumitem()
	{
	int result=itemprice();
	System.out.println("total amt="+result);
	}
	public static void discountOfitems()
	{
	int total=itemprice();
	if(total>=5000)
	{
	int value=total*20/100;
	int dis=total-value;
	System.out.println("Discount is applicable");
	System.out.println("Amount after discount"+dis);
	}
	else
	{
	System.out.println("discount is not applicable");
	}
	}
	public static void main(String args[])
	{
	sumitem();
	discountOfitems();
	}
	}


