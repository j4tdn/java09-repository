package ex05;

import java.util.Arrays;

public class BookShopDemo {
	public static void main(String[] args) {

		Book[] books = getListBook();
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("====================================");
		System.out.println("Toàn bộ sách thuộc nhà xuất bản Nhi Đồng \n");
		Book[] nhiDongBooks = getBooksOfPublishingCompany(books, "NXB Nhi Đồng");
		for (Book book : nhiDongBooks) {
			System.out.println(book);
		}
		System.out.println("====================================");
		System.out.println("Toàn bộ sách có đơn giá nhỏ hơn 50 \n");
		Book[] priceLessThan50Books = getBooksWithPriceLessThan50(books);
		for (Book book : priceLessThan50Books) {
			System.out.println(book);
		}

		System.out.println("====================================");
		System.out.println("Toàn bộ sách có đơn giá hơn 100, nhỏ hơn 200 \n");
		Book[] textbookPriceFrom100To200 = getTextbooksWithPriceFrom100To200(books);
		for (Book book : textbookPriceFrom100To200) {
			System.out.println(book);
		}

		Book[] myBook = new Book[] { books[1], books[3] };
		Float money = getTotalPrice(myBook);
		System.out.println("====================================");
		System.out.println("Các sách đã mua \n");
		for (Book book : myBook) {
			System.out.println(book);
		}
		System.out.println("TỔNG TIỀN:" + money);
	}

	private static Book[] getListBook() {
		Book[] books = new Book[] { new Textbook("SGK1", 120f, "NXB Kim Đồng", false),
				new Textbook("SGK2", 20f, "NXB Nhi Đồng", true), new Textbook("SGK3", 1200f, "NXB Thanh Niên", false),
				new ReferenceBooks("STK1", 1000f, "NXB Tuổi Trẻ", 1.5f),
				new ReferenceBooks("STK2", 500f, "NXB Nhi Đồng", 1f) };

		return books;
	}

	private static Book[] getBooksOfPublishingCompany(Book[] books, String companyName) {
		Book[] result = new Book[books.length];
		int length = 0;
		for (Book book : books) {
			if (book.getPublishingCompany().equals(companyName)) {
				result[length++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, length);
	}

	private static Book[] getBooksWithPriceLessThan50(Book[] books) {
		Book[] result = new Book[books.length];
		int length = 0;
		for (Book book : books) {
			if (book.getPrice() < 50) {
				result[length++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, length);
	}

	private static Book[] getTextbooksWithPriceFrom100To200(Book[] books) {
		Book[] result = new Book[books.length];
		int length = 0;
		for (Book book : books) {
			if (book instanceof Textbook) {
				if (book.getPrice() >= 100 && book.getPrice() <= 200) {
					result[length++] = book;
				}
			}
		}
		return Arrays.copyOfRange(result, 0, length);
	}

	private static Float getTotalPrice(Book[] books) {
		Float result = 0f;
		for (Book book : books) {
			result += book.getMoney();
		}
		return result;
	}
}
