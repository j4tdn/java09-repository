package view;

import beans.Format;
import utils.StringUntils;

public class SingletonDemo {
	public static void main(String[] args) {
		Format format = Format.getInstance();
		StringUntils.hashCode(format);

		Format second = Format.getInstance();
		StringUntils.hashCode(second);
	}

}
