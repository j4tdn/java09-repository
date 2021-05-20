package service;

import java.util.List;

import dao.Ex02Dao;
import persistence.ItemDto;
import persistence.ItemGroup;

public class Ex02Service {


	private static Ex02Dao ex02Dao;

	public Ex02Service() {
		ex02Dao=new Ex02Dao();
	}
	
	public List<ItemDto> getAll() {
		return ex02Dao.getItemDtos();
	}
	
}
