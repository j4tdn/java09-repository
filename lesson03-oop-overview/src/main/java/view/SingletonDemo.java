package view;

import beans.Format;
import utils.StringUtils;

public class SingletonDemo {
	public static void main(String[] args) {
		Format first = Format.getInstance();
		StringUtils.hashCode(first);
		
		Format second = Format.getInstance();
		StringUtils.hashCode(first);
	}
}
