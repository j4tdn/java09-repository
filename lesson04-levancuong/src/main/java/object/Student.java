package object;

import java.util.Scanner;

public class Student {

	private static Scanner sc = new Scanner(System.in);
	private int id;
	private String name;
	private float theoryPoint;
	private float practicePoint;

	public Student() {
		this.id = 0;
		this.name = "";
		this.theoryPoint = 0;
		this.practicePoint = 0;
	}

	public Student(int id, String name, float theoryPoint, float practicePoint) {
		this.id = id;
		this.name = name;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
	}

	public int getId() {
		return this.id;
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

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	public float averagePoint(float theoryPoint, float practicePoint) {
		return (theoryPoint + practicePoint) / 2;
	}

	public void input() {
		System.out.print("Enter id:");
		this.id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter name:");
		this.name = sc.nextLine();
		System.out.print("Enter theory point:");
		this.theoryPoint = Float.parseFloat(sc.nextLine());
		System.out.print("Enter practice point:");
		this.practicePoint = Float.parseFloat(sc.nextLine());

	}

	@Override
	public String toString() {
		return String.format("%-20d%-30s%-20.2f%-20.2f%-20.2f", this.id, this.name, this.theoryPoint,
				this.practicePoint, this.averagePoint(theoryPoint, practicePoint));
	}

}
