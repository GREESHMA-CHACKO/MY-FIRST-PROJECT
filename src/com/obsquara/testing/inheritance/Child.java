package com.obsquara.testing.inheritance;

public class Child extends Parentclass{
	public void display()
	{
		System.out.println("This is child class");
		super.display();
	}


		public static void main(String[] args) {
			Child ch=new Child();
			ch.display();
		}




}
