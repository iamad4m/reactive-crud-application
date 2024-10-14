package com.adam.reactive.reactiveapp.repository;

import com.adam.reactive.reactiveapp.student.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * @author PC
 **/
public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {
    Flux<Student> findAllByFirstnameIgnoreCase(String firstname);
//    we return a flux and not a list
}
