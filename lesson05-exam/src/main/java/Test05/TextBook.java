package Test05;

import java.util.Scanner;

public class TextBook extends Book {
	private String status;
	public TextBook() {
		super();
	}
	public TextBook(String status) {
		super();
		this.status=status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return super.toString()+"\nTình trạng:"+this.status;
	}
	@Override 
	public void input() {
		super.input();
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		System.out.print("Tình trạng:");
		this.status=sc.nextLine();
	}
}
