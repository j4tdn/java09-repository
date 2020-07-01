package view;

import beans.DeviceAdv;
import beans.DeviceAdv.Builder;

public class BuilderDemo {
	public static void main(String[] args) {
		DeviceAdv first = DeviceAdv.builder().IdDevice("123").Color("blue").build();
		System.out.println(first);
		Builder builder =DeviceAdv.builder().IdDevice("123").Color("blue");
		DeviceAdv second=builder.build();
		DeviceAdv third=builder.build();
	}

}
