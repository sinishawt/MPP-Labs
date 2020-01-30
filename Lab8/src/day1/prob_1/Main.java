package day1.prob_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> list = new ArrayList<>();
		
		BiFunction<Double, Double, List<Double>> exp = (x, y) -> {
			list.add(Math.pow(x, y));
			list.add(x * y);
			
			return list;
		};
		
		
		System.out.println(exp.apply(2.0, 3.0));
	}

}
