package bean;

public class DigitDto {
	private int max;
	private int min;
	
	public DigitDto() {
	}
	public DigitDto(int max, int min) {
		this.max=max;
		this.min=min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	
}

