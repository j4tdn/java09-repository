package beans;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class ItemDetail {
	private Customer customer;
	private Phone[] phones;
	private LocalDate date;
	double sum = 0;

	public ItemDetail() {
	}

	public ItemDetail(Customer customer, Phone[] phones, LocalDate date) {
		super();
		this.customer = customer;
		this.phones = phones;
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	private String formatPrice(double price) {
		return NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(price);
	}

	public double getTotalPrice() {
		sum = 0;
		if (phones != null) {
			Arrays.stream(phones).forEach(phone -> {
				if(date.isEqual(LocalDate.of(2020, 5, 5)) && phone.getPrice() > 590) {
					sum += (phone.getPrice() * 0.9);
				} else {
					sum += phone.getPrice();
				}
			});
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(
				"Khách hàng:\n" + this.customer + "\nNgày mua: " + date + "\nThiết bị đã mua: ");
		Arrays.stream(phones).forEach(phone -> result.append(phone).append("\n"));
		result.append("Tổng tiền:\n").append(formatPrice(getTotalPrice())).append("\n");
		return result.toString();
	}
}
