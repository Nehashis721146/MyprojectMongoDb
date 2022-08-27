package com.example.myproject.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.myproject.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer>{


}
