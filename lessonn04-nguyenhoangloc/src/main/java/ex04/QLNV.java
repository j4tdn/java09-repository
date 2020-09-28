package ex04;

public class QLNV {
	public static void main(String[] args) {
		People giamDoc=new GiamDoc();
		People truongPhong=new TruongPhong();
		People nhanVien=new NhanVien();
		giamDoc.nhap();
		truongPhong.nhap();
		nhanVien.nhap();
		giamDoc.tinhLuong();
		truongPhong.tinhLuong();
		nhanVien.tinhLuong();
		System.out.println(giamDoc);
		System.out.println(truongPhong);
		System.out.println(nhanVien);
	}
}
