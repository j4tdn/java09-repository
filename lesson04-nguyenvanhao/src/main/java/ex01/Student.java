package ex01;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private float practice;
	private float theory;
	Scanner sc=new Scanner(System.in);
	public Student() {
		
	}
	public Student(int id,String name,float practice,float theory) {
		this.id=id;
		this.name=name;
		this.practice=practice;
		this.theory=theory;
	}
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
	public float getPractice() {
		return practice;
	}
	public void setPractice(float practice) {
		this.practice = practice;
	}
	public float getTheory() {
		return theory;
	}
	public void setTheory(float theory) {
		this.theory = theory;
	}
	public float  mediumScore() {
		return (float) (this.practice*0.5+this.theory*0.5);
	}
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.theory+" "+this.practice;
	}
	public void input() {
		System.out.print("Nhập mã sinh viên:");
		this.id=sc.nextInt();
		sc.nextLine();
		System.out.print("Tên sinh viên:");
		this.name=sc.nextLine();
		System.out.print("Điểm lý thuyết:");	
		this.theory=sc.nextFloat();
		System.out.print("Điểm thực hành");
		this.practice=sc.nextFloat();
		}
	public void output() {
		System.out.printf("%-12s%-12s%-30s%-25s",this.id,this.name,this.theory,this.practice);
		System.out.println();
	}
}
