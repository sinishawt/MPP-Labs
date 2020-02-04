package prob_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static final Set<String> SET = new HashSet<String>();
	
	public  Set<String> union(List<Set<String>> sets){
		return sets.stream().reduce(SET, (s, t) -> {s.addAll(t); return s;});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main ma = new Main();
		
		Set<String> set1 = new HashSet<String>();
		set1.add("A");
		set1.add("B");

		Set<String> set2 = new HashSet<String>();
		set2.add("D");
		
		Set<String> set3 = new HashSet<String>();
		set3.add("1");
		set3.add("3");
		set3.add("5");
		
		List<Set<String>> li = new ArrayList<Set<String>>();
		li.add(set1);
		li.add(set2);
		li.add(set3);
		
		System.out.println(ma.union(li));
	}

}
