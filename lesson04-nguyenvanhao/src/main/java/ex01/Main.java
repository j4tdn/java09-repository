package ex01;

public class Main {
	public static void main(String[] args) {
		Student st=new Student();
		st.input();
		System.out.println(st.toString());
		System.out.printf("%-12s%-12s%-30s%-25s","ID","Tên","Điểm thực hành","Điểm lý thuyết");
		System.out.println();
		st.output();
	}
}
