package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.*;

public class Demo {
	// traders executing transactions
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();
		List<Trader> traders = getTraders();
		
		System.out.println("===== Find all transactions in the year 2011 and sort them by value (small to high) =====");
		List<Transaction> allTransactionsAfter2011 = transactions.stream()
													.filter(transaction -> transaction.getYear() == 2011)
													.sorted(comparing(Transaction::getValue))
													.collect(Collectors.toList());
		showList(allTransactionsAfter2011);

		System.out.println("===== Find all transactions have value greater than 300 and sort them by trader’s city =====");
		List<Transaction> allTransactionsGreater300 = transactions.stream()
								   .filter(transaction -> transaction.getValue() > 300)
								   .sorted(comparing(transaction -> transaction.getTrader().getCity()))
								   .collect(Collectors.toList());
		showList(allTransactionsGreater300);
		
		System.out.println("===== What are all the unique cities where the traders work? =====");
		List<String> uniqueCity = traders.stream()
										.map(Trader::getCity)
										.filter(distinctBy(String::valueOf))
										.collect(Collectors.toList());
		showList(uniqueCity);
		
		System.out.println("===== Find all traders from Cambridge and sort them by name desc =====");
		List<Trader> allTraderCambridge = traders.stream()
									 .filter(trader -> "Cambridge".equals(trader.getCity()))
									 .sorted(comparing(Trader::getName, reverseOrder()))
									 .collect(Collectors.toList());
		showList(allTraderCambridge);
		
		System.out.println("===== Return a string of all traders’ names sorted alphabetically. =====");
		List<String> traderNames = traders.stream()
									 .map(Trader::getName)
									 .sorted()
									 .collect(Collectors.toList());
		String names = String.join(" - ", traderNames);
		System.out.println(names);
		
		System.out.println("===== Are any traders based in Milan? =====");
		boolean anyTraderInMilan = traders.stream().anyMatch(trader-> "Milan".equals(trader.getCity()));
		System.out.println(anyTraderInMilan);
		
		System.out.println("===== Count the number of traders in Milan =====");
		long numberTraderInMilan = traders.stream().filter(trader -> "Milan".equals(trader.getCity())).count();
		System.out.println(numberTraderInMilan);
		
		System.out.println("===== Print all transactions’ values from the traders living in Cambridge =====");
		List<Transaction> cambridgeTransactionValues = transactions.stream()
				.filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
				.collect(Collectors.toList());
		showList(cambridgeTransactionValues);
		
		
		System.out.println("===== What’s the highest value of all the transactions =====");
		OptionalInt maxValue = transactions.stream()
									.mapToInt(Transaction::getValue)
									.max();
		System.out.println(maxValue.orElse(0));
		
		System.out.println("===== Find the transaction with the smallest value =====");
		OptionalInt minValue = transactions.stream()
				.mapToInt(Transaction::getValue)
				.min();
		System.out.println(minValue.orElse(0));
	}
	
	private static <T> void showList(List<T> list) {
		list.forEach(System.out::println);
	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> function){
		Set<R> origins = new HashSet<R>();
		return t -> origins.add(function.apply(t));
	}

	private static List<Transaction> getTransactions() {
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

	private static List<Trader> getTraders() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return Arrays.asList(raoul, mario, alan, brian);
	}

}
