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
    public int EmployeeNumber;

    public Company(){}

    public Company(int id, String name, int EmployeeNumber) {
        this.id = id;
        this.name = name;
        this.EmployeeNumber = EmployeeNumber;
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
        return EmployeeNumber;
    }

    public void setEmployeeNumber(int EmployeeNumber) {
        this.EmployeeNumber = EmployeeNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", EmployeeNumber=" + EmployeeNumber +
                '}';
    }
}
