package practice;

public class Transaction {
private final int year;
private final int value;
private final Trader trader;
public Transaction(Trader trader, int year, int value) {
	this.year = year;
	this.value = value;
	this.trader = trader;
}
public int getYear() {
	return year;
}
public int getValue() {
	return value;
}
public Trader getTrader() {
	return trader;
}
	public String toString() {
		return "Trader: "+trader+"year: "+year+"value: "+value;
	}
}
