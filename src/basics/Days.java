package basics;

public class Days {
	public static void main(String[] args) {
		String dayOfWeek = "thursday";
		
		switch(dayOfWeek) {
			case "monday":
				System.out.println("Today is monday");
				break;
			default: System.out.println("Today is " + dayOfWeek);
		}
	}
}
