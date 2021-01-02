package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class Demo {
	// traders executing transactions
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();
		List<Trader> traders = getTraders();

		// todo: implement code here
		// Q1
		List<Transaction> result1 = getAllTByPredicate(transactions, t -> t.getYear() == 2011,
				comparing(t -> t.getValue()));
		// Q2
		List<Transaction> result2 = getAllTByPredicate(transactions, t -> t.getValue() > 300,
				comparing(t -> t.getTrader().getCity()));
		// Q3
		List<String> result3 = getAllUniqueCities(traders);

		// Q4
		List<Trader> result4 = getAllTByPredicate(traders, t -> t.getCity().equals("Cambridge"),
				comparing(t -> t.getName(), reverseOrder()));
		// Q5
		List<String> result5 = getPropertyOfT(traders, t -> t.getName(),t -> true, comparing(Function.identity()));
//		List<Transaction> result5 = getPropertyOfT(transactions, t -> t, t -> t.getYear() == 2011,
//				comparing(t -> t.getValue()));
		// Q6
		boolean result6 = isAnyTraterInCity(traders, t -> t.getCity().equals("Milan"));
		// Q7
		int result7 = countTraderInCity(traders, t -> t.getCity().equals("Milan"));
		// Q8
		// to result
		// Q9
		int result9 = findMaxValueOfTransaction(transactions);
		// Q10
		Transaction result10 = getTransactionByValue(transactions);
		
		// todo: result
		System.out.println("=====Q1=====");
		result1.forEach(System.out::println);
		System.out.println("=====Q2=====");
		result2.forEach(System.out::println);
		System.out.println("=====Q3=====");
		result3.forEach(System.out::println);
		System.out.println("=====Q4=====");
		result4.forEach(System.out::println);
		System.out.println("=====Q5=====");
		result5.forEach(System.out::println);
		System.out.println("=====Q6=====");
		System.out.println(result6);
		System.out.println("=====Q7=====");
		System.out.println(result7);
		System.out.println("=====Q8=====");
		printValueOfTransactionByPredi(transactions, t -> t.getTrader().getCity().equals("Cambridge"));
		System.out.println("=====Q9=====");
		System.out.println(result9);
		System.out.println("=====Q10=====");
		System.out.println(result10);
	}

	private static List<Transaction> getTransactions() {
		List<Trader> traders = getTraders();
		return Arrays.asList(new Transaction(traders.get(3), 2011, 300), new Transaction(traders.get(0), 2012, 1000),
				new Transaction(traders.get(0), 2011, 400), new Transaction(traders.get(1), 2012, 710),
				new Transaction(traders.get(1), 2012, 700), new Transaction(traders.get(2), 2012, 950));
	}

	private static List<Trader> getTraders() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return Arrays.asList(raoul, mario, alan, brian);
	}

	private static <T> List<T> getAllTByPredicate(List<T> listOfT, Predicate<T> predi, Comparator<T> com) {
		List<T> result = listOfT.stream().filter(predi).collect(Collectors.toList());
		result.sort(com);
		return result;
	}
	/**
	 * Hàm getAllTByPredicate: Trả về List của Object
	 * Hàm getPropertyOfT : Vừa trả về List của Object vừa có thể trả về List thuộc tính của Object
	 * Em tính dùng chung 1 hàm getPropertyOfT, mà không biết logic rứa ổn không nên để 2 hàm, 
	 * anh xem comment giúp em với :v
	 */
	/**
	 * 
	 * @param <T> type of data
	 * @param <R> return type of data
	 */
	private static <T, R> List<R> getPropertyOfT(List<T> listOfT, Function<T, R> function, Predicate<R> predi,
			Comparator<R> com) {
		List<R> result = listOfT.stream().map(function).filter(predi).collect(Collectors.toList());
		result.sort(com);
		return result;
	}
	
	private static boolean isAnyTraterInCity(List<Trader> traders, Predicate<Trader> predicate) {
		return traders.stream().anyMatch(predicate);
	}
	
	private static int countTraderInCity(List<Trader> traders, Predicate<Trader> predi) {
		int result = 0;
		for (Trader trader : traders) {
			if(predi.test(trader)) {
				result ++;
			}
		}
		return result;
	}
	
	private static void printValueOfTransactionByPredi(List<Transaction> transactions, Predicate<Transaction> predi) {
		for (Transaction transaction : transactions) {
			if(predi.test(transaction)) {
				System.out.println(transaction.getValue());
			}
		}
	}
	
	private static int findMaxValueOfTransaction(List<Transaction> transactions) {
		return transactions.stream().map( t-> t.getValue()).reduce(Integer::max).get();
	}
	
	private static Transaction getTransactionByValue(List<Transaction> transactions) {
		Transaction result = transactions.get(0);
		for (int i = 1; i < transactions.size(); i++) {
			if(result.getValue() < transactions.get(i).getValue()) {
				result = transactions.get(i);
			}
		}
		return result;
	}

	private static List<String> getAllUniqueCities(List<Trader> traders){
		Map<String, Integer> mapTrader = new HashMap<>();
		for (int i = 0; i < traders.size(); i++) {
			if(!mapTrader.containsKey(traders.get(i).getCity())) {
				mapTrader.put(traders.get(i).getCity(), 1);
			} else {
				mapTrader.replace(traders.get(i).getCity(), 2);
			}
		}
		List<String> result = mapTrader.entrySet()
										.stream()
										.filter(m -> m.getValue() == 1)
										.map(m -> m.getKey())
										.collect(Collectors.toList());
		return result;
		
	}
	
}
