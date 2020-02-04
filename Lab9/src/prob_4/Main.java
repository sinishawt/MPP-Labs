package prob_4;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(4);
	}
	
	public static void printSquares(int num) {
		IntStream square = IntStream.iterate(1, n -> n +1)
				.map(x -> x * x).limit(num);
		square.forEach(n -> System.out.print(n + " "));
	}
}
