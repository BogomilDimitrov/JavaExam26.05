import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		Pattern pat = Pattern.compile("[\\-\\d]+");
		Matcher match = pat.matcher(input);
		ArrayList<String> numbers = new ArrayList<>();
		
		while (match.find()) {
			numbers.add(match.group());
		}
		
		ArrayList<String> sequences = new ArrayList<>();
		
		for (int i = 1; i < numbers.size(); i++) {
			sequences.add(numbers.get(i-1)+" "+numbers.get(i));
		}

		LinkedHashMap<String,Integer> output = new LinkedHashMap<>();
		
		for (String sequence : sequences) {
			Integer count = output.get(sequence);
			if (count == null) {
				count = 0;
			}
			output.put(sequence, count + 1);
		}
		
		for (String sequence : output.keySet()) {
			double percent = (double)output.get(sequence)*100.00/(double)sequences.size();
			System.out.printf("%s -> %.2f%%", sequence, percent);
			System.out.println();
		}
		

	}

}
