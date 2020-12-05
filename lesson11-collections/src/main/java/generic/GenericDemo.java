package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits=new JavaList<Integer>();
		digits.add(10);
		System.out.println("size:"+digits.size());
		System.out.println("empty:"+digits.isEmpty());
		
		IList<String> items=new JavaList<String>();
		items.add("welcome to Java09");
		items.add("cheer from Java09");
		items.add("hello from Java09");
		
		System.out.println(items.count(item->item.startsWith("welcome")));
		//items.size();
	}
}
