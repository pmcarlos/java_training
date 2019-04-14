package basics;

public class Lab1 {

	public static void main(String[] args) {
		System.out.print(sum(5) + " ");
		System.out.print(fact(4) + " ");
		int[] numbers = {4, -4, 5, -1};
		
		System.out.print(min(numbers) + " ");
		System.out.print(max(numbers) + " ");
		System.out.print(avg(numbers));
	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <=n; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
	
	public static int fact(int n) {
		if(n == 0) return 1;
		return fact(n-1) * n;
	}
	
	public static int min(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public static int max(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static int avg(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		return sum/arr.length;
	}

}
