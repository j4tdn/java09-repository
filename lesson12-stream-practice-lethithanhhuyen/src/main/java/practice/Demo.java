package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Demo {
	// traders executing transactions
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();
		
		// todo: implement code here
//		1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> res1 = transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(new Comparator<Transaction>() {

					@Override
					public int compare(Transaction o1, Transaction o2) {
						return o1.getValue() - o2.getValue();
					}
				})
				.collect(Collectors.toList());
//		2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> res2 = transactions.stream()
					.filter(transaction -> transaction.getValue() > 300)
					.sorted(new Comparator<Transaction>() {

						@Override
						public int compare(Transaction o1, Transaction o2) {
							return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
						}
					})
					.collect(Collectors.toList());
//		3. What are all the unique cities where the traders work?
		List<String> res3 = transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList());
//		4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> res4 = transactions.stream()
				.map(Transaction::getTrader)
				.distinct()
				.filter(trader -> trader.getCity().equals("Cambridge"))
				.sorted(new Comparator<Trader>() {

					@Override
					public int compare(Trader o1, Trader o2) {
						return o1.getName().compareTo(o2.getName());
					}
				})
				.collect(Collectors.toList());
				
//		5. Return a string of all traders’ names sorted alphabetically.
		String res5 = transactions.stream()
			.map(transaction -> transaction.getTrader().getName())
			.distinct()
			.sorted(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			})
			.reduce("", (a,b) -> a + b);
//		6. Are any traders based in Milan?
		boolean res6 = transactions.stream()
			.anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
//		7. Count the number of traders in Milan.
		long res7 = transactions.stream()
			.filter(transaction -> "Milan".equals(transaction.getTrader().getCity()))
			.count();
//		8. Print all transactions’ values from the traders living in Cambridge.
		List<Integer> res8 = transactions.stream()
					.filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
					.map(Transaction::getValue)
					.collect(Collectors.toList());
//		9. What’s the highest value of all the transactions?
		Optional<Integer> res9 = transactions.stream()
					.map(Transaction::getValue)
					.reduce((a,b) -> a > b ? a : b);
//		10. Find the transaction with the smallest value.
		Optional<Integer> temp = transactions.stream()
			.map(Transaction::getValue)
			.reduce((a,b) -> a < b ? a : b);
		List<Transaction> res10 = transactions.stream()
					.filter(transaction -> transaction.getValue() == temp.get())
					.collect(Collectors.toList());
		
		// todo: result
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high)");
		res1.stream()
			.forEach(System.out::println);
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		res2.stream()
			.forEach(System.out::println);
		System.out.println("3. What are all the unique cities where the traders work?");
		res3.stream()
			.forEach(System.out::println);
		System.out.println("4. Find all traders from Cambridge and sort them by name desc.");
		res4.stream()
			.forEach(System.out::println);
		System.out.println("5. Return a string of all traders’ names sorted alphabetically.");
		System.out.println(res5);
		System.out.println("6. Are any traders based in Milan?");
		System.out.println(res6);
		System.out.println("7. Count the number of traders in Milan.");
		System.out.println(res7);
		System.out.println("8. Print all transactions’ values from the traders living in Cambridge.");
		res8.stream()
			.forEachOrdered(System.out::println);
		System.out.println("9. What’s the highest value of all the transactions?");
		System.out.println(res9.get());
		System.out.println("10. Find the transaction with the smallest value.");
		res10.stream()
			.forEach(System.out::println);
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
