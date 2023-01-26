package task;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[] {0, 5, 2, 4, 7, 1, 3, 19};
		
		int oddNumbersAmount = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 > 0) {
				oddNumbersAmount = oddNumbersAmount + 1;
			}
		}
		
		System.out.println("Amount of odd numbers: " + oddNumbersAmount);

	}
	
}
