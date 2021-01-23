package com.rel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rel.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>
{
	public Student findAllByUsernameAndPassword(String uname,String pass);
	public Student findByid(int id);
}
