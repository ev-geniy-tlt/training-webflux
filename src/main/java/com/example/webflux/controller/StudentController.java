package com.example.webflux.controller;

import com.example.webflux.model.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private static final List<StudentDto> students = new ArrayList<>();

    static {
        students.add(new StudentDto("John Smith", 5));
        students.add(new StudentDto("Mark Davis", 4));
    }

    @GetMapping("students")
    public Flux<StudentDto> getStudents() {
        return Flux.fromIterable(students);
    }
}
