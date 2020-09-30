package model;

import java.util.ArrayList;

public class Book {
	private String bookId;
	private float cost;
	private String publisher;
	
	public Book() {
		
	}
	
	public Book(String bookId, float cost, String publisher) {
		super();
		this.bookId = bookId;
		this.cost = cost;
		this.publisher = publisher;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return bookId+"---"+cost+"---"+publisher+"---";
	}
	
	
	public ArrayList<Book> getBookByCost(ArrayList<Book> a, float n) {
		ArrayList<Book> a1 = new ArrayList<Book>();
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i).getCost() < n) {
				a1.add(a.get(i));
			}
		}
		return a1;
	}
	
	public ArrayList<Book> getBookByCost(ArrayList<Book> a, float n1, float n2, String bookName) {
		ArrayList<Book> a1 = new ArrayList<Book>();
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i).getCost() >= n1 &&  a.get(i).getCost() <= n2
					&& a.get(i).getBookId().substring(0, 3).equals(bookName)) {
				a1.add(a.get(i));
				
			}
			
		}
		return a1;
	}

	public ArrayList<Book> getBookByPublisher(ArrayList<Book> a, String str) {
		ArrayList<Book> a1 = new ArrayList<Book>();
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i).getPublisher().equals(str)) {
				a1.add(a.get(i));
			}
		}
		return a1;
	}
	
	
	
}
