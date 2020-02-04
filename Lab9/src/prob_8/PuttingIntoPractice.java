package prob_8;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		transactions.stream()
			.filter(x -> x.getYear() >= 2011)
			.sorted(Comparator.comparing(Transaction::getValue).reversed())
			.forEach(System.out::print);;
		
        System.out.println();
        // Query 2: What are all the unique cities where the traders work?
        List<String> result = transactions.stream()
        	.map(e -> e.getTrader().getCity())
        	.distinct()
        	.collect(Collectors.toList());
        System.out.println(result);

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> result1 = transactions.stream()
        .map(Transaction::getTrader)
        .filter(x -> x.getCity().equalsIgnoreCase("Cambridge"))
        .sorted(comparing(Trader::getName))
        .collect(Collectors.toList());
   
        System.out.println(result1);
        // Query 4: Return a string of all traders names sorted alphabetically.
        String result2 = transactions.stream()
        		.map(t -> t.getTrader().getName())
        		.sorted()
        		.reduce("", (n1, n2) -> n1 + " " + n2);
        		
        System.out.println(result2);  		
        		
        // Query 5: Are there any trader based in Milan?
        Boolean b = transactions.stream()
        		.anyMatch(x -> x.getTrader().getCity().equals("Milan"));
        System.out.println(b);
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
        	.map(Transaction::getTrader)
        	.filter(t -> t.getCity().equals("Milan"))
        	.forEach(t -> t.setCity("Cambridge"));
        System.out.println(transactions);
        
        // Query 7: What's the highest value in all the transactions?
       System.out.println( transactions.stream()
        	.max(Comparator.comparing(Transaction::getValue)));
    }
}
