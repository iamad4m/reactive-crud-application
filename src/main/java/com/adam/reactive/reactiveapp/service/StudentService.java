package com.adam.reactive.reactiveapp.service;

import com.adam.reactive.reactiveapp.repository.StudentRepository;
import com.adam.reactive.reactiveapp.student.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author PC
 **/
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

//    mono: one object.
//    flux: list of objects.

    public Mono<Student> save(Student student) {
        return repository.save(student);
    }

    public Flux<Student> findAll() {
        return repository.findAll();
    }

    public Mono<Student> findById(Integer id) {
        return repository.findById(id);
    }
}
