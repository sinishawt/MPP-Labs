package day2.prob1;

import java.util.function.Predicate;

public class MyClass {
	
	
	Predicate<MyClass> p1 = (MyClass instance) -> this.equals(instance);
	
	Predicate<MyClass> p2 = this::equals;
	
	void myMethod(MyClass c1){
		System.out.println("This instance equal to passed class: " + p2.test(c1));
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		mc.myMethod(mc);
	}

}
