package com.example.demo.ServiceTest;

import com.example.demo.DB.MemoryDB;
import com.example.demo.entity.Employees;
import com.example.demo.service.EmployeesService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 10:21 PM 7/24/2018
 * @Modified By:
 */
public class EmployeesServiceTest {

    public EmployeesService employeesService=new EmployeesService(new MemoryDB());
    @Test
    public void should_return_all_Employees_When_call_getEmployeesList() {
        List<Employees> employeesList= employeesService.getEmployeesList();
        System.out.println(employeesList.toString());
        Assert.assertEquals("[Employees{id=0, name='小明', age=20, gender='男', salary=1000}, Employees{id=1, name='小红', age=19, gender='女', salary=2000}, Employees{id=2, name='小智', age=15, gender='男', salary=3000}, Employees{id=3, name='小刚', age=16, gender='男', salary=4000}, Employees{id=4, name='小霞', age=15, gender='女', salary=5000}]",
                employeesList.toString());

    }


    @Test
    public void should_return_right_Employees_When_call_findEmployeesById() {
        Employees employees= employeesService.findEmployeesById(1);
        System.out.println(employees.toString());
        Assert.assertEquals("Employees{id=1, name='小红', age=19, gender='女', salary=2000}",
                employees.toString());

    }
}
