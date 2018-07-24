package com.example.demo.service;

import com.example.demo.DB.MemoryDB;
import com.example.demo.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 10:13 PM 7/24/2018
 * @Modified By:
 */
@Service
public class EmployeesService {
    public final MemoryDB memoryDB;

    @Autowired
    public EmployeesService(MemoryDB memoryDB) {
        this.memoryDB = memoryDB;
    }

    public List getEmployeesList(){
        return memoryDB.getEmployeesList();
    }

    public Employees findEmployeesById(int id) {
        return memoryDB.getEmployeesList().stream().filter(e->e.getId()==id).collect(Collectors.toList()).get(0);
    }
}
