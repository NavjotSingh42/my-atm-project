package s1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter name, ph_no, pin");
		String name = in.nextLine();
		String ph_no = in.next();
		int pin = in.nextInt();
		
		Atm obj = new Atm(name, ph_no, pin);
		
		System.out.println("Enter the type of transaction from following:");
		System.out.println("1: Cash Deposit");
		System.out.println("2: Cash Withdraw");
		System.out.println("3: Check Balance");
		System.out.println("4: Change Pin");
		System.out.println("5: Exit");
		
		int ch=0;
		
		while(ch<5) {
			
			System.out.println("Enter choice of transaction?");
			ch = in.nextInt();
			double amount;
			
			switch(ch) {
			
				case 1:
					System.out.println("Enter amount:");
					amount = in.nextDouble();
					obj.deposit(amount);
					System.out.println("Deposited");
					break;
				
				case 2:
					System.out.println("Enter amount:");
					amount = in.nextDouble();
					obj.withdraw(amount);
					break;
				
				case 3:
					System.out.println("Available Balance: Rs."+obj.checkBalance());
					break;
				
				case 4:
					System.out.println("Enter new pin: "); 
					int new_pin = in.nextInt();
					obj.changePin(new_pin);
					System.out.println("Pin successfully changed");
					break;
				
				case 5:
					System.out.println("Do you want a receipt? 1.YES 2.NO");
					int yn = in.nextInt();
					if (yn == 1) {
						obj.genBill();
					}
					System.out.println("Thank You.");
					break;
				
				default:
					System.out.println("No such transaction type exists.");
					break;
			
			}
		}		

	}
}
