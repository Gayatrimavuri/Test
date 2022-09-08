package com.techwave.restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techwave.restapi.model.dao.EmpDao;
import com.techwave.restapi.model.pojo.Emp;

@RestController
@RequestMapping("/api")
public class EmpController {

	EmpDao ED=new EmpDao();
	@GetMapping("/emp")
	public List<Emp> getEmps()
	{
		return ED.getAll();
	}
	@GetMapping("/emp/{id}")
	public Emp getEmps(@PathVariable("id") int id)
	{
		return ED.getById(id);
	}
	@PostMapping("/insertemp")
	public String insertEmp(@RequestBody Emp E)
	{
		return ED.insertEmp(E);
	}
	
	
	
	
	
	
}
