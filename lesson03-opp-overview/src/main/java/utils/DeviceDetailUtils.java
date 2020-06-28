package utils;

import java.time.LocalDate;

import beans.Device;
import beans.DeviceDetail;

public class DeviceDetailUtils {
	// defalt contructor
	private DeviceDetailUtils() {
		//todo getbill condition
	}

	public static double getBill(DeviceDetail deviceDetail) {

		double result = 0;
		Device[] devices = deviceDetail.getDevice();
		LocalDate date = deviceDetail.getDate();
		// foreach
		for (Device device : devices) {
			double price = device.getPrice();
			if (date.isEqual(LocalDate.of(2020, 5, 5)) && price > 590) {

				price *= 0.9;

			}
			result += price;
		}
		return result;

	}

}
