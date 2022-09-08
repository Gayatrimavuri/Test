package com.techwave.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DemoController {
	static List<String>list=new ArrayList<String>();
		
	public DemoController()
	{
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("Four");
		
	}
	@RequestMapping(value= "/",method = RequestMethod.GET)
	//@GetMapping("/")
	public List<String> displayList()
	{
		return list;
	}
	
	@RequestMapping(value = "/{id}",method=RequestMethod.GET)
	//@GetMapping("/{id}")
	public String displayList(@PathVariable("id") int i)
	{
		
		return list.get(i);
	}
	//@PostMapping("/insert")
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void addString(@RequestBody String s)
	{
		list.add(s);
	}
	@PutMapping("/modify/{id}")
	public void modifyString(@RequestBody String ns,@PathVariable("id") int id)
	{
		list.set(id, ns);
	}
	
	@DeleteMapping("/delete/{id}")
	public void DeleteString(@PathVariable("id") int id)
	{
		list.remove(id);
	}
	
}
