package org.mes.training.array;

public class Division extends Inheritance{
	public void display()
	{
		int d=c;
		if(d%10==0)
		{
			System.out.println("divisible by 10");
		}
		else {
			System.out.println("not divisible");
		}
		
	}

	public static void main(String[] args) {
		Division v=new Division();
		System.out.println("the sum="+v.sum(10,20));
		v.display();
	}

}
