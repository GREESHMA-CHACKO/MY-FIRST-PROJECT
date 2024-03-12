package com.obsqura.training.method1;

public class Validation {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public void validate() {
		if(pin==1001||pin==1234||pin==1212)
		{
			System.out.println("valid pin");
		}
			else {
				System.out.println("not a valid pin");
				
			}
		}
	}
	


