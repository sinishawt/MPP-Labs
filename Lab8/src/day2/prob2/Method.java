package day2.prob2;

import java.util.function.Supplier;

public class Method {
	public static void main(String[] args) {
		Supplier<Double> supplier = Math::random;
		System.out.println(supplier.get());
	}
}
