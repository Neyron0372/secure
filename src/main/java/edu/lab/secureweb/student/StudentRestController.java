package edu.lab.secureweb.student;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

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
    @PreAuthorize("hasRole('USER')")
    public String helloUser() {
        return "Hello User!";
    }

    @GetMapping("/hello-admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String helloAdmin() {
        return "Hello Admin!";
    }

    @GetMapping("/hello-superadmin")
    @PreAuthorize("hasRole('SUPERADMIN')")
    public String helloSuperAdmin() {
        return "Hello SuperAdmin!";
    }

    @GetMapping("hello-unknown")
    public String helloUnknown() {
        return "Hello Unknown!";
    }

    @GetMapping("/view/profile")
    public String viewProfile() {
        return "This is your profile information. (Access granted for USER, ADMIN, SUPERADMIN)";
    }

    @GetMapping("/view/dashboard")
    public String viewDashboard() {
        return "Welcome to the dashboard. (Access granted for USER, ADMIN)";
    }

    @GetMapping("hello/stranger")
    public String helloStranger() {
        return "Hello Stranger!";
    }

    @GetMapping("/view/stats")
    public String viewStats() {
        return "Here are the detailed stats. (Access granted only for SUPERADMIN)";
    }
}
