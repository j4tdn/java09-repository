package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
	// traders executing transactions
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();
		List<Trader> traders = getTraders();
		List<Transaction> resutl=Ex01(transactions);
		resutl.forEach(System.out::println);
		List<Transaction> resutl2=Ex02(transactions);
		resutl.forEach(System.out::println);
		List<Trader> resutl3=Ex03(traders);
		resutl.forEach(System.out::println);
		
		// todo: implement code here
		
		
		// todo: result
	}
	//cau1
	private static List<Transaction> Ex01(List<Transaction> trans){
		List<Transaction> result = trans.stream()
				.filter(t->t.getYear()==2011)
				.sorted((o1,o2)->o1.getValue()-o2.getValue()).collect(Collectors.toList());
		return result;
	}
	//cau2
	private static List<Transaction> Ex02(List<Transaction> trans){
		List<Transaction> result=trans.stream().filter(t-> t.getValue()>300)
				.collect(Collectors.toList());
		result.sort(Comparator.comparing(t -> t.getTrader().getCity()));
		return result;
	}
	//cau3
	private static List<Trader> Ex03(List<Trader> trand){
		List<Trader> result=trand.stream().filter(t ->t.getCity().equals("Cambridge"))
				.collect(Collectors.toList());
		result.sort(Comparator.comparing(t ->  t.getName()));
		return result;
	}
	//cau4
	
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
