package com.example.myproject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.myproject.Repository.StudentRepository;
import com.example.myproject.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public Student saveOrUpdate(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public List<Student> getDetails(Student student) {
		return studentRepository.findAll();
	}

	public Optional<Student> getById(@PathVariable int studId){
		return studentRepository.findById(studId);
	}
	public String delete(@PathVariable int studId) {
		studentRepository.deleteById(studId);
		return "deletd successfully";
	}

	

	
	
}
