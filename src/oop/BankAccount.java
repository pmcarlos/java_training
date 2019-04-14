package oop;

public class BankAccount implements IRate{
	//static belongs to the class not the instance
	private static final String routingNumber = "12453";
		
	private String accountNumber;
	private String name;
	
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructors
	BankAccount(){
		System.out.println("New account created");
	}
	
	//Overloading
	BankAccount(String accountType){
		System.out.println("New account created" + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("New account created" + accountType + " with balance of " + initDeposit);
		String msg;
		if(initDeposit < 1000) {
			msg = "Error: Initial deposit must be at least 1000";
		}else {
			msg = "Thanks for your initial deposit of " + initDeposit;
			balance = initDeposit;
		}
		
		System.out.println(msg);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setRate() {
		System.out.println("Setting rate");
	}  
	@Override
	public void increaseRate() {
		System.out.println("Increasing rate");		
	}
	
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println(activity);
		System.out.println("Your new balance is $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is " + balance);
	}
	
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return name + " " + accountNumber;
	}

	
}
