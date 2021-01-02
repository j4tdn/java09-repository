package practice;

import java.util.Arrays;
import java.util.HashMap;

import static java.util.Comparator.*;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
	// traders executing transactions
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();
		List<Trader> traders = getTraders();
		
		// todo: implement code here
		
		// 1
		List<Transaction> allTransactions2011 = transactions.stream()
															.filter(transaction -> transaction.getYear() == 2011)
															.sorted(comparing(Transaction::getValue))
															.collect(Collectors.toList());
		
		// 2
		List<Transaction> allTransactionsValueGreater300 = transactions.stream()
																	   .filter(transaction -> transaction.getValue() > 300)
																	   .sorted(comparing(transaction -> transaction.getTrader().getCity()))
																	   .collect(Collectors.toList());
		
		// 3
		Map<String, Integer> countDistinctCity = new HashMap<>();
		traders.stream().forEach(trader -> {
			String city = trader.getCity();
			if (countDistinctCity.get(city) != null) {
				countDistinctCity.put(city, countDistinctCity.get(city) +1);
			} else {
				countDistinctCity.put(city, 1);
			}
		});
		List<String> uniqueCities = countDistinctCity.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Entry::getKey).collect(Collectors.toList());
		
		// 4
		List<Trader> allTraderCambridge = traders.stream()
												 .filter(trader -> "Cambridge".equals(trader.getCity()))
												 .collect(Collectors.toList());
		
		// 5
		List<String> nameAllTraders = traders.stream()
										     .map(trader -> trader.getName())
										     .sorted(comparing(Function.identity()))
										     .collect(Collectors.toList());

		// 6
		boolean anyTraderInMilan = traders.stream().anyMatch(trader-> "Milan".equals(trader.getCity()));
		
		// 7
		long numberTraderInMilan = traders.stream().filter(trader -> "Milan".equals(trader.getCity())).count();
		
		// 8
		transactions.stream().filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
							 .forEach(transaction -> System.out.println(transaction.getValue()));
		
		
		// 9
		Optional<Integer> maxValue = transactions.stream()
								   .map(Transaction::getValue)
								   .reduce((a,b) -> a>b?a :b);
		
		// 10
		Optional<Transaction> minValueTransaction = transactions.stream().reduce((a,b) -> {
		            	Integer value1 = a.getValue();
		            	Integer value2 = b.getValue();
		            	return value1 < value2 ? a : b;
		            });
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
