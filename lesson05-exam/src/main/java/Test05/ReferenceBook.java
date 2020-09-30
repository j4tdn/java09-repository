package Test05;

import java.util.Scanner;

public class ReferenceBook extends Book {
	private float tax;
	public ReferenceBook() {
		super();
	}
	public ReferenceBook(float tax) {
		super();
		this.tax=tax;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return super.toString()+"\n Thuế:"+this.tax;
	}
	@Override
	public void input() {
		super.input();
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		System.out.print("Thuế: ");
		this.tax=sc.nextFloat();
	}
}
