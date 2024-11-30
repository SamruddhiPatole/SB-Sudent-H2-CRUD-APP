package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;

	@Autowired
	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Student saveStudent(Student student) {
       return repository.save(student);
	}
		
	@Override
	public Student getStudent(int id) {
		if(repository.existsById(id))
		{
		return repository.findById(id).get();
		}
		return null;
	}
	
	@Override
	public List<Student> getAllStudent() {
		List<Student> list = repository.findAll();
		return list;
	}
	
	@Override
	public List<Student> deleteStudent(int id) {
	repository.deleteById(id);
		return getAllStudent();
	}
}
