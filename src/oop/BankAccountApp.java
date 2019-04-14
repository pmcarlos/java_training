package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		 acc1.setName("Carlos Peña");
		 acc1.setSsn("123dsf");
		 acc1.balance = 1000;
		 acc1.deposit(1000);
		 acc1.withdraw(100);

	}

}
