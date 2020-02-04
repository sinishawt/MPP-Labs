package prob_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Main {
	
	public static boolean contains1(List<String> list, String s) {
		for(String x:list) {
			if(x == null && s == null) return true;
			if(s== null && x == null) continue;
			if(x.equals(s)) return true;
		}
		return false;
	}
	
	private static <T extends U , U > boolean contains2(List<T> list, U e, BiPredicate<? super T,U> pred2) {
	    
	    for(T emp: list) {
	      if(emp == null && e == null) return true;
	      if(emp == null || e == null) continue;
	      if(pred2.test(emp, e)) return true;
	    }
	    return false;  
	  }
	
	public static <T> boolean contains3(List<T> list, T ob, 
			BiPredicate<? super T,? super T> eq) {
		for(T x: list) {
			if(eq.test(x, ob)) {
				return true;
			}
		}
		return false;
		
	}
	
	public static <T> boolean contains4(List<? extends T> list, T ob, 
			BiPredicate<? super T,? super T> eq) {
		for(T x: list) {
			if(eq.test(x, ob)) {
				return true;
			}
		}
		return false;
		
	}
	
	
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom");
		System.out.println(result);
	}
	
	public static void test2() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 60000));
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
		Employee e = new Employee(1001, "Joe", 50000);
		boolean foundIt = Main.contains2(list, e, (e1,e2) -> e1.getId()==e2.getId());
		System.out.println(foundIt);
	}
	
	public static void test3() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager m = new Manager(1001, "Joe", 50000, 500);
		boolean foundIt = Main.contains3(list, m, 
				(Employee e1, Employee e2) -> e1.getId()==e2.getId());
		System.out.println(foundIt);		
	}
	
	public static void test4() {
		List<CheckingAccount> list = new ArrayList<>();
		list.add(new CheckingAccount(1001, 25.00));
		list.add(new CheckingAccount(1002, 35.00));
		list.add(new CheckingAccount(1003, 125.00));
		
		Account a = new CheckingAccount(1002, 35.00);
		boolean foundIt = Main.contains4(list, a, 
			(Account a1, Account a2) -> a1.getAcctId()==a2.getAcctId());
		System.out.println(foundIt);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
	}

}
