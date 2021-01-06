package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
public class Executing {
	public static void main(String[] args) {
		
		List<Trader> traders = getTraders();
		List<Transaction>transactions = getTransactions();
		//1.Find all transactions in the year 2011 and sort them by value (small to high).
        List<Transaction> findalltransactions2011 = transactions.stream()
        		.filter(transaction -> transaction.getYear()==2011)
        		.sorted((o1,o2)->o1.getValue()-o2.getValue())
        		.collect(Collectors.toList());
        System.out.println("all transactions in the year 2011:" + findalltransactions2011);
        	
        System.out.println("=======================================");
      //2.Find all transactions have value greater than 300 and sort them by trader’s city
        List<Transaction> findalltransactions300 = transactions.stream()
        		.filter(transaction->transaction.getValue()>300)
        		.collect(Collectors.toList());
        System.out.println("all transactions have value greater than 300 : " + findalltransactions300);
        System.out.println("=======================================");	
        //3.What are all the unique cities where the traders work?
        List<String> findallcity = traders.stream()
        		.map(trader -> trader.getCity())
        		.distinct()
        		.collect(Collectors.toList());
        System.out.println("all the unique cities where the traders work: " + findallcity);
        System.out.println("=======================================");	
        //4.Find all traders from Cambridge and sort them by name desc.
        List<Transaction> findalltransactionsCam = transactions.stream()
        		.filter(transaction -> transaction.getTrader().getCity()== "Cambridge")
        		.sorted((o1,o2)->o2.getValue()-o1.getValue())
        		.collect(Collectors.toList());
        System.out.println("all traders from Cambridge: " + findalltransactionsCam);
        System.out.println("=======================================");	
        //5.Return a string of all traders’ names sorted alphabetically.
        List<String> findallname = traders.stream()
        		.map(trader -> trader.getName())
        		.sorted()
        		.collect(Collectors.toList());
        System.out.println("all traders’ names: " + findallname);
        System.out.println("=======================================");	
        //6.Are any traders based in Milan?
        boolean findtraderMilan = traders.stream()
        		.anyMatch(trader -> "Milan".equals(trader.getCity()));
        System.out.println("Are any traders based in Milan?: "  +findtraderMilan);
        System.out.println("=======================================");	
        //Count the number of traders in Milan.
       long countTraderMilan = traders.stream()
    		   .filter(trader -> trader.getCity().equals("Milan")).count();
       System.out.println("number of traders in Milan: " + countTraderMilan);
       System.out.println("=======================================");	
       //Print all transactions’ values from the traders living in Cambridge.
       System.out.println("all transactions’ values from the traders living in Cambridge.");
        transactions.stream()
        .filter(transaction -> transaction.getTrader().getCity()== "Cambridge")
       	.forEach(transaction -> System.out.print(  transaction.getValue() + " "));
        System.out.println("=======================================");
        //What’s the highest value of all the transactions?
        Optional<Transaction>highestvalue = transactions.stream().max((o1,o2) -> o1.getValue() -o2.getValue());
        System.out.println("the highest value of all the transactions: " + highestvalue);
        System.out.println("=======================================");
        //Find the transaction with the smallest value.
        Optional<Transaction>smallestvalue = transactions.stream().min((o1,o2) -> o1.getValue() -o2.getValue());
        System.out.println("the transaction with the smallest value" + smallestvalue);
	}
	

	private static List<Trader> getTraders() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		return Arrays.asList(raoul, mario, alan, brian);

	}
	private static List<Transaction> getTransactions(){
		List<Trader> traders = getTraders();
		return Arrays.asList(
				new Transaction(traders.get(3),2011,300),
				new Transaction(traders.get(0),2012,1000),
				new Transaction(traders.get(0),2011,400),
				new Transaction(traders.get(1),2012,710),
				new Transaction(traders.get(1),2012,700),
				new Transaction(traders.get(2),2012,950)
				);
		
	}

}
