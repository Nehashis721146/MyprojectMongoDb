package com.example.myproject.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.Service.StudentService;
import com.example.myproject.model.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@PostMapping
	public ResponseEntity<Student> SaveOrUpdate(@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentService.saveOrUpdate(student),HttpStatus.ACCEPTED);
	}
	@GetMapping
	public List<Student> getDetails(@RequestBody Student student){
		return studentService.getDetails(student);
		
	}
	@GetMapping("/{studId}")
	public Optional<Student> getById(@PathVariable int studId){
		return studentService.getById(studId);
	}
	@DeleteMapping("/{studId}")
	public String delete(@PathVariable int studId ) {
		return studentService.delete(studId);
	}
	
}
