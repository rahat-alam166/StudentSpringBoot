package com.genspark.EmployeeSpringBoot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String department;
    private double yearlySalary;

    public Employee(String name, String department, double yearlySalary)
    {
        this.name = name;
        this.department = department;
        this.yearlySalary = yearlySalary;
    }

    public Employee()
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

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public double getYearlySalary()
    {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary)
    {
        this.yearlySalary = yearlySalary;
    }
}
