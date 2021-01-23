package com.rel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rel.model.Address;
import com.rel.model.Student;
import com.rel.serviceIn.ServiceInt;

@RestController
@CrossOrigin("*")
public class RelationalController 
{
	@Autowired
	ServiceInt si;
	
	@RequestMapping("/")
	public Student details()
	{
		Address adr = new Address();
		adr.setAreaname("KV");
		adr.setCityname("Pune");
		
		Student s = new Student();
		
		s.setName("Siddharth");
		s.setUsername("sid");
		s.setPassword("sid123");
		
		s.setAddr(adr);
		
		return s;
	}
	
	@RequestMapping(value="/getAlldata",method = RequestMethod.GET)
	public Iterable<Student> getdata()
	{
		Iterable<Student> slist=si.getdata();
		return slist;
	}
	
	@RequestMapping(value = "/savedata",method = RequestMethod.POST)
	public String savedata(@RequestBody Student s)
	{
		si.savedata(s);
		return "Data Saved";
		
	}
	
	@RequestMapping(value="/deletedata/{id}",method = RequestMethod.DELETE)
	public void deletedata(@PathVariable Integer id)
	{
		si.deleteData(id);
	}
	
	
	@RequestMapping("/editdata/{id}")
	public Student editData(@PathVariable Integer id)
	{
		Student s = si.updateData(id);
		return s;
	}
	
	@RequestMapping(value="/updatedata",method = RequestMethod.PUT)
	public Student updateData(@RequestBody Student s)
	{
		si.savedata(s);
		return s;
	}
	
}
