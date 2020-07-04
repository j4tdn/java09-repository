package view;

import beans.Vehicle;

public class VehicleDemo {

	public static void main(String[] args) {
		VehicleDemo vehicleDemo = new VehicleDemo();
		// khoi tao du lieu khach hang

		Vehicle loanVehicle = new Vehicle("Nguyễn Thu Loan","Future Neo", 100, 35000000);
		Vehicle tinhVehicle = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
		Vehicle trietVehicle = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);
		System.out.println("Tên chủ xe" + "            " + "Loại xe" + "            " + "Dung Tích" + "            "
				+ "Trị giá" + "            " + "Thuế phải nôp");
		System.out.println(
				"===============================================================================================");
		System.out.println(loanVehicle + "            " + loanVehicle.getTax());
		System.out.println(trietVehicle+ "            "+ trietVehicle.getTax());
		System.out.println(tinhVehicle + "            " + tinhVehicle.getTax());

	}

	
}
