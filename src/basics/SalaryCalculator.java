package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		String career;
		career = "Developer";
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("I am a " + career + "working " + hoursPerWeek + " hours per week and my yearly salary is " + salary );
	}
}
