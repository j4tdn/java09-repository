package exercise04;

public class NhanVien extends People {
	String nameDV;

	public void nhap() {
		super.nhap();
		System.out.println("Nhập tên đơn vị: ");
		this.nameDV = scanner.nextLine();
	}

	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String name, int birthday, float coesalary, String nameDV) {
		super(name, birthday, coesalary);
		this.nameDV = nameDV;
	}

	public String getNameDV() {
		return nameDV;
	}

	public void setNameDV(String nameDV) {
		this.nameDV = nameDV;
	}

	public long salary() {
		return (long) coesalary * 1250000;
	}

	@Override
	public String toString() {
		return this.name + "		" + this.coesalary + "	" + this.nameDV + "	" + salary();
	}

}
