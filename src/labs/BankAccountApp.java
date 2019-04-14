package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("2412424", 1000);
		BankAccount acc2 = new BankAccount("35235325", 3500);
		
		acc1.setName("Carlos Peña");
		acc2.setName("Pancho Pantera");
		acc1.makeDeposit(500);
		acc1.makeDeposit(45000);
		acc1.paybill(570);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}


class BankAccount implements IInterest{
	private static int ID = 100;
	private String accountNumber;
	private static final String routingNumber = "0045346";
	private String name;
	private String SSN;
	private double balance;
	
	BankAccount(String SSN, double initDeposit){
		System.out.println("New Account Created");
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	
	private void setAccountNumber() {
		int rand = (int) (Math.random() * 100);
		accountNumber = ID + "" + rand + SSN.substring(0,2) ;
		System.out.println(accountNumber);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void paybill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	private void showBalance() {
		System.out.println("Your balance: $" + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1 + (rate/100));
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[AccountNumber: " + accountNumber + "]\n[Balance: " + balance + "]";
	}
}