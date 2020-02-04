package prob_3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> test = Arrays.asList("Smart", "ccass", "kjojoi", "ccsdd", "ccccc");
		
		Main m = new Main();
		m.countWords(test, 's', 's', 5);
		System.out.println(m.countWords(test, 's', 's', 5));
	}
	
	public int countWords(List<String> words, char c, char d, int len) {
		
		
		return (int) words.stream()
				.filter(x -> x.length() == len)
				.filter(x -> x.contains("c"))
				.filter(x -> !x.contains("d"))
				.count();
	}

}
