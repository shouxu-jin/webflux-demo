package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/api/students")
    public Flux<Student> list() {
        return studentRepository.findAll();
    }
    @RequestMapping("/api/students/{id}")
    public Mono<Student> list(@PathVariable Long id) {
        return studentRepository.findById(id);
    }
}

