package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.Comparator.*;

public class Demo {
	// traders executing transactions
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();
		List<Trader> traders = getTraders();
		// todo: implement code here
		
	//Ex01:
		/*
		  List<Transaction> findTransactionsIn2011 = transactions.stream()
				   .filter(transaction -> transaction.getYear() == 2011)
				   .sorted(comparing()
				   .collect(Collectors.toList());
		System.out.println(findTransactionsIn2011);*/
	//Ex02:
		List<Transaction> getAllValue300 = transactions.stream()
			.filter(value -> value.getValue() > 300)
			.sorted(comparing(transaction -> transaction.getTrader()
					.getCity())).collect(Collectors.toList());
		System.out.println(getAllValue300);
	//Ex04:
		List<Trader> findAllCambridge = traders.stream()
				.filter(trader -> "Cambridge".equals(trader.getCity())).collect(Collectors.toList());
		System.out.println(findAllCambridge);
	//Ex05:
		List<String> trandersNames = traders.stream().map(trader -> trader.getName())
				.sorted(comparing(Function.identity())).collect(Collectors.toList());
		System.out.println(trandersNames);
	//Ex06:
		boolean tramdersInMilan = traders.stream().anyMatch(trander -> "Milan".equals(trander.getCity()));
		System.out.println(tramdersInMilan);
	//Ex07:
		long coutTrandersInMilan = traders.stream().filter(trader ->"Milan".equals(trader.getCity())).count();
		System.out.println(coutTrandersInMilan);
	//Ex08:
		  transactions.stream().filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
				.forEach(transaction ->System.out.println(transaction.getValue()));
	//Ex09:
		  Optional<Integer> maxValue = transactions.stream().map(Transaction::getValue).reduce(Integer ::max);
		  System.out.println(maxValue);
	//Ex10:
		  Optional<Integer> minValue = transactions.stream().map(Transaction::getValue).reduce(Integer ::min);
		  System.out.println(minValue);
	
	
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