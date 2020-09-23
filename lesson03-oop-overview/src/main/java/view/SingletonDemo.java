package view;

import beans.Format;
import utils.StringUtils;

public class SingletonDemo {
	 public static void main(String[] args) {
		 Format first = Format.getInstance();
		 Format second = Format.getInstance();
	}
}
