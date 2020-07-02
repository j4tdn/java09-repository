package exercise02;

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle[] vehicles = getVehicles();
		System.out.println(String.format("%-20s%-15s%15s%20s%20s", "Tên chủ xe", "Loại xe", "Dung tích", "Giá xe", "Thuế phải nộp"));
		
		System.out.println("-----------------------------------------------------------------------------------");
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}

	public static Vehicle[] getVehicles() {
		Vehicle[] vehicles = new Vehicle[] { new Vehicle("Nguyễn Thị Hồng", "Lamborghini", 1500, 1000000000),
				new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 25000000),
				new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 150000000),
				new Vehicle("Nguyễn Văn Chiến", "Mercedes", 2000, 150000000),
				new Vehicle("Nguyễn Thị Loan", "Dream", 50, 10000000),

		};
		return vehicles;
	}
}
