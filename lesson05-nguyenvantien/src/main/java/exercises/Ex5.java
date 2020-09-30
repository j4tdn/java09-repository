package exercises;

import java.util.ArrayList;

import model.Book;
import model.Customer;
import model.RefeBook;
import model.TextBook;

public class Ex5 {
	public static void main(String[] args) {
		Book book = new Book();
		TextBook t1 = new TextBook("SGK1", 1, "Nhi Đồng", "mới");
		TextBook t2 = new TextBook("SGK2", 2, "B", "mới");
		TextBook t3 = new TextBook("SGK3", 3, "C", "mới");

		RefeBook r1 = new RefeBook("STK1", 4, "D", 1);
		RefeBook r2 = new RefeBook("STK2", 5, "F", 2);

		ArrayList<Book> a = new ArrayList<Book>();
		a.add(t1);
		a.add(t2);
		a.add(t3);
		a.add(r1);
		a.add(r2);

		System.out.println(book.getBookByPublisher(a, "Nhi Đồng"));

		System.out.println(book.getBookByCost(a, 50));

		System.out.println(book.getBookByCost(a, 1, 2, "SGK"));

		ArrayList<Book> arr = new ArrayList<Book>();
		arr.add(t1);
		arr.add(t2);
		Customer customer = new Customer("1", "Nguyễn A", "123", "DN", t1, r2);
		System.out.println(customer.pay(customer));

	}

}
