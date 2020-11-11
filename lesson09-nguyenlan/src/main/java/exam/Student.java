package exam;

import java.util.Arrays;

public class Student {
	private int ID; 
	private String name;
	private Rank rank;
	
	
	
	public Student() {
	}

	public Student(int iD, String name, Rank rank) {
		super();
		ID = iD;
		this.name = name;
		this.rank = rank;
	}

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public static void main(String[] args) {
		Student[] list = new Student[11];
		list[0] = new Student(102, "Nam", Rank.C);
		list[1] = new Student(104, "Hoàng", Rank.D);
		list[2] = new Student(109, "Lan", Rank.A);
		list[3] = new Student(103, "Bảo", Rank.F);
		list[4] = new Student(105, "Nguyên", Rank.B);
		list[5] = new Student(107, "Vũ", Rank.F);
		list[6] = new Student(103, "Bảo", Rank.F);
		list[7] = new Student(202, "Đạt", Rank.C);
		list[8] = new Student(107, "Vũ", Rank.C);
		list[9] = new Student(193, "Bảo", Rank.B);
		list[10] = new Student(199, "Tài", Rank.A);	
		
		getAStudents(list);
		
		getFStudents(list);
	}
	
	@Override
	public String toString() {
		return "ID: " + this.getID()
				+ "		name: " + this.getName() 
				+ "		rank: " + this.getRank();
	}

	
	private static void getAStudents(Student[] list) {
		System.out.println("DANH SÁCH SINH VIÊN TỪNG ĐẠT LOẠI A");
		//Student[] result = new Student[list.length];
		//int index = 0;
		for(Student student: list) {
			if(student.getRank() == Rank.A) {
				//result[index++] = student;
				System.out.println(student);
			}
		}
	}
	
	private static void getFStudents(Student[] list) { 
		System.out.println("DANH SÁCH SINH VIÊN THAM GIA HỌC LẠI MÔN");
		Student[] listF = new Student[list.length];
		int index = 0;
		for(Student student: list) {
			if(student.getRank() == Rank.F) {
				listF[index++] = student;
			}
		}
		listF = Arrays.copyOfRange(listF, 0, index);
		
		Student[] result = new Student[listF.length];
		int indexR = 0;
		for(int i = 0; i < listF.length; i++) {
			int count = 0;
			for(int j = 0; j < list.length; j++) {
				if(listF[i].getID() == list[j].getID()) {
					count++;
				}
			}
			if(count >= 2) {
				result[indexR++] = listF[i];
			}			
		}
		result = Arrays.copyOfRange(result, 0, indexR);
		
		for(Student student: result) {
			System.out.println(student);
		}
	}
	
	
}
