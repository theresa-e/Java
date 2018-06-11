import java.util.*;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.depositFunds(100.99, "checking");
		b.getBalances();
	}
}