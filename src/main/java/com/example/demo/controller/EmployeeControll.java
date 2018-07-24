package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 7:11 PM 7/24/2018
 * @Modified By:
 */
@RestController
public class EmployeeControll {
    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/employees")
    public List getEmployeeList(){
        return employeeService.getEmployeeList();
    }

    @GetMapping("/employees/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        return employeeService.findEmployeeById(id);
    }

    @PostMapping("/employees")
    public List<Employee> addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public List<Employee> deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
        return employeeService.updateEmployee(id,employee);
    }





}
