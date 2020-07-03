package exercises;

import java.util.Scanner;

public class VehicleView {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		Vehicle vehicle1=new Vehicle();
		Vehicle vehicle2=new Vehicle();
		Vehicle vehicle3=new Vehicle();
		
		do {
			System.out.println("===========MENU==========");
			System.out.println("1.Nhập thông tin và tạo các đối tượng:");
			System.out.println("2.Xuất bảng kê khai tiền thuế trước bạ của các xe:");
			System.out.println("3.Thoát:");
			System.out.println("=========================");
			System.out.print("Nhap lua chon:");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
			     vehicle1 = setInfo();
				 vehicle2 = setInfo();
				 vehicle3 = setInfo();
				break;
			case 2:
				System.out.printf("%-30s","Ten chu xe");
				System.out.printf("%-30s","Loai xe");
				System.out.printf("%-30s","Dung tich");
				System.out.printf("%-30s","Tri gia");
				System.out.printf("%-30s\n","Thue phai nop");
				System.out.println("======================================================================="
						+ "===============================================================");
				System.out.printf("%-30s%-30s%-30d%-30f%-30f\n", vehicle1.getCarOwner(),vehicle1.getKindOfCar(),
						     vehicle1.getCylinderCapacity(),vehicle1.getPrice(),vehicle1.getTax());
				System.out.printf("%-30s%-30s%-30d%-30f%-30f\n", vehicle2.getCarOwner(),vehicle2.getKindOfCar(),
						vehicle2.getCylinderCapacity(),vehicle2.getPrice(),vehicle2.getTax());
				System.out.printf("%-30s%-30s%-30d%-30f%-30f\n", vehicle3.getCarOwner(),vehicle3.getKindOfCar(),
						vehicle3.getCylinderCapacity(),vehicle3.getPrice(),vehicle3.getTax());
				break;
			case 3:
				break;
			default:
				continue;
			}
		} while (choice != 3);
	}

	private static Vehicle setInfo() {
		String carOwner;
		String kindOfCar;
		int cylinderCapacity;
		float price;
		System.out.print("Nhap ten chu xe:");
		carOwner = sc.nextLine();
		System.out.print("Nhap loai xe:");
		kindOfCar = sc.nextLine();
		System.out.print("Nhap dung tich xe:");
		cylinderCapacity = sc.nextInt();
		System.out.print("Nhap tri gia xe:");
		price = sc.nextFloat();
		sc.nextLine();

		return new Vehicle(carOwner, kindOfCar, cylinderCapacity, price);
	}
}
