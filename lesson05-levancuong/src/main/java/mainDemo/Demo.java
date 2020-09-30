package mainDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import exam.Book;
import exam.ReferenceBook;
import exam.Textbook;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Book> books = books();
		// xuat danh sach
		for (Book b : books) {
			System.out.println(b);
		}

		// xuat danh sach nha xuat ban nhi dong

		System.out.println("Danh sach nha sach nhi dong");
		ArrayList<Book> find = findBookPublisher(books);
		for (Book b : find) {
			System.out.println(b);
		}

		// xuat danh sach co price <50

		System.out.println("Danh sach co price <50");
		ArrayList<Book> fiftyPrice = findBookUnitPriceLow50(books);
		for (Book b : find) {
			System.out.println(b);
		}

	}

	private static ArrayList<Book> books() {
		ArrayList<Book> b = new ArrayList<>();
		Book t1 = new Textbook("SGK1", 10000f, "Nhi dong", true);
		b.add(t1);
		Book t2 = new Textbook("SGK2", 20000f, "Kim dong", true);
		b.add(t2);
		Book t3 = new Textbook("SGK3", 30000f, "Lam dong", false);
		b.add(t3);
		Book r1 = new ReferenceBook("STK1", 40000, "Kim dong", 1000);
		b.add(r1);
		Book r2 = new ReferenceBook("STK2", 50000, "Nhi dong", 2000);
		b.add(r2);
		return b;

	}

	private static ArrayList<Book> findBookPublisher(ArrayList<Book> books) {
		ArrayList<Book> result = new ArrayList<>();
		for (Book b : books) {
			if (b.getPublisher().equals("Nhi dong")) {
				result.add(b);
			}
		}
		return result;

	}

	private static ArrayList<Book> findBookUnitPriceLow50(ArrayList<Book> books) {
		ArrayList<Book> result = new ArrayList<>();
		for (Book b : books) {
			if (b.getUnitPrice() < 50) {
				result.add(b);
			}
		}
		return result;

	}

	private static ArrayList<Book> findBookUnitPriceFrom100To200(ArrayList<Book> books) {
		ArrayList<Book> result = new ArrayList<>();
		for (Book b : books) {
			if (b.getUnitPrice() >= 100 && b.getUnitPrice() <= 200) {
				result.add(b);
			}
		}
		return result;

	}

	private static float tienMuaSach(ArrayList<Book> books, String idSGK, String idSTK) {
		float resutl = 0;
		for (Book b : books) {
			if (b.getIdBook().equals(idSGK)) {
				result += b.tinhtien();
			}
			if (b.getIdBook().equals(idSTK)) {
				result += b.tinhtien();
			}

		}
		return result;
	}

}
