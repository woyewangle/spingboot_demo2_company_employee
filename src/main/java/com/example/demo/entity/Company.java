package com.example.demo.entity;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 6:48 PM 7/24/2018
 * @Modified By:
 */
public class Company {
    public int id;
    public String name;
    public int employeeNumber;

    public Company(){}

    public Company(int id, String name, int employeeNumber) {
        this.id = id;
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int EmployeeNumber) {
        this.employeeNumber = EmployeeNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", EmployeeNumber=" + employeeNumber +
                '}';
    }
}
