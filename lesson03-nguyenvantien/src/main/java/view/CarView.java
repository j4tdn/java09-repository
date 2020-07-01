package view;

import java.util.Scanner;

import beans.Vehicle;

public class CarView {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Vehicle car1 = null;
		Vehicle car2 = null;
		Vehicle car3 = null;
		int select = 0;
		while (select != 3) {
			System.out.println("-----MEMU-----");
			System.out.println("1.Nhập thông tin đối tượng xe.");
			System.out.println("2.Hiển thị thông tin.");
			System.out.println("3.Thoát.");
			System.out.println("Nhập 1 -> 3 để lựa chon công việc: ");
			select = scanner.nextInt();
			scanner.nextLine();
			switch (select) {
			case 1:
				car1 = getInf();
				car2 = getInf();
				car3 = getInf();
				break;
			case 2:
				if(car1 == null) {
					System.out.println("Chưa nhập thông tin xe. Vui lòng nhập!");
					break;
				}
				Vehicle[] carArr = new Vehicle[] { car1, car2, car3 };
				display(carArr);
				break;
			case 3:
				System.out.println("Thoát chương trình!");
				break;
			default:
				System.out.println("Nhập lại lựa chọn.");
			}
		}
	}

	private static void display(Vehicle[] carArr) {
		System.out.printf("%-24s %-23s %-15s %9s %21s %20s\n","Tên chủ xe","Loại xe","Màu","Dung tích","Giá bán","Thuế");
		for (Vehicle vehicle : carArr) {
			System.out.printf("%-24s %-23s %-15s %9d %21.2f %20.2f \n", vehicle.getCarOwner(), vehicle.getModel(),
					vehicle.getColor(), vehicle.getCapacity(), vehicle.getPrice(), vehicle.getTax());
		}
	}

	private static Vehicle getInf() {
		String carOwner;
		String model;
		String color;
		Integer capacity;
		Double price;

		System.out.println("Nhập thông tin cho xe.");
		System.out.print("Chủ xe: ");
		
		carOwner = scanner.nextLine();
		System.out.print("Kiểu xe: ");
		model = scanner.nextLine();
		System.out.print("Màu xe: ");
		color = scanner.nextLine();
		System.out.print("Dung tích (lớn hơn 0): ");
		capacity = scanner.nextInt();
		while (capacity <= 0) {
			System.out.println("Nhập sai thông tin dung tích của xe. HÃY NHẬP LẠI!");
			capacity = scanner.nextInt();
		}
		System.out.print("Giá xe (lớn hơn 0): ");
		price = scanner.nextDouble();
		while (price <= 0) {
			System.out.println("Nhập sai thông tin giá của xe. HÃY NHẬP LẠI!");
			price = scanner.nextDouble();
		}
		scanner.nextLine();
		return new Vehicle(carOwner, model, color, capacity, price);
	}
}
