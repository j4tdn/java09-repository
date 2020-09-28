package exercise01;

import java.util.Scanner;

public class Students {
	int id;
	String name;
	float diemLT;
	float diemTH;
	float diemTB;
	public static Scanner scanner = new Scanner(System.in);
	//constructor
	public Students(int id, String name, float diemLT, float diemTH) {
		super();
		this.id = id;
		this.name = name;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
public Students() {
	// TODO Auto-generated constructor stub
	this.id = 0;
	this.name = " ";
	this.diemLT = 0;
	this.diemTH = 0;
	
}
//getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	public float diemTB(float diemTH, float diemLT) {
		return diemTB = (diemLT + diemTH)/2;
	}
	
	@Override
	public String toString() {
		return  id +  "   " + name + "		" + diemLT + "        " + diemTH + "        " + diemTB(diemTH, diemLT) ;
	}
	public void nhap() {
		System.out.println("Nhập vào thông tin SV03: ");
		System.out.println("Họ và tên sinh viên: ");
		name = scanner.nextLine();
		System.out.println("Mã số sinh viên là: ");
		id= scanner.nextInt();
	    System.out.println("Điểm lý thuyết là: ");
		diemLT = scanner.nextFloat();
		System.out.println("Điểm thực hành là: ");
		diemTH = scanner.nextFloat();
		
	}
public static void main(String[] args) {
		
		Students SV01 = new Students ( 100001 ,  "Nguyễn Văn An" , 9, 10  );
		Students SV02 = new Students(100002, "Trần Thị Bê" , 7, 9);
		Students SV03 = new Students();
		SV03.nhap();
		System.out.println("MSSV" + "   " + " Họ và tên" + "		" + "Điểm LT" + "   "+ "Điểm TH" + "   " + "Điểm TB");
		System.out.println(SV01);
		System.out.println(SV02);
		System.out.println(SV03);
		
	}
	
	
}