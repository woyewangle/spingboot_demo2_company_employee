package com.example.demo.ServiceTest;

import com.example.demo.DB.MemoryDB;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 10:21 PM 7/24/2018
 * @Modified By:
 */
public class EmployeeServiceTest {

    public EmployeeService employeeService=new EmployeeService(new MemoryDB());
    @Test
    public void should_return_all_Employee_When_call_getEmployeeList() {
        List<Employee> employeeList= employeeService.getEmployeeList();
        Assert.assertEquals("[Employee{id=0, name='小明', age=20, gender='男', salary=1000}, Employee{id=1, name='小红', age=19, gender='女', salary=2000}, Employee{id=2, name='小智', age=15, gender='男', salary=3000}, Employee{id=3, name='小刚', age=16, gender='男', salary=4000}, Employee{id=4, name='小霞', age=15, gender='女', salary=5000}]",
                employeeList.toString());

    }

    @Test
    public void should_return_right_Employee_When_call_findEmployeeById() {
        Employee employee= employeeService.findEmployeeById(1);
        Assert.assertEquals("Employee{id=1, name='小红', age=19, gender='女', salary=2000}",
                employee.toString());
    }

    @Test
    public void should_add_Employee_succeed_When_call_addEmployee() {
        Employee employee=new Employee(2,"大明",18,"男",2000);
        List<Employee> employeeList= employeeService.addEmployee(employee);
        System.out.println(employeeList);
        Assert.assertEquals("[Employee{id=0, name='小明', age=20, gender='男', salary=1000}, Employee{id=1, name='小红', age=19, gender='女', salary=2000}, Employee{id=2, name='大明', age=18, gender='男', salary=2000}]",
                employeeList.toString());
    }

    @Test
    public void should_delete_Employee_succeed_When_call_deleteEmployee() {
        List<Employee> employeeList= employeeService.deleteEmployee(1);
        Assert.assertEquals("[Employee{id=0, name='小明', age=20, gender='男', salary=1000}]",
                employeeList.toString());
    }

    @Test
    public void should_update_Employee_succeed_When_call_updateEmployee() {
        Employee employee=new Employee(1,"大明",18,"男",2000);
        Employee newEmployee= employeeService.updateEmployee(1,employee);
        Assert.assertEquals(newEmployee.toString(),
                employee.toString());
    }


}
