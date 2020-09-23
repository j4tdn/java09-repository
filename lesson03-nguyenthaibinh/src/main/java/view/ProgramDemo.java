package view;

import beans.Vehicle;
import java.util.Scanner;

public class ProgramDemo {

	public static void main(String[] args) {
		boolean flag = true;
		Vehicle[] vehicles = null ;
		Scanner ip = new Scanner(System.in);
		do {
			System.out.println("Hệ thống tính thuế đóng trước bạ của các xe");
			System.out.println("===========================================");
			System.out.println("1) Nhập thông tin xe");
			System.out.println("2) Xuất bảng kê khai tiền thuế trước bạ của các xe");
			System.out.println("3) Thoát hệ thống");
			Integer thread = ip.nextInt();
			switch (thread) {
			case 1:
				System.out.println("Bạn muốn nhập thông tin bao nhiêu xe: ");
				Integer number = ip.nextInt();
				vehicles = new Vehicle[number];
				for (int i = 0; i < number; i++) {
					System.out.println("Xe thứ: " + (i + 1));
					vehicles[i] = new Vehicle();
					inputCar(vehicles[i]);
				}
				break;
			case 2:
				System.out.printf("%5s %10s %20s %20s %20s \n","Ten chu xe","Loai xe","Dung tich","Tri Gia","Thue Phai Nop");
				for(int i = 0; i < vehicles.length; i++) {
					System.out.printf("%5s %5s %20s %20s %20s \n",
							vehicles[i].getCarOwner(),
							vehicles[i].getCategory(),
							vehicles[i].getCapacity(),
							vehicles[i].getPrice(),
							calculationTax(vehicles[i]));
				}
				break;
			default:
				flag = false;
				break;
			}
		} while (flag);

	}

	public static void inputCar(Vehicle vehicle) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap ten chu xe: ");
		vehicle.setCarOwner(ip.nextLine());
		System.out.println("Mo ta xe: ");
		vehicle.setCategory(ip.nextLine());
		System.out.println("Nhap dung tich xe: ");
		vehicle.setCapacity(ip.nextInt());
		System.out.println("Nhap gia tri xe: ");
		vehicle.setPrice(ip.nextInt());
		
	}
	public static float calculationTax(Vehicle vehicle) {
		float tax = 0;
		Integer tmp = vehicle.getCapacity();
		if(tmp < 100 ) {
			tax = vehicle.getPrice() / 100;
		} else if (tmp == 100 && tmp < 200) {
			tax = (vehicle.getPrice() * 3) / 100;
		} else {
			tax = (vehicle.getPrice() * 5) / 100; 
		}
		return tax;
	}

}
