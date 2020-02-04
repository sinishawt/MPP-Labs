package prob_1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Stream.of("Bill", "Thomas", "Mary")
				.collect(Collectors.joining(", ")));
	}

}
