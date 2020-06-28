package util;

import beans.ItemDetail;
import view.Device;

public class ItemDetaileUtils {
	public static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Device[] devices = itemDetail.getDevice();
		for (Device device : devices) {
			result += device.getPrice();
		}
		return result;
	}
}
