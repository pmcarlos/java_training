package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"New York", "Tuxtla", "Miami"};
		
		System.out.println(cities[0]);
		
		String[] states = new String[5];
		states[0] = "chiapas";
		System.out.println(states[0]);
		
		int i = 0;
		
		/*do {
			System.out.println(cities[i]);
			i++;
		} while(i < 3);*/
		boolean found = false;
		while(i < 3 && !found) {
			System.out.println(cities[i]);
			if(cities[i] == "Tuxtl") {
				found = true;
			}
			i++;
		}
		
		for(int x = 0; x < 3; x++) {
			System.out.println(cities[x]);
		}
	}

}
