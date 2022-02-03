package com.example.crudApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    @Column(unique = true)
    String number;

    Integer age;

    LocalDate dob;

    public Employee(String name, String number, int age, LocalDate dob) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.dob = dob;
    }

}
