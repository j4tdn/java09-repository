package view;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class ShopView {
	public static void main(String[] args) {
		Customer[] customers=getCustomer();
		Device[] device=getDeivce();
		
		
		Device[] leNaDevice=new Device[] {device[0],device[1]};
	   ItemDetail leNaBillDetail=new ItemDetail(customers[0],leNaDevice,LocalDate.of(2020, 5, 5));
	
	    Device[] hoangTeoDevice=new Device[] {device[1],device[2]};
	    ItemDetail hoangTeoBillDetail=new ItemDetail(customers[0],hoangTeoDevice,LocalDate.of(2020, 6, 5));
	
	    double lenaBill=getBill(leNaBillDetail);
	    double hoangteoBill=getBill(hoangTeoBillDetail);
	    
	    System.out.println("Le na: "+format(lenaBill));
	    System.out.println("Hoang teo: "+format(hoangteoBill));
	    
	}
	private static String format(double money) {
		return NumberFormat.getCurrencyInstance(new Locale("vi","VN")).format(money);
	}
	private static Device[] getDeivce() {
		return new Device[] {
				new Device("Nokia1202","undefined","Black",500),
				new Device("iphone4","ios","White",1000),
				new Device("LgG3","android","Black",860),
				new Device("SamsungS6","android","White",1200),				
		};
	}
	private static double getBill(ItemDetail itemDetail) {
		double result=0;
		LocalDate date=itemDetail.getDate();
		Device[] device=itemDetail.getDevice();
		for(Device dv:device) {
			double price=dv.getPrice();
			if(date.isEqual(LocalDate.of(2020, 5, 5))&&price>559) {
				price*=0.9;
			}
			result+=price;
		}	
		return result;
	}
	private static Customer[] getCustomer() {
		return  new Customer[] {
				new Customer("Nguyen Van A","01122123","01234567","Da Nang"),
				new Customer("Nguyen Van B","01122124","01234567","Da Nang"),
				new Customer("Nguyen Van C","01122125","01234567","Da Nang"),
				new Customer("Nguyen Van D","01122126","01234567","Da Nang"),
		};
	}
}
