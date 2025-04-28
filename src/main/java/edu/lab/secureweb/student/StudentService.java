package edu.lab.secureweb.student;

import jakarta.annotation.PostConstruct;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/*
  @author   neyron
  @project   security
  @class  StudentService
  @version  1.0.0 
  @since 29.03.2025 - 00.16
*/
@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private List<Student> students;

    @PostConstruct
    void init() {
        if (studentRepository.count() == 0) {
            students.add(new Student("1", "name1", "123a"));
            students.add(new Student("2", "name2", "123b"));
            students.add(new Student("3", "name3", "343"));
            studentRepository.saveAll(students);
        }
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student getById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        studentRepository.deleteById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
