package view;

import beans.Format;
import utils.StringUtils;

public class SingletonDemo {
	public static void main(String[] args) {
		Format format1 = Format.getInstance();
		StringUtils.hashCode(format1);
		
		Format format2 = Format.getInstance();
		StringUtils.hashCode(format2);
	}
}
