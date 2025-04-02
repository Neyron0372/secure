package edu.lab.secureweb.student;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/*
  @author   neyron
  @project   security
  @class  StudentRestController
  @version  1.0.0 
  @since 29.03.2025 - 00.17
*/

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentRestController {
    private final StudentService service;

    @GetMapping
    public List<Student> getStudents() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Student getOneStudent(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        service.deleteById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @GetMapping("/hello-user")
    public String helloUser() {
        return "Hello User!";
    }

    @GetMapping("/hello-admin")
    public String helloAdmin() {
        return "Hello Admin!";
    }

    @GetMapping("hello-unknown")
    public String helloUnknown() {
        return "Hello Unknown!";
    }
}
