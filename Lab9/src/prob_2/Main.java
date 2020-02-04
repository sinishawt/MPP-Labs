package prob_2;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stream<Integer> IntStream = Stream.of(1, 5, 8, 9)
//				.max()
		
		IntSummaryStatistics IntStreamer =  IntStream.of(7, 19, 88, 73, 4, 10)
				.summaryStatistics();
		
		System.out.println("The Maximum Number is: " + IntStreamer.getMax() + "\n" + "The Minumum Number is: " + IntStreamer.getMin());
	}

}
