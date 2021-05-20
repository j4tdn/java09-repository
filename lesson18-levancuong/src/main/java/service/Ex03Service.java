package service;

import java.util.List;

import dao.Ex03Dao;
import persistence.Ex03Dto;
import persistence.ItemDto;
import persistence.ItemGroup;

public class Ex03Service {


	private static Ex03Dao ex03Dao;

	public Ex03Service() {
		ex03Dao=new Ex03Dao();
	}
	
	public List<Ex03Dto> getAll() {
		return ex03Dao.getTop3Dtos();
	}
	
}
