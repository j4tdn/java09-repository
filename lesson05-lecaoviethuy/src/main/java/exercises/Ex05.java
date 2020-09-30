package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entities.Book;
import entities.BookType;
import entities.ReferenceBook;
import entities.TextBook;

public class Ex05 {
	public static void main(String[] args) {
		List<Book> books = createNewBooks();
		showBooks(books);
		
		System.out.println("==============================");
		System.out.println("Lay ra nhung quyen sach co NXB la nhi dong");
		List<Book> nhidongBooks = findBooksWithPredicated(books, new Predicate<Book>() {
			@Override
			public boolean test(Book t) {
				return t.getPublishingCompany().equalsIgnoreCase("nhi dong");
			}
		});
		showBooks(nhidongBooks);

		System.out.println("==============================");
		System.out.println("Lay ra nhung quyen sach co gia thap hon 50");
		List<Book> lower50PriceBooks = findBooksWithPredicated(books, new Predicate<Book>() {
			@Override
			public boolean test(Book t) {
				return t.getPrice() < 50;
			}
		});
		showBooks(lower50PriceBooks);

		System.out.println("==============================");
		System.out.println("Lay ra nhung quyen sach co lon hon 50 va nho hon 100");
		List<Book> between50to100PriceBooks = findBooksWithPredicated(books, new Predicate<Book>() {
			@Override
			public boolean test(Book t) {
				if(t.getType() == BookType.TEXT_BOOK) {
					return t.getPrice() > 50 && t.getPrice() < 100;
				} else {
					return false;
				}
			}
		});
		showBooks(between50to100PriceBooks);
		
		System.out.println("==============================");
		List<Book> boughtBook = new ArrayList<Book>();
		boughtBook.add(books.get(0));
		boughtBook.add(books.get(3));
		
		float totalPrice = caculateBooks(boughtBook);
		System.out.println("Tong tien mua sach: " + totalPrice);
	}
	
	private static float caculateBooks(List<Book> boughtBook) {
		float sum = 0;
		for(Book book : boughtBook) {
			if(book.getType() == BookType.TEXT_BOOK) {
				TextBook textBook = (TextBook) book;
				if(textBook.getStatus().equalsIgnoreCase("cũ")) {
					sum += textBook.getPrice() * 0.7;
				} else {
					sum += textBook.getPrice();
				}
			} else {
				ReferenceBook referenceBook = (ReferenceBook) book;
				sum += referenceBook.getPrice() * (1 + referenceBook.getTax());
			}
		}
		
		return sum;
	}
	
	public static void showBooks(List<Book> books) {
		books.forEach(System.out::println);
	}

	private static List<Book> findBooksWithPredicated(List<Book> books, Predicate<Book> pre){
		return books.stream()
				.filter(book -> pre.test(book))
				.collect(Collectors.toList());
	}

	private static List<Book> createNewBooks() {
		List<Book> books = new ArrayList<Book>();
		TextBook tb1 = new TextBook(BookType.TEXT_BOOK, "03", 20, "Nhi Dong", "mới");
		TextBook tb2 = new TextBook(BookType.TEXT_BOOK, "5A", 56, "NXB GD", "cũ");
		TextBook tb3 = new TextBook(BookType.TEXT_BOOK, "FF", 70, "Da Nang", "mới");
		ReferenceBook rb1 = new ReferenceBook(BookType.REFERENCE_BOOK, "OA", 30, "Kim Dong", 0.2f);
		ReferenceBook rb2 = new ReferenceBook(BookType.REFERENCE_BOOK, "9H", 99, "Sai Gon", 0.05f);
		
		books.add(tb1);
		books.add(tb2);
		books.add(tb3);
		books.add(rb1);
		books.add(rb2);
		return books;
	}
}
