package prob_2;

import java.util.*;

public class SecondSmallest {
	
	
	public static <T extends Comparable<T>> T secondSmallest2(List<T> list) {
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(smallest.compareTo(secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(next.compareTo(smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(next.compareTo(secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}
	
	
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 2, 3, 6);
		System.out.println(secondSmallest2(list));
		
	}

}
