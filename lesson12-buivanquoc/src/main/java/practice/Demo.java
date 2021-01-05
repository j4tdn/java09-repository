package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = new ArrayList<>();
		traders.add(raoul);
		traders.add(mario);
		traders.add(alan);
		traders.add(brian);
		List<Transaction> transactions = Arrays.asList(new Transaction(traders.get(3), 2011, 300),
				new Transaction(traders.get(0), 2012, 1000), new Transaction(traders.get(0), 2011, 400),
				new Transaction(traders.get(1), 2012, 710), new Transaction(traders.get(1), 2012, 700),
				new Transaction(traders.get(2), 2011, 950));
//	1.find all transactions in the year 2011 and sort them by value (small to high).
		System.out.println("=====cau 1=====");
		List<Transaction> year2011 = transactions.stream().filter(transaction -> transaction.getYear() == 2011)
				.sorted(new Comparator<Transaction>() {

					@Override
					public int compare(Transaction o1, Transaction o2) {
						return o1.getValue() - o2.getValue();
					}
				}).collect(Collectors.toList());
		year2011.stream().forEach(System.out::println);

//	2.find all transactions have value greater than 300 and sort them by trander's city.
		System.out.println("=====cau 2=====");
		List<Transaction> valueThan300 = transactions.stream().filter(transaction -> transaction.getValue() > 300)
				.sorted(new Comparator<Transaction>() {

					@Override
					public int compare(Transaction o1, Transaction o2) {
						return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
					}
				}).collect(Collectors.toList());
		valueThan300.stream().forEach(System.out::println);
//	3.what are all the unique cities where the traders work?
		System.out.println("=====cau 3=====");
		List<String> uniqueCities = transactions.stream().map(transaction -> transaction.getTrader().getCity())
				.distinct().collect(Collectors.toList());
		uniqueCities.stream().forEach(System.out::println);
//	4.find all traders from Cambridge and sort them by name desc.
		System.out.println("=====cau 4=====");
		List<Trader> tradersFromCambridge = traders.stream().filter(trader -> "Cambridge".equals(trader.getCity()))
				.sorted(new Comparator<Trader>() {

					@Override
					public int compare(Trader o1, Trader o2) {
						return o2.getName().compareTo(o1.getName());
					}
				}).collect(Collectors.toList());
		tradersFromCambridge.stream().forEach(System.out::println);
//	5.Return a string of all traders' names sorted alphabetically.
		System.out.println("=====cau 5=====");
		List<String> traderNames = traders.stream().map(Trader::getName).distinct().sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		}).collect(Collectors.toList());
		traderNames.stream().forEach(System.out::println);
//	6.Are any traders based in Milan?
		System.out.println("=====cau 6=====");
		boolean tradersBaseInMilan = traders.stream().anyMatch(trader -> "Milan".equals(trader.getCity()));
		System.out.println(tradersBaseInMilan);
//	7.Count the number of traders in Milan.
		System.out.println("=====cau 7=====");
		long numberOfTraders = traders.stream().filter(trader -> "Milan".equals(trader.getCity())).count();
		System.out.println(numberOfTraders);
//	8.Print all transactions' values from the traders living in Cambridge.
		System.out.println("=====cau 8=====");
		List<Integer> valuesFromTraders = transactions.stream()
				.filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity())).map(Transaction::getValue)
				.collect(Collectors.toList());
		valuesFromTraders.stream().forEach(System.out::println);
//	9.what's the highest value of all the transactions?
		System.out.println("=====cau 9=====");
		List<Integer> value = transactions.stream().map(transaction -> transaction.getValue())
				.collect(Collectors.toList());
		Optional<Integer> highestValue = value.stream().reduce((a, b) -> a > b ? a : b);
		highestValue.stream().forEach(System.out::println);
//		System.out.println("=====hightestValue=====\n " + highestValue.orElse(0));
//	10.Find the transaction with the smallest value.
		System.out.println("=====cau 10=====");
		Optional<Integer> smallestValue = value.stream().reduce((a, b) -> a < b ? a : b);
		smallestValue.stream().forEach(System.out::println);
	}

}
