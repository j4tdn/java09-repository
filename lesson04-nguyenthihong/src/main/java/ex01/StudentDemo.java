package ex01;

public class StudentDemo {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Nguyen Thi Hong", 9f, 10f);
		Student sv2 = new Student(2, "Nguyen Thi Loan", 9f, 9f);
		Student sv3 = new Student();
		sv3.setId(3);
		sv3.setName("Nguyen Thi Tuyet Nhung");
		sv3.setPracticePoint(8.5f);
		sv3.setTheoreticalPoint(10f);
		System.out.printf("%-10s%-25s%-10s%-10s%-10s \n", "ID", "Họ Tên", "Điểm TH", "Điểm LT", "Điểm TB");
		System.out.println("--------------------------------------------------------------");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
