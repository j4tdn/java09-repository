package ex05;


public class Ex05 {
	private static void createNewListBooks(Book list[]){
		list[0] = new Textbook("SGK1", 40, "Nhi Đồng", Status.New);
		list[1] = new Textbook("SGK2", 110, "Giáo dục", Status.New);
		list[2] = new Textbook("SGK3", 120, "Giáo dục", Status.New);
		list[3] = new ReferenceBook("STK1", 200, "Nhi Đồng", 0.1f);
		list[4] = new ReferenceBook("STK2", 50, "Nhi Đồng", 0.12f);
	}
	
	public static void findPublisher(String publisher, Book list[]) {
		System.out.println("các sách thuộc nhà xuất bản " + publisher + " là: ");
		for(int i = 0; i < list.length; i++) {
			if(publisher == list[i].getPublisher()) {
				System.out.println(list[i]);
			}
		}
	}
	
	public static void findWithPrice50(Book list[]) {
		System.out.println("sách có đơn giá nhỏ hơn 50");
		for(int i = 0; i < list.length; i++) {
			if(list[i].getPrice() < 50) {
				System.out.println(list[i]);
			}
		}
	}
	
	public static void findWithPrice100_200(Book list[]) {
		System.out.println("sách có đơn giá nhỏ hơn 50");
		for(int i = 0; i < list.length; i++) {
			if(list[i].getPrice() >= 100 && list[i].getPrice() <= 200) {
				System.out.println(list[i]);
			}
		}
	}
	
	public static float sale(Textbook tb, ReferenceBook rb) {
		float price = 0;
		if(tb.getStatus() == Status.Secondhand) {
			price += tb.getPrice() * 0.3;
		} else {
			price += tb.getPrice();
		}
		price += rb.getPrice() * (1 + rb.getTax());
		return price;
	}
	public static void main(String[] args) {
		Book listBook[] = new Book[5];
		createNewListBooks(listBook);
		findPublisher("Nhi Đồng", listBook);
		findWithPrice50(listBook);
		findWithPrice100_200(listBook);
		System.out.println("giá tiền phải trả khi mua TGK1 và STK2 là: " + sale((Textbook)listBook[1],(ReferenceBook) listBook[4]));	
	}
}
