package edu.lab.secureweb.student;

import org.springframework.data.mongodb.repository.MongoRepository;

/*
  @author   neyron
  @project   security
  @class  StudentRepository
  @version  1.0.0 
  @since 29.03.2025 - 00.15
*/public interface StudentRepository extends MongoRepository<Student, String> {
}
