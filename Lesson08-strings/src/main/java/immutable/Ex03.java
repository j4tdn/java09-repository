package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s="welcome to our class".replace("class", "club");//thay the s1 = s2
		String s1 ="class";
		String s2 = "club";
		String s3="   cheers  from Danang   ";
		System.out.println(s.startsWith(s1));//kiem tra s1 cos bawbt dau trong s ko
		System.out.println(s.endsWith(s1));
		System.out.println(s);
		
		// loại bỏ khoảng trằng thừa hai đầu
		System.out.println(s3.trim());
		//Loại bỏ khoảng trằng đầu
		System.out.println("leading: " + s3.stripLeading());
		// Lọai bỏ khoảng trắng cuối 
		System.out.println("trailing: " + s3.stripTrailing());
		
		// cắt full
		// \\s{1,} = \\s+ pattern 1 || n spaces
		System.out.println("replace all: "+ s3.replaceAll("\\s{1,}", "-")); //repalce 1 hoặc nhiều khoảng trắng
		
	}
	
}
