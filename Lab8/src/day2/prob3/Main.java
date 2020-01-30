package day2.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
		// with lambda expression
		fruits.forEach((name) -> System.out.println(name));

		// with method reference
		fruits.forEach(System.out::println);
	}

}
