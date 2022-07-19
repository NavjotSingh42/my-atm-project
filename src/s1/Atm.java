package s1;

import java.util.Scanner;

public class Atm extends UserBill implements Functions {

	Scanner in = new Scanner(System.in);

	private int pin;
	private double balance;
	
	public Atm(String name, String ph_no, int pin){
		super(name, ph_no);
		this.pin = pin;
		this.balance = 0;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("Enter pin to proceed: ");
		int val = in.nextInt();
		if (val != this.pin) {
			System.out.println("Incorrect Pin");
		}
		else {
			if (amount > this.balance)
				System.out.println("Not enough cash");
			else {
				this.balance -= amount;
				System.out.println("Withdrawn");
			}
			
		}
	}
	
	public double checkBalance() {
		return this.balance;
	}
	
	public void changePin(int new_pin) {
		this.pin = new_pin;
	}
	
	public void genBill() {
		super.genBill();
		System.out.println("Available amount: Rs."+this.balance);
	}

}
