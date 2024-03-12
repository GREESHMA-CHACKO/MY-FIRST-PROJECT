package com.obsqura.training.method1;
import java.util.Scanner;

public class User1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		Validation j=new Validation();
		j.setPin(pin);
		System.out.println("pin number:"+j.getPin());
		j.validate();
		
		
		

	}

}
