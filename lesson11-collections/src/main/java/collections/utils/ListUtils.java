package collections.utils;

import java.util.List;

public class ListUtils {
	public static void prinf(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
	}

	// generic method
	// E: generic type => compile: Object
	// hỗ trợ bắt lỗi tại compile
	// giới hạn kiểu tham số truyền vào <E extends Number>
	public static <E> void printf(List<E> elements) {
		for (E element : elements) {
			System.out.println(element);
		}
	}
	public static void printfwc(List<? super Number> elements) {
		for (Object element : elements) {
			System.out.println(element);
		}
	}
}
