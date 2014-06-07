import java.util.Scanner;


public class Problem02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		Integer[] numbers = new Integer[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(scan.nextLine());
		}
		boolean isEqual = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				for (int j2 = 0; j2 < numbers.length; j2++) {
					if (numbers[i]<=numbers[j]) {
						if ((numbers[i]*numbers[i])+(numbers[j]*numbers[j])==(numbers[j2]*numbers[j2])) {
							System.out.println(numbers[i]+"*"+numbers[i]+" + "+numbers[j]+"*"+numbers[j]+" = "+numbers[j2]+"*"+numbers[j2]);
							isEqual = true;
						}	
					}
				}
			}
		}
		if (!isEqual) {
			System.out.println("No");
		}
	}

}
