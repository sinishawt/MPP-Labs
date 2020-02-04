package prob_5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {

	public static Stream<String> streamSection(Stream<String> stream, int m, int n){
		//implement code 
		
		Stream<String> st = stream.limit(n+1).skip(Math.max((long)m, 0L));
		return st;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//make three calls for the stream section method with diffrent inputs 
		
		System.out.println(streamSection(nextStream(), 0, 5).collect(Collectors.joining(", ")));
		

	}
	
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
		}

}
