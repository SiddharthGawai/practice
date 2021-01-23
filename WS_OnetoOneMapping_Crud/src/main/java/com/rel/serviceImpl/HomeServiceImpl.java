package com.rel.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rel.model.Student;
import com.rel.repository.HomeRepository;
import com.rel.serviceIn.ServiceInt;

@Service
public class HomeServiceImpl implements ServiceInt
{
	@Autowired
	HomeRepository hr;
	
	@Override
	public Student savedata(Student s) 
	{
		return hr.save(s);
		
	}

	
	@Override
	public Student updateData(int id) 
	{
		return hr.findByid(id);
	}

	@Override
	public void deleteData(int id) 
	{
		hr.deleteById(id);
		
	}


	@Override
	public Iterable<Student> getdata() 
	{
		
		return hr.findAll();
	}

	

}
