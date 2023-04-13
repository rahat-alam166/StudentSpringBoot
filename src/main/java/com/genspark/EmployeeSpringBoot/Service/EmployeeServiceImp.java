package com.genspark.EmployeeSpringBoot.Service;

import com.genspark.EmployeeSpringBoot.Dao.EmployeeDao;
import com.genspark.EmployeeSpringBoot.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService
{
    @Autowired
    private EmployeeDao dao;
    public EmployeeServiceImp()
    {
    }

    @Override
    public List<Employee> getAllEmployees()
    {
        return this.dao.findAll();
    }

    @Override
    public Employee getByID(int id)
    {
        Optional<Employee> o = this.dao.findById(id);
        Employee emp = null;
        if (o.isPresent())
        {
            emp = o.get();
        }
        else
            throw new RuntimeException("Employee not found");
        return emp;
    }

    @Override
    public Employee addEmp(Employee emp)
    {
        return this.dao.save(emp);
    }

    @Override
    public Employee updateEmp(Employee emp)
    {
        return this.dao.save(emp);
    }

    @Override
    public String deleteEmpByID(int id)
    {
        this.dao.deleteById(id);
        return "Deleted";
    }
}
