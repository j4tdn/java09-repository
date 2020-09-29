package exercise04;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class GiamDoc extends People {
	float hschucvu;

	public void nhap() {
		super.nhap();
		System.out.println("Nhập hệ số chức vụ: ");
		this.hschucvu = scanner.nextFloat();

	}

	public GiamDoc() {
		// TODO Auto-generated constructor stub
	}

	public GiamDoc(String name, int birthday, float coesalary, float hschucvu) {
		super(name, birthday, coesalary);
		this.hschucvu = hschucvu;
	}

	public float getHschucvu() {
		return hschucvu;
	}

	public void setHschucvu(float hschucvu) {
		this.hschucvu = hschucvu;
	}

	public long salary() {
		return (long) ((coesalary + hschucvu) * 3000000);
	}

	@Override
	public String toString() {
		return this.name + "		" + this.coesalary + "	" + this.hschucvu + "	" + salary();
	}

}
