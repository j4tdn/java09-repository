package dao;

import java.text.ParseException;
import java.util.Scanner;

import persistence.Customer;
public class TestCustomerDAO {
	public static void main(String[] args) throws ParseException {
		CustomerDAO pDAO = new CustomerDAO();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out
					.println("-------------------------------------------------------");
			System.out
					.println("1.show all  2.delete  3.update name  4.add  5.find");
			System.out.print("press select: ");
			int n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				pDAO.showAll();
				break;
			case 2:
				System.out.print("enter id of Customer need to delete: ");
				int id = Integer.parseInt(sc.nextLine());
				pDAO.delete(new Customer(id));
				System.out.println("deleted!");
				break;
			case 3:
				System.out.print("enter id of Customer need to update name:");
				int id2 = Integer.parseInt(sc.nextLine());
				System.out.print("enter new name: ");
				String name = sc.nextLine();
				pDAO.updateName(id2, name);
				System.out.println("updated!");
				break;
			case 4:
				System.out.println("fill information of new Customer");
				System.out.print("enter id: ");
				int idCustomer = Integer.parseInt(sc.nextLine());
				System.out.print("enter name: ");
				String name2 = sc.nextLine();
				System.out.print("enter address: ");
				String address = sc.nextLine();
				Customer customer = new Customer(idCustomer, name2, address);
				pDAO.insert(customer);
				System.out.println("inserted!");
				break;
			case 5:
				System.out.print("enter name of Customer to find: ");
				String name3 = sc.nextLine();
				pDAO.searchByName(name3);
				break;

			}
		}
	}
}
