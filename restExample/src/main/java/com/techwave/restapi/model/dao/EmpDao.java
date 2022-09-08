package com.techwave.restapi.model.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.techwave.restapi.model.pojo.Emp;

public class EmpDao {
	static List<Emp> list=new ArrayList<Emp>();
	public EmpDao()
	{
		
		list.add(new Emp(1,"A",LocalDate.parse("2022-09-01"),30000));
		list.add(new Emp(2,"B",LocalDate.parse("2022-10-01"),40000));
		list.add(new Emp(3,"C",LocalDate.parse("2022-11-01"),60000));
		list.add(new Emp(4,"D",LocalDate.parse("2022-12-01"),70000));
		list.add(new Emp(5,"E",LocalDate.parse("2022-08-01"),80000));
	}
	public  List<Emp> getAll()
	{
		return list;
	}
	public  Emp getById(int id)
	{
	  return list.stream().filter(i->i.getEmpno()==id).collect(Collectors.toList()).get(0);
	}
	
	public  String insertEmp(Emp E)
	{
		list.add(E);
		return "1 employee added";
	}
	
	
	
}
