package service;

import java.util.List;

import dao.Ex04Dao;
import persistence.ItemGroup;

public class Ex04Service {
	
	private static Ex04Dao ex04Dao;

	public Ex04Service() {
		ex04Dao=new Ex04Dao();
	}
	
	public List<ItemGroup> getAll() {
		return ex04Dao.getAll();
	}
}
