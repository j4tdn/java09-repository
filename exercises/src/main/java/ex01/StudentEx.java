package ex01;

public class StudentEx {
	
	public static void main(String[] args) {
			
		Student st01 = new Student(1,"truong",10f,9f);
		Student st02 = new Student(2,"phu",9f,7f);
		Student st03 = new Student();
		st03.setMasv(3);
		st03.setName("hoang");
		st03.setTheoreticalPoint(8f);
		st03.setMathPoint(7f);
		System.out.printf("%-10s%-25s%-10s%-10s%-10s \n", "ID", "Họ Tên", "Điểm TH", "Điểm LT", "Điểm TB");
		System.out.println("--------------------------------------------------------------");
		System.out.println(st01);
		System.out.println(st02);
		System.out.println(st03);
}
}
