package lesson05;

public class SachThamKhao extends Sach{
private double tax;
public SachThamKhao() {
}
public SachThamKhao(double tax) {
	this.tax = tax;
}
public double getTax() {
	return tax;
}
public void setTax(double tax) {
	this.tax = tax;
}

}
