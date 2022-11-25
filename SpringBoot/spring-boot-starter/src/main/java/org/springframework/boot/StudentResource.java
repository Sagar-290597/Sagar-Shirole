package org.springframework.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentResource {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<StudentDetails> retrieveAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public StudentDetails retrieveStudent(@PathVariable long id) {
        Optional<StudentDetails> student = studentRepository.findById(id);

        if (student.isEmpty())
            throw new StudentNotFoundException("Id: " + id);
        return student.get();
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentRepository.deleteById(id);
    }

    @PostMapping("/students")
    public ResponseEntity<Object> createStudent(@RequestBody StudentDetails studentDetails) {
        StudentDetails savedStudentDetails = studentRepository.save(studentDetails);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedStudentDetails.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Object> updateStudent(@RequestBody StudentDetails studentDetails, @PathVariable long id) {

        Optional<StudentDetails> studentOptional = studentRepository.findById(id);
        if (studentOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        studentDetails.setId(id);
        studentRepository.save(studentDetails);
        return ResponseEntity.noContent().build();
    }
}
