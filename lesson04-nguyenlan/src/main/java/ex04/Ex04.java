package ex04;

public class Ex04 {
	public static void main(String[] args) {
		GiamDoc gd = new GiamDoc("Nguyễn Thị Nở", "01/01/2000", 2.5f, 2.0f);
		TruongPhong tp = new TruongPhong("Nguyễn Hữu Phương", "14/10/2000", 1.8f, 10);
		NhanVien nv1 = new NhanVien("Tạ Minh Triết", "01/02/2000", 1.0f, "Bảo vệ");
		NhanVien nv2 = new NhanVien("Lê Anh Quân", "09/03/1999", 1.5f, "Marketing");

		System.out.println("Giám đốc:		" + gd + "	,lương: " + gd.calSalary());
		System.out.println("Trưởng phòng:		" + tp + "	, lương:	" + tp.calSalary());
		System.out.println("Nhân viên 1:		" + nv1 + "	, lương: " + nv1.calSalary() );
		System.out.println("Nhân viên 2:		" + nv2 + "	, lương: " + nv2.calSalary());	
	}
}
