package day2.prob4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
	        
	        Arrays.sort(names, String::compareToIgnoreCase);
	        for (String name : names) {
	            System.out.println(name);
	        }
	}

}
