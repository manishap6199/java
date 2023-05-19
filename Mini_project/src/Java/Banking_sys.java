package Java;

import java.util.Scanner;

public class Banking_sys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj1 = new BankAccount("Manisha", "Ba001");
		obj1.showMenu();
	}

}

class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;

	public BankAccount(String cname, String cid) {
		// TODO Auto-generated constructor stub
		customerName = cname;
		customerId = cid;
	}

	void deposite(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occured ");
		}
	}

	void showMenu() {
		char option = '\0';
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome..." + customerName);
		System.out.println("Your Id is " + customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposite");
		System.out.println("C. Withdrawn");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");

		do {
			System.out.println("===================================================");
			System.out.println("Enter an Option");
			System.out.println("====================================================");
			option = sc.next().charAt(0);
			System.out.println("\n");

			switch (option) {
			case 'A':
				System.out.println("---------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("-------------------------------------");
				System.out.println("\n");
				break;

			case 'B':
				System.out.println("---------------------------------");
				System.out.println("Enter an amount to deposite");
				System.out.println("-------------------------------------");
				int amount = sc.nextInt();
				deposite(amount);
				System.out.println("\n");
				break;

			case 'C':
				System.out.println("---------------------------------");
				System.out.println("Enter an amount to withdraw: ");
				System.out.println("-------------------------------------");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;

			case 'D':
				System.out.println("---------------------------------");
				getPreviousTransaction();
				System.out.println("-------------------------------------");
				System.out.println("\n");
				break;

			case 'E':
				System.out.println("***********************************");
				break;

			default:
				System.out.println("Invalid Option !!!..Please enter again");
				break;
			}
		} while (option != 'E');
		System.out.println("Thank You for using our services");
	}
}
