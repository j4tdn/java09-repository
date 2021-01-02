package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {
	// traders executing transactions
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();
		List<Trader> traders = getTraders();

		
		
		
		///1
		System.out.println("==========1");
		List<Transaction> resutl=findByAllTransactionsIn2011(transactions);///1
		resutl.forEach(System.out::println);
		
		
		//2
		System.out.println("==========1");
		List<Transaction> resutl2=findAllTransactionsThan300(transactions);
		resutl2.forEach(System.out::println);
		
		
		//4
		System.out.println("==========4");
		List<Trader> resutl4=findAllTradersfromCambridge(traders);
		resutl4.forEach(System.out::println);
		
		//6
		System.out.println("==========6");
		boolean reusult6=traders.stream().anyMatch(t -> t.getCity().equals("Milan"));
		System.out.println(reusult6);

		System.out.println("==========7");
		int reusult7 = traderInCity(traders, t -> t.getCity().equals("Milan"));
		System.out.println(reusult7);

		
		//8
				System.out.println("==========8");
				
		
		
	}
	
	public static <T> List<T> findByAllTransactionsIn2011(List<T> list){
		List<T> result=list.stream().
				filter(t->((Transaction) t).getYear()==2011).
				sorted((o1,o2)->((Transaction) o1).getValue()-((Transaction) o2).getValue()).
				collect(Collectors.toList());
		return result;
	}
	private static <T> List<T> findAllTransactionsThan300(List<T> list){
		List<T> result=list.stream().filter(t->((Transaction) t).getValue()>900)
				.collect(Collectors.toList());
		result.sort(Comparator.comparing(t -> ((Transaction) t).getTrader().getCity()));
		return result;
	}
	private static <T> List<T> findAllTradersfromCambridge (List<T> list){
		List<T> result=list.stream().filter(t ->((Trader) t).getCity().equals("Cambridge"))
				.collect(Collectors.toList());
		result.sort(Comparator.comparing(t -> ((Trader) t).getName()));
		return result;
	}
	
	
	
	private static int traderInCity(List<Trader> traders, Predicate<Trader> predicate) {
		int result = 0;
		for (Trader trader : traders) {
			if(predicate.test(trader)) {
				result ++;
			}
		}
		return result;
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
