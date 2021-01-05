package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
public static void main(String[] args) {
	
	Trader raoul=new Trader("Raoul", "Cambridge");
	Trader mario=new Trader("Mario", "Milan");
	Trader alan=new Trader("Alan", "Cambridge");
	Trader brian=new Trader("Brian", "Cambridge");
	
	
	List<Trader> traders=new ArrayList<Trader>();
			traders.add(raoul);
			traders.add(mario);
			traders.add(alan);
			traders.add(brian);
			
			
	List<Transaction> transactions=Arrays.asList(
			new Transaction(brian,2011,300),
			new Transaction(raoul,2012,1000),
			new Transaction(raoul,2011,400),
			new Transaction(mario,2012,710),
			new Transaction(mario,2012,700),
			new Transaction(alan,2012,950)
			);
	
	
	//1:Find all transactions in the year 2011 and sort them by value (small to high).
	
	System.out.println("1:Find all transactions in the year 2011 and sort them by value (small to high)");
	List<Transaction> allTransactionIn2011AndSort= transactions.stream().filter(transaction -> transaction.getYear()==2011)
			.sorted(Comparator.comparing(transaction ->transaction.getValue())).collect(Collectors.toList());
	
	allTransactionIn2011AndSort.forEach(System.out::println);
	
	//2:Find all transactions have value greater than 300 and sort them by trader’s city
	
	System.out.println("2:Find all transactions have value greater than 300 and sort them by trader’s city");
	
	List<Transaction> allTransactionHaveValueGreaterThan300=transactions.stream().filter(transition ->transition.getValue()>300)
			.sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity())).collect(Collectors.toList());
	
	allTransactionHaveValueGreaterThan300.forEach(System.out::println);
	
	//3:What are all the unique cities where the traders work?
	
	// 
	
	//4:Find all traders from Cambridge and sort them by name desc.
	System.out.println("4:Find all traders from Cambridge and sort them by name desc.");
	List<Trader> allTraderFromCambridge=traders.stream().filter(trader ->trader.getCity().equals("Cambridge"))
			.sorted(Comparator.comparing(trader -> trader.getName(),Comparator.reverseOrder())).collect(Collectors.toList());
	
	allTraderFromCambridge.forEach(System.out::println);
	
	//5:Return a string of all traders’ names sorted alphabetically.
	
	System.out.println("5:Return a string of all traders’ names sorted alphabetically.");
	
	List<String> nameTraders=transactions.stream().map(transition ->transition.getTrader().getName()).collect(Collectors.toList());
	nameTraders.sort(Comparator.comparing(Function.identity()));
	nameTraders.forEach(System.out::println);
	
	//6:Are any traders based in Milan?
	
	System.out.println("6:Are any traders based in Milan?");
	boolean isTraderInMilan=traders.stream().anyMatch(trader->trader.getCity().equals("Milan"));
	System.out.println("result:"+isTraderInMilan);
	
	//7:Count the number of traders in Milan.
	
	System.out.println("7:Count the number of traders in Milan.");
	long count=traders.stream().filter(trader ->trader.getCity().equals("Milan")).count();
	System.out.println("result:"+count);
	
	//8:Print all transactions’ values from the traders living in Cambridge.
	System.out.println("8:Print all transactions’ values from the traders living in Cambridge.");
	
	List<Integer> allValueInCambridge=transactions.stream().filter(transaction ->transaction.getTrader().getCity().equals("Cambridge"))
			.map(transaction ->transaction.getValue()).collect(Collectors.toList());
	
			
	allValueInCambridge.forEach(System.out::println);
	
	//9: What’s the highest value of all the transactions?
	
	System.out.println("9: What’s the highest value of all the transactions?");
	Optional<Integer> highestValue=transactions.stream().map(transaction ->transaction.getValue()).reduce((a,b) -> (a>b?a:b));
	highestValue.ifPresent(val ->System.out.println("max:"+val));
	
	
	//10. Find the transaction with the smallest value.
	
	Optional<Integer> minValue=transactions.stream().map(transaction ->transaction.getValue()).reduce((a,b) -> (a<b?a:b));

//	List<Transaction> minVal=transactions.stream().filter(transaction ->transaction.getValue()==minValue).collect(Collectors.toList());
//	
//	minVal.forEach(System.out::println);
}
	
	
}
