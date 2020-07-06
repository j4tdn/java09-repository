package utils;

import java.time.LocalDate;

import view.Device;
import view.ItemDetail;

public class ItemDetailUtils {
	public ItemDetailUtils() {
	}
	public static double getBill(ItemDetail itemDetail) {
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
}
