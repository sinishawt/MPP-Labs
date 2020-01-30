package day1.prob_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Product {

	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}
//	public class ProductComparator implements Comparator<Product>{
//
//		@Override
//		public int compare(Product p1, Product p2) {
//			// TODO Auto-generated method stub
//			if(p1.price == p2.price) return 0;
//			else if(p1.price < p2.price) return -1;
//			else return 1;
//		}
//		
//		ProductComparator(){};
//		
//	}



}
