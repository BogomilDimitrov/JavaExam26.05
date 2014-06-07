import java.util.Scanner;


public class Problem01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int hours = 0;
		int minutes = 0;
		
		while (true) {
			String input = scan.nextLine();
			if (input.equals("End")) {
				break;
			}else {
				String[] temp = input.split(":");
				hours += Integer.parseInt(temp[0]);
				minutes += Integer.parseInt(temp[1]);
			}
		}
		
		int outputHours = hours+ minutes/60;
		int outputMinutes = minutes%60;
		
		System.out.printf("%d:%02d",outputHours, outputMinutes);
		
	}

}
