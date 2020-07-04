package exercises;
import java.util.Scanner;

public class VehicleDemo {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Vehicle xe1 = new Vehicle();
		Vehicle xe2 = new Vehicle();
		Vehicle xe3 = new Vehicle();
		boolean check = true;
		while (true) {
			System.out.println("===============================MENU=================================");
			System.out.println("1.Nhập thông tin xe.");
			System.out.println("2.Xuất bản kê khai tiền thuế trước bạ của xe .");
			System.out.println("3.Thoát .");
			System.out.print("Bạn chọn : ");
			int option = sc.nextInt();
			sc.nextLine();
			System.out.println("===================================================================");
			switch (option) {
			case 1:
				int count = 1;
				makeVehicle(xe1, count);
				count++;
				makeVehicle(xe2, count);
				count++;
				makeVehicle(xe3, count);
				break;

			case 2:
				String row = String.format("%-20s%-15s%-15s%-15s%-15s",
						"Tên chủ xe",
						"Loại xe",
						"Dung tích",
						"Trị giá",
						"Thuế phải nộp");
				System.out.println(row);
				System.out.println(view(xe1));
				System.out.println(view(xe2));
				System.out.println(view(xe3));
				break;
			case 3:
				check = false;
				break;
			}
			if (check == false) {
				break;
			}
		}
	}

	private static void makeVehicle(Vehicle xe, int count) {
		System.out.print("Nhập tên chủ xe thứ " + count + ": ");
		xe.setOwner(sc.nextLine());

		System.out.print("Nhập loại xe: ");
		xe.setModel(sc.nextLine());

		System.out.print("Nhập dung tích : ");
		xe.setCapacity(Integer.parseInt(sc.nextLine()));

		System.out.print("Nhập giá tiền : ");
		xe.setPrice(Integer.parseInt(sc.nextLine()));
	}
	private static String view(Vehicle xe) {
		if(xe.getCapacity() < 100) {
			xe.setTax(xe.getPrice()/100);
		}
		else if(xe.getCapacity() <= 200) {
			xe.setTax(xe.getPrice()/100*3);
		}
		else if(xe.getCapacity() > 200) {
			xe.setTax(xe.getPrice()/100*5);
		}
		
		String row = String.format("%-20s%-15s%-15d%-15.2f%-15.2f",
		xe.getOwner(),
		xe.getModel(),
		xe.getCapacity(),
		xe.getPrice(),
		xe.getTax());
		
		return row;
	}
}

