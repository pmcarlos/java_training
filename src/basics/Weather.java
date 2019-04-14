package basics;

public class Weather {
	public static void main(String[] args) {
		int temperature = 23;
		
		if(temperature > 28) {
			System.out.println("It's so hot outside");
		} else if(temperature > 18 && temperature < 28) {
			System.out.println("It feels good");
		}
	}
}
