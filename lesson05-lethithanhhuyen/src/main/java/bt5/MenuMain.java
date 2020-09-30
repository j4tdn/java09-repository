package bt5;

public class MenuMain {
	public static void main(String[] args) {
		
		Sach books[] = setBooks();
		
		function(books);
		
		
	}
	
	public static Sach[] setBooks() {
		//Create 3 object sgk
		Sach sgk1 = new SachGK("SGK1", 100, "Hà Nội", true);
		Sach sgk2 = new SachGK("SGK2", 200, "Nhi Đồng", false);
		Sach sgk3 = new SachGK("SGK3", 300, "Việt Nam", true);
		//Create 2 object stk
		Sach stk1 = new SachTK("STK1", 400, "Nhi Đồng", 0.1F);
		Sach stk2 = new SachTK("STK2", 40, "Minh Châu", 0.05F);
		
		//Save into one array
		Sach s[] = {sgk1,sgk2,sgk3,stk1,stk2};
		return s;
	}
	
	public static void function(Sach[] s) {
		//Search publisher = "Nhi Đồng"
		System.out.println("**Sách có nhà xuất bản là Nhi Đồng**");
		for (int i=0; i<s.length; i++) {
			if (s[i].getPublisher()=="Nhi Đồng") {
				System.out.println(s[i]);
			}
		}
		
		//Search price<50
		System.out.println("**Sách có đơn giá nhỏ hơn 50**");
		for (int i= 0; i<s.length;i++) {
			if (s[i].getPrice()<50) {
				System.out.println(s[i]);
			}
		}
		
		//Search sgk price = 100 -> 200
		System.out.println("**Sách giáo khoa có đơn giá từ 100 đến 200");
		for (int i= 0; i<s.length; i++) {
			if (s[i].getId().contains("SGK") 
					&& s[i].getPrice() >= 100 
					&& s[i].getPrice() <= 200) {
				System.out.println(s[i]);
			}
		}
		
		
	}
	
	public static long sumPrice(SachGK a, SachTK b) {
		long sgk = a.getPrice();
		if (!a.isState()) {
			sgk *= 0.7; 
		}
		long stk = (long) ((long) b.getPrice() * (1+ b.getTax()));
		
		return sgk+stk;
	}
}
