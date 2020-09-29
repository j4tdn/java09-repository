package exercise04;

public class Demo {
	public static void main(String[] args) {

		GiamDoc giamdoc = new GiamDoc();
		System.out.println("Nhập thông tin giám đốc: ");
		giamdoc.nhap();
		TruongPhong tp = new TruongPhong();
		System.out.println(" Nhập thông tin trưởng phòng: ");
		tp.nhap();
		NhanVien nv01 = new NhanVien();
		System.out.println("Nhập thông tin nhân viên thứ 1");
		nv01.nhap();
		NhanVien nv02 = new NhanVien();
		System.out.println("Nhập thông tin nhân viên thứ 2");
		nv02.nhap();
		System.out.println(giamdoc);
		System.out.println(tp);
		System.out.println(nv01);
		System.out.println(nv02);

	}

}
