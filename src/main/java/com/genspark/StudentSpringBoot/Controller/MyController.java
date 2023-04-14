package com.genspark.StudentSpringBoot.Controller;

import com.genspark.StudentSpringBoot.Entity.Student;
import com.genspark.StudentSpringBoot.Service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController
{
    @Autowired
    private StudentServiceImp stuService;
    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1> WELCOME TO STUDENT BOOT APPLICATION</H1></HTML>";
    }

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return this.stuService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable String id)
    {
        return this.stuService.getByID(Integer.parseInt(id));
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student emp)
    {
        return this.stuService.addStudent(emp);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student emp)
    {
        return this.stuService.updateStudent(emp);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable String id)
    {
        return this.stuService.deleteStudentById(Integer.parseInt(id));
    }

}
