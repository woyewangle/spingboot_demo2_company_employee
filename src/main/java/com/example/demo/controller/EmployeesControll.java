package com.example.demo.controller;

import com.example.demo.entity.Employees;
import com.example.demo.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 7:11 PM 7/24/2018
 * @Modified By:
 */
@RestController
public class EmployeesControll {
    @Autowired
    public EmployeesService employeesService;

    @GetMapping("/employees")
    public List getEmployeesList(){
        System.out.println(employeesService.getEmployeesList());
        return employeesService.getEmployeesList();
    }

    @GetMapping("/employees/{id}")
    public Employees findEmployeesById(@PathVariable int id){
        System.out.println(employeesService.findEmployeesById(id));
        return employeesService.findEmployeesById(id);
    }
}
