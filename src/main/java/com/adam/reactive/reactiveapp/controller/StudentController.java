package com.adam.reactive.reactiveapp.controller;

import com.adam.reactive.reactiveapp.service.StudentService;
import com.adam.reactive.reactiveapp.student.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * @author PC
 **/
@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public Mono<Student> save(
            @RequestBody Student student
    ) {
//        when calling this endpoint, no need to call subscribe ourselves.
//        Spring WebFlux handles the subscription
        return studentService.save(student);
    }

    @GetMapping
    public Flux<Student> findAll() {
//        I delayed the response to visualize the stream behavior
        return studentService.findAll().delayElements(Duration.ofSeconds(1));
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(
            @PathVariable Integer id
    ) {
        return studentService.findById(id);
    }
}
