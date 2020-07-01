package view;

import beans.DeviceAdv;
import beans.DeviceAdv.Builder;

public class BuilderDemo {
	public static void main(String[] args) {
		DeviceAdv first = DeviceAdv.builder().code("123").color("green").build();
		//DeviceAdv second = DeviceAdv.builder().code("234").color("blue").price(10.00).build();
		Builder builder = DeviceAdv.builder().code("124").color("green").price(20.0);
		DeviceAdv second = builder.build();
		DeviceAdv third = builder.ops("android").build();
				
				
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		
				                           
	}

}
