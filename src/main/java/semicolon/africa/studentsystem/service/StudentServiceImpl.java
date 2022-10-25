package semicolon.africa.studentsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import semicolon.africa.studentsystem.model.Student;
import semicolon.africa.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(AddStudentRequest addStudentRequest) {
        Student student = new Student();
        student.setFirstName(addStudentRequest.getFirstName());
        student.setLastName(addStudentRequest.getLastName());

        return studentRepository.save(student);
    }
}
