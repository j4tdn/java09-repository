package main;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.xml.crypto.dsig.DigestMethod;

import org.apache.commons.codec.digest.DigestUtils;

import dao.EmployeeDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import dao.ItemGroupDtoDao;
import dto.ItemGroupDto;
import persistence.Employee;
import persistence.Item;
import persistence.ItemGroup;

public class App {
	private static ItemGroupDao itemGroupDao;
	private static ItemDao itemDao;
	private static ItemGroupDtoDao igrDtoDao;
	private static EmployeeDao empDao;
	static {
		itemGroupDao = new ItemGroupDao();
		itemDao = new ItemDao();
		igrDtoDao = new ItemGroupDtoDao();
		empDao = new EmployeeDao();
	}

	public static void main(String[] args) {
		List<ItemGroup> itemGroup = itemGroupDao.getAll();
		show(itemGroup);
		List<Item> items = itemDao.getItems(1, 100, 500);
		show(items);
		System.out.println("=========================");
		List<Item> items2 = itemDao.getItems3("Quần", 100, 500);
		show(items2);
		System.out.println("=========================");

		List<ItemGroupDto> igrDtoAll = igrDtoDao.getIgrDto();
		show(igrDtoAll);
		System.out.println("============================");
		List<persistence.ItemGroupDto> igrDetails = itemGroupDao.getItemsGroupDetails();
		show(igrDetails);

		// convert MD5
		System.out.println("========================");
		String pass = "12345";
		System.out.println("MD5: " + DigestUtils.md5Hex(pass));
		System.out.println("===============================");

		Scanner ip = new Scanner(System.in);

		while (true) {
			System.out.println("username: ");
			String username = ip.nextLine();
			System.out.println("password: ");
			String password = ip.nextLine();
			 empDao.login(username, password).ifPresent(System.out::println);
			

		}
	}

	private static <E> void show(List<E> es) {
		for (E e : es) {
			System.out.println(e);
		}

	}
}
