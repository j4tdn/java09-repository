package allocation1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01 {
	
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();
		List<Trader> traders = getTraders();

		List<Transaction> ex1=transactions.stream()
				.filter(a->a.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());
		
		List<Transaction> ex2=transactions.stream().filter(a->a.getValue()>300)
				.sorted(Comparator.comparing(a->a.getValue())).collect(Collectors.toList());
		List<Trader> ex4 = traders.stream()
				 .filter(trader -> "Cambridge".equals(trader.getCity()))
				 .collect(Collectors.toList());
		List<String> ex5 = traders.stream()
			     .map(trader -> trader.getName())
			     .sorted(Comparator.comparing(Function.identity()))
			     .collect(Collectors.toList());

		boolean ex06 = traders.stream().anyMatch(trader-> "Milan".equals(trader.getCity()));

		
		long ex07 = traders.stream().filter(trader -> "Milan".equals(trader.getCity())).count();
		transactions.stream()
		.filter(a->"Cambridge".equals(a.getTrader()))
		.forEach(a->System.out.println(a.getValue()));
		Optional<Integer> ex9 = transactions.stream()
				   .map(Transaction::getValue)
				   .reduce(Integer::sum);
		Optional<Integer> ex10 = transactions.stream()
				   .map(Transaction::getValue)
				   .reduce(Integer::min);
	System.out.println(ex1);
	System.out.println(ex2);
	System.out.println(ex4);
	System.out.println(ex5);
	System.out.println(ex06);
	System.out.println(ex07);
	

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
	


