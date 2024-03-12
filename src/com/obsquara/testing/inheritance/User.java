package com.obsquara.testing.inheritance;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Bank b=new Bank();
		Scanner sc = new Scanner(System.in);
	int x=sc.nextInt();
	b.setPinno(x);
		System.out.println(b.getPinno());

	}

}
