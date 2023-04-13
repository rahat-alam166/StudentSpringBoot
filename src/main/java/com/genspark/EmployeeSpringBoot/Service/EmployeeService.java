package com.genspark.EmployeeSpringBoot.Service;

import com.genspark.EmployeeSpringBoot.Entity.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> getAllEmployees();
    Employee getByID(int id);
    Employee addEmp(Employee emp);
    Employee updateEmp(Employee emp);
    String deleteEmpByID(int id);
}
