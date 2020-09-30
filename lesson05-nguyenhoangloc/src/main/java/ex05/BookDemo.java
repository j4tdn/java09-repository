package ex05;

public class BookDemo {
	public static void main(String[] args) {
		Book[] books=getBook();
		findBook(books);
		findTextBook(books);
	}
	public static Book[] getBook() {
		return new Book[] {
				new TextBook("1", 20, "nhi dong", "none"),
				new TextBook("1", 100, "FPT", "none"),
				new TextBook("1", 10, "FPT", "none"),
				new ReferrenceBook("2", 200, "fpt", 1),
				new ReferrenceBook("2", 200, "fpt", 1),
		};
	}
	
	public static void findBook(Book[] book) {
		for(int i=0;i<book.length;i++) {
			if(book[i].getPrice()<50) {
				System.out.println(book[i]);
			}
		}
	}
	public static void findTextBook(Book[] book) {
		for(int i=0;i<book.length;i++) {
			if(book[i].getId()=="SGK1") {
				System.out.println(book[i]);
			}
		}
	}
}
