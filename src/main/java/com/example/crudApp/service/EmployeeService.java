package com.example.crudApp.service;

import com.example.crudApp.model.Employee;
import com.example.crudApp.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public Employee getEmployeeByName(String name) {
        return employeeRepo.getByName(name);
    }

    public Employee updateEmployeeNumber(String number, Integer id) {
       Employee empl = employeeRepo.getById(id);
       empl.setNumber(number);
       return employeeRepo.save(empl);
    }

    public Boolean deleteEmployeeById(Integer id) {
        employeeRepo.deleteById(id);
        return !employeeRepo.existsById(id);
    }

    public Employee updateEmployeeDob(Integer id, LocalDate dob) {
        Employee empl = employeeRepo.getById(id);
        empl.setDob(dob);
        LocalDate curDate = LocalDate.now();
       Integer age =  Period.between(dob, curDate).getYears();
       empl.setAge(age);
       System.out.println("agge"+age);
       return employeeRepo.save(empl);
    }

    public boolean deleteAllEmployees() {
         employeeRepo.deleteAll();
         return employeeRepo.findAll().size() == 0;
    }

    public List<Employee> getAllEmployees() {
       return employeeRepo.findAll();
    }
}
