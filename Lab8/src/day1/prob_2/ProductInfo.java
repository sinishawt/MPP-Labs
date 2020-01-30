package day1.prob_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProductInfo {
	static enum SortMethod {
		BYPRICE, BYTITLE;
	}
	
	public void sort(List<Product> prod, final SortMethod method) {
		class ProductComparator implements Comparator<Product>{

			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				if(method == SortMethod.BYPRICE) {
					if(p1.price == p2.price) return 0;
					else if(p1.price < p2.price) return -1;
					else return 1;
				}else {
					return p1.title.compareToIgnoreCase(p2.title);
				}
				
			}
			
		}
		Collections.sort(prod, new ProductComparator());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		list.add(new Product("Cream", 45.0, 2));
		list.add(new Product("Bread", 3.0, 2));
		list.add(new Product("dog Food", 62.0, 2));
		list.add(new Product("Juice", 1.0, 2));
		list.add(new Product("Milk", 10.0, 2));

		ProductInfo p1 = new ProductInfo();
		p1.sort(list, SortMethod.BYPRICE);
		System.out.println("Products Sorted by Price \n" + list);
		
		p1.sort(list, SortMethod.BYTITLE);
		System.out.println("Products Sorted by Title \n" +list);
		
		list.add(new Product("dog Food", 62.0, 3));
		list.add(new Product("Milk", 10.0, 86));
		
		list.sort((p3, p4) -> {
			if(p3.title.equalsIgnoreCase(p4.title)) {
				return p3.model - p4.model;
			}else {
				return p3.title.compareToIgnoreCase(p4.title);
			}
		});
		System.out.println("After sorting with Title and Name: \n" + list);
	}

}
