package transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		List<Transaction> transactions = getTransactions();
		List<Trader> traders = getTraders();
		
				
		System.out.println(transactions);
		System.out.println("============================");
		// 1. Find all transactions in the year 2011
		List<Transaction> transaction2011 = transactions.stream().filter(transaction->transaction.getYear()==2011).collect(Collectors.toList());
		System.out.println("=====transactions in the year 2011=====\n" +transaction2011);
		
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> transactionG300 = transactions.stream().filter(transaction->transaction.getValue()>300).collect(Collectors.toList());
		System.out.println("=====transactions have value greater than 300=====\n" + transactionG300);
		
		//3. What are all the unique cities where the traders work?
		List<String> cities = traders.stream().map(trader -> trader.getcity()).collect(Collectors.toList());
		System.out.println("=====all the unique cities where the traders work=====\n" +cities);
		
		//4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> tradersCambridge = traders.stream().filter(trader -> "Cambridge".equals(trader.getcity())).collect(Collectors.toList());
		System.out.println("=====all traders from Cambridge=====\n" +tradersCambridge);
		
		//5. Return a string of all traders’ names sorted alphabetically.
		List<String> traderOfNames = traders.stream().map(Trader::getname).sorted().collect(Collectors.toList());
		System.out.println("=====traders’ names sorted alphabetically=====" +traderOfNames);
		
		//6. Are any traders based in Milan?
		Optional<Trader> tradersMilan = traders.stream().filter(trader -> "Milan".equals(trader.getcity())).findAny();
		System.out.println("=====traders based in Milan=====\n" + tradersMilan);

		//7. Count the number of traders in Milan.
		long numberTradersMilan = traders.stream().filter(trader -> "Milan".equals(trader.getcity())).count();
		System.out.println("=====number of traders in Milan=====\n" + numberTradersMilan);
		
		//8. Values from the traders living in Cambridge
		
		
		
		//9. What’s the highest value of all the transactions?
		List<Integer> value = transactions.stream().map(transaction -> transaction.getValue()).collect(Collectors.toList());
		Optional<Integer> hightestValue = value.stream().reduce((a, b) -> a > b?a:b);
		System.out.println("=====hightestValue=====\n " + hightestValue.orElse(0));
		
		//10. What’s the smallest value of all the transactions?
		Optional<Integer> smallestValue = value.stream().reduce((a, b) -> a < b?a:b);
		System.out.println("=====smallestValue=====\n " + smallestValue.orElse(0));
		
		

	}

	private static List<Trader> getTraders() {
		return Arrays.asList(
				new Trader("Raoul", "Cambridge"),
				new Trader("Mario", "Milan"),
				new Trader("Alan", "Cambridge"), 
				new Trader("Brian", "Cambridge")

		);
	}
	
	private static List<Transaction> getTransactions(){
		List<Trader> traders = getTraders();
		return Arrays.asList(
				new Transaction(traders.get(3), 2011, 300),
				new Transaction(traders.get(0), 2012, 1000),
				new Transaction(traders.get(0), 2011, 400),
				new Transaction(traders.get(1), 2012, 710),
				new Transaction(traders.get(1), 2012, 700),
				new Transaction(traders.get(2), 2012, 950)
				);
	}
	

}
