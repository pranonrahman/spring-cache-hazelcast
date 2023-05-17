package net.therap.hazelcastdemoquery.controller;

import lombok.RequiredArgsConstructor;
import net.therap.hazelcastdemoquery.dto.StudentDto;
import net.therap.hazelcastdemoquery.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author raianrahman
 * @since 5/17/23
 */
@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PutMapping
    public ResponseEntity<?> putStudent(@RequestBody StudentDto studentDto) {
        return ResponseEntity.ok(studentService.putStudent(studentDto));
    }

    @PostMapping
    public ResponseEntity<?> setStudent(@RequestBody StudentDto studentDto) {
        studentService.setStudent(studentDto);

        return ResponseEntity.ok("Student saved!!! No value returned");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeStudent(@PathVariable Long id) {
        studentService.removeStudent(id);

        return ResponseEntity.ok("Removed student");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudent(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudent(id));
    }

    @GetMapping
    public ResponseEntity<?> getAllStudent() {
        return ResponseEntity.ok(studentService.getAllStudent());
    }

}
