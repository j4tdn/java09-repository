package exercises;
import java.util.Scanner;

public class VehicleView{
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Vehicle vh1=new Vehicle();
		Vehicle vh2=new Vehicle();
		Vehicle vh3=new Vehicle();
		boolean check=true;
		while(check) {
			System.out.println("===============================MENU=================================");
			System.out.println("1.Nhập thông tin xe.");
			System.out.println("2.Xuất bản kê khai tiền thuế trước bạ của xe .");
			System.out.println("3.Thoát .");
			System.out.print("Nhập lựa chọn : ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				vh1=input();
				vh2=input();
				vh3=input();
				break;
			case 2:
				String row = String.format("%-20s%-15s%-15s%-15s%-15s",
						"Tên chủ xe",
						"Loại xe",
						"Dung tích",
						"Trị giá",
						"Thuế phải nộp");
				System.out.println(row);
				System.out.println(view(vh1));
				System.out.println(view(vh2));
				System.out.println(view(vh3));
				break;
			case 3: 
				check =false;
			}
		}
	}
	private static Vehicle input() {
		String carOwner;
		String kindOfCar;
		int capacity;
		double price;
		sc.nextLine();
		System.out.print("Nhap ten chu xe:");
		carOwner = sc.nextLine();
		System.out.print("Nhap loai xe:");
		kindOfCar = sc.nextLine();
		System.out.print("Nhap dung tich xe:");
		capacity = sc.nextInt();
		System.out.print("Nhap tri gia xe:");
		price = sc.nextDouble();
		sc.nextLine();

		return new Vehicle(carOwner, kindOfCar, capacity, price);
	}
	public static  String view(Vehicle vh) {
		String row = String.format("%-20s%-15s%-15d%-15.2f%-15.2f",
				vh.getCarOwner(),
				vh.getKindOfCar(),
				vh.getCapacity(),
				vh.getPrice(),
				vh.getTax());
		return row;
	}
	
}