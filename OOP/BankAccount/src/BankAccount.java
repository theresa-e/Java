
import java.util.*;

public class BankAccount {
	private String accountNumber;
	private double checkingBal;
	private double savingsBal;
	private static int numberOfAccounts = 0;
	private static double totalAmountMoney = 0;
	
	public BankAccount() {
		this.accountNumber = getAccountNumber();
		numberOfAccounts++;
	}
	
	public String getAccountNumber() {
		String accountNumber = "";
		for (int i = 0; i<=10; i++) {
			Random r = new Random();
			int number = r.nextInt(10);
			accountNumber+=number;
		}
		System.out.println("The new account number: " + accountNumber);
		return accountNumber;
	}

	public double getCheckingBal() {
		return this.checkingBal;
	}
	
	public double getSavingsBal() {
		return this.savingsBal;
	}
	
	public void depositFunds(double amount, String account) {
		if (account == "checking") {
			System.out.println("Amount before adding money to checking: " + this.checkingBal );
			this.checkingBal += amount;
			System.out.println("Amount after adding money to checking: " + this.checkingBal );
		} else if (account == "savings") {
			System.out.println("Amount before adding money to savings: " + this.savingsBal );
			this.savingsBal += amount;
			System.out.println("Amount after adding money to savings: " + this.savingsBal );
		} else {
			System.out.println("Could not complete deposit - Invalid account name.");
		}
	}
	
	public void withdrawChecking (double amount) {
		if (this.checkingBal > amount) {
			System.out.println("Insufficient funds. Current balance: " + this.checkingBal);
		} else {
			this.checkingBal-= amount;
			System.out.println("Amount withdrawn. Current balance: " + this.checkingBal);
		}
		
	}
	
	public void withdrawSaving (double amount) {
		if (this.savingsBal > amount) {
			System.out.println("Insufficient funds. Current balance: " + this.savingsBal);
		} else {
			System.out.println("Amount withdrawn. Current balance: " + this.savingsBal);
		}
	}
	
	public void getBalances () {
		System.out.println("Checking balance: " + this.getCheckingBal());
		System.out.println("Saving balance: " + this.getSavingsBal());
	}
}
