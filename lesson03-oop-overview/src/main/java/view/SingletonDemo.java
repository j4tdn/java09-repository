package view;

import beans.Format;
import util.StringUtil;

public class SingletonDemo {
	public static void main(String[] args) {
		Format format= Format.getInstance();
		StringUtil.hashCode(format);
		
		
		Format format2=Format.getInstance();
		StringUtil.hashCode(format2);
	}

}
