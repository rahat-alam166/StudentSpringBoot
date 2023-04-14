package com.genspark.StudentSpringBoot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String major;
    private double gpa;
    private boolean onCampus;





    public Student(String name, String major, double gpa, boolean onCampus)
    {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.onCampus = onCampus;
    }

    public Student()
    {

    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String department)
    {
        this.major = department;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setGpa(double yearlySalary)
    {
        this.gpa = yearlySalary;
    }
    public boolean isOnCampus()
    {
        return onCampus;
    }

    public void setOnCampus(boolean onCampus)
    {
        this.onCampus = onCampus;
    }
}
