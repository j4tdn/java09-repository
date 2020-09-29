package ex01;

public class StudentsEx01 {
	public static void main(String[] args) {
		Students sv1 = new Students(0212, "Hoang Thai", 8, 8);
		Students sv2 = new Students(0212, "Hoang Loc", 9, 9);
		Students sv3 = new Students();
		sv3.nhap();
		System.out.println("MSSV" + "   " + " Họ và tên" + "		" + "Điểm LT" + "   "+ "Điểm TH" + "   " + "Điểm TB");
		System.out
				.println("MSSV" + "   " + " Họ và tên" + "		" + "Điểm LT" + "   " + "Điểm TH" + "   " + "Điểm TB");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
