package bai5;

public class Demo {
	public static void main(String[] args) {
//		SachThamKhao stk1 = new Sa
//		Sach[] sach = {new SachGiaoKhoa()};
		SachGiaoKhoa sgk1 = new SachGiaoKhoa("SGK01", 120, "Kim Dong", "Moi");
		SachGiaoKhoa sgk2 = new SachGiaoKhoa("SGK02", 20, "Thanh Nien", "Moi");
		SachGiaoKhoa sgk3 = new SachGiaoKhoa("SGK03", 40, "Kim Dong", "Cu");
		
		SachThamKhao stk1 = new SachThamKhao("STK01", 60, "Da Nang", 20);
		SachThamKhao stk2 = new SachThamKhao("STK02", 10, "Kim Dong", 25);
		
		Sach list[] = {sgk1,sgk2,sgk3,stk1,stk2};
		
		System.out.println("Nhung sach co nha xuat ban la Kim Dong :");
		for(int i = 0 ; i < list.length ; i ++) {
			if (list[i].NhaXuatBan.equals("Kim Dong")) {
				System.out.println(list[i].toSstring());
			}
		}
		System.out.println("nhung sach co don gia nho hon 50 :");
		for(int i = 0 ; i < list.length ; i ++) {
			if (list[i].DonGia < 50) {
				System.out.println(list[i].toSstring());
			}
		}
		System.out.println("Nhung sach giao khoa co don gia tu 100 den 200 :");
		for(int i = 0 ; i < list.length ; i ++) {
			if (list[i].DonGia > 100 && list[i].DonGia < 200 && kiemTraSach(list[i]) == true) {
				System.out.println(list[i].toSstring());
			}
		}
		

		int tongTien = (sgk1.DonGia / 10 * 3) + stk2.DonGia*(1 + stk2.getThue()/100);
		System.out.println("Neu khach hang mua SGK01 va STK02 thi gia tien la :" + tongTien);
		
	}
	public static boolean kiemTraSach(Sach sach) {
		String kiemtra = sach.MaSach.substring(0, 3);
		if (kiemtra.equals("SGK")) {
			return true;
		}
		return false;
	}
	
}
