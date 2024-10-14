package com.adam.reactive.reactiveapp.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author PC
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "students")
// with reactive programming we use this @table annotation, there is no entity
// r2dbc does not support auto ddl, we need a migration tool
public class Student {
    @Id
//    this is not the same annotation we use in the traditional applications
    private Integer id;
    private String firstname;
    private String lastname;
    private int age;
}
