package com.example.crudApp.controllers;

import com.example.crudApp.model.Employee;
import com.example.crudApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/demoController")
public class DemoController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/demoControllerMethod")
    public String demoMethod(){
        return "demo hi";
    }

    @PostMapping(("/saveEmployee"))
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("getEmployeeById")
    public Employee getEmployeeById(@RequestParam(name = "id") Integer id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("getEmployeeByName/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }
    @PutMapping("updateContactNumber")
    public Employee updateContactNumber(@RequestParam String number, @RequestParam Integer id){
        return employeeService.updateEmployeeNumber(number, id);
    }

    @PutMapping("updateEmployeeDob")
    public Employee updateEmployeeDob(@RequestParam Integer id,@DateTimeFormat String dob){
        return employeeService.updateEmployeeDob(id, LocalDate.parse(dob));
    }

    @DeleteMapping("deleteEmployeeById")
    public Boolean deleteEmployeeById(@RequestParam Integer id){
        return  employeeService.deleteEmployeeById(id);
    }

    @DeleteMapping("deleteAllEmployees")
    public boolean deleteAllEmployees(){
        return employeeService.deleteAllEmployees();
    }

    @GetMapping("getAllEmployees")
    public List<Employee> getAllEmployees(){
       return employeeService.getAllEmployees();
    }

}
