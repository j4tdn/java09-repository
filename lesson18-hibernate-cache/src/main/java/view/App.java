package view;

import service.DepartmentService;

public class App {
	
	private static DepartmentService departmentService;
	
	static {
		departmentService = new DepartmentService();
	}
	
	public static void main(String[] args) {
		System.out.println(departmentService.getDepartment("mgm-by"));
	}
}
