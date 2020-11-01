package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s = "Cheer from DaNang , welcome ";
		String s3 = "  Cheer from DaNang   ,     welcome   ";
		String s1 = "Cheer";
		String s2 = "haha";
		if (s.indexOf(s1) == 0 ) {
			System.out.println("Chuoi s bat dau bang chuoi s1!");
			//hoac co he dung ham s.startwith(s1);
		}
		if (s.lastIndexOf(s1) == (s.length()-s1.length())){
			System.out.println("Chuoi s ket thuc bang chuoi s1!");
			//hoac co he dung ham s.endwith(s1);
		}
		System.out.println("Cau 2 : " + s.replace(s1, s2));
		System.out.println("Cau 3 :" + s3.stripLeading());//loai bo khoan trang thua o dau
		System.out.println("Cau 3 :" + s3.stripTrailing());//loai bo khoan trang thua o cuoi
		System.out.println("Cau 3 :" + s3.trim().replaceAll("\\s{1,}", " "));//loai bo khoan trang thua dung regex(\\s la ki tu cach)
		System.out.println("cau 4 :" + s.substring(6));
	}
}
