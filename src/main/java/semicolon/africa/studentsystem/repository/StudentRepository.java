package semicolon.africa.studentsystem.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import semicolon.africa.studentsystem.model.Student;


public interface StudentRepository extends MongoRepository<Student,String > {

}
