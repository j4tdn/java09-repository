package entities;

public class Director extends People{
     private float coefficientsPosition;
       
     public Director() {
		super();
	}

	public Director (String name,int birthDay,float coefficientsSalary,float coefficientsPosition) {
    	  super(name,birthDay,coefficientsSalary);
    	  this.coefficientsPosition = coefficientsPosition;
     }

	public float getCoefficientsPosition() {
		return coefficientsPosition;
	}

	public void setCoefficientsPosition(float coefficientsPosition) {
		this.coefficientsPosition = coefficientsPosition;
	}

	@Override
	public float getSalary() {
		return (this.coefficientsPosition + this.coefficientsSalary) * 3000000;
	}

	@Override
	public String toString() {
		return super.toString() + ", coefficientsPosition:" + coefficientsPosition;
	}
    
	
	
     
}
