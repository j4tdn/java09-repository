package polymorphism.method;

public class OverrideDemo {
	public static void main(String[] args) {
		Parent father = new Parent();
		father.playSport();
		
		System.out.println("====================");
		
		Parent son = new Child();
		son.playSport();
		
		System.out.println("====================");
		
		Parent undefined = new Child(); // override 
		//Child a = new Parent();// cau lenh sai
		System.out.println("runtime instance: " + undefined.getClass()); // luc runtime thi tro den lop child
		
		undefined.playSport();// hien thi phuong thuc cua lop con
		
	}
}
