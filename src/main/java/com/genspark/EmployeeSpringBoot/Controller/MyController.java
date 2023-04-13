package com.genspark.EmployeeSpringBoot.Controller;

import com.genspark.EmployeeSpringBoot.Entity.Employee;
import com.genspark.EmployeeSpringBoot.Service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController
{
    @Autowired
    private EmployeeServiceImp eService;
    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1> WELCOME TO STUDENT BOOT APPLICATION</H1></HTML>";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees()
    {
        return this.eService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable String id)
    {
        return this.eService.getByID(Integer.parseInt(id));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee emp)
    {
        return this.eService.addEmp(emp);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee emp)
    {
        return this.eService.updateEmp(emp);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable String id)
    {
        return this.eService.deleteEmpByID(Integer.parseInt(id));
    }

}
