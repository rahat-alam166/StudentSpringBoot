package com.genspark.StudentSpringBoot.Service;

import com.genspark.StudentSpringBoot.Dao.StudentDao;
import com.genspark.StudentSpringBoot.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService
{
    @Autowired
    private StudentDao dao;
    public StudentServiceImp()
    {
    }

    @Override
    public List<Student> getAllStudents()
    {
        return this.dao.findAll();
    }

    @Override
    public Student getByID(int id)
    {
        Optional<Student> o = this.dao.findById(id);
        Student stu = null;
        if (o.isPresent())
        {
            stu = o.get();
        }
        else
            throw new RuntimeException("Student not found");
        return stu;
    }

    @Override
    public Student addStudent(Student stu)
    {
        return this.dao.save(stu);
    }

    @Override
    public Student updateStudent(Student stu)
    {
        return this.dao.save(stu);
    }

    @Override
    public String deleteStudentById(int id)
    {
        this.dao.deleteById(id);
        return "Deleted";
    }
}
