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
    public int employeesNumber;

    public Company(){}

    public Company(int id, String name, int employeesNumber) {
        this.id = id;
        this.name = name;
        this.employeesNumber = employeesNumber;
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

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeesNumber=" + employeesNumber +
                '}';
    }
}
