package com.example.springjpa.service;

import com.example.springjpa.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    Student addStudent(Student student);
}
