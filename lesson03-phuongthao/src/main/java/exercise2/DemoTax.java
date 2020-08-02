package exercise2;

public class DemoTax {
	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
		Vehicle vehicle2 = new Vehicle("Lê Ninh Tính", "Ford Ranger", 3000, 250000000);
		Vehicle vehicle3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 100000000);
		
		System.out.printf("%-25s%-25s%-25s%-25s%s\n","Tên chủ xe","Loại xe","Dung tích","Trị giá","Thuế");
		System.out.println("===========================================================================================================");

		System.out.println(vehicle1);
		System.out.println(vehicle2);
		System.out.println(vehicle3);

	}
}
