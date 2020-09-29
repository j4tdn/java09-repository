package ex04;

public class GiamDoc extends People {

	private float positionCoefficient;
	
	public GiamDoc() {
		super();
	}
	
	public GiamDoc(String name, String birthDay, float coefficientSalary, float positionCoefficient) {
		super(name, birthDay, coefficientSalary);
		this.positionCoefficient = positionCoefficient;
	}
	
	public float getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(int positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	
	@Override
	float calSalary() {
		return (this.positionCoefficient + this.salaryCoefficient) * 1250000;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ",	position coefficient:	" + this.positionCoefficient;
	}

}
