package com.genspark.StudentSpringBoot.Service;

import com.genspark.StudentSpringBoot.Entity.Student;

import java.util.List;

public interface StudentService
{
    List<Student> getAllStudents();
    Student getByID(int id);
    Student addStudent(Student emp);
    Student updateStudent(Student emp);
    String deleteStudentById(int id);
}
