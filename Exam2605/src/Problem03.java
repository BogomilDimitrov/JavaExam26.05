import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		Pattern pat = Pattern.compile("\\d+");
		Matcher match = pat.matcher(input);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		while (match.find()) {
			numbers.add(Integer.parseInt(match.group()));
		}
		
		ArrayList<Integer> rectArea = new ArrayList<>();
		for (int i = 1; i < numbers.size(); i+=2) {
			rectArea.add(numbers.get(i)*numbers.get(i-1));
		}
		
		BigDecimal biggestArea = new BigDecimal(0);
		for (int i = 2; i <= rectArea.size()-1; i++) {
			BigDecimal currentArea = new BigDecimal(rectArea.get(i)+rectArea.get(i-1)+rectArea.get(i-2));
			if (currentArea.compareTo(biggestArea)==1||currentArea.compareTo(biggestArea)==0){
				biggestArea = currentArea;
			}
		}
		
		System.out.println(biggestArea);
	}

}
