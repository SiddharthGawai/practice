package com.rel.serviceIn;


import com.rel.model.Student;

public interface ServiceInt 
{
	public Iterable<Student> getdata();
	public Student savedata(Student s);
	public void deleteData(int id);
	public Student updateData(int id);
}
