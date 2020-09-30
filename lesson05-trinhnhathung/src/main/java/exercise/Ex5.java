package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Book;
import entities.ReferenceBook;
import entities.SchoolBook;

public class Ex5 {
	public static void main(String[] args) {
		 List<Book> books = createDataForShop();
		 System.out.println("Tien khach hang tra:" + pay("STK2", "SGK2", books));
	}
	
	public static List<Book> createDataForShop () {
		SchoolBook schoolBook1 = new SchoolBook("SGK1",10, "Kim dong" ,"new");
		SchoolBook schoolBook2 = new SchoolBook("SGK2",1500, "Giao duc" ,"old");
		SchoolBook schoolBook3 = new SchoolBook("SGK3",1000, "Kim dong" ,"new");
		ReferenceBook referenceBook1 = new ReferenceBook("STK1", 20, "Kim dong", 0.1f);
		ReferenceBook referenceBook2 = new ReferenceBook("STK2", 1800, "Giao duc", 0.2f);
		List<Book>  books = new ArrayList<Book>();
		books.add(schoolBook1);
		books.add(schoolBook2);
		books.add(schoolBook3);
		books.add(referenceBook1);
		books.add(referenceBook2);
		return books;
	}
	
	public static List<Book> searchBookOfKimDong( List<Book> books) {
		 List<Book> result = new ArrayList<Book>();
		 for (Book book : books) {
			 if (book.getPublishingCompany().toLowerCase().equals("kim dong")) {
				result.add(book);
			 }
		 }
		 return result;
	}
	
	public static List<Book> searchBookHasCostLess50(List<Book> books) {
		List<Book>  result = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getCost() < 50) {
				result.add(book);
			}
		}
		return result;
	}
	
	public static List<Book> searchSchoolBookHasCost100To200(List<Book> books) {
		List<Book> result = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getId().substring(0, 3).toLowerCase().equals("stk") && book.getCost() >= 100  && book.getCost() <=200) {
				result.add(book);
			}
		}
		return result;
	}
	
	public static float pay (String idReferenceBook, String idSchoolBook, List<Book> books) {
		 float s = 0;
		 for (Book book : books) {
			 if (idReferenceBook.equals(book.getId())) {
				 s += book.pay();
			 } 
			 
			 if (idSchoolBook.equals(book.getId())) {
				 s += book.pay();
			 }
		 }
		 return s;
	}
}
