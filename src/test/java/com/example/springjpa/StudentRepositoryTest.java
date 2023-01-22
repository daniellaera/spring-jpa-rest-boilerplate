package com.example.springjpa;

import com.example.springjpa.model.Student;
import com.example.springjpa.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    /*@Test
    public void saveStudent() {
        Student student = new Student();
        student.setFirstName("Kamul");
        student.setLastName("Gmari");
        student.setEmail("kibubbuk@gmail.com");
        student.setAge(12);

        studentRepository.save(student);
    }*/

    @Test
    public void findAllStudents() {
        List<Student> studentList = studentRepository.findAll();

        System.out.println("Student List -> " + studentList);
    }

    /*@Test
    public void findStudentByFirstName() {
        List<Student> studentList = studentRepository.findByFirstName("John");

        System.out.println("Student  -> " + studentList);
    }*/

}
