package demo;

import java.util.List;

import dao.Ex03Dao;
import persistence.Ex03Dto;
import persistence.ItemDto;
import persistence.ItemGroup;
import service.Ex02Service;
import service.Ex03Service;
import service.Ex04Service;

public class Demo {
	private static Ex04Service ex04Service=new Ex04Service();
	private static Ex02Service ex02Service=new Ex02Service();
	private static Ex03Service ex03Service=new Ex03Service();
	public static void main(String[] args) {
		//ex04
		
//		List<ItemGroup> itemGroups=ex04Service.getAll();
//		itemGroups.forEach(System.out::println);
		
		//ex02
	
//		List<ItemDto> itemDtos=ex02Service.getAll();
//		itemDtos.forEach(System.out::println);
		
		//ex03
		
//		List<Ex03Dto> top3=ex03Service.getAll();
//		top3.forEach(System.out::println);
		
		
	}

}
